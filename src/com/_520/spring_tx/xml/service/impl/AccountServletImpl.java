package com._520.spring_tx.xml.service.impl;

import com._520.spring_tx.xml.dao.IAccountDAO;
import com._520.spring_tx.xml.service.IAccountService;

public class AccountServletImpl implements IAccountService {

    private IAccountDAO dao;

    public void setDao(IAccountDAO dao) {
        this.dao = dao;
    }

    public void trans(Long outId, Long inId, int money) {
        dao.transIn(inId, money);
//        int i = 1 / 0;
        dao.transOut(outId, money);
    }
}
