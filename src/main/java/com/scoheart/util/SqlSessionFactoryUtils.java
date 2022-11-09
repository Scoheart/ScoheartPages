package com.scoheart.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @ProjectName: ScoheartPages
 * @ClassName: SqlSessionFactoryUtils
 * @Description: TODO
 * @Author: Scoheart
 * @Date: 2022/11/9 20:56
 * @Version: 1.0
 **/


public class SqlSessionFactoryUtils {

    private static SqlSessionFactory sqlSessionFactory;

    static {
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
       sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }


    public static SqlSessionFactory getSqlSessionFactory() {
        return sqlSessionFactory;
    }
}
