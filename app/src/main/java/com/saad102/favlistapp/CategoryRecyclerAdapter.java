package com.saad102.favlistapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

class CategoryRecyclerAdapter extends RecyclerView.Adapter<CategoryRecyclerHolder> {
    //String []  categories = {"Hobbies", "Sports", "Games", "Electronic Gadgets", "Foods", "Countries" };


    private ArrayList<Category> categories;

    public CategoryRecyclerAdapter(ArrayList<Category> categories) {
        this.categories = categories;
    }

    @NonNull
    @Override
    public CategoryRecyclerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.category_viewholder, parent, false);
        CategoryRecyclerHolder categoryRecyclerHolder = new CategoryRecyclerHolder(view);
        return categoryRecyclerHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryRecyclerHolder holder, int position) {

        holder.getTxtCategoryNumber().setText(Integer.toString(position + 1));
        holder.getGetTxtCategoryName().setText(categories.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return categories.size();
    }
    public void addCategories(Category category){
        categories.add(category);
        notifyItemInserted(categories.size() - 1);
    }
}
