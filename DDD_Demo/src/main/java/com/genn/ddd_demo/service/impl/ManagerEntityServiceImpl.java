package com.genn.ddd_demo.service.impl;


import com.genn.ddd_demo.entity.ManagerEntity;
import com.genn.ddd_demo.mapper.ManagerEntityMapper;
import com.genn.ddd_demo.service.ManagerEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagerEntityServiceImpl implements ManagerEntityService {

    @Autowired
    private ManagerEntityMapper managerEntityMapper;

    @Override
    public ManagerEntity queryById(Long id) {
        return managerEntityMapper.queryById(id);
    }

    @Override
    public void update(ManagerEntity managerEntity) {
        managerEntityMapper.update(managerEntity);
    }
}
