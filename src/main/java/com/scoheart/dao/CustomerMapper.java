package com.scoheart.dao;

import com.scoheart.pojo.Customer;

import java.util.List;

/**
 * @ProjectName: ScoheartPages
 * @InterfaceName: CustomerMapper
 * @Description: TODO
 * @Author: Scoheart
 * @Date: 2022/11/9 20:33
 * @Version: 1.0
 **/


public interface CustomerMapper {
    List<Customer>  queryAllCustomer();
}
