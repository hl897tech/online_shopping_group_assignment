package com.hengliu.onlineshopping_01.db.dao;

import com.hengliu.onlineshopping_01.db.po.OnlineShoppingCommodity;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@Slf4j
class OnlineShoppingCommodityDaoTest {
    @Resource
    OnlineShoppingCommodityDao onlineShoppingCommodityDao;
    @BeforeEach
    void setUp() {
    }

    @Test
    void insertCommodity() {
        OnlineShoppingCommodity onlineShoppingCommodity = OnlineShoppingCommodity.builder()
                .commodityName("test2")
                .commodityDesc("desc2")
                .commodityId(1001L)
                .availableStock(101)
                .totalStock(200)
                .lockStock(0)
                .price(111)
                .creatorUserId(1001L)
                .build();
        onlineShoppingCommodityDao.insertCommodity(onlineShoppingCommodity);
    }

    @Test
    void selectCommoditybyid() {
     OnlineShoppingCommodity onlineShoppingCommodity = onlineShoppingCommodityDao.selectCommoditybyid(1000L);
     log.info("commodity1000 " + onlineShoppingCommodity);
    }
    @Test
    void listcommdities() {
        List<OnlineShoppingCommodity> onlineShoppingCommodityList = onlineShoppingCommodityDao.ListCommodities();
        log.info("commodity: " + onlineShoppingCommodityList);
    }
    @Test
    void listcommditiesbyuserid() {
        List<OnlineShoppingCommodity> onlineShoppingCommoditybyuseridList = onlineShoppingCommodityDao.ListCommoditiesByUserid(1001L);
        log.info("1001id commodity: " + onlineShoppingCommoditybyuseridList);
    }
}