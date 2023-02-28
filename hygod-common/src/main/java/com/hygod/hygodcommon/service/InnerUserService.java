package com.hygod.hygodcommon.service;



import com.hygod.hygodcommon.model.entity.User;


/**
 * 用户服务
 *
 * @author yupi
 */
public interface InnerUserService  {

    /**
     *     1.数据库中查询是否分配给用户秘钥
     * @param  accessKey
     * @return
     */
    User getInvokeUser(String accessKey);


}
