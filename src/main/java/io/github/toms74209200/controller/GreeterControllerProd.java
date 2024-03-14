package io.github.toms74209200.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Profile("!feat-greet")
@Controller
public class GreeterControllerProd implements GreeterController {
    @Override
    @GetMapping("/greet")
    public ResponseEntity<String> greet() {
        log.info("Get greet production");
        return ResponseEntity.notFound().build();
    }
}
