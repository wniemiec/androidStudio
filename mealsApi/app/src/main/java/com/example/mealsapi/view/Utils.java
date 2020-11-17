/*-----------------------------------------------------------------------------
 - Developed by Haerul Muttaqin                                               -
 - Last modified 3/17/19 5:24 AM                                              -
 - Subscribe : https://www.youtube.com/haerulmuttaqin                         -
 - Copyright (c) 2019. All rights reserved                                    -
 -----------------------------------------------------------------------------*/
package com.example.mealsapi.view;

import android.app.AlertDialog;
import android.content.Context;

import com.example.mealsapi.api.FoodApi;
import com.example.mealsapi.api.FoodClient;

public class Utils
{
    public static FoodApi getApi() {
        return FoodClient.getFoodClient().create(FoodApi.class);
    }
}
