package com.genn.ddd_demo.builder;

import com.genn.ddd_demo.domain.CaseLoan;
import com.genn.ddd_demo.entity.CaseEntity;
import org.springframework.stereotype.Component;

@Component
public class CaseLoanBuilder {

    public CaseLoan toCaseLoan(CaseEntity caseEntity){
        CaseLoan caseLoan = new CaseLoan();

        return caseLoan;
    }

    public CaseEntity toCaseEntity(CaseLoan caseLoan){
        CaseEntity caseEntity = new CaseEntity();

        return caseEntity;
    }


}
