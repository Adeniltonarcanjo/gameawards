package github.adeniltonarcanjo.gameawards.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "games")
public class Game implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String name;
    @Column(length = 500)
    private String description;
    private String cover;
    private long votes;

    public Game() {
    }

    public Game(String name, String description, String cover, long votes) {
        this.name = name;
        this.description = description;
        this.cover = cover;
        this.votes = votes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public long getVotes() {
        return votes;
    }

    public void setVotes(long votes) {
        this.votes = votes;
    }
}
