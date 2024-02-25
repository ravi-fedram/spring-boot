package com.pracrice.onetoone.dao;

import com.pracrice.onetoone.entity.Instructor;
import com.pracrice.onetoone.entity.InstructorDetail;
import org.springframework.context.annotation.Bean;


public interface InstructorDao {

    void Save(Instructor instructor);

    Instructor findInstructorById(int id);

    void deleteInstructorById(int id);

    InstructorDetail findInstructorDetailsById(int id);

    void deleteInstructorDetailsById(int id);


}
