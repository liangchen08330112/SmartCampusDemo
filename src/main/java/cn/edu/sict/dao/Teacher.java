package cn.edu.sict.dao;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("tb_teacher")
public class Teacher {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    private String teachNo;
    private String name;
    private char gender;
    private String password;
    private String email;
    private String telephone;
    private String address;
    private String className;
    private String portrait;
}
