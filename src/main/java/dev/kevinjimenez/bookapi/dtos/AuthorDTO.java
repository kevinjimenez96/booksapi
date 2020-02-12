package dev.kevinjimenez.bookapi.dtos;

import dev.kevinjimenez.bookapi.model.Author;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity(name="authors")
public class AuthorDTO {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private LocalDate birthday;
    private LocalDate deathDate;
    private int score;
    @OneToMany(mappedBy = "author")
    private List<BookDTO> books;

    public List<BookDTO> getBooks() {
        return books;
    }

    public void setBooks(List<BookDTO> books) {
        this.books = books;
    }

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
