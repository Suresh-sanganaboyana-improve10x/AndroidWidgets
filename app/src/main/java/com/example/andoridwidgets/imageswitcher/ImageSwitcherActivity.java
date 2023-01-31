package com.example.andoridwidgets.imageswitcher;

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

import com.example.andoridwidgets.R;
import com.example.andoridwidgets.databinding.ActivityImageSwitcherBinding;

public class ImageSwitcherActivity extends AppCompatActivity implements ImageSwitcherView {

    private ActivityImageSwitcherBinding binding;
    int imageSwitcherImages[] = {R.drawable.samantha_dp, R.drawable.improve10x_logo__2_, R.drawable.ic_launcher_background};
    int switcherImageLength = imageSwitcherImages.length;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityImageSwitcherBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        showImageView(R.drawable.samantha_dp);
        handleNextBtn();

    }

    @Override
    public void handleNextBtn() {
        Animation aniOut = AnimationUtils.loadAnimation(this, android.R.anim.fade_out);
        Animation aniIn = AnimationUtils.loadAnimation(this, android.R.anim.fade_in);
        binding.imageSwitcher.setOutAnimation(aniOut);
        binding.imageSwitcher.setInAnimation(aniIn);
        binding.nextBtn.setOnClickListener(v -> {
            counter = new ImageSwitcherControllerImpl().getImageNextPosition(counter, switcherImageLength);
            binding.imageSwitcher.setImageResource(imageSwitcherImages[counter]);
        });
    }

    @Override
    public void showImageView(int resourceId) {
        binding.imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView = new ImageView(getApplicationContext());
                imageView.setLayoutParams(new ImageSwitcher.LayoutParams(
                        ActionBar.LayoutParams.MATCH_PARENT, ActionBar.LayoutParams.MATCH_PARENT
                ));
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setImageResource(resourceId);
                return imageView;
            }
        });
    }
}