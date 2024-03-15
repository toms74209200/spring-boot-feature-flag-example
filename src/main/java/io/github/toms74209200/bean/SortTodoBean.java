package io.github.toms74209200.bean;

import io.github.toms74209200.logic.SortTodo;
import io.github.toms74209200.logic.SortTodoByDeadline;
import io.github.toms74209200.logic.SortTodoByPriority;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class SortTodoBean {

    private final SortTodo sortTodoByDeadline = new SortTodoByDeadline();
    private final SortTodo sortTodoByPriority = new SortTodoByPriority();

    @Profile("!feat-priority")
    @Bean
    public SortTodo sortTodoByDeadline() {
        return sortTodoByDeadline;
    }

    @Profile("feat-priority")
    @Bean
    public SortTodo sortTodoByPriority() {
        return sortTodoByPriority;
    }
}
