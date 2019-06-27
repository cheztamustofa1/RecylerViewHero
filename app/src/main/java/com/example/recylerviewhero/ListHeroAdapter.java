package com.example.recylerviewhero;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class ListHeroAdapter extends RecyclerView.Adapter<ListHeroAdapter.CategoryViewHolder> {

    private ArrayList<Hero> listHero;
    private Context context;

    public ListHeroAdapter(ArrayList<Hero> listHero, Context context) {
        this.listHero = listHero;
        this.context = context;
    }

    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.item_row_hero, viewGroup, false);
        return new CategoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder categoryViewHolder, int i) {
        Glide.with(context).load(listHero.get(i).getPhoto()).into(categoryViewHolder.img);
        categoryViewHolder.nma1.setText(listHero.get(i).getName());
        categoryViewHolder.txt2.setText(listHero.get(i).getFrom());
    }

    @Override
    public int getItemCount() {
        return listHero.size();
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder {
        CircleImageView img;
        TextView nma1;
        TextView txt2;
        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img_item_photo);
            nma1 = itemView.findViewById(R.id.tv_item_name);
            txt2 = itemView.findViewById(R.id.tv_item_from);

        }
    }
}