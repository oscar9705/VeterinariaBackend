package com.ejemplo.demo.service;

import com.ejemplo.demo.model.Students;
import com.ejemplo.demo.repository.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentsService {

    private final StudentsRepository studentsRepository;

    @Autowired
    public  StudentsService(StudentsRepository studentsRepository){
        this.studentsRepository = studentsRepository;
    }

    public Students saveStudent (Students students){
        return studentsRepository.save(students);
    }

    public Students updateStudent (Students students){
        return studentsRepository.save(students);
    }
    public List<Students> findAllByFirstName (String firstName){
        return studentsRepository.findAllByFirstName(firstName);
    }

    public Students getOneByNumberId (Integer numberId){
        return studentsRepository.getOneByNumberId(numberId);
    }

    public void deleteStudents(Long id){
        studentsRepository.deleteById(id);
    }

    public List<Students> findAll(){
        return studentsRepository.findAll();
    }


}
