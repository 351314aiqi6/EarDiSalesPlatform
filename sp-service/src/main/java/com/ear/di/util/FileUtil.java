package com.ear.di.util;

import com.baomidou.mybatisplus.core.toolkit.StringUtils;

import java.io.*;

public class FileUtil {

    /**
     * 文件根路径
     */
    public static String FILE_ROOT_PATH = "/Users/zengbo/EarDi/img/";

    /**
     * 写文件
     *
     * @param fileName    文件全路径
     * @param fileContent 文件内容
     * @throws IOException
     */
    public static void write(String fileName, String fileContent) throws IOException {
        File filePath = new File(fileName.substring(0, fileName.lastIndexOf("/") + 1));
        if (!filePath.exists()) filePath.mkdirs();
        FileWriter fileWriter = new FileWriter(fileName);
        fileWriter.write(fileContent);
        fileWriter.flush();
        fileWriter.close();
    }

    /**
     * 读取文件
     *
     * @param fileName 文件名称
     * @return 文件内容
     * @throws IOException
     */
    public static String read(String fileName) throws IOException {
        StringBuffer content = new StringBuffer();
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
        String line = reader.readLine();
        while (StringUtils.isNotBlank(line)) {
            content.append(line);
            line = reader.readLine();
        }
        return content.toString();
    }
}
