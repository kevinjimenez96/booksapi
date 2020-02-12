package dev.kevinjimenez.bookapi.services.book;

import dev.kevinjimenez.bookapi.model.Book;

import java.util.List;

public interface BookService {
    public List<Book> find();
    public List<Book> findByAuthor(int author);
    public Book findById(int id);
    public void save(Book book);
    public void delete(Book book);
}
