package com.genn.ddd_demo.service.impl;


import com.genn.ddd_demo.service.AuditLoanService;
import com.genn.ddd_demo.vo.SubmitCaseVo;
import org.springframework.stereotype.Service;

/**
 * 贷前系统 和 审批系统 的RPC请求类，
 */
@Service
public class AuditLoanServiceImpl implements AuditLoanService {

    @Override
    public String submit(SubmitCaseVo vo) {
        System.out.println("caseBasic提交到审批系统.......");
        return "000000";
    }
}
