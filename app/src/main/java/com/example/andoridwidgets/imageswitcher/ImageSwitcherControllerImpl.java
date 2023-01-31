package com.example.andoridwidgets.imageswitcher;

public class ImageSwitcherControllerImpl implements ImageSwitcherController{
    @Override
    public int getImageNextPosition(int currentImagePosition, int length) {
        if (currentImagePosition < length-1) {
            return currentImagePosition + 1;
        } else {
            return 0;
        }
    }
}
