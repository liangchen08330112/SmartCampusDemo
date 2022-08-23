package cn.edu.sict.dao;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @description: 级部信息
 */
@Data
@TableName("tb_grade")
public class Grade {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    private String name;
    private String manager;  //级部主任姓名
    private String email;    //级部主任邮箱
    private String telephone;//级部主任电话
}
