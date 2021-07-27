
package cn.lacknb.dao;

import cn.lacknb.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * <h2></h2>
 * @author gitsilence
 * date 2021/7/27
 */
public interface UserDao {

    int addUser (User user);

    int updateUser (User user);

    User findById (@Param("id") Integer id);

    User findByIdPlus (@Param("id") Integer id);

}
