package com.hygod.hygodcommon.service;

import com.hygod.hygodcommon.model.entity.UserInterfaceInfo;

/**
* @author 35322
* @description 针对表【user_interface_info(用户调用接口关系表)】的数据库操作Service
* @createDate 2023-02-26 14:06:20
*/
public interface InnerUserInterfaceInfoService  {



    /**
     * 调用接口统计
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    Boolean invokeCount(long interfaceInfoId, long userId);

    /**
     * 剩余调用次数统计，
     * @param userId
     * @param interfaceInfoId
     * @return
     */
    Integer getLeftNum(Long userId,Long interfaceInfoId);

}
