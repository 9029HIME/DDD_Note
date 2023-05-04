package com.genn.ddd_demo.service.impl;

import com.genn.ddd_demo.service.AuditLoanService;
import com.genn.ddd_demo.service.ThirdPartyService;
import com.genn.ddd_demo.vo.SubmitCaseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ThirdPartyServiceImpl implements ThirdPartyService {

    @Autowired
    private AuditLoanService auditLoanService;

    @Override
    public void loanSubmit(SubmitCaseVo submitCaseVo) {
        String result = auditLoanService.submit(submitCaseVo);
        if (!"000000".equals(result)) {
            throw new RuntimeException("提交案件审批失败");
        }
    }

}
