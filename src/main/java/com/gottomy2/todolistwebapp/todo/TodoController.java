package com.gottomy2.todolistwebapp.todo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.time.LocalDate;
import java.util.List;

@Controller
@SessionAttributes("name")
public class TodoController {
    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping("list-todos")
    public String listAllTodos(ModelMap modelMap){
        List<Todo> todos = todoService.findByUsername("gottomy");
        modelMap.addAttribute("todos",todos);
        return "listTodos";
    }

    @RequestMapping(value="add-todo", method= RequestMethod.GET)
    public String showTodoPage(){
        return "todo";
    }

    @RequestMapping(value="add-todo", method= RequestMethod.POST)
    public String addNewTodo(@RequestParam String description, ModelMap modelMap){
        //Redirects user to url /list-todos:
        String username = (String)modelMap.get("name");
        todoService.addTodo(username, description, LocalDate.now().plusYears(1), false);
        return "redirect:list-todos";
    }
}
