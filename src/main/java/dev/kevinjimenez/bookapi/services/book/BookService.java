package dev.kevinjimenez.bookapi.services.book;

import dev.kevinjimenez.bookapi.model.Book;

import java.util.List;

public interface BookService {
    public List<Book> find();
    public List<Book> findByAuthor(String author);
    public Book findById(String id);
    public void save(Book book);
    public void delete(Book book);
}
