package com.autostock.auth;

import jakarta.validation.Valid;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody @Valid LoginRequest request) {
        String token = authService.login(request.email, request.senha);
        return ResponseEntity.ok(token);
    }

    @PostMapping("/register")
    public ResponseEntity<Void> register(@RequestBody @Valid RegisterRequest request) {
        authService.registrar(request.email, request.senha, request.role);
        return ResponseEntity.ok().build();
    }

    @Data
    public static class LoginRequest {
        public String email;
        public String senha;
    }

    @Data
    public static class RegisterRequest {
        public String email;
        public String senha;
        public String role;
    }
}
