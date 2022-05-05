package com.jojoldu.book.springboot.web;

import com.jojoldu.book.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/hello/issue")
    public String issue(){
        return "hello issue";
    }

    @GetMapping("/hello/issue3")
    public String issue3(){
        return "hello issue3";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String
                                                 name,
                                     @RequestParam("amount") int
                                                 amount){
        return new HelloResponseDto(name, amount);
    }
}
