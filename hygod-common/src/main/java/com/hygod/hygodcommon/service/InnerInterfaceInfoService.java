package com.hygod.hygodcommon.service;


import com.hygod.hygodcommon.model.entity.InterfaceInfo;
import com.hygod.hygodcommon.model.entity.User;

/**
* @author 35322
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2023-02-21 13:35:30
*/
public interface InnerInterfaceInfoService  {

    /**
     *     查询模拟接口是否发布以及接口参数等信息
     * @param  url
     * @param  method
     * @return
     */
    InterfaceInfo getInterfaceInfo(String url, String method);


}
