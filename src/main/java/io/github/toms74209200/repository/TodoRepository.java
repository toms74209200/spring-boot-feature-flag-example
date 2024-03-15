package io.github.toms74209200.repository;

import io.github.toms74209200.entity.Todo;
import java.time.Instant;
import java.util.Collections;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class TodoRepository {

    private final List<Todo> todos =
            List.of(
                    new Todo("Buy milk", Instant.parse("2021-12-24T12:00:00Z"), false, 1),
                    new Todo("Call mom", Instant.parse("2021-12-26T12:00:00Z"), false, 2),
                    new Todo("Write a blog", Instant.parse("2021-12-25T12:00:00Z"), false, 3));

    public List<Todo> selectTodos() {
        return Collections.unmodifiableList(todos);
    }
}
