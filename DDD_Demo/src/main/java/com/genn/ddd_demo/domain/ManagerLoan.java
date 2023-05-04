package com.genn.ddd_demo.domain;

public class ManagerLoan {
    public Long managerId;
    public Integer caseCount;

    public void increaseCaseCount(Integer addend){
        this.caseCount = this.caseCount + addend;
    }
}
