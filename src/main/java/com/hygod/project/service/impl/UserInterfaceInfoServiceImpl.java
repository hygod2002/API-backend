package com.hygod.project.service.impl;



import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hygod.hygodcommon.model.entity.UserInterfaceInfo;
import com.hygod.project.common.ErrorCode;
import com.hygod.project.exception.BusinessException;
import com.hygod.project.mapper.UserInterfaceInfoMapper;
import com.hygod.project.service.UserInterfaceInfoService;
import org.springframework.stereotype.Service;

/**
* @author 35322
* @description 针对表【user_interface_info(用户调用接口关系表)】的数据库操作Service实现
* @createDate 2023-02-26 14:06:20
*/
@Service
public class UserInterfaceInfoServiceImpl extends ServiceImpl<UserInterfaceInfoMapper, UserInterfaceInfo>
    implements UserInterfaceInfoService {

    @Override
    public void validinterfaceinfo(UserInterfaceInfo userInterfaceInfo, boolean add) {
        if (userInterfaceInfo == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        Long userId = userInterfaceInfo.getUserId();
        Long interfaceInfoId = userInterfaceInfo.getInterfaceInfoId();
        Integer leftNum = userInterfaceInfo.getLeftNum();

        if (add) {
            if (interfaceInfoId<=0 || userId<=0) {
                throw new BusinessException(ErrorCode.PARAMS_ERROR,"接口或者用户不存在");
            }
        }
        if (leftNum <0) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "剩余次数不能小于 0 ");
        }
    }

    @Override
    public Boolean invokeCount(long interfaceInfoId, long userId) {
        //校验
        if(interfaceInfoId <=0 || userId <=0){
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        UpdateWrapper<UserInterfaceInfo> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("interfaceInfoId",interfaceInfoId);
        updateWrapper.eq("userId",userId);
        updateWrapper.setSql("leftNum = leftNum -1 , totalNum = totalNUm +1");

        return this.update(updateWrapper);
        //todo 其实这里应该添加事务和锁
    }
}





