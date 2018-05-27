package cn.mycloudx.readinglist.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author zhanghao
 * @date 2018/05/26
 */
@Entity
@Data
public class Reader  {

    @Id
    private String username;
    private String fullname;
    private String password;

}
