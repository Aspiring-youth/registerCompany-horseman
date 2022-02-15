package org.horseman.api.service.impl;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.horseman.api.service.TestService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class TestServiceImpl implements TestService {
    private final Log logger = LogFactory.getLog(TestServiceImpl.class);


    @Override
    public Object queryAA() {
        return "很棒的哦！！！";
    }
}
