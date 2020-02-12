package dev.kevinjimenez.bookapi.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import dev.kevinjimenez.bookapi.dtos.BookDTO;
import dev.kevinjimenez.bookapi.dtos.CommentDTO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Book {
    private String id;
    private int isbn;
    private String title;
    private String genre;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate publication;
    private String synopsis;
    private int score;
    private List<Comment> comments;
    private Author author;

    public Book() {

    }

    public Book(BookDTO bookDTO) {
        this.id = bookDTO.getId();
        this.isbn = bookDTO.getIsbn();
        this.title = bookDTO.getTitle();
        this.genre = bookDTO.getGenre();
        this.publication = bookDTO.getPublication();
        this.synopsis = bookDTO.getSynopsis();
        this.score = bookDTO.getScore();
        this.comments = new ArrayList<Comment>();
        if (bookDTO.getComments() != null) {
            for (CommentDTO commentDTO : bookDTO.getComments()) {
                this.comments.add(new Comment(commentDTO));
            }
        }
        this.author = new Author(bookDTO.getAuthor());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
