package com.genn.ddd_demo.service;

import com.genn.ddd_demo.entity.ManagerEntity;

public interface ManagerEntityService {

    ManagerEntity queryById(Long id);

    void update(ManagerEntity managerEntity);

}
