package com.example.packing.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.packing.entity.Student;
import com.example.packing.service.StudentService;
import com.example.packing.mapper.StudentMapper;
import org.springframework.stereotype.Service;

/**
* @author ingram
* @description 针对表【student】的数据库操作Service实现
* @createDate 2023-05-15 12:45:39
*/
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student>
    implements StudentService{

}




