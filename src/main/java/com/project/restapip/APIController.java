package com.project.restapip;
import org.springframework.web.bind.annotation.*;

@RestController
public class APIController {
    @PostMapping("/post/{id}")
    public String post(@RequestBody String id) {
        System.out.println(id);
        return "Hello, " + id + "!";
    }
    @GetMapping("/get/{id}")
    public String get(@PathVariable String id) {
        System.out.println(id);
        return "Hello, " + id + "!";
    }
}
