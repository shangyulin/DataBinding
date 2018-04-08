package com.example.shangyulin.databinding;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    List<Food> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initData();
        ListView listView = findViewById(R.id.lv);

        FoodAdapter adapter = new FoodAdapter(this, list, R.layout.food_item, BR.food);

        listView.setAdapter(adapter);

//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                list.get(i).setContent("hahahahahahhahahahahdhfuekwhfuf");
//            }
//        });
    }

    private void initData() {
        Food f1 = new Food("http://img2.cache.netease.com/auto/2016/7/28/201607282215432cd8a.jpg", "苹果");
        Food f2 = new Food("http://cn.bing.com/az/hprichbg/rb/RiversMeet_ROW12983242988_1920x1080.jpg", "橘子");
        Food f3 = new Food("http://img2.cache.netease.com/auto/2016/7/28/201607282215432cd8a.jpg", "香蕉");
        Food f4 = new Food("http://cn.bing.com/az/hprichbg/rb/RiversMeet_ROW12983242988_1920x1080.jpg", "栗子");
        Food f5 = new Food("http://img2.cache.netease.com/auto/2016/7/28/201607282215432cd8a.jpg", "西瓜");
        Food f6 = new Food("http://cn.bing.com/az/hprichbg/rb/RiversMeet_ROW12983242988_1920x1080.jpg", "葡萄");
        Food f7 = new Food("http://img2.cache.netease.com/auto/2016/7/28/201607282215432cd8a.jpg", "芒果");
        Food f8 = new Food("http://cn.bing.com/az/hprichbg/rb/RiversMeet_ROW12983242988_1920x1080.jpg", "荔枝");
        Food f9 = new Food("http://img2.cache.netease.com/auto/2016/7/28/201607282215432cd8a.jpg", "黄瓜");
        Food f10 = new Food("http://cn.bing.com/az/hprichbg/rb/RiversMeet_ROW12983242988_1920x1080.jpg", "西红柿");
        list.add(f1);
        list.add(f2);
        list.add(f3);
        list.add(f4);
        list.add(f5);
        list.add(f6);
        list.add(f7);
        list.add(f8);
        list.add(f9);
        list.add(f10);
    }


}
