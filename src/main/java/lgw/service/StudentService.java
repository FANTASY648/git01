package lgw.service;

import lgw.mapper.StudentMapper;
import lgw.message.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Transactional
    public List<Student> queryList(){
        return studentMapper.queryList();
    }


}
