package dev.kevinjimenez.bookapi.dtos;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class UserDTO {
    @Id
    private String id;
    private String username;
    private String password;
}
