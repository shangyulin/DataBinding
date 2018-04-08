package com.example.shangyulin.databinding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.BindingAdapter;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by shangyulin on 2018/4/8.
 */

public class Food extends BaseObservable {

    public String image;
    public String content;

    @BindingAdapter("image")
    public static void getInternetImage(ImageView imageView, String image){
        Glide.with(imageView.getContext()).load(image).into(imageView);
    }

    @Bindable
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
        notifyPropertyChanged(BR.image);
    }

    @Bindable
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        notifyPropertyChanged(BR.content);
    }

    public Food(String image, String content) {
        this.image = image;
        this.content = content;
    }

    public void onItemClick(View view) {
        setContent("点击后更改为新数据");
    }
}
