package com.kodilla.testing.statistics;

import java.util.ArrayList;

public class StatCollector {
    private double users;
    private double posts;
    private double comments;
    private double averageUserPosts;
    private double averageUserComments;
    private double averagePostsComments;

    public void calculateAdvStatistics(Statistics statistics){
        ArrayList<Double> results = new ArrayList<>();
        users=statistics.usersNames().size();
        posts=statistics.postsCount();
        comments=statistics.commentsCount();
        if(users>0){
            averageUserPosts = posts/users;
        } else {
            averageUserPosts = 0;
        }
        if(posts>0){
            averagePostsComments = comments/posts;
        } else {
            averagePostsComments = 0;
        }
        if(users>0){
            averageUserComments = comments/users;
        } else {
            averageUserComments = 0;
        }
        System.out.println("Advanced statistics calculated");
    }
    public void showStatistics(){
        System.out.println("User count: " + users + "Posts count: " + posts + "Comments count: " + comments
        + "Average posts per user: " + averageUserPosts + "Average comments per user: " + averageUserComments
        + "Average comments per post: " + averagePostsComments);
    }

    public double getPosts() {
        return posts;
    }

    public double getComments() {
        return comments;
    }

    public double getAverageUserPosts() {
        return averageUserPosts;
    }

    public double getAverageUserComments() {
        return averageUserComments;
    }

    public double getAveragePostsComments() {
        return averagePostsComments;
    }

    public double getUsers() {
        return users;
    }
}
