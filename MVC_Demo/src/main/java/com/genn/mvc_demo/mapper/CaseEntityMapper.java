package com.genn.mvc_demo.mapper;

import com.genn.mvc_demo.entity.CaseEntity;
import org.springframework.stereotype.Repository;

/**
 *  案件的Mapper层
 */
@Repository
public class CaseEntityMapper {

    public void update(CaseEntity caseEntity){
        System.out.println("更新caseEntity.......");
    }

    public CaseEntity queryById(Long caseId){
        return new CaseEntity();
    }


}
