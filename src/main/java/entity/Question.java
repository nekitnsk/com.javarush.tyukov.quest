package entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.Objects;

@AllArgsConstructor
@Getter
@EqualsAndHashCode
public class Question {

    private String question;
    private Answer answer1;
    private Answer answer2;

}
