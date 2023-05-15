package com.example.packing.mapper;

import com.example.packing.entity.Student;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

/**
* @author ingram
* @description 针对表【student】的数据库操作Mapper
* @createDate 2023-05-15 12:45:39
* @Entity com.example.packing.entity.Student
*/
@Mapper
public interface StudentMapper extends BaseMapper<Student> {

}




