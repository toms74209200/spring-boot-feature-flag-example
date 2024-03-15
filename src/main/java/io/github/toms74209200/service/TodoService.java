package io.github.toms74209200.service;

import io.github.toms74209200.entity.Todo;
import io.github.toms74209200.repository.TodoRepository;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class TodoService {

    private final TodoRepository todoRepository;

    public List<Todo> getTodos() {
        List<Todo> todos = todoRepository.selectTodos();
        return todos.stream()
                .sorted(Comparator.comparing(Todo::deadline))
                .collect(Collectors.toList());
    }
}
