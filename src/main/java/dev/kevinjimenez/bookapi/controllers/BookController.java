package dev.kevinjimenez.bookapi.controllers;

import dev.kevinjimenez.bookapi.model.Book;
import dev.kevinjimenez.bookapi.services.book.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.DELETE})
@RestController
@RequestMapping("/v1/book")
public class BookController {
    private BookService bookService;

    @Autowired
    public void setBookService(BookService bookService){
        this.bookService = bookService;
    }

    @GetMapping
    public List<Book> getBooks(@RequestParam(required = false) int author){
        if(author != 0){
            return this.bookService.findByAuthor(author);
        }
        return this.bookService.find();
    }
    

    @GetMapping("/{id}")
    public Book getAuthor(@PathVariable int id){
        return this.bookService.findById(id);
    }

    @PostMapping
    @PutMapping
    public Book postAuthor(@RequestBody(required = true) Book book){
        this.bookService.save(book);
        return book;
    }

    @DeleteMapping("/{id}")
    public void deleteAuthor(@PathVariable int id){
        Book book = this.bookService.findById(id);
        if (book != null){
            this.bookService.delete(book);
        }
    }

}
