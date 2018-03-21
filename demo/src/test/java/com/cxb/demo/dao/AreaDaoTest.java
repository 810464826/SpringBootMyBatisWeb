package com.cxb.demo.dao;

import com.cxb.demo.model.Area;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class AreaDaoTest {
    @Autowired
    private AreaDao areaDao;
    @Test
    public void queryArea() {
        List<Area> list=areaDao.queryArea();
        System.out.println(list.size());
    }

    @Test
    public void queryAreaById() {
        Area area = areaDao.queryAreaById(1);
        System.out.println(area.getAreaName());
    }

    @Test
    public void insertArea() {
        Area area=new Area();
        area.setAreaName("北苑");
        area.setPriority(4);
        area.setCreateTime(new Date());
        int i = areaDao.insertArea(area);
        System.out.println(i);
    }

    @Test
    //暂时不执行该方法
    @Ignore
    public void updateArea() {
        Area area=new Area();
        area.setAreaName("华西苑");
        area.setAreaId(4);
        area.setLastEditTime(new Date());
        int i = areaDao.updateArea(area);
        System.out.println(i);
    }

    @Test
    public void deleteArea() {
        int i = areaDao.deleteArea(2);
        System.out.println(i);
    }
}