package com.ericjdube.spring5jokesappv2.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 * Created by ericjdube on 3/9/2022 11:25 AM
 */
@Service
public class JokeServiceImpl implements JokeService {
    @Override
    public String getJoke() {
        ChuckNorrisQuotes cnq = new ChuckNorrisQuotes();

        return cnq.getRandomQuote();
    }
}
