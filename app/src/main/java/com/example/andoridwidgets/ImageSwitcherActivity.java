package com.example.andoridwidgets;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import com.example.andoridwidgets.databinding.ActivityImageSwitcherBinding;

public class ImageSwitcherActivity extends AppCompatActivity {

    private ActivityImageSwitcherBinding binding;
    int imageSwitcherImages[] = {R.drawable.samantha_dp, R.drawable.improve10x_logo__2_, R.drawable.ic_launcher_background};
    int switcherImageLength = imageSwitcherImages.length;
    int counter = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityImageSwitcherBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleNext();
        handleImageSwitcher();
    }

    private void handleImageSwitcher() {
        binding.imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView = new ImageView(getApplicationContext());
                imageView.setLayoutParams(new ImageSwitcher.LayoutParams(
                        ActionBar.LayoutParams.MATCH_PARENT,ActionBar.LayoutParams.MATCH_PARENT
                ));
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setImageResource(R.drawable.ic_launcher_foreground);
                return imageView;
            }
        });
    }

    private void handleNext() {
        Animation aniOut = AnimationUtils.loadAnimation(this, android.R.anim.fade_out);
        Animation aniIn = AnimationUtils.loadAnimation(this, android.R.anim.fade_in);
        binding.imageSwitcher.setOutAnimation(aniOut);
        binding.imageSwitcher.setInAnimation(aniIn);
        binding.nextBtn.setOnClickListener(v -> {
            setImages();
        });
    }

    private void setImages() {
        counter++;
        if (counter == switcherImageLength) {
            counter = 0;
            binding.imageSwitcher.setImageResource(imageSwitcherImages[counter]);
        } else {
            binding.imageSwitcher.setImageResource(imageSwitcherImages[counter]);
        }
    }
}