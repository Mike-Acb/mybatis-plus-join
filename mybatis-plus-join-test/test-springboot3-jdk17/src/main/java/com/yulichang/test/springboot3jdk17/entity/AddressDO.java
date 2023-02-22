package com.yulichang.test.springboot3jdk17.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@ToString
@Accessors(chain = true)
@EqualsAndHashCode
@TableName("address")
public class AddressDO implements Serializable {

    @TableId
    private Integer id;

    private Integer userId;

    private Integer areaId;

    private String tel;

    private String address;

    @TableLogic
    private Boolean del;
}
