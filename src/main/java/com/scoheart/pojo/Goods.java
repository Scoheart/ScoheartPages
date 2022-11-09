package com.scoheart.pojo;

/**
 * @ProjectName: ScoheartPages
 * @ClassName: Goods
 * @Description: TODO
 * @Author: Scoheart
 * @Date: 2022/11/9 22:04
 * @Version: 1.0
 **/


public class Goods {
 private  Integer   goodsId;
 private  String   goodsName;
 private  String   goodsIntro;
 private  Double   goodsPrice;
 private  String   goodsClass;
 private  Integer   goodsInventory;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsIntro() {
        return goodsIntro;
    }

    public void setGoodsIntro(String goodsIntro) {
        this.goodsIntro = goodsIntro;
    }

    public Double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getGoodsClass() {
        return goodsClass;
    }

    public void setGoodsClass(String goodsClass) {
        this.goodsClass = goodsClass;
    }

    public Integer getGoodsInventory() {
        return goodsInventory;
    }

    public void setGoodsInventory(Integer goodsInventory) {
        this.goodsInventory = goodsInventory;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goodsId=" + goodsId +
                ", goodsName='" + goodsName + '\'' +
                ", goodsIntro='" + goodsIntro + '\'' +
                ", goodsPrice=" + goodsPrice +
                ", goodsClass='" + goodsClass + '\'' +
                ", goodsInventory=" + goodsInventory +
                '}';
    }
}
