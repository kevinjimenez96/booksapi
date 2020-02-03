package dev.kevinjimenez.bookapi.dtos;

import dev.kevinjimenez.bookapi.model.Book;
import dev.kevinjimenez.bookapi.model.Comment;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Document(collection = "books")
public class BookDTO {
    @Id
    private String id;
    private int isbn;
    private String  title;
    private String genre;
    private LocalDate publication;
    private String synopsis;
    private int score;
    private List<CommentDTO> comments;
    @DBRef
    private AuthorDTO author;

    public BookDTO(){
    }

    public BookDTO(Book book) {
        this.id = book.getId();
        this.isbn = book.getIsbn();
        this.title = book.getTitle();
        this.genre = book.getGenre();
        this.publication = book.getPublication();
        this.synopsis = book.getSynopsis();
        this.score = book.getScore();
        this.comments = new ArrayList<CommentDTO>();
        if(book.getComments() != null){
            for (Comment comment: book.getComments()) {
                this.comments.add(new CommentDTO(comment));
            }
        }
        this.author = new AuthorDTO(book.getAuthor());
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

    public List<CommentDTO> getComments() {
        return comments;
    }

    public void setComments(List<CommentDTO> comments) {
        this.comments = comments;
    }

    public AuthorDTO getAuthor() {
        return author;
    }

    public void setAuthor(AuthorDTO authorDTO) {
        this.author = authorDTO;
    }
}
