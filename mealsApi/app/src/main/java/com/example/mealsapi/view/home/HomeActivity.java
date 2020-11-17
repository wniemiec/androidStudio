package com.example.mealsapi.view.home;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.mealsapi.R;
import com.example.mealsapi.model.Categories;
import com.example.mealsapi.model.Meals;

import org.w3c.dom.Text;

import java.util.List;


public class HomeActivity extends AppCompatActivity implements HomeView {


    HomePresenter presenter;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = (TextView) findViewById(R.id.txt);

        presenter = new HomePresenter(this);
        presenter.getMeals();
    }

    @Override
    public void setMeal(List<Meals.Meal> meal)
    {
        for(int i=0; i<meal.size(); i++)
        {
            txt.setText(meal.get(i).getStrMeal());
        }
    }

    @Override
    public void onErrorLoading(String message) {

    }
}
