package com.hengliu.onlineshopping_01.db.dao;

import com.hengliu.onlineshopping_01.db.po.OnlineShoppingCommodity;

import java.util.List;

public interface OnlineShoppingCommodityDao {
    int insertCommodity(OnlineShoppingCommodity commodity);
    OnlineShoppingCommodity selectCommoditybyid(long commodityid);
    List<OnlineShoppingCommodity> ListCommodities();
    List<OnlineShoppingCommodity> ListCommoditiesByUserid(long userid);
}
