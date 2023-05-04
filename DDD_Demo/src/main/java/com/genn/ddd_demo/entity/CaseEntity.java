package com.genn.ddd_demo.entity;

/**
 * 案件Entity，与数据库字段对应。
 */
public class CaseEntity {
    private Long caseId;
    private String caseStatus;
    private Long managerId;
    private Integer caseLevel;
    private String createTime;
    private String updateTime;

    public Long getCaseId() {
        return caseId;
    }

    public void setCaseId(Long caseId) {
        this.caseId = caseId;
    }

    public String getCaseStatus() {
        return caseStatus;
    }

    public void setCaseStatus(String caseStatus) {
        this.caseStatus = caseStatus;
    }

    public Long getManagerId() {
        return managerId;
    }

    public void setManagerId(Long managerId) {
        this.managerId = managerId;
    }

    public Integer getCaseLevel() {
        return caseLevel;
    }

    public void setCaseLevel(Integer caseLevel) {
        this.caseLevel = caseLevel;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
}
