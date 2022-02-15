package org.horseman.api.web;


import jdk.nashorn.internal.runtime.logging.Logger;
import org.horseman.api.annotation.LoginUser;
import org.horseman.api.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/test")
@RestController
@Logger
public class test {

    @Autowired
    private TestService testService;

    @GetMapping("/queryAA")
    public Object queryAA(@LoginUser Integer userId){
        if (userId == null){
            return "请登录";
        }
       return testService.queryAA();
    }


}
