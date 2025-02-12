package entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.Objects;

@AllArgsConstructor
@Getter
@EqualsAndHashCode
public class Answer {

    private String answer;
    private String nextStep;

}
