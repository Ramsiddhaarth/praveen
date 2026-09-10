package grp.project.grpart.stduentrepositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import grp.project.grpart.domain.student;

@Repository 
public interface studentrepositry extends JpaRepository<student, Integer>{
    student findByStudentnameAndPassword(String studentname, String password);

}
