package com.kodilla.testing.statistics;

import org.junit.Test;

import java.util.ArrayList;
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
        statCollector.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(4.0, statCollector.getAverageUserComments(), 0.05);
        Assert.assertEquals(0.0, statCollector.getAveragePostsComments(), 0.05);
        Assert.assertEquals(0.0, statCollector.getAverageUserPosts(), 0.05);


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
        statCollector.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(40.0, statCollector.getAverageUserComments(), 0.05);
        Assert.assertEquals(2.0, statCollector.getAveragePostsComments(), 0.05);
        Assert.assertEquals(20.0, statCollector.getAverageUserPosts(), 0.05);
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
        statCollector.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0.0, statCollector.getAverageUserComments(), 0.05);
        Assert.assertEquals(0.0, statCollector.getAveragePostsComments(), 0.05);
        Assert.assertEquals(20.0, statCollector.getAverageUserPosts(), 0.05);

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
        statCollector.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(10.0, statCollector.getAverageUserComments(), 0.05);
        Assert.assertEquals(0.5, statCollector.getAveragePostsComments(), 0.05);
        Assert.assertEquals(20.0, statCollector.getAverageUserPosts(), 0.05);

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
        statCollector.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(20.0, statCollector.getAverageUserComments(), 0.05);
        Assert.assertEquals(10.0,  statCollector.getAveragePostsComments(), 0.05);
        Assert.assertEquals(2.0, statCollector.getAverageUserPosts(), 0.05);
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
        statCollector.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0.0, statCollector.getAverageUserComments(), 0.05);
        Assert.assertEquals(0.2, statCollector.getAveragePostsComments(), 0.05);
        Assert.assertEquals(0.0, statCollector.getAverageUserPosts(), 0.05);

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
        statCollector.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(20.0, statCollector.getAverageUserComments(), 0.05);
        Assert.assertEquals(2.0, statCollector.getAveragePostsComments(), 0.05);
        Assert.assertEquals(10.0, statCollector.getAverageUserPosts(), 0.05);

    }
}
