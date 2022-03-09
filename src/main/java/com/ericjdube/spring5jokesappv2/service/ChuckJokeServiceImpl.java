package com.ericjdube.spring5jokesappv2.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by ericjdube on 3/9/2022 11:25 AM
 */
@Profile({"chuckJokes", "default"})
@Service
public class ChuckJokeServiceImpl implements JokeService {
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckJokeServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return this.chuckNorrisQuotes.getRandomQuote();
    }
}
