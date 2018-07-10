package com.udacity.gradle.builditbigger;

import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;

@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTest {
    @Test
    public void checkJokeValueTest() throws Exception {
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask();
        endpointsAsyncTask.execute(InstrumentationRegistry.getContext());
        String joke = endpointsAsyncTask.get(5, TimeUnit.SECONDS);
        Assert.assertNotEquals( "", joke );
        Assert.assertEquals( "Why did the chicken cross the road? Hahaha", joke );
    }
}

