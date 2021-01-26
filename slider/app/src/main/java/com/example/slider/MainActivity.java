package com.example.slider;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageSlider imageSlider = findViewById(R.id.slider);

        List<SlideModel> slideModels = new ArrayList<>();

        slideModels.add( new SlideModel("https://bit.ly/2YoJ77H", "The animal population decreased by 58 percent in 42 years."));
        slideModels.add(new SlideModel("https://bit.ly/2BteuF2", "Elephants and tigers may become extinct."));
        slideModels.add(new SlideModel("https://bit.ly/3fLJf72", "And people do that."));
        imageSlider.setImageList(slideModels,true);
    }
}