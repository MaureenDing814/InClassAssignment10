package com.example.android.inclassassignment10_mengqid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;
import static android.os.Build.VERSION_CODES.N;

public class ListActivity extends AppCompatActivity {

    TextView display;

    FirebaseDatabase database;
    DatabaseReference postRef;
    DatabaseReference postsRef;
    ArrayList<BlogPost> posts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        database = FirebaseDatabase.getInstance();
        postRef = database.getReference("post");
        postsRef = database.getReference("posts");

        posts = new ArrayList<>();

        display = (TextView) findViewById(R.id.display);

        postsRef.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                BlogPost post = dataSnapshot.getValue(BlogPost.class);
                posts.add(post);

                String results = "";
                for(BlogPost p:posts)
                {
                    results += p + "\n";
                }
                display.setText(results);
            }
            // When it detects that some children are added

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        display.setVisibility(View.VISIBLE);
    }
}
