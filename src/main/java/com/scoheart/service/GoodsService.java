package com.scoheart.service;

import com.scoheart.dao.GoodsMapper;
import com.scoheart.pojo.Goods;
import com.scoheart.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * @ProjectName: ScoheartPages
 * @ClassName: GoodsService
 * @Description: TODO
 * @Author: Scoheart
 * @Date: 2022/11/9 22:47
 * @Version: 1.0
 **/


public class GoodsService {
    public List<Goods> queryAllGoods(){
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        GoodsMapper mapper = sqlSession.getMapper(GoodsMapper.class);
        List<Goods> goods = mapper.queryAllGoods();
        return goods;
    }
}
