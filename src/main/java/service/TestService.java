package service;

import entity.Question;
import repository.QuestionRepository;

import java.util.HashMap;

public class TestService {

    public Question getQuestion(String answer){

        QuestionRepository questionRepository = new QuestionRepository();
        HashMap<String, Question> questions = questionRepository.getQuestions();

        if(answer != null && !answer.isEmpty() && !answer.equals("restart")) {
            return questions.get(answer);
        }else {
            return questions.get("0");
        }



    }
}
