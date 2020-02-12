package dev.kevinjimenez.bookapi.dtos;

import dev.kevinjimenez.bookapi.model.Comment;

public class CommentDTO {

    private int score;
    private String message;

    public CommentDTO() {
    }

    public CommentDTO(Comment comment) {
        this.score = comment.getScore();
        this.message = comment.getMessage();
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
