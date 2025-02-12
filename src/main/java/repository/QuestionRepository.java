package repository;

import entity.Answer;
import entity.Question;

import java.util.HashMap;


public class QuestionRepository {

    private final HashMap<String, Question> questions = new HashMap<>();

    public QuestionRepository(){

        getQuestionsFromDb();
    }

    private void getQuestionsFromDb(){
        questions.put("0", new Question("Вы ищите работу?",
                                        new Answer("Да", "1"),
                                        new Answer("Нет", "stop")
        ));
        questions.put("1", new Question("У вас есть высшее техническое образование?",
                                        new Answer("Да", "2"),
                                        new Answer("Нет", "3")
                                        ));
        questions.put("2", new Question("Вы хотели бы работать в IT?",
                                        new Answer("Да", "final"),
                                        new Answer("Нет", "3")
                ));
        questions.put("3", new Question("Вы готовы работать вахтовым методом?",
                                        new Answer("Да", "final"),
                                        new Answer("Нет", "stop")
        ));

    }

    public HashMap<String, Question> getQuestions() {
        return questions;
    }
}
