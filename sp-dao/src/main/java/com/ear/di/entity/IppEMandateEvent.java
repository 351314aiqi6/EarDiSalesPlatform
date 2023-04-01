package com.ear.di.entity;

import java.math.BigDecimal;
import java.util.Date;

public class IppEMandateEvent {
    private Long id;

    private String eventId;

    private String eventType;

    private String eventTypeDesc;

    private String eventStatus;

    private String eventStatusDesc;

    private String fromChnlSeq;

    private String fromChnlCode;

    private Date fromChnlDate;

    private Date fromChnlDttm;

    private String mandateId;

    private String mandateStatus;

    private String mandateRole;

    private Date mandateStartDate;

    private Date mandateEndDate;

    private String mandatePurpose;

    private String billerReferenceId;

    private String billerDisplayName;

    private String mandateType;

    private String sequenceType;

    private String periodType;

    private Integer periodPerCount;

    private String colltnType;

    private BigDecimal colltnMaxAmount;

    private BigDecimal colltnFixedAmount;

    private BigDecimal firstColltnAmount;

    private Date firstColltnDate;

    private Date finalColltnDate;

    private String customerNo;

    private String creditorId;

    private String creditorName;

    private String creditorAcctNo;

    private String creditorAcctName;

    private String creditorAcctType;

    private String creditorAgentId;

    private String debtorId;

    private String debtorName;

    private String debtorAcctNo;

    private String debtorAcctName;

    private String debtorAcctType;

    private String debtorAgentId;

    private String acceptFlag;

    private String rejectCode;

    private String rejectMessage;

    private String mandateAdditional;

    private String mandateRemark;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId == null ? null : eventId.trim();
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType == null ? null : eventType.trim();
    }

    public String getEventTypeDesc() {
        return eventTypeDesc;
    }

    public void setEventTypeDesc(String eventTypeDesc) {
        this.eventTypeDesc = eventTypeDesc == null ? null : eventTypeDesc.trim();
    }

    public String getEventStatus() {
        return eventStatus;
    }

    public void setEventStatus(String eventStatus) {
        this.eventStatus = eventStatus == null ? null : eventStatus.trim();
    }

    public String getEventStatusDesc() {
        return eventStatusDesc;
    }

    public void setEventStatusDesc(String eventStatusDesc) {
        this.eventStatusDesc = eventStatusDesc == null ? null : eventStatusDesc.trim();
    }

    public String getFromChnlSeq() {
        return fromChnlSeq;
    }

    public void setFromChnlSeq(String fromChnlSeq) {
        this.fromChnlSeq = fromChnlSeq == null ? null : fromChnlSeq.trim();
    }

    public String getFromChnlCode() {
        return fromChnlCode;
    }

    public void setFromChnlCode(String fromChnlCode) {
        this.fromChnlCode = fromChnlCode == null ? null : fromChnlCode.trim();
    }

    public Date getFromChnlDate() {
        return fromChnlDate;
    }

    public void setFromChnlDate(Date fromChnlDate) {
        this.fromChnlDate = fromChnlDate;
    }

    public Date getFromChnlDttm() {
        return fromChnlDttm;
    }

    public void setFromChnlDttm(Date fromChnlDttm) {
        this.fromChnlDttm = fromChnlDttm;
    }

    public String getMandateId() {
        return mandateId;
    }

    public void setMandateId(String mandateId) {
        this.mandateId = mandateId == null ? null : mandateId.trim();
    }

    public String getMandateStatus() {
        return mandateStatus;
    }

    public void setMandateStatus(String mandateStatus) {
        this.mandateStatus = mandateStatus == null ? null : mandateStatus.trim();
    }

    public String getMandateRole() {
        return mandateRole;
    }

    public void setMandateRole(String mandateRole) {
        this.mandateRole = mandateRole == null ? null : mandateRole.trim();
    }

    public Date getMandateStartDate() {
        return mandateStartDate;
    }

    public void setMandateStartDate(Date mandateStartDate) {
        this.mandateStartDate = mandateStartDate;
    }

    public Date getMandateEndDate() {
        return mandateEndDate;
    }

    public void setMandateEndDate(Date mandateEndDate) {
        this.mandateEndDate = mandateEndDate;
    }

    public String getMandatePurpose() {
        return mandatePurpose;
    }

    public void setMandatePurpose(String mandatePurpose) {
        this.mandatePurpose = mandatePurpose == null ? null : mandatePurpose.trim();
    }

    public String getBillerReferenceId() {
        return billerReferenceId;
    }

    public void setBillerReferenceId(String billerReferenceId) {
        this.billerReferenceId = billerReferenceId == null ? null : billerReferenceId.trim();
    }

    public String getBillerDisplayName() {
        return billerDisplayName;
    }

    public void setBillerDisplayName(String billerDisplayName) {
        this.billerDisplayName = billerDisplayName == null ? null : billerDisplayName.trim();
    }

    public String getMandateType() {
        return mandateType;
    }

    public void setMandateType(String mandateType) {
        this.mandateType = mandateType == null ? null : mandateType.trim();
    }

    public String getSequenceType() {
        return sequenceType;
    }

    public void setSequenceType(String sequenceType) {
        this.sequenceType = sequenceType == null ? null : sequenceType.trim();
    }

    public String getPeriodType() {
        return periodType;
    }

    public void setPeriodType(String periodType) {
        this.periodType = periodType == null ? null : periodType.trim();
    }

    public Integer getPeriodPerCount() {
        return periodPerCount;
    }

    public void setPeriodPerCount(Integer periodPerCount) {
        this.periodPerCount = periodPerCount;
    }

    public String getColltnType() {
        return colltnType;
    }

    public void setColltnType(String colltnType) {
        this.colltnType = colltnType == null ? null : colltnType.trim();
    }

    public BigDecimal getColltnMaxAmount() {
        return colltnMaxAmount;
    }

    public void setColltnMaxAmount(BigDecimal colltnMaxAmount) {
        this.colltnMaxAmount = colltnMaxAmount;
    }

    public BigDecimal getColltnFixedAmount() {
        return colltnFixedAmount;
    }

    public void setColltnFixedAmount(BigDecimal colltnFixedAmount) {
        this.colltnFixedAmount = colltnFixedAmount;
    }

    public BigDecimal getFirstColltnAmount() {
        return firstColltnAmount;
    }

    public void setFirstColltnAmount(BigDecimal firstColltnAmount) {
        this.firstColltnAmount = firstColltnAmount;
    }

    public Date getFirstColltnDate() {
        return firstColltnDate;
    }

    public void setFirstColltnDate(Date firstColltnDate) {
        this.firstColltnDate = firstColltnDate;
    }

    public Date getFinalColltnDate() {
        return finalColltnDate;
    }

    public void setFinalColltnDate(Date finalColltnDate) {
        this.finalColltnDate = finalColltnDate;
    }

    public String getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo == null ? null : customerNo.trim();
    }

    public String getCreditorId() {
        return creditorId;
    }

    public void setCreditorId(String creditorId) {
        this.creditorId = creditorId == null ? null : creditorId.trim();
    }

    public String getCreditorName() {
        return creditorName;
    }

    public void setCreditorName(String creditorName) {
        this.creditorName = creditorName == null ? null : creditorName.trim();
    }

    public String getCreditorAcctNo() {
        return creditorAcctNo;
    }

    public void setCreditorAcctNo(String creditorAcctNo) {
        this.creditorAcctNo = creditorAcctNo == null ? null : creditorAcctNo.trim();
    }

    public String getCreditorAcctName() {
        return creditorAcctName;
    }

    public void setCreditorAcctName(String creditorAcctName) {
        this.creditorAcctName = creditorAcctName == null ? null : creditorAcctName.trim();
    }

    public String getCreditorAcctType() {
        return creditorAcctType;
    }

    public void setCreditorAcctType(String creditorAcctType) {
        this.creditorAcctType = creditorAcctType == null ? null : creditorAcctType.trim();
    }

    public String getCreditorAgentId() {
        return creditorAgentId;
    }

    public void setCreditorAgentId(String creditorAgentId) {
        this.creditorAgentId = creditorAgentId == null ? null : creditorAgentId.trim();
    }

    public String getDebtorId() {
        return debtorId;
    }

    public void setDebtorId(String debtorId) {
        this.debtorId = debtorId == null ? null : debtorId.trim();
    }

    public String getDebtorName() {
        return debtorName;
    }

    public void setDebtorName(String debtorName) {
        this.debtorName = debtorName == null ? null : debtorName.trim();
    }

    public String getDebtorAcctNo() {
        return debtorAcctNo;
    }

    public void setDebtorAcctNo(String debtorAcctNo) {
        this.debtorAcctNo = debtorAcctNo == null ? null : debtorAcctNo.trim();
    }

    public String getDebtorAcctName() {
        return debtorAcctName;
    }

    public void setDebtorAcctName(String debtorAcctName) {
        this.debtorAcctName = debtorAcctName == null ? null : debtorAcctName.trim();
    }

    public String getDebtorAcctType() {
        return debtorAcctType;
    }

    public void setDebtorAcctType(String debtorAcctType) {
        this.debtorAcctType = debtorAcctType == null ? null : debtorAcctType.trim();
    }

    public String getDebtorAgentId() {
        return debtorAgentId;
    }

    public void setDebtorAgentId(String debtorAgentId) {
        this.debtorAgentId = debtorAgentId == null ? null : debtorAgentId.trim();
    }

    public String getAcceptFlag() {
        return acceptFlag;
    }

    public void setAcceptFlag(String acceptFlag) {
        this.acceptFlag = acceptFlag == null ? null : acceptFlag.trim();
    }

    public String getRejectCode() {
        return rejectCode;
    }

    public void setRejectCode(String rejectCode) {
        this.rejectCode = rejectCode == null ? null : rejectCode.trim();
    }

    public String getRejectMessage() {
        return rejectMessage;
    }

    public void setRejectMessage(String rejectMessage) {
        this.rejectMessage = rejectMessage == null ? null : rejectMessage.trim();
    }

    public String getMandateAdditional() {
        return mandateAdditional;
    }

    public void setMandateAdditional(String mandateAdditional) {
        this.mandateAdditional = mandateAdditional == null ? null : mandateAdditional.trim();
    }

    public String getMandateRemark() {
        return mandateRemark;
    }

    public void setMandateRemark(String mandateRemark) {
        this.mandateRemark = mandateRemark == null ? null : mandateRemark.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}