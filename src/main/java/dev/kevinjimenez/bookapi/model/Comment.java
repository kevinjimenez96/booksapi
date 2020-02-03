package dev.kevinjimenez.bookapi.model;

import dev.kevinjimenez.bookapi.dtos.CommentDTO;
import dev.kevinjimenez.bookapi.dtos.UserDTO;

public class Comment {
    private int score;
    private String message;

    public Comment() {
    }

    public Comment(CommentDTO commentDTO) {
        this.score = commentDTO.getScore();
        this.message = commentDTO.getMessage();
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
