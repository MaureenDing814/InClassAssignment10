package com.example.android.inclassassignment10_mengqid;

import java.util.Calendar;

/**
 * Created by Maureen_Ding on 4/5/17.
 */

public class BlogPost {
    String title;
    String body;
    String time;

    public BlogPost() {
        // Defualt constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public BlogPost(String title, String body, String time) {
        this.title = title;
        this.body = body;
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public String getTime() {
        return time;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setTime(String time) {
        this.time = time;
    }

    //Convert
    public String toReadableTime() {
        long postTime = Long.valueOf(time);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(postTime);
        return calendar.getTime().toString();
    }

        @Override
        public String toString () {
            return "Title: " + title + "\n"
                    + "Time: " + toReadableTime() + "\n"
                    + "Body" + body + "\n";
        }


    }


