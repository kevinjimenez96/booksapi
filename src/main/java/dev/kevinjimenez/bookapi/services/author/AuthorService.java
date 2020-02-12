package dev.kevinjimenez.bookapi.services.author;

import dev.kevinjimenez.bookapi.model.Author;

import java.util.List;

public interface AuthorService {
    public List<Author> find();
    public Author findById(int id);
    public void save(Author author);
    public void delete(Author author);
}
