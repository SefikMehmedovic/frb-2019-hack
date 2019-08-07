package org.frb.stls.hack.hackservice.persistence.entiy;

import javax.inject.Named;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="question", schema = "question")
public class Question implements Serializable {
    private static final long serialVersionsId = -1;

    @Id
    @Column(name= "questionid")
    private Integer id;

    @Column(name= "questiontext")
    private String text;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
