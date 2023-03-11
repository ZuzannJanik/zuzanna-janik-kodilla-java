package com.kodilla.good.patterns.challenges;

import static com.kodilla.good.patterns.challenges.MovieStore.getMovies;
import static java.util.stream.Collectors.joining;

public class Movies {
    public static void main(String[] args) {

        String translatorHell = getMovies().entrySet().stream()
                .flatMap(entry -> entry.getValue().stream())
                .collect(joining("!"));
        System.out.print(translatorHell);

    }
}
