package dev.kevinjimenez.bookapi.services.author.implementation;

import dev.kevinjimenez.bookapi.dtos.AuthorDTO;
import dev.kevinjimenez.bookapi.model.Author;
import dev.kevinjimenez.bookapi.repositories.AuthorRepository;
import dev.kevinjimenez.bookapi.services.author.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AuthorServiceImpl implements AuthorService {
    private AuthorRepository authorRepository;

    @Autowired
    public void setAuthorRepository(AuthorRepository authorRepository){
        this.authorRepository = authorRepository;
    }

    @Override
    public List<Author> find() {
        List<AuthorDTO> authorDTOS = authorRepository.findAll();
        List<Author> authors = new ArrayList<Author>();
        for (AuthorDTO authorDTO: authorDTOS) {
            authors.add(new Author(authorDTO));
        }
        return authors;
    }

    @Override
    public Author findById(String id) {
        Optional<AuthorDTO> optionalAuthorDTO = authorRepository.findById(id);
        Author author;
        author = optionalAuthorDTO.map(Author::new).orElse(null);
        return author;
    }

    @Override
    public void save(Author author) {
        authorRepository.save(new AuthorDTO(author));
    }

    @Override
    public void delete(Author author) {
        authorRepository.delete(new AuthorDTO(author));
    }
}
