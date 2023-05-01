package com.ear.di.controller;

import cn.hutool.extra.spring.SpringUtil;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.ear.di.comm.Result;
import com.ear.di.dao.ChnlAgentInfoMapper;
import com.ear.di.dao.GoodsInfoMapper;
import com.ear.di.dao.GoodsTypeMapper;
import com.ear.di.dao.MerchantInfoMapper;
import com.ear.di.entity.*;
import com.ear.di.enums.RespCode;
import com.ear.di.util.FileUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@CrossOrigin
@RequestMapping("/goods")
public class GoodsController {
    /**
     * 激活状态
     */
    public final static String ACTIVE = "00";

    public static String USER_FILE_PATH = FileUtil.FILE_ROOT_PATH + "/Users/zengbo/EarDi/img/";

    private final GoodsInfoMapper goodsInfoMapper = SpringUtil.getBean(GoodsInfoMapper.class);

    private final MerchantInfoMapper merchantInfoMapper = SpringUtil.getBean(MerchantInfoMapper.class);

    private final MerchantController merchantController = SpringUtil.getBean(MerchantController.class);

    private final GoodsTypeController goodsTypeController = SpringUtil.getBean(GoodsTypeController.class);

    private final GoodsTypeMapper goodsTypeMapper = SpringUtil.getBean(GoodsTypeMapper.class);

    private final ChnlAgentInfoMapper chnlAgentInfoMapper = SpringUtil.getBean(ChnlAgentInfoMapper.class);


    /**
     * 商品信息添加
     *
     * @param merchantId 商户ID
     * @param goodsDesc  商品描述
     * @param goodsImage 商品图片链接
     * @param goodsName  商品名称
     * @param goodsPrice 商品价格
     * @param goodsStock 商品库存
     * @return 交易结果
     */
    @ResponseBody
    @RequestMapping(value = "/add", method = {RequestMethod.GET, RequestMethod.POST})
    public Result add(@RequestParam(name = "merchantId") String merchantId,
                      @RequestParam(name = "goodsDesc") String goodsDesc,
                      @RequestParam(name = "goodsImage", required = false) String goodsImage,
                      @RequestParam(name = "goodsName") String goodsName,
                      @RequestParam(name = "goodsPrice") String goodsPrice,
                      @RequestParam(name = "goodsStock") String goodsStock,
                      @RequestParam(name = "goodsTypeId") String goodsTypeId) {
        MerchantInfoExample example = new MerchantInfoExample();
        example.createCriteria().andMerchantIdEqualTo(merchantId);
        List<MerchantInfo> merchantInfos = merchantInfoMapper.selectByExample(example);
        if (merchantInfos == null || merchantInfos.isEmpty()) {
            return Result.error(null, RespCode.MERCHANT_IS_NOT_EXIST);
        } else {
            MerchantInfo merchantInfo = merchantInfos.get(0);
            GoodsInfo goodsInfo = new GoodsInfo();
            goodsInfo.setGoodsDesc(goodsDesc);
            goodsInfo.setGoodsName(goodsName);
            goodsInfo.setGoodsStatus(ACTIVE);
            goodsInfo.setChnlAgentId(merchantInfo.getChnlAgentId());
            goodsInfo.setChnlUserId(merchantInfo.getUserId());
            goodsInfo.setGoodsType(goodsTypeId);
            goodsInfo.setMerchantId(merchantId);
            goodsInfo.setGoodsPrice(new BigDecimal(goodsPrice));
            goodsInfo.setGoodsStock(Integer.parseInt(goodsStock));
            goodsInfo.setGoodsId(String.valueOf(System.currentTimeMillis()));
            if (StringUtils.isNotBlank(goodsImage)) {
                goodsInfo.setGoodsImage(USER_FILE_PATH + goodsInfo.getGoodsId() + ".text");
                try {
                    FileUtil.write(goodsInfo.getGoodsImage(), goodsImage);
                } catch (IOException e) {
                    e.printStackTrace();
                    return Result.error(null, RespCode.ADD_GOODS_ERROR);
                }
            }
            return Result.judgeResult(goodsInfoMapper.insertSelective(goodsInfo) == 1 && goodsTypeController.addGoods(goodsTypeId, 1L).isSuccess(), goodsInfo, RespCode.ADD_GOODS_ERROR);
        }
    }

    /**
     * 商品信息修改
     *
     * @param id         商品ID
     * @param goodsDesc  商品描述
     * @param goodsImage 商品图片链接
     * @param goodsName  商品名称
     * @param goodsPrice 商品价格
     * @param goodsStock 商品库存
     * @param goodsType  商品类型
     * @return 交易结果
     */
    @ResponseBody
    @RequestMapping(value = "/update", method = {RequestMethod.GET, RequestMethod.POST})
    public Result update(@RequestParam(name = "id") String id,
                         @RequestParam(name = "goodsDesc", required = false) String goodsDesc,
                         @RequestParam(name = "goodsImage", required = false) String goodsImage,
                         @RequestParam(name = "goodsName", required = false) String goodsName,
                         @RequestParam(name = "goodsPrice", required = false) String goodsPrice,
                         @RequestParam(name = "goodsStock", required = false) String goodsStock,
                         @RequestParam(name = "goodsType", required = false) String goodsType,
                         @RequestParam(name = "goodsStatus", required = false) String goodsStatus) {
        GoodsInfo goodsInfo = new GoodsInfo();
        goodsInfo.setId(Long.parseLong(id));
        goodsInfo.setGoodsDesc(goodsDesc);
        goodsInfo.setGoodsName(goodsName);
        goodsInfo.setGoodsStatus(goodsStatus);
        goodsInfo.setGoodsType(goodsType);
        if (goodsPrice != null) {
            goodsInfo.setGoodsPrice(new BigDecimal(goodsPrice));
        }
        if (goodsStock != null) {
            goodsInfo.setGoodsStock(Integer.parseInt(goodsStock));
        }
        if (StringUtils.isNotBlank(goodsImage)) {
            goodsInfo.setGoodsImage(USER_FILE_PATH + goodsInfo.getGoodsId() + ".text");
            try {
                FileUtil.write(goodsInfo.getGoodsImage(), goodsImage);
            } catch (IOException e) {
                e.printStackTrace();
                return Result.error(null, RespCode.GOODS_UPDATE_ERROR);
            }
        }
        return Result.judgeResult(goodsInfoMapper.updateByPrimaryKeySelective(goodsInfo) == 1, goodsInfo, RespCode.GOODS_IS_NOT_EXIST);
    }

    /**
     * 商品信息查询
     *
     * @param merchantId  商户ID
     * @param goodsId     商品ID
     * @param goodsStatus 商品状态
     * @return 交易结果
     */
    @ResponseBody
    @RequestMapping(value = "/query", method = {RequestMethod.GET, RequestMethod.POST})
    public Result query(@RequestParam(name = "merchantId", required = false) String merchantId,
                        @RequestParam(name = "goodsId", required = false) String goodsId,
                        @RequestParam(name = "userId", required = false) String userId,
                        @RequestParam(name = "chnlAgentId", required = false) String chnlAgentId,
                        @RequestParam(name = "goodsTypeId", required = false) String goodsTypeId,
                        @RequestParam(name = "goodsStatus", required = false) String goodsStatus,
                        @RequestParam(name = "pageSize", required = false) String pageSize,
                        @RequestParam(name = "pageIndex", required = false) String pageIndex) throws IOException {
        if (StringUtils.isBlank(pageSize)) {
            pageSize = "5";
        }
        if (StringUtils.isBlank(pageIndex)) {
            pageIndex = "1";
        }
        if (merchantController.query(null, null, merchantId, null).dataIsNummOrEmpty()) {
            return Result.error(null, RespCode.MERCHANT_IS_NOT_EXIST);
        } else {
            GoodsInfoExample example = new GoodsInfoExample();
            GoodsInfoExample.Criteria criteria = example.createCriteria();
            if (StringUtils.isNotBlank(merchantId)) {
                criteria.andMerchantIdEqualTo(merchantId);
            }
            if (StringUtils.isNotBlank(goodsId)) {
                criteria.andGoodsIdEqualTo(goodsId);
            }
            if (StringUtils.isNotBlank(userId)) {
                criteria.andChnlUserIdEqualTo(userId);
            }
            if (StringUtils.isNotBlank(chnlAgentId)) {
                criteria.andChnlAgentIdEqualTo(chnlAgentId);
            }
            if (StringUtils.isNotBlank(goodsTypeId)) {
                criteria.andGoodsTypeEqualTo(goodsTypeId);
            }
            if (StringUtils.isNotBlank(goodsStatus)) {
                criteria.andGoodsStatusEqualTo(goodsStatus);
            }
            List<GoodsInfo> goodsInfos = goodsInfoMapper.selectByExample(example);
            Map<String, Object> dataMap = new HashMap<>();
            int end = Integer.parseInt(pageIndex) * Integer.parseInt(pageSize);
            int start = (Integer.parseInt(pageIndex) - 1) * Integer.parseInt(pageSize);
            if (end > goodsInfos.size()) {
                end = goodsInfos.size();
            }
            List<GoodsInfo> subGoodsInfos = goodsInfos.subList(start, end);
            for(GoodsInfo goodsInfo : subGoodsInfos){
               if(StringUtils.isNotBlank(goodsInfo.getGoodsImage())){
                   goodsInfo.setGoodsImage(FileUtil.read(goodsInfo.getGoodsImage()));
               }
            }
            dataMap.put("goodsList",subGoodsInfos);
            dataMap.put("totalSize", goodsInfos.size());
            return Result.success(dataMap);
        }
    }

    /**
     * 商户信息删除
     *
     * @param id 商户ID
     * @return 交易结果
     */
    @ResponseBody
    @RequestMapping(value = "/delete", method = {RequestMethod.GET, RequestMethod.POST})
    public Result delete(@RequestParam(name = "id") String id,
                         @RequestParam(name = "goodsType") String goodsType) {
        return Result.judgeResult(goodsInfoMapper.deleteByPrimaryKey(Long.parseLong(id)) == 1 && goodsTypeController.addGoods(goodsType, -1L).isSuccess(), null, RespCode.GOODS_UPDATE_ERROR);
    }

    /**
     * 商品检索
     *
     * @return 商品检索结果
     */
    @ResponseBody
    @RequestMapping(value = "/selectGoods", method = {RequestMethod.GET, RequestMethod.POST})
    public Result selectGoods(@RequestParam(name = "selectType") String selectType) {
        List<Map<String, Object>> goodsOptions = new ArrayList<>();
        if (selectType.equals("01")) {
            List<GoodsType> goodsTypes = goodsTypeMapper.selectByExample(new GoodsTypeExample());
            for (GoodsType goodsType : goodsTypes) {
                Map<String, Object> goodsOption = new HashMap<>();
                goodsOption.put("value", goodsType.getGoodsTypeId());
                goodsOption.put("label", goodsType.getGoodsTypeName());
                GoodsInfoExample goodsInfoExample = new GoodsInfoExample();
                goodsInfoExample.createCriteria().andGoodsTypeEqualTo(goodsType.getGoodsTypeId());
                List<GoodsInfo> goodsInfos = goodsInfoMapper.selectByExample(goodsInfoExample);
                if (!goodsInfos.isEmpty()) {
                    List<Map<String, Object>> goodsInfoList = new ArrayList<>();
                    for (GoodsInfo goodsInfo : goodsInfos) {
                        Map<String, Object> goods = new HashMap<>();
                        goods.put("value", goodsInfo.getId());
                        goods.put("label", goodsInfo.getGoodsName());
                        goodsInfoList.add(goods);
                    }
                    goodsOption.put("children", goodsInfoList);
                } else {
                    break;
                }
                // 放入到商品中
                goodsOptions.add(goodsOption);
            }
        } else {
            List<ChnlAgentInfo> chnlAgentInfoList = chnlAgentInfoMapper.selectByExample(new ChnlAgentInfoExample());
            for (ChnlAgentInfo chnlAgentInfo : chnlAgentInfoList) {
                MerchantInfoExample merchantInfoExample = new MerchantInfoExample();
                merchantInfoExample.createCriteria().andChnlAgentIdEqualTo(chnlAgentInfo.getChnlAgentId());
                List<MerchantInfo> merchantInfoList = merchantInfoMapper.selectByExample(merchantInfoExample);
                Map<String, Object> chnlOption = new HashMap<>();
                List<Map<String, Object>> children = new ArrayList<>();
                chnlOption.put("value", chnlAgentInfo.getChnlAgentId());
                chnlOption.put("label", chnlAgentInfo.getChnlAgentName());
                chnlOption.put("children", children);
                for (MerchantInfo merchantInfo : merchantInfoList) {
                    Map<String, Object> merchantOption = new HashMap<>();
                    merchantOption.put("value", merchantInfo.getMerchantId());
                    merchantOption.put("label", merchantInfo.getMerchantName());
                    List<Map<String, Object>> merchantChildren = new ArrayList<>();
                    merchantOption.put("children", merchantChildren);
                    GoodsInfoExample goodsInfoExample = new GoodsInfoExample();
                    goodsInfoExample.createCriteria().andMerchantIdEqualTo(merchantInfo.getMerchantId());
                    List<GoodsInfo> goodsInfoList = goodsInfoMapper.selectByExample(goodsInfoExample);
                    for (GoodsInfo goodsInfo : goodsInfoList) {
                        Map<String, Object> goodsOption = new HashMap<>();
                        merchantChildren.add(goodsOption);
                        goodsOption.put("value", goodsInfo.getId());
                        goodsOption.put("label", goodsInfo.getGoodsName());
                    }
                    if (!merchantChildren.isEmpty()) {
                        // 商户选项放入渠道商户
                        children.add(merchantOption);
                    }
                }
                if (!children.isEmpty()) {
                    // 放入到商品中
                    goodsOptions.add(chnlOption);
                }
            }
        }
        return Result.success(goodsOptions);
    }

    /**
     * 商品信息查询
     *
     * @param id 商品ID
     * @return 交易结果
     */
    @ResponseBody
    @RequestMapping(value = "/queryOne", method = {RequestMethod.GET, RequestMethod.POST})
    public Result queryOne(@RequestParam(name = "id") String id) {
        return Result.success(goodsInfoMapper.selectByPrimaryKey(Long.parseLong(id)));
    }

    /**
     * 获取图片
     */

    @ResponseBody
    @RequestMapping(value = "/getGoodsImage", method = {RequestMethod.GET, RequestMethod.POST})
    public Result getGoodsImage(@RequestParam(name = "id") String id) {
        GoodsInfo goodsInfo = goodsInfoMapper.selectByPrimaryKey(Long.parseLong(id));
        try {
            if (StringUtils.isBlank(goodsInfo.getGoodsImage())) {
                return Result.success(null);
            }
            return Result.success(FileUtil.read(goodsInfo.getGoodsImage()));
        } catch (IOException e) {
            e.printStackTrace();
            return Result.error(null, RespCode.GOODSIMAGE_IS_NOT_EXISIT);
        }
    }

    /**
     * 更换图片
     */


    @ResponseBody
    @RequestMapping(value = "/replaceGoodsImage", method = {RequestMethod.GET, RequestMethod.POST})
    public Result replaceGoodsImage(@RequestParam(name = "id", required = false) String id,
                                    @RequestParam(name = "goodsImage", required = false) String goodsImage) {
        if (StringUtils.isBlank(id)) {
            return Result.success(null);
        }
        GoodsInfo goodsInfo = goodsInfoMapper.selectByPrimaryKey(Long.parseLong(id));
        try {
            if (StringUtils.isBlank(goodsInfo.getGoodsImage())) {
                String goodsImageFilePah = USER_FILE_PATH + goodsInfo.getGoodsId() + ".text";
                goodsInfo.setGoodsImage(goodsImageFilePah);
            }
            FileUtil.write(goodsInfo.getGoodsImage(), goodsImage);
            goodsInfoMapper.updateByPrimaryKey(goodsInfo);
        } catch (IOException e) {
            e.printStackTrace();
            return Result.error(null, RespCode.GOODSIMAGE_IS_NOT_EXISIT);
        }
        return Result.success(null);
    }


    public static void main(String[] args) throws IOException {
        String filePath = "/Users/zengbo/EarDi/img/goodsImg/sss.text";
        System.out.println(filePath.substring(0, filePath.lastIndexOf("/") + 1));

    }
}
