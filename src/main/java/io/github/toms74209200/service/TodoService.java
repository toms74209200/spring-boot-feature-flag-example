package io.github.toms74209200.service;

import io.github.toms74209200.entity.Todo;
import io.github.toms74209200.logic.SortTodo;
import io.github.toms74209200.repository.TodoRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class TodoService {

    private final TodoRepository todoRepository;
    private final SortTodo sortTodo;

    public List<Todo> getTodos() {
        List<Todo> todos = todoRepository.selectTodos();
        return sortTodo.sort(todos);
    }
}
