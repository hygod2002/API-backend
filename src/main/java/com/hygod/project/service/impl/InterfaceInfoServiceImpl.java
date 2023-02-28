package com.hygod.project.service.impl;
import java.util.Date;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.hygod.hygodcommon.model.entity.InterfaceInfo;
import com.hygod.project.common.ErrorCode;
import com.hygod.project.exception.BusinessException;
import com.hygod.project.mapper.InterfaceInfoMapper;
import com.hygod.project.service.InterfaceInfoService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
* @author 35322
* @description 针对表【interface_info(接口信息)】的数据库操作Service实现
* @createDate 2023-02-22 20:04:56
*/
@Service
public class InterfaceInfoServiceImpl extends ServiceImpl<InterfaceInfoMapper, InterfaceInfo>
    implements InterfaceInfoService {


    @Override
    public void validinterfaceinfo(InterfaceInfo interfaceinfo, boolean add) {
    if (interfaceinfo == null) {
        throw new BusinessException(ErrorCode.PARAMS_ERROR);
    }
     Long id = interfaceinfo.getId();
     String name = interfaceinfo.getName();
     String description = interfaceinfo.getDescription();
     String url = interfaceinfo.getUrl();
     String requestParams = interfaceinfo.getRequestParams();
     String requestHeader = interfaceinfo.getRequestHeader();
     String responseHeader = interfaceinfo.getResponseHeader();
     Integer status = interfaceinfo.getStatus();
     String method = interfaceinfo.getMethod();
     Long userId = interfaceinfo.getUserId();
     Date createTime = interfaceinfo.getCreateTime();
     Date updateTime = interfaceinfo.getUpdateTime();
     Integer isDelete = interfaceinfo.getIsDelete();

        if (add) {
            if (StringUtils.isAnyBlank(name)) {
                throw new BusinessException(ErrorCode.PARAMS_ERROR);
            }
        }
        if (StringUtils.isNotBlank(name) && name.length() > 50) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "名字过长");
        }
    }
}




