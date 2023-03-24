package com.gottomy2.todolistwebapp.todo;

import java.time.LocalDate;

public class Todo {
    private Long id;

    private String username;

    private String description;

    private LocalDate targetDate;

    private boolean done;

    public Todo(Long id, String username, String description, LocalDate targetDate, boolean done) {
        this.id = id;
        this.username = username;
        this.description = description;
        this.targetDate = targetDate;
        this.done = done;
    }

    public Todo() {
    }

    @Override
    public String toString() {
        return "Todo{" +
               "id=" + id +
               ", username='" + username + '\'' +
               ", description='" + description + '\'' +
               ", targetDate=" + targetDate +
               ", done=" + done +
               '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(LocalDate targetDate) {
        this.targetDate = targetDate;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
