package com.scoheart.servlet;

import com.alibaba.fastjson.JSON;
import com.scoheart.dao.GoodsMapper;
import com.scoheart.pojo.Goods;
import com.scoheart.service.GoodsService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "QueryAllGoodsServlet", value = "/QueryAllGoodsServlet")
public class QueryAllGoodsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        GoodsService goodsService = new GoodsService();
        List<Goods> goods = goodsService.queryAllGoods();
        String jsonString = JSON.toJSONString(goods);

        response.setContentType("text/json;charset = utf-8");
        response.getWriter().write(jsonString);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
