package com.hygod.project.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hygod.hygodcommon.model.entity.UserInterfaceInfo;

import java.util.List;

/**
* @author 35322
* @description 针对表【user_interface_info(用户调用接口关系表)】的数据库操作Mapper
* @createDate 2023-02-26 14:06:20
* @Entity generator.domain.UserInterfaceInfo
*/
public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {

    List<UserInterfaceInfo> listTopInvokeInterfaceInfo(int limit);

}




