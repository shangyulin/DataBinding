package com.example.shangyulin.databinding;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.shangyulin.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        ActivityMainBinding dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        user = new User("张三", 22, "http://img2.cache.netease.com/auto/2016/7/28/201607282215432cd8a.jpg");
        dataBinding.setUser(user);
        dataBinding.setClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn) {
            user.setAge(100);
            user.setImageUrl("http://cn.bing.com/az/hprichbg/rb/RiversMeet_ROW12983242988_1920x1080.jpg");
        } else if(view.getId() == R.id.jump){
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        }
    }
}
