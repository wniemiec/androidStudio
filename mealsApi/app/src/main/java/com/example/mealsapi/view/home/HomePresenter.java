/*-----------------------------------------------------------------------------
 - Developed by Haerul Muttaqin                                               -
 - Last modified 3/17/19 5:24 AM                                              -
 - Subscribe : https://www.youtube.com/haerulmuttaqin                         -
 - Copyright (c) 2019. All rights reserved                                    -
 -----------------------------------------------------------------------------*/
package com.example.mealsapi.view.home;


import androidx.annotation.NonNull;


import com.example.mealsapi.model.Categories;
import com.example.mealsapi.model.Meals;
import com.example.mealsapi.view.Utils;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;



class HomePresenter {

    private HomeView view;

    public HomePresenter(HomeView view) {
        this.view = view;
    }



    void getMeals() {
        Call<Meals> mealsCall = Utils.getApi().getMeal();
        mealsCall.enqueue(new Callback<Meals>() {
            @Override
            public void onResponse(@NonNull Call<Meals> call, @NonNull Response<Meals> response) {


                if (response.isSuccessful() && response.body() != null) {

                    view.setMeal(response.body().getMeals());

                }
                else {
                    view.onErrorLoading(response.message());
                }
            }

            @Override
            public void onFailure(@NonNull Call<Meals> call, @NonNull Throwable t) {

                view.onErrorLoading(t.getLocalizedMessage());
            }
        });
    }

}
