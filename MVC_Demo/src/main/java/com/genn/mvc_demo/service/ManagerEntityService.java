package com.genn.mvc_demo.service;

import com.genn.mvc_demo.entity.ManagerEntity;

public interface ManagerEntityService {

    ManagerEntity queryById(Long id);

    void update(ManagerEntity managerEntity);

}
