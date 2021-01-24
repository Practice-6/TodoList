package com.dimaion666gmail.todolist;

public class Task {
    private boolean isDone;
    private String title;
    private boolean isImportant;

    public static final Task[] tasks = {
            new Task(true, "Родиться", false),
            new Task(false, "Пожить", false),
            new Task(false, "Умереть", true)
    };

    private Task(boolean isDone, String title, boolean isImportant) {
        this.isDone = isDone;
        this.title = title;
        this.isImportant = isImportant;
    }

    public boolean getIsDone() {
        return isDone;
    }

    public String getTitle() {
        return title;
    }

    public boolean isImportant() {
        return isImportant;
    }
}
