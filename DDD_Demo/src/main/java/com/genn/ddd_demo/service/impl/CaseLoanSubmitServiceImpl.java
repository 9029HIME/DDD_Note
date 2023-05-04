package com.genn.ddd_demo.service.impl;

import com.genn.ddd_demo.domain.CaseLoan;
import com.genn.ddd_demo.domain.ManagerLoan;
import com.genn.ddd_demo.service.CaseLoanSubmitService;
import org.springframework.stereotype.Service;

@Service
public class CaseLoanSubmitServiceImpl implements CaseLoanSubmitService {

    @Override
    public void submitSuccess(CaseLoan caseLoan, ManagerLoan managerLoan) {
        // 更改案件状态为2（审批中）
        caseLoan.submitSuccess();
        // 客户经理的案件个数+1
        managerLoan.increaseCaseCount(1);
    }

}
