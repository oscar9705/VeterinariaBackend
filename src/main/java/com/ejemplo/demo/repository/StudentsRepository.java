package com.ejemplo.demo.repository;

import com.ejemplo.demo.model.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import  java.util.List;

public interface StudentsRepository extends JpaRepository<Students, Long> {

    List<Students> findAllByFirstName(String firsName);

    @Query(nativeQuery = true,
            value = "SELECT " +
                    "st_first_name," +
                    "st_first_surname, " +
                    "st_id, " +
                    "st_number_id, " +
                    "st_second_name, " +
                    "st_second_surname, " +
                    "st_active" +
                    "FROM students" +
                    "WHERE st_number_id =: dni")
    Students getOneByNumberId(@Param(value = "dni") Integer numberId);



}