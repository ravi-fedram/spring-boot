package com.pracrice.onetomay.dao;

import com.pracrice.onetomay.entity.Instructor;
import com.pracrice.onetomay.entity.InstructorDetail;


public interface InstructorDao {

    void Save(Instructor instructor);

    Instructor findInstructorById(int id);

    void deleteInstructorById(int id);

    InstructorDetail findInstructorDetailsById(int id);

    void deleteInstructorDetailsById(int id);


}
