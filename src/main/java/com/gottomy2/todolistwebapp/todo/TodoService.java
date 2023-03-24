package com.gottomy2.todolistwebapp.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();

    static {
        todos.add(new Todo(1L, "gottomy", "Learn Spring Boot", LocalDate.now().plusMonths(2), false));
        todos.add(new Todo(1L, "gottomy", "Learn Fullstack Development", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(1L, "gottomy", "Do Laundry", LocalDate.now().plusDays(1), false));
    }

    public List<Todo> findByUsername(String username) {
        return todos;
    }
}
