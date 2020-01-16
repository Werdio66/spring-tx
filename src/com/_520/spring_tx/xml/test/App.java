package com._520.spring_tx.xml.test;


import com._520.spring_tx.xml.advice.CjlibAccountServiceProxy;
import com._520.spring_tx.xml.advice.JdkAccountServiceProxy;
import com._520.spring_tx.xml.service.IAccountService;
import com._520.spring_tx.xml.service.impl.AccountServletImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.Arrays;
import java.util.List;

@SpringJUnitConfig
public class App {


//    @Autowired
//    private JdkAccountServiceProxy accountServiceProxy;

    @Autowired
    private CjlibAccountServiceProxy cjlibAccountServiceProxy;

//    @Autowired
//    private IAccountService service;
   @Test
    void trans(){
//       service.trans(10086L, 10010L,1000);
   }


    @Test
    void save(){
//        IAccountService proxy = accountServiceProxy.getProxyObject();
//        System.out.println(Arrays.toString(proxy.getClass().getInterfaces()));
        System.out.println("================================================");
        AccountServletImpl cjlibProxy = cjlibAccountServiceProxy.getProxyObject();
        System.out.println(cjlibProxy.getClass());
   }
}
