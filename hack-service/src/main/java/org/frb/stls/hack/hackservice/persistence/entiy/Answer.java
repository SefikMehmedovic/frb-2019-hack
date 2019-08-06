package org.frb.stls.hack.hackservice.persistence.entiy;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name="ANSWER")
public class Answer implements Serializable {
    private static final long serialVersionsId = -1;
    @Id
    @Column(name= "ID")
    private Integer id;

    @Column(name= "QUESTION_ID")
    private Integer questionId;

    @Column(name= "CORRECT")
    private Boolean correct;

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
}
