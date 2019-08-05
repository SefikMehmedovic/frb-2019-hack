package org.frb.stls.hack.hackservice.persistence.entiy;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name="GAME")
public class Game implements Serializable {
    private static final long serialVersionsId = -1;

    @Id
    @Column(name= "ID")
    private Integer id;

    @Column(name="START_TIME")
    private Date startTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
}
