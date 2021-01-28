package com.dimaion666gmail.todolist;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ListContainerFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        RecyclerView taskRecycler = (RecyclerView) inflater.inflate(R.layout.fragment_list_container,
                container, false);

        boolean[] isDone = new boolean[Task.tasks.length];
        for (int i = 0; i < isDone.length; i++) {
            isDone[i] = Task.tasks[i].getIsDone();
        }

        String[] titles = new String[Task.tasks.length];
        for (int i = 0; i < titles.length; i++) {
            titles[i] = Task.tasks[i].getTitle();
        }

        String[] listContainers = new String[Task.tasks.length];
        for (int i = 0; i < listContainers.length; i++) {
            listContainers[i] = Task.tasks[i].getListContainer();
        }

        boolean[] isImportant = new boolean[Task.tasks.length];
        for (int i = 0; i < isDone.length; i++) {
            isImportant[i] = Task.tasks[i].getIsImportant();
        }

        TaskCardsAdapter taskCardsAdapter = new TaskCardsAdapter(isDone, titles, listContainers,
                isImportant);
        taskRecycler.setAdapter(taskCardsAdapter);
        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(), 1);
        taskRecycler.setLayoutManager(layoutManager);
        return taskRecycler;
    }
}