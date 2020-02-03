package dev.kevinjimenez.bookapi.repositories;

import dev.kevinjimenez.bookapi.dtos.UserDTO;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<UserDTO, String> {
}
