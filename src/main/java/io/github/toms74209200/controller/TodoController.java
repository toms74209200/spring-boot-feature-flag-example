package io.github.toms74209200.controller;

import io.github.toms74209200.entity.Todo;
import io.github.toms74209200.service.TodoService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@AllArgsConstructor
@Controller
public class TodoController {

    private final TodoService todoService;

    @GetMapping("/todo")
    public ResponseEntity<List<Todo>> getTodos() {
        return ResponseEntity.ok(todoService.getTodos());
    }
}
