package com.pracrice.onetomay.dao;

import com.pracrice.onetomay.entity.Instructor;
import com.pracrice.onetomay.entity.InstructorDetail;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class InstructorDaoImpl implements InstructorDao{


    @Autowired
    private EntityManager entityManager;


    @Override
    @Transactional
    public void Save(Instructor instructor) {
        this.entityManager.persist(instructor);
    }

    @Override
    public Instructor findInstructorById(int id) {
        return this.entityManager.find(Instructor.class,id);
    }

    @Override
    @Transactional
    public void deleteInstructorById(int id) {
        Instructor temp = this.entityManager.find(Instructor.class,id);
        this.entityManager.remove(temp);
    }

    @Override
    public InstructorDetail findInstructorDetailsById(int id) {
        return this.entityManager.find(InstructorDetail.class,id);
    }

    @Transactional
    @Override
    public void deleteInstructorDetailsById(int id) {
        InstructorDetail tempDetail = this.entityManager.find(InstructorDetail.class,id);
        Instructor tempInstructor = tempDetail.getInstructor();
        tempInstructor.setInstructorDetail(null);
        this.entityManager.remove(tempDetail);
    }
}
