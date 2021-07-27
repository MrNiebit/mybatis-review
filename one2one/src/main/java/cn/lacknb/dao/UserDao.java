/**
 * @(#)UserDao.java, 7月 27, 2021.
 * <p>
 * Copyright 2021 pinghang.com. All rights reserved.
 * PINGHANG.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package cn.lacknb.dao;

import cn.lacknb.entity.User;

/**
 * <h2></h2>
 * @author niebaohua
 * date 2021/7/27
 */
public interface UserDao {

    int addUser (User user);

    int updateUser (User user);

}
