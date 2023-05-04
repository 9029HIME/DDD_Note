package com.genn.ddd_demo.repository.impl;

import com.genn.ddd_demo.builder.CaseLoanBuilder;
import com.genn.ddd_demo.domain.CaseLoan;
import com.genn.ddd_demo.entity.CaseEntity;
import com.genn.ddd_demo.mapper.CaseEntityMapper;
import com.genn.ddd_demo.repository.CaseLoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CaseLoanRepositoryImpl implements CaseLoanRepository {

    @Autowired
    private CaseEntityMapper caseEntityMapper;
    @Autowired
    private CaseLoanBuilder caseLoanBuilder;

    @Override
    public CaseLoan query(Long caseId) {
        CaseEntity caseEntity = caseEntityMapper.queryById(caseId);
        CaseLoan caseLoan = caseLoanBuilder.toCaseLoan(caseEntity);
        return caseLoan;
    }

    @Override
    public void update(CaseLoan caseLoan) {
        CaseEntity caseEntity = caseLoanBuilder.toCaseEntity(caseLoan);
        caseEntityMapper.update(caseEntity);
    }
}
