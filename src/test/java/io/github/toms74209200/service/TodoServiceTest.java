package io.github.toms74209200.service;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.toms74209200.entity.Todo;
import io.github.toms74209200.repository.TodoRepository;
import java.util.List;
import org.junit.jupiter.api.Test;

class TodoServiceTest {

    @Test
    public void testGetTodos() {
        TodoService todoService = new TodoService(new TodoRepository());

        List<Todo> actual = todoService.getTodos();

        assertThat(actual.get(0).task()).isEqualTo("Buy milk");
        assertThat(actual.get(1).task()).isEqualTo("Write a blog");
        assertThat(actual.get(2).task()).isEqualTo("Call mom");
    }
}
