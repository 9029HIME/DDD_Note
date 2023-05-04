package com.genn.ddd_demo.repository.impl;

import com.genn.ddd_demo.builder.ManagerLoanBuilder;
import com.genn.ddd_demo.domain.ManagerLoan;
import com.genn.ddd_demo.entity.ManagerEntity;
import com.genn.ddd_demo.mapper.ManagerEntityMapper;
import com.genn.ddd_demo.repository.ManagerLoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ManagerLoanRepositoryImpl implements ManagerLoanRepository {

    @Autowired
    private ManagerEntityMapper managerEntityMapper;
    @Autowired
    private ManagerLoanBuilder managerLoanBuilder;

    @Override
    public ManagerLoan query(Long managerId) {
        ManagerEntity managerEntity = managerEntityMapper.queryById(managerId);
        ManagerLoan managerLoan = managerLoanBuilder.toManagerLoan(managerEntity);
        return managerLoan;
    }

    @Override
    public void update(ManagerLoan managerLoan) {
        ManagerEntity managerEntity = managerLoanBuilder.toManagerEntity(managerLoan);
        managerEntityMapper.update(managerEntity);
    }
}
