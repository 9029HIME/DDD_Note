package com.genn.mvc_demo.controller;

import com.genn.mvc_demo.service.CaseEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 案件接口
 */
@RestController
@RequestMapping("/case")
public class CaseEntityController {

    @Autowired
    private CaseEntityService caseEntityService;

    @PostMapping("/submit/{caseId}")
    public String submit(@PathVariable("caseId") Long caseId){
        caseEntityService.submit(caseId);
        return "success";
    }

}
