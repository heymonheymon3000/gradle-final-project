package com.udacity.gradle.builditbigger.backend;

import com.tparri.jokes.JokesDataSource;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    public String getData() {
        JokesDataSource jokesDataSource = new JokesDataSource();
        return jokesDataSource.getJoke();
    }
}