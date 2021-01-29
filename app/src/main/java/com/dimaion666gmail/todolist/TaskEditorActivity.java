package com.dimaion666gmail.todolist;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.TextView;

public class TaskEditorActivity extends AppCompatActivity {

    public static final String EXTRA_TASK_ID = "taskId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_editor);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        int taskId = (Integer) getIntent().getExtras().get(EXTRA_TASK_ID);
        String title = Task.tasks[taskId].getTitle();
        TextView titleTextView = findViewById(R.id.info_title);
        titleTextView.setText(title);
    }
}