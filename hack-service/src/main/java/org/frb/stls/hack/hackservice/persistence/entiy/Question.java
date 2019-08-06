package org.frb.stls.hack.hackservice.persistence.entiy;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name="QUESTION")
public class Question implements Serializable {
    private static final long serialVersionsId = -1;

    @Id
    @Column(name= "ID")
    private Integer id;

    @Column(name= "TEXT")
    private Integer text;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getText() {
        return text;
    }

    public void setText(Integer text) {
        this.text = text;
    }
}
