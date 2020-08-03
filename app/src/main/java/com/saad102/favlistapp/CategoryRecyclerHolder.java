package com.saad102.favlistapp;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class CategoryRecyclerHolder extends RecyclerView.ViewHolder {

    private TextView txtCategoryNumber;
    private TextView getTxtCategoryName;

    public CategoryRecyclerHolder(@NonNull View itemView) {
        super(itemView);

        txtCategoryNumber = itemView.findViewById(R.id.category_number_textview);
        getTxtCategoryName = itemView.findViewById(R.id.category_name_textview);
    }

    public TextView getTxtCategoryNumber() {
        return txtCategoryNumber;
    }

    public TextView getGetTxtCategoryName() {
        return getTxtCategoryName;
    }
}
