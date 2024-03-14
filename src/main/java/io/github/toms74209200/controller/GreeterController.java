package io.github.toms74209200.controller;

import org.springframework.http.ResponseEntity;

public interface GreeterController {
    ResponseEntity<String> greet();
}
