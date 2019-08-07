package org.frb.stls.hack.hackservice.persistence.entiy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="game", schema = "game")
public class Game implements Serializable {
    private static final long serialVersionsId = -1;

    @Id
    @Column(name= "gameid")
    private Integer id;

    @Column(name="starttime")
    @OrderBy
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
