package com.ericjdube.spring5jokesappv2.controller;

import com.ericjdube.spring5jokesappv2.service.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ericjdube on 3/9/2022 11:23 AM
 */
@Controller
public class JokeController {

    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping("/")
    public String getJoke(Model model) {
        model.addAttribute("randomjoke", this.jokeService.getJoke());

        return "jokes/index";
    }
}
