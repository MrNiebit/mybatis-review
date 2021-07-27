package cn.lacknb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <h2></h2>
 * @author gitsilence
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
     * 朋友
     */
    private User friend;

    /**
     * 朋友Id
     */
    private Integer friendId;

}
