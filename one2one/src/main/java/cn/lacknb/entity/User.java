/**
 * @(#)User.java, 7月 27, 2021.
 * <p>
 * Copyright 2021 pinghang.com. All rights reserved.
 * PINGHANG.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package cn.lacknb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <h2></h2>
 * @author niebaohua
 * date 2021/7/27
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    /**
     * 主键id
     */
    private Integer id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别
     */
    private String gender;

    /**
     * 朋友Id
     */
    private Integer friendId;

}
