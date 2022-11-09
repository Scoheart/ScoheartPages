package com.scoheart.dao;

import com.scoheart.pojo.Goods;

import java.util.List;

/**
 * @ProjectName: ScoheartPages
 * @InterfaceName: GoodsMapper
 * @Description: TODO
 * @Author: Scoheart
 * @Date: 2022/11/9 22:09
 * @Version: 1.0
 **/


public interface GoodsMapper {
    List<Goods> queryAllGoods();
}
