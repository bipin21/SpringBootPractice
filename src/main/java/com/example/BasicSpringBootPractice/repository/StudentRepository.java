package com.example.BasicSpringBootPractice.repository;

import com.example.BasicSpringBootPractice.domain.manytomany.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {

    @Query("select s from Student s where s.firstName = :name")
    List<Student> findStudentsByFirstName(@Param("name") String name);

    @Query("Select s from Student s join s.courses c where c.id = :id")
     List<Student> findAllByCourseId(@Param("id") String id);

    @Query("Select s from Student s where s.gpa <= :gpa")
    List<Student> findAllgpa(@Param("gpa") double gpa);

    @Query("Select s from Student s where s.gpa > :lowergpa and s.gpa < :highgpa")
    List<Student> findAllbetweengpa(@Param("lowergpa") double lowergpa, @Param("highgpa") double highgpa);

    @Query("Select s from Student s where s.L_Name like :startwith%")
    List<Student> findStudentsByFirstNameStartingWith(@Param("startwith") String startwith);
}
