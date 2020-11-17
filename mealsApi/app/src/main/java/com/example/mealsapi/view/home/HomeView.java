/*-----------------------------------------------------------------------------
 - Developed by Haerul Muttaqin                                               -
 - Last modified 3/17/19 5:24 AM                                              -
 - Subscribe : https://www.youtube.com/haerulmuttaqin                         -
 - Copyright (c) 2019. All rights reserved                                    -
 -----------------------------------------------------------------------------*/
package com.example.mealsapi.view.home;

import com.example.mealsapi.model.Categories;
import com.example.mealsapi.model.Meals;

import java.util.List;

public interface HomeView {
    void setMeal(List<Meals.Meal> meal);
    void onErrorLoading(String message);
}
