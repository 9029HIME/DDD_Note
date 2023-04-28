package com.genn.mvc_demo.service.impl;

import com.genn.mvc_demo.entity.CaseEntity;
import com.genn.mvc_demo.entity.ManagerEntity;
import com.genn.mvc_demo.mapper.CaseEntityMapper;
import com.genn.mvc_demo.service.AuditLoanService;
import com.genn.mvc_demo.service.CaseEntityService;
import com.genn.mvc_demo.service.ManagerEntityService;
import com.genn.mvc_demo.vo.SubmitCaseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 案件Service层
 */
@Service
public class CaseEntityServiceImpl implements CaseEntityService {
    @Autowired
    private CaseEntityMapper caseEntityMapper;
    @Autowired
    private AuditLoanService auditLoanService;
    @Autowired
    private ManagerEntityService managerEntityService;

    @Override
    public void submit(Long caseId) {
        CaseEntity caseEntity = caseEntityMapper.queryById(caseId);
        ManagerEntity managerEntity = managerEntityService.queryById(caseEntity.getManagerId());
        // 包装请求，调用审批系统
        SubmitCaseVo submitCaseVo = new SubmitCaseVo();
        submitCaseVo.setCaseId(caseEntity.getCaseId());
        String result = auditLoanService.submit(submitCaseVo);
        if(!"000000".equals(result)){
            throw new RuntimeException("提交案件审批失败");
        }
        // 更改案件状态为2（审批中）
        caseEntity.setCaseStatus("2");
        // 客户经理的案件个数+1
        managerEntity.setCaseCount(managerEntity.getCaseCount()+1);
        // 更新数据库
        caseEntityMapper.update(caseEntity);
        managerEntityService.update(managerEntity);
    }
}
