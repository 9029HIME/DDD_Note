package com.genn.ddd_demo.service;

import com.genn.ddd_demo.vo.SubmitCaseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface ThirdPartyService {

    void loanSubmit(SubmitCaseVo submitCaseVo);

}
