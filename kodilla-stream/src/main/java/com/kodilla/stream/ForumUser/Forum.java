package com.kodilla.stream.ForumUser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> theForumList = new ArrayList<>();

    public Forum(){
        theForumList.add(new ForumUser(111111, "Jason", 'M', 1994, 4, 4, 12));
        theForumList.add(new ForumUser(111112, "Shaun", 'M', 1994, 5, 5, 11));
        theForumList.add(new ForumUser(111113, "Ann", 'F', 2006, 2, 2, 54));
        theForumList.add(new ForumUser(111114, "FinalBoss", 'M', 1999, 3, 4, 0));
        theForumList.add(new ForumUser(111115, "MasterOfAll", 'F', 2011, 1, 1, 0));
        theForumList.add(new ForumUser(111116, "PressToPayRespects", 'F', 1990, 10, 11, 12));
        theForumList.add(new ForumUser(111117, "BelongsHere", 'M', 1985, 1, 2, 2));
        theForumList.add(new ForumUser(111118, "Napoleon", 'M', 1769, 8, 15, 1821));
        theForumList.add(new ForumUser(111119, "WhoLetHerHere", 'F', 1999, 9, 9, 9));
    }

    public List<ForumUser> getUserList(){
        return new ArrayList<ForumUser>(theForumList);
    }
}
