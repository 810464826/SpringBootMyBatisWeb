package com.cxb.demo.dao;

import com.cxb.demo.model.Area;

import java.util.List;
//这里的dao层的方法名是与mybatis.xml文件中id名称一一对应的
public interface AreaDao {
    //查询所有
    List<Area> queryArea();

    //根据id查询
    Area queryAreaById(int areaId);

    //插入添加地区
    int insertArea(Area area);

    //更新地区
    int updateArea(Area area);

    //删除地区
    int deleteArea(int areaId);
}
