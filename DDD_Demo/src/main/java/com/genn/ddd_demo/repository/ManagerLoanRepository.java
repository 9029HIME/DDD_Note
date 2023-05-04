package com.genn.ddd_demo.repository;

import com.genn.ddd_demo.domain.ManagerLoan;

public interface ManagerLoanRepository {
    ManagerLoan query(Long managerId);
    void update(ManagerLoan managerLoan);
}
