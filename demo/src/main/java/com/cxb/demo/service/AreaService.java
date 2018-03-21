package com.cxb.demo.service;

import com.cxb.demo.model.Area;

import java.util.List;

/**
 * 这个接口方法是处理真正的逻辑方法的一些方法，具体的实现是在实现类里实现的，实现类只需要加上@Service 注解即可
 * 在web/controller里面直接调用该接口，即可。只提供公开的方法，不需要提供具体的实现方式。
 */
public interface AreaService {
    /**
     * 获取区域列表
     *
     * @return
     */
    List<Area> getAreaList();

    /**
     * 通过区域Id获取区域信息
     *
     * @param areaId
     * @return
     */
    Area getAreaById(int areaId);

    /**
     * 增加区域信息
     *
     * @param area
     * @return
     */
    boolean addArea(Area area);

    /**
     * 修改区域信息
     *
     * @param area
     * @return
     */
    boolean modifyArea(Area area);

    /**
     * 删除区域信息
     *
     * @param area
     * @return
     */
    boolean deleteArea(int areaId);

}
