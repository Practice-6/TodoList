package com.dimaion666gmail.todolist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class TaskCardsAdapter extends RecyclerView.Adapter<TaskCardsAdapter.ViewHolder> {

    private boolean[] isDone;
    private String[] title;
    private String[] listContainer;
    private boolean[] isImportant;

    public TaskCardsAdapter(boolean[] isDone, String[] title, String[] listContainer,
                            boolean[] isImportant) {
        this.isDone = isDone;
        this.title = title;
        this.listContainer = listContainer;
        this.isImportant = isImportant;
    }

    @Override
    public TaskCardsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        CardView cv = (CardView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_task, parent, false);
        return new ViewHolder(cv);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        CardView cardView = holder.cardView;

        ToggleButton isDoneToggleButtonView = cardView.findViewById(R.id.info_is_done);
        TextView titleTextView = cardView.findViewById(R.id.info_title);
        TextView listContainerTextView = cardView.findViewById(R.id.info_list_container);
        ToggleButton isImportantToggleButtonView = cardView.findViewById(R.id.info_is_important);

        isDoneToggleButtonView.setChecked(isDone[position]);
        titleTextView.setText(String.valueOf(title[position]));
        listContainerTextView.setText(String.valueOf(listContainer[position]));
        isImportantToggleButtonView.setChecked(isImportant[position]);
    }

    @Override
    public int getItemCount() {
        return title.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private CardView cardView;

        public ViewHolder(CardView v) {
            super(v);
            cardView = v;
        }
    }
}
