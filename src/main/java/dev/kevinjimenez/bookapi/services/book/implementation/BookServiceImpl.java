package dev.kevinjimenez.bookapi.services.book.implementation;

import dev.kevinjimenez.bookapi.dtos.AuthorDTO;
import dev.kevinjimenez.bookapi.dtos.BookDTO;
import dev.kevinjimenez.bookapi.model.Book;
import dev.kevinjimenez.bookapi.repositories.BookRepository;
import dev.kevinjimenez.bookapi.services.author.AuthorService;
import dev.kevinjimenez.bookapi.services.book.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {
    private BookRepository bookRepository;
    private AuthorService authorService;

    @Autowired
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Autowired
    public void setAuthorService(AuthorService authorService) {
        this.authorService = authorService;
    }

    @Override
    public List<Book> find() {
        List<BookDTO> booksDtos = this.bookRepository.findAll();
        List<Book> books = new ArrayList<Book>();
        for (BookDTO bookDTO: booksDtos) {
            books.add(new Book(bookDTO));
        }
        return books;
    }

    @Override
    public List<Book> findByAuthor(String author) {
        AuthorDTO authorDTO = new AuthorDTO(this.authorService.findById(author));
        List<BookDTO> bookDTOS = this.bookRepository.findByAuthor(authorDTO);
        List<Book> books = new ArrayList<>();
        for (BookDTO bookDTO: bookDTOS) {
            books.add(new Book(bookDTO));
        }
        return books;
    }

    @Override
    public Book findById(String id) {
        Optional<BookDTO> optionalBookDTO = this.bookRepository.findById(id);
        Book book;
        book = optionalBookDTO.map(Book::new).orElse(null);
        return book;
    }

    @Override
    public void save(Book book) {
        this.bookRepository.save(new BookDTO(book));
    }

    @Override
    public void delete(Book book) {
        this.bookRepository.delete(new BookDTO(book));
    }
}
