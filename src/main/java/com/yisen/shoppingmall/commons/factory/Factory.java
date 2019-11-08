package com.yisen.shoppingmall.commons.factory;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;

public class Factory {
    private static SqlSessionFactory factory;
    private Factory() {}
    static {
        try {
            Reader reader = Resources.getResourceAsReader("config.xml");
            factory = new SqlSessionFactoryBuilder().build(reader);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static SqlSession getSession() {
        return factory.openSession();
    }
}
