package com.gottomy2.todolistwebapp.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();

    private static int todosCount = 0;

    static {
        todos.add(new Todo(++todosCount, "gottomy", "Learn Spring Boot", LocalDate.now().plusMonths(2), false));
        todos.add(new Todo(++todosCount, "gottomy", "Learn Fullstack Development", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(++todosCount, "gottomy", "Do Laundry", LocalDate.now().plusDays(1), false));
    }

    public List<Todo> findByUsername(String username) {
        return todos;
    }

    public void addTodo(String username, String description, LocalDate targetDate, boolean done){
        Todo todo = new Todo(++todosCount, username, description, targetDate, done);
        todos.add(todo);
    }

    public void deleteById(int id){
        //If todo from todosList id has matching id remove it:
        Predicate<? super Todo> predicate = todos -> todos.getId() == id;
        todos.removeIf(predicate);
    }

    public Todo findById(int id) {
        Predicate<? super Todo> predicate = todos -> todos.getId() == id;
        Todo todo = todos.stream().filter(predicate).findFirst().get();
        return todo;
    }

    public void updateTodo(Todo todo) {
        deleteById(todo.getId());
        todos.add(todo);
    }
}
