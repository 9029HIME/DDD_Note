package com.genn.ddd_demo.repository;

import com.genn.ddd_demo.domain.CaseLoan;

public interface CaseLoanRepository {
    CaseLoan query(Long caseId);
    void update(CaseLoan caseLoan);
}
