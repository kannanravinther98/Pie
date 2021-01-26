package com.example.slider;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.slider.R;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by Devendra K Chavan on May,2020
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageSlider imageSlider = findViewById(R.id.slider);

        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel(getString(R.string.ffff),"1 Image"));
        slideModels.add(new SlideModel(getString(R.string.ff2),"2 Image"));
        slideModels.add(new SlideModel(getString(R.string.ff3),"3 Image"));
        slideModels.add(new SlideModel(imageUrl: "https://c4.wallpaperflare.com/wallpaper/662/618/496/natur-2560x1600-sceneries-wallpaper-preview.jpg","4 Image"));
        imageSlider.setImageList(slideModels,true);

    }
}