package dev.kevinjimenez.bookapi.dtos;

import dev.kevinjimenez.bookapi.model.Author;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "authors")
public class AuthorDTO {
    @Id
    private String id;
    private String name;
    private LocalDate birthday;
    private LocalDate deathDate;
    private int score;

    public AuthorDTO(){

    }

    public AuthorDTO(Author author) {
        this.id = author.getId();
        this.name = author.getName();
        this.birthday = author.getBirthday();
        this.deathDate = author.getDeathDate();
        this.score = author.getScore();

    }

    public AuthorDTO(String name) {
        this.name = name;
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
