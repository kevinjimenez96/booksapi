package dev.kevinjimenez.bookapi.controllers;

import dev.kevinjimenez.bookapi.model.Author;
import dev.kevinjimenez.bookapi.services.author.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/author")
public class AuthorController {
    private AuthorService authorService;

    @Autowired
    public void setAuthorService(AuthorService authorService){
        this.authorService = authorService;
    }

    @GetMapping
    public List<Author> getAuthors(){
        return this.authorService.find();
    }

    @GetMapping("/{id}")
    public Author getAuthor(@PathVariable String id){
        return this.authorService.findById(id);
    }

    @PostMapping
    @PutMapping
    public Author postAuthor(@RequestBody(required = true) Author author){
        this.authorService.save(author);
        return author;
    }

    @DeleteMapping("/{id}")
    public void deleteAuthor(@PathVariable String id){
        Author author = this.authorService.findById(id);
        if (author != null){
            this.authorService.delete(author);
        }
    }
}
