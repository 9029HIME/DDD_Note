package com.genn.ddd_demo.builder;

import com.genn.ddd_demo.domain.ManagerLoan;
import com.genn.ddd_demo.entity.ManagerEntity;
import org.springframework.stereotype.Component;

@Component
public class ManagerLoanBuilder {

    public ManagerLoan toManagerLoan(ManagerEntity managerEntity){
        ManagerLoan managerLoan = new ManagerLoan();

        return managerLoan;
    }

    public ManagerEntity toManagerEntity(ManagerLoan managerLoan){
        ManagerEntity managerEntity = new ManagerEntity();

        return managerEntity;
    }
    
}
