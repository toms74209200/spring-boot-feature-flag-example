package io.github.toms74209200.entity;

import java.time.Instant;

public record Todo(String task, Instant deadline, boolean done, int priority) {}
