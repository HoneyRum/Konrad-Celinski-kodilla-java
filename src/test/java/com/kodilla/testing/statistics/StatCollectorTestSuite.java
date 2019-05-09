package com.kodilla.testing.statistics;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.Assert;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatCollectorTestSuite {
    @Test
    public void testAverageZeroPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users =new ArrayList<>();
        for(int i=0; i<50; i++){
            String username = Integer.toString(i);
            users.add(username);
        }
        int postsCount = 0;
        int commentsCount = 200;
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        StatCollector statCollector = new StatCollector();

        //When
        ArrayList<Double> actualResults = statCollector.calculateAdvStatistics(statisticsMock);
        ArrayList<Double> expectedResults = new ArrayList<>();
        expectedResults.add(50.0);              //users
        expectedResults.add(0.0);               //posts
        expectedResults.add(200.0);             //comments
        expectedResults.add(0.0);               //average posts per user
        expectedResults.add(4.0);               //average comments per user
        expectedResults.add(0.0);               //average comments per post

        //Then
        Assert.assertEquals(expectedResults, actualResults);


    }
    @Test
    public void testAverageManyPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users =new ArrayList<>();
        for(int i=0; i<50; i++){
            String username = Integer.toString(i);
            users.add(username);
        }
        int postsCount = 1000;
        int commentsCount = 2000;
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        StatCollector statCollector = new StatCollector();

        //When
        ArrayList<Double> actualResults = statCollector.calculateAdvStatistics(statisticsMock);
        ArrayList<Double> expectedResults = new ArrayList<>();
        expectedResults.add(50.0);
        expectedResults.add(1000.0);
        expectedResults.add(2000.0);
        expectedResults.add(20.0);
        expectedResults.add(40.0);
        expectedResults.add(2.0);

        //Then
        Assert.assertEquals(expectedResults, actualResults);

    }
    @Test
    public void testAverageZeroComments(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users =new ArrayList<>();
        for(int i=0; i<50; i++){
            String username = Integer.toString(i);
            users.add(username);
        }
        int postsCount = 1000;
        int commentsCount = 0;
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        StatCollector statCollector = new StatCollector();

        //When
        ArrayList<Double> actualResults = statCollector.calculateAdvStatistics(statisticsMock);
        ArrayList<Double> expectedResults = new ArrayList<>();
        expectedResults.add(50.0);
        expectedResults.add(1000.0);
        expectedResults.add(0.0);
        expectedResults.add(20.0);
        expectedResults.add(0.0);
        expectedResults.add(0.0);

        //Then
        Assert.assertEquals(expectedResults, actualResults);

    }
    @Test
    public void testMorePostsThanComments(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users =new ArrayList<>();
        for(int i=0; i<50; i++){
            String username = Integer.toString(i);
            users.add(username);
        }
        int postsCount = 1000;
        int commentsCount = 500;
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        StatCollector statCollector = new StatCollector();

        //When
        ArrayList<Double> actualResults = statCollector.calculateAdvStatistics(statisticsMock);
        ArrayList<Double> expectedResults = new ArrayList<>();
        expectedResults.add(50.0);
        expectedResults.add(1000.0);
        expectedResults.add(500.0);
        expectedResults.add(20.0);
        expectedResults.add(10.0);
        expectedResults.add(0.5);

        //Then
        Assert.assertEquals(expectedResults, actualResults);

    }
    @Test
    public void testMoreCommentsThanPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users =new ArrayList<>();
        for(int i=0; i<50; i++){
            String username = Integer.toString(i);
            users.add(username);
        }
        int postsCount = 100;
        int commentsCount = 1000;
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        StatCollector statCollector = new StatCollector();

        //When
        ArrayList<Double> actualResults = statCollector.calculateAdvStatistics(statisticsMock);
        ArrayList<Double> expectedResults = new ArrayList<>();
        expectedResults.add(50.0);
        expectedResults.add(100.0);
        expectedResults.add(1000.0);
        expectedResults.add(2.0);
        expectedResults.add(20.0);
        expectedResults.add(10.0);

        //Then
        Assert.assertEquals(expectedResults, actualResults);
    }
    @Test
    public void testZeroUsers(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users =new ArrayList<>();
        for(int i=0; i<0; i++){
            String username = Integer.toString(i);
            users.add(username);
        }
        int postsCount = 1000;
        int commentsCount = 200;
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        StatCollector statCollector = new StatCollector();

        //When
        ArrayList<Double> actualResults = statCollector.calculateAdvStatistics(statisticsMock);
        ArrayList<Double> expectedResults = new ArrayList<>();
        expectedResults.add(0.0);
        expectedResults.add(1000.0);
        expectedResults.add(200.0);
        expectedResults.add(0.0);
        expectedResults.add(0.0);
        expectedResults.add(0.2);

        //Then
        Assert.assertEquals(expectedResults, actualResults);

    }
    @Test
    public void testManyUsers(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users =new ArrayList<>();
        for(int i=0; i<100; i++){
            String username = Integer.toString(i);
            users.add(username);
        }
        int postsCount = 1000;
        int commentsCount = 2000;
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        StatCollector statCollector = new StatCollector();

        //When
        ArrayList<Double> actualResults = statCollector.calculateAdvStatistics(statisticsMock);
        ArrayList<Double> expectedResults = new ArrayList<>();
        expectedResults.add(100.0);
        expectedResults.add(1000.0);
        expectedResults.add(2000.0);
        expectedResults.add(10.0);
        expectedResults.add(20.0);
        expectedResults.add(2.0);

        //Then
        Assert.assertEquals(expectedResults, actualResults);

    }
}
