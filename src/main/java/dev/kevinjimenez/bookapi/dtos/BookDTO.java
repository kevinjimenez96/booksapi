package dev.kevinjimenez.bookapi.dtos;

import dev.kevinjimenez.bookapi.model.Book;

import javax.persistence.*;
import java.time.LocalDate;

@Entity(name="books")
public class BookDTO {
    @Id
    @GeneratedValue
    private int isbn;
    private String  title;
    private String genre;
    private LocalDate publication;
    private String synopsis;
    private int score;
    @ManyToOne
    @JoinColumn(name="author_id")
    private AuthorDTO author;

    public BookDTO(){
    }

    public BookDTO(Book book) {
        this.isbn = book.getIsbn();
        this.title = book.getTitle();
        this.genre = book.getGenre();
        this.publication = book.getPublication();
        this.synopsis = book.getSynopsis();
        this.score = book.getScore();
        this.author = new AuthorDTO(book.getAuthor());
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

    public AuthorDTO getAuthor() {
        return author;
    }

    public void setAuthor(AuthorDTO authorDTO) {
        this.author = authorDTO;
    }
}
