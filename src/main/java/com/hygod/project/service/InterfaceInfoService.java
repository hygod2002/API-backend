package com.hygod.project.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.hygod.hygodcommon.model.entity.InterfaceInfo;

/**
* @author 35322
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2023-02-21 13:35:30
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {




    void validinterfaceinfo(InterfaceInfo interfaceinfo, boolean add);
}
