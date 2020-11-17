package com.example.mealsapi.api;

import com.example.mealsapi.model.Categories;
import com.example.mealsapi.model.Meals;

import retrofit2.Call;
import retrofit2.http.GET;

public interface FoodApi {

      @GET("search.php?f=a")
       Call<Meals> getMeal();

    @GET("categories.php")
    Call<Categories> getCategories();

    // TODO 14. add interface get meals by category

}
