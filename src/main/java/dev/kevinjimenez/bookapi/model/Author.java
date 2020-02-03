package dev.kevinjimenez.bookapi.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import dev.kevinjimenez.bookapi.dtos.AuthorDTO;

import java.time.LocalDate;


public class Author {
    private String id;
    private String name;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate birthday;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate deathDate;
    private int score;

    public Author(){

    }

    public Author(AuthorDTO authorDTO){
        this.id = authorDTO.getId();
        this.name = authorDTO.getName();
        this.birthday = authorDTO.getBirthday();
        this.deathDate = authorDTO.getDeathDate();
        this.score = authorDTO.getScore();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public LocalDate getDeathDate() {
        return deathDate;
    }

    public void setDeathDate(LocalDate deathDate) {
        this.deathDate = deathDate;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
