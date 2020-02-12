package dev.kevinjimenez.bookapi.repositories;

import dev.kevinjimenez.bookapi.dtos.AuthorDTO;
import dev.kevinjimenez.bookapi.dtos.BookDTO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository  extends JpaRepository<BookDTO, Integer> {
    List<BookDTO> findByAuthor(AuthorDTO authorDTO);
}
