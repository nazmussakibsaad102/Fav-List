package com.saad102.favlistapp;

import android.content.Context;
import android.content.SharedPreferences;

import androidx.preference.PreferenceManager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

public class CategoryManager {

   private Context context;

    public CategoryManager(Context context) {
        this.context = context;
    }

    public void saveCategory(Category category){
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        //converting arraay list to set
        HashSet itemsHashSet = new HashSet(Arrays.asList(category.getItems()));

        editor.putStringSet(category.getName(), itemsHashSet);

        editor.apply();
    }

    public ArrayList<Category> retreiveCategories(){
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        Map<String, ? > data =  sharedPreferences.getAll();
        ArrayList<Category> categories = new ArrayList<>();

        for (Map.Entry<String, ?> entry : data.entrySet()){
            //typecasting to convert from hashset
            Category category = new Category(entry.getKey(), new ArrayList<String>((HashSet) entry.getValue()));
            categories.add(category);
        }
        return categories;

    };
}
