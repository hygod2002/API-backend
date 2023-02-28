package com.hygod.project.service.impl.inner;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hygod.hygodcommon.model.entity.User;
import com.hygod.hygodcommon.service.InnerUserService;
import com.hygod.project.common.ErrorCode;
import com.hygod.project.exception.BusinessException;
import com.hygod.project.mapper.UserMapper;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

/**
 * @Author: hygod
 * @Date: 2023/2/27
 * @Time: 15:25
 * @Description:
 */
@DubboService
public class InnerUserServiceImpl implements InnerUserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User getInvokeUser(String accessKey) {

        if (StringUtils.isAnyBlank(accessKey)){
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }

        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.eq("accessKey",accessKey);

        return userMapper.selectOne(userQueryWrapper);
    }
}
