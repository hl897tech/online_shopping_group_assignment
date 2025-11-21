package com.hengliu.onlineshopping_01.db.dao.impl;

import com.hengliu.onlineshopping_01.db.dao.OnlineShoppingCommodityDao;
import com.hengliu.onlineshopping_01.db.mappers.OnlineShoppingCommodityMapper;
import com.hengliu.onlineshopping_01.db.po.OnlineShoppingCommodity;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class OnlineShoppingCommodityDaoImpl implements OnlineShoppingCommodityDao {
    @Resource
    OnlineShoppingCommodityMapper onlineShoppingCommodityMapper;
    @Override
    public int insertCommodity(OnlineShoppingCommodity commodity) {
       return onlineShoppingCommodityMapper.insert(commodity);
    }

    @Override
    public OnlineShoppingCommodity selectCommoditybyid(long commodityid) {
        return  onlineShoppingCommodityMapper.selectByPrimaryKey(commodityid);
    }

    @Override
    public List<OnlineShoppingCommodity> ListCommodities() {
        return onlineShoppingCommodityMapper.listCommodities();
    }

    @Override
    public List<OnlineShoppingCommodity> ListCommoditiesByUserid(long userid) {
        return onlineShoppingCommodityMapper.listCommoditiesByUserid(userid);
    }
}
