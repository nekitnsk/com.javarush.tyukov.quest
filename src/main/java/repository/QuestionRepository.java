package repository;

import entity.Answer;
import entity.Question;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@Getter
public class QuestionRepository {

    private HashMap<Integer, Question> question = new HashMap<>();

    public QuestionRepository(){
        getQuestionsFromDb();
    }

    private void getQuestionsFromDb(){
        question.put(0, new Question("Вы ищите работу?",
                                        new Answer("Да", 1),
                                        new Answer("Нет", 99)
        ));
        question.put(1, new Question("У вас есть высшее техническое образование?",
                                        new Answer("Да", 2),
                                        new Answer("Нет", 3)
                                        ));
        question.put(2, new Question("Вы хотели бы работать в IT?",
                                        new Answer("Да", 77),
                                        new Answer("Нет", 3)
                ));
        question.put(3, new Question("Вы готовы работать вахтовым методом?",
                                        new Answer("Да", 77),
                                        new Answer("Нет", 99)
        ));

    }
}
