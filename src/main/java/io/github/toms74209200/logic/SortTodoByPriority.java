package io.github.toms74209200.logic;

import io.github.toms74209200.entity.Todo;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SortTodoByPriority implements SortTodo {
    @Override
    public List<Todo> sort(List<Todo> todos) {
        log.info("Sorting todos by priority");
        return todos.stream()
                .sorted(Comparator.comparing(Todo::priority))
                .collect(Collectors.toList());
    }
}
