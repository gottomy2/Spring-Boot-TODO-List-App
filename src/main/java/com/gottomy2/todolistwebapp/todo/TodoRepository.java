package com.gottomy2.todolistwebapp.todo;

import com.gottomy2.todolistwebapp.todo.entities.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Integer> {
    public List<Todo> getTodosByUsername(String username);
}
