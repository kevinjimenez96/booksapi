package dev.kevinjimenez.bookapi.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import dev.kevinjimenez.bookapi.dtos.BookDTO;

import java.time.LocalDate;

public class Book {
    private int isbn;
    private String title;
    private String genre;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate publication;
    private String synopsis;
    private int score;
    private Author author;

    public Book() {

    }

    public Book(BookDTO bookDTO) {
        this.isbn = bookDTO.getIsbn();
        this.title = bookDTO.getTitle();
        this.genre = bookDTO.getGenre();
        this.publication = bookDTO.getPublication();
        this.synopsis = bookDTO.getSynopsis();
        this.score = bookDTO.getScore();
        this.author = new Author(bookDTO.getAuthor());
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public LocalDate getPublication() {
        return publication;
    }

    public void setPublication(LocalDate publication) {
        this.publication = publication;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
