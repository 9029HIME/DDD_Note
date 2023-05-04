package com.genn.ddd_demo.service;

import com.genn.ddd_demo.domain.CaseLoan;
import com.genn.ddd_demo.domain.ManagerLoan;

public interface CaseLoanSubmitService {
    void submitSuccess(CaseLoan caseLoan, ManagerLoan managerLoan);
}
