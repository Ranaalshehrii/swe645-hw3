package edu.gmu.springboot.student_survey.controller;

import edu.gmu.springboot.student_survey.model.Survey;
import edu.gmu.springboot.student_survey.repository.SurveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/survey")
public class SurveyController {

    @Autowired
    private SurveyRepository surveyRepository;

    // 1. Save a New Survey (CREATE)
    @PostMapping("/save")
    public Survey saveSurvey(@RequestBody Survey survey) {
        return surveyRepository.save(survey);
    }

    // 2. Retrieve All Surveys (READ ALL)
    @GetMapping("/all")
    public List<Survey> getAllSurveys() {
        return surveyRepository.findAll();
    }

    // 3. Retrieve Survey By ID (READ ONE)
    @GetMapping("/{id}")
    public Optional<Survey> getSurveyById(@PathVariable Long id) {
        return surveyRepository.findById(id);
    }

    // 4. Update Survey (UPDATE)
    @PutMapping("/update/{id}")
    public Survey updateSurvey(@PathVariable Long id, @RequestBody Survey survey) {
        survey.setId(id); // Ensure the correct ID is used for updating
        return surveyRepository.save(survey);
    }

    // 5. Delete Survey By ID (DELETE)
    @DeleteMapping("/delete/{id}")
    public void deleteSurvey(@PathVariable Long id) {
        surveyRepository.deleteById(id);
    }
}
