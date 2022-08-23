package cn.edu.sict.dao;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @description: 学生信息
 */
@Data
@TableName("tb_student")
public class Student {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    private String stuNo;        //学号
    private String name;
    private char sex;
    private String password;
    private String telephone;
    private String address;      //家庭住址
    private String dormNo;       //宿舍号
    private String introduction; //个人介绍
    private String portrait;     //头像存放路径
    private String classBelong;  //所属班级
}
