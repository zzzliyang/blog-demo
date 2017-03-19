package io.zzzliyang.persistence;

import javax.annotation.sql.DataSourceDefinition;
import javax.persistence.*;

/**
 * Created by Liyang, Zhang on 3/18/2017.
 */
@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Long id;
    @Column
    String name;
    @Column(name="DB_SCORE")
    Double dbScore;

    public Movie() {
    }

    public Movie(String name, Double dbScore) {
        this.name = name;
        this.dbScore = dbScore;
    }

    public Movie(Long id, String name, Double dbScore) {
        this.id = id;
        this.name = name;
        this.dbScore = dbScore;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDbScore(Double dbScore) {
        this.dbScore = dbScore;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getDbScore() {
        return dbScore;
    }
}
