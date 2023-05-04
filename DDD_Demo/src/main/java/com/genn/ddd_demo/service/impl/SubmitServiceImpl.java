package com.genn.ddd_demo.service.impl;


import com.genn.ddd_demo.domain.CaseLoan;
import com.genn.ddd_demo.domain.ManagerLoan;
import com.genn.ddd_demo.repository.CaseLoanRepository;
import com.genn.ddd_demo.repository.ManagerLoanRepository;
import com.genn.ddd_demo.service.SubmitService;
import com.genn.ddd_demo.service.CaseLoanSubmitService;
import com.genn.ddd_demo.service.ThirdPartyService;
import com.genn.ddd_demo.vo.SubmitCaseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 申请提交应用层
 */
@Service
public class SubmitServiceImpl implements SubmitService {
    @Autowired
    private CaseLoanRepository caseLoanRepository;
    @Autowired
    private ManagerLoanRepository managerLoanRepository;
    @Autowired
    private ThirdPartyService thirdPartyService;
    @Autowired
    private CaseLoanSubmitService caseLoanSubmitService;

    @Override
    public void submit(Long caseId) {
        CaseLoan caseLoan = caseLoanRepository.query(caseId);
        ManagerLoan managerLoan = managerLoanRepository.query(caseLoan.managerId);
        // 包装请求，调用审批系统
        SubmitCaseVo submitCaseVo = new SubmitCaseVo();
        submitCaseVo.setCaseId(caseLoan.caseId);
        thirdPartyService.loanSubmit(submitCaseVo);
        // 提交审批成功后的业务
        caseLoanSubmitService.submitSuccess(caseLoan,managerLoan);
        // 更新数据库
        caseLoanRepository.update(caseLoan);
        managerLoanRepository.update(managerLoan);
    }
}
