package com.ericjdube.spring5jokesappv2.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by ericjdube on 3/9/2022 12:17 PM
 */
@Profile({"dumbJokes"})
@Service
public class DumbJokeServiceImpl implements JokeService {
    private final List<String> jokeList;

    public DumbJokeServiceImpl() {
        this.jokeList = Arrays.asList("dumb joke 1", "dumb joke 2", "dumb joke 3");
    }

    @Override
    public String getJoke() {
        return jokeList.get(ThreadLocalRandom.current().nextInt(0, jokeList.size()));

        //return "horse walks into a bar...";
    }
}
