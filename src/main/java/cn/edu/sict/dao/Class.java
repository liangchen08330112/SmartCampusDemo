package cn.edu.sict.dao;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @description: 班级信息
 */
@Data
@TableName("tb_class")
public class Class {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    private String name;
    private String students;   //学生数量
    private String classIntro; //班级介绍
    private String headmaster; //班主任姓名
    private String telephone;  //班主任电话
    private String email;      //班主任邮箱
    private String grade;      //所属级部
}
