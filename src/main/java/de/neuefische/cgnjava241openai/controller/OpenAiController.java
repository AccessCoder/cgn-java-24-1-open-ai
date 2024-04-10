package de.neuefische.cgnjava241openai.controller;

import de.neuefische.cgnjava241openai.service.OpenAiService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/open")
@RequiredArgsConstructor
public class OpenAiController {

    private final OpenAiService service;

    @GetMapping
    public String askQuestion(@RequestParam String q){
        return service.askQuestion(q);
    }

}
