package edu.gmu.springboot.student_survey.repository;

import edu.gmu.springboot.student_survey.model.Survey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurveyRepository extends JpaRepository<Survey, Long> {
}
