package com.scoheart.service;

import com.scoheart.dao.CustomerMapper;
import com.scoheart.pojo.Customer;
import com.scoheart.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * @ProjectName: ScoheartPages
 * @ClassName: CustomerService
 * @Description: TODO
 * @Author: Scoheart
 * @Date: 2022/11/9 21:08
 * @Version: 1.0
 **/


public class CustomerService {

    SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();

    public List<Customer> queryAllCustomer(){

        SqlSession sqlSession = sqlSessionFactory.openSession();
        CustomerMapper mapper = sqlSession.getMapper(CustomerMapper.class);
        List<Customer> customers = mapper.queryAllCustomer();

        sqlSession.close();
        return customers;
    }
}
