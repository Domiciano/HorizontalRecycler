package edu.co.icesi.horizontalscrollview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import edu.co.icesi.horizontalscrollview.adapter.UsersAdapter;
import edu.co.icesi.horizontalscrollview.model.User;

public class UsersActivity extends AppCompatActivity {

    private RecyclerView usersList;
    private UsersAdapter userAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users);

        usersList = findViewById(R.id.usersList);
        userAdapter = new UsersAdapter();
        usersList.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        usersList.setHasFixedSize(true);
        usersList.setAdapter(userAdapter);


        userAdapter.addUser(new User("A", "A"));
        userAdapter.addUser(new User("B", "B"));
        userAdapter.addUser(new User("C", "C"));
        userAdapter.addUser(new User("D", "D"));
        userAdapter.addUser(new User("E", "E"));
        userAdapter.addUser(new User("F", "F"));
        userAdapter.addUser(new User("G", "G"));
        userAdapter.addUser(new User("H", "H"));
        userAdapter.addUser(new User("I", "I"));

    }
}