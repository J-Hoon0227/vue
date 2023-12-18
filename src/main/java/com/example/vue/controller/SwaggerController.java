package com.example.vue.controller;

import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
 
@Tag(name = "예제 API", description = "Swagger 테스트용 API")
@RestController
@RequestMapping("/")
public class SwaggerController {
    @Operation(summary = "문자열 반복", description = "파라미터로 받은 문자열을 2번 반복합니다.")
    @Parameter(name = "str", description = "2번 반복할 문자열") //파라미터를 지정해주어야 함
    @GetMapping("/returnStr")
    public String returnStr(@RequestParam String str) {
        return str + "\n" + str;
    }
 
    @GetMapping("/example")
    public String example() {
        return "예시 API";
    }

    @PostMapping("/context")
    public String context() {
        return "예시 context API";
    }

    @Operation(summary = "숫자 반복", description = "파라미터로 받은 숫자를 2번 반복합니다.")
    @Parameter(name = "int", description = "숫자를 입력")
    @GetMapping("/moon")
    public String moon(){
        return "병창님 API";
    }
 
    @Hidden
    @GetMapping("/ignore")
    public String ignore() {
        return "무시되는 API";
    }
}
