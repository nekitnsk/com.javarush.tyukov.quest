package service;

import entity.Question;
import org.junit.jupiter.api.Test;
import repository.QuestionRepository;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;
class TestServiceTest {

    @Test
    void getQuestionTest() {

        QuestionRepository questionRepository = new QuestionRepository();
        HashMap<String, Question> questions = questionRepository.getQuestions();

        TestService testService = new TestService();

        for (String question: questions.keySet()){

            assertEquals(testService.getQuestion(question), questions.get(question));
        };


    }


}