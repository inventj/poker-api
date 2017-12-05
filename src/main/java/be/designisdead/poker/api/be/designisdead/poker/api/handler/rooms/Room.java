package be.designisdead.poker.api.be.designisdead.poker.api.handler.rooms;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * Created by j.peeters on 05/12/2017.
 */
public class Room {

    private Long id;
    private String name;
    private String created;

    public Room(@JsonProperty("id") Long id, @JsonProperty("name") String name, @JsonProperty("createdAt") String createdAt) {
        this.id = id;
        this.name = name;
        this.created = createdAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }
}
