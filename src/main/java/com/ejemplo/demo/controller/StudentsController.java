package com.ejemplo.demo.controller;

import com.ejemplo.demo.model.Students;
import com.ejemplo.demo.service.StudentsService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentsController {

    private final StudentsService studentsService;

    @Autowired
    public StudentsController(StudentsService studentsService){
        this.studentsService = studentsService;
    }

    @PostMapping(path = "/save")
    @ApiOperation(value = "Insert Students", response = Students.class)
    public Students saveStudent (@RequestBody Students students){
        return studentsService.saveStudent(students);
    }

    @PutMapping(path = "/update")
    @ApiOperation(value = "Insert Students", response = Students.class)
    public Students updateStudent(@RequestBody Students students){
        return studentsService.updateStudent(students);
    }

    @GetMapping(path = "all/name")
    @ApiOperation(value = "Insert Students", response = Students.class)
    public List<Students> findAllByFirstName(@RequestParam(name = "name") String firstName){
        return studentsService.findAllByFirstName(firstName);
    }

    @GetMapping(path = "/numberId")
    @ApiOperation(value = "Insert Students", response = Students.class)
    public Students getOneByNumberId (@RequestParam(name = "number") Integer numberId){
        return studentsService.getOneByNumberId(numberId);
    }

    @DeleteMapping(path = "/delete")
    @ApiOperation(value = "Insert Students", response = Students.class)
    public void deleteById(@RequestParam(name = "id") long id){
        studentsService.deleteStudents(id);

    }

    @GetMapping(path = "/all")
    @ApiOperation(value = "Insert Students", response = Students.class)
    public  List<Students> findAll(){
        return  studentsService.findAll();
    }
}
