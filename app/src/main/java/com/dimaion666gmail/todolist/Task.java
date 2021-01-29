package com.dimaion666gmail.todolist;

public class Task {
    private boolean isDone;
    private String title;
    private String listContainer;
    private boolean isImportant;

    public static final Task[] tasks = {
            new Task(true, "Родиться",
                    "Задачки от Жака Фреско", false),

            new Task(false, "Пожить",
                    "Задачки от Жака Фреско", false),

            new Task(false, "Умереть",
                    "Задачки от Жака Фреско", true),

            new Task(true, "Продать яблоки",
                    "Задачки от Стива Джобса", false),

            new Task(false, "Продать яблоки",
                    "Задачки от Стива Джобса", false),

            new Task(false, "Продать окна",
                    "Задачки от Билла Гейтса", true),

            new Task(true, "Продать окна",
                    "Задачки от Билла Гейтса", false),

            new Task(false, "Продать яблоки",
                    "Задачки от Стива Джобса", false),

            new Task(false, "Продать яблоки",
                    "Задачки от Стива Джобса", true),

            new Task(true, "Продать яблоки",
                    "Задачки от Стива Джобса", false),

            new Task(false, "Продать яблоки",
                    "Задачки от Стива Джобса", false),

            new Task(false, "Продать яблоки",
                    "Задачки от Стива Джобса", true),

            new Task(true, "Продать яблоки",
                    "Задачки от Стива Джобса", false),

            new Task(false, "Продать яблоки",
                    "Задачки от Стива Джобса", false),

            new Task(false, "Продать яблоки",
                    "Задачки от Стива Джобса", true)
    };

    private Task(boolean isDone, String title, String listContainer, boolean isImportant) {
        this.isDone = isDone;
        this.title = title;
        this.listContainer = listContainer;
        this.isImportant = isImportant;
    }

    public void setIsDone(boolean isDone) {
        this.isDone = isDone;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setListContainer(String listContainer) {
        this.listContainer = listContainer;
    }

    public void setIsImportant(boolean isImportant) {
        this.isImportant = isImportant;
    }

    public boolean getIsDone() {
        return isDone;
    }

    public String getTitle() {
        return title;
    }

    public String getListContainer() {
        return listContainer;
    }

    public boolean getIsImportant() {
        return isImportant;
    }
}
