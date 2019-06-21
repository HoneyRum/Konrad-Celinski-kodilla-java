package com.kodilla.stream;


import com.kodilla.stream.ForumUser.Forum;
import com.kodilla.stream.ForumUser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum theForum = new Forum();
        Map<Integer, ForumUser> theResultMapOfForumUsers = theForum.getUserList().stream()
                .filter(forumUser -> forumUser.checkAge() > 20)
                .filter(forumUser -> forumUser.getNumberOfPosts() > 0)
                .filter(forumUser -> forumUser.getGender() == 'M')
                .collect(Collectors.toMap(ForumUser::getId, forumUser -> forumUser));

        System.out.println("# elements: " + theResultMapOfForumUsers.size());
        theResultMapOfForumUsers.entrySet().stream()
                .map(entry -> entry.getKey() + "; " + entry.getValue())
                .forEach(System.out::println);
    }
}