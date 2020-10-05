package com.xm.pojo;

import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.NotNull;

/**
 * 发红包请求时接收的参数对象
 */
@Data
@ToString
public class RedPacketDto {

    private Integer userId;

    //指定多少人抢
    @NotNull
    private Integer total;

    //指定总金额-单位为分
    @NotNull
    private Integer amount;
}









































