package com.kodilla.testing.statistics;

import java.util.ArrayList;
import java.util.Map;

public class StatCollector {
    private double users;
    private double posts;
    private double comments;
    private double averageUserPosts;
    private double averageUserComments;
    private double averagePostsComments;

    public ArrayList<Double> calculateAdvStatistics(Statistics statistics){
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
        results.add(users);
        results.add(posts);
        results.add(comments);
        results.add(averageUserPosts);
        results.add(averageUserComments);
        results.add(averagePostsComments);
        return results;

    }
    public void showStatistics(){
        System.out.println("User count: " + users + "Posts count: " + posts + "Comments count: " + comments
        + "Average posts per user: " + averageUserPosts + "Average comments per user: " + averageUserComments
        + "Average comments per post: " + averagePostsComments);
    }
}
