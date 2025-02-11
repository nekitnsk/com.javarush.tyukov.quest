package entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Question {

    private String question;
    private Answer answer1;
    private Answer answer2;

}
