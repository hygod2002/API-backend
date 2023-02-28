package com.hygod.project.model.vo;

import com.hygod.hygodcommon.model.entity.InterfaceInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @Author: hygod
 * @Date: 2023/2/28
 * @Time: 15:56
 * @Description:
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class InterfaceInfoVO extends InterfaceInfo {
    /**
     * 调用次数
     */
    private Integer totalNum;

    private  static final long serialVersionUID =1L;
}
