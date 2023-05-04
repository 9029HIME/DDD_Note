package com.genn.ddd_demo.domain;

public class CaseLoan {
    public Long caseId;
    public String caseStatus;
    public Long managerId;

    public void submitSuccess(){
        this.caseStatus = "2";
    }
}