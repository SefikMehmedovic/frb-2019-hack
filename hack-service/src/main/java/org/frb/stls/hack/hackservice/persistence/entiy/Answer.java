package org.frb.stls.hack.hackservice.persistence.entiy;

import javax.inject.Named;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="answer", schema = "question")
public class Answer implements Serializable {
    private static final long serialVersionsId = -1;
    @Id
    @Column(name= "answerid")
    private Integer id;

    @Column(name= "questionid")
    private Integer questionId;

    @Column(name= "correctflag")
    private Boolean correct;

    @Column(name= "answertext")
    private String answerText;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public Boolean getCorrect() {
        return correct;
    }

    public void setCorrect(Boolean correct) {
        this.correct = correct;
    }

    public String getAnswerText() {
        return answerText;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }
}
