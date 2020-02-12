package dev.kevinjimenez.bookapi.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import dev.kevinjimenez.bookapi.dtos.AuthorDTO;
import dev.kevinjimenez.bookapi.dtos.BookDTO;

import java.time.LocalDate;
import java.util.List;


public class Author {
    private int id;
    private String name;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate birthday;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate deathDate;
    private int score;
    private List<Book> books;

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Author(){

    }

    public Author(AuthorDTO authorDTO){
        this.id = authorDTO.getId();
        this.name = authorDTO.getName();
        this.birthday = authorDTO.getBirthday();
        this.deathDate = authorDTO.getDeathDate();
        this.score = authorDTO.getScore();
        this.books = authorDTO.getBooks();
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
