package com._520.spring_tx.xml.tx;

/**
 * 模拟事务增强
 */
public class TranscationManeger {

    public void begin(){
        System.out.println("开启事务");
    }

    public void commit(){
        System.out.println("提交事务");
    }


    public void rollback(){
        System.out.println("回滚事务");
    }
}
