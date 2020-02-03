package dev.kevinjimenez.bookapi.services.book.implementation;

import dev.kevinjimenez.bookapi.dtos.BookDTO;
import dev.kevinjimenez.bookapi.model.Book;
import dev.kevinjimenez.bookapi.repositories.BookRepository;
import dev.kevinjimenez.bookapi.services.book.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {
    private BookRepository bookRepository;

    @Autowired
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
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
