package com.example.jwt;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/api/jwt")
public class JwtController {
    private final JwtService service;

    public JwtController(JwtService service) {
        this.service = service;
    }

    @PostMapping("/generate")
    public String generate(@RequestBody Map<String, Object> data) {
        return service.generateToken(data);
    }
}
