package com.hygod.project.model.dto.userInterfaceInfo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * 在线调用请求
 *
 * @TableName product
 */
@Data
public class UserInterfaceInfoInvokeRequest implements Serializable {



        /**
         * 主键
         */
        @TableId(type = IdType.AUTO)
        private Long id;


        /**
         * 请求参数
         */
        private String userRequestParams;


        private static final long serialVersionUID = 1L;
    }


