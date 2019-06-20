package com.example.recylerviewhero;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class ListHeroAdapter extends RecyclerView.Adapter<ListHeroAdapter.CategoryViewHolder> {

    private ArrayList<Hero> listHero;

    public ListHeroAdapter(ArrayList<Hero> list) {
        this.listHero = list;
    }@NonNull
    @Override
    public ListHeroAdapter(ArrayList<Hero> list) {
        public ListHeroAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_hero, parent, false);
            return new ListHeroAdapter(view);

        public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_hero, parent, false);
        return new ListHeroAdapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder categoryViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder {
        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}