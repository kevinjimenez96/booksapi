package dev.kevinjimenez.bookapi.repositories;

import dev.kevinjimenez.bookapi.dtos.AuthorDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<AuthorDTO, Integer> {

}
