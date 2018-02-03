package com.tsp.server.pojo.bo;

import com.tsp.server.enumeration.UpdateReasonEnum;
import lombok.Data;

/**
 * @description :
 * @author: liuyanlong
 * @date: created in 2018/2/4 1:15
 */
@Data
public class UpdateReason {
    private UpdateReasonEnum reasonCode;
    private String reasonDesc;
}
