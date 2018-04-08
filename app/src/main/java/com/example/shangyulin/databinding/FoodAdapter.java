package com.example.shangyulin.databinding;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by shangyulin on 2018/4/8.
 */

public class FoodAdapter extends BaseAdapter {

    private final LayoutInflater inflater;
    private Context context;

    private List<Food> foodList;

    private int layoutID;

    private int resID;

    public FoodAdapter(Context context, List<Food> foodList, int layoutID, int resID) {
        this.context = context;
        this.foodList = foodList;
        this.layoutID = layoutID;
        this.resID = resID;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return foodList.size();
    }

    @Override
    public Object getItem(int i) {
        return foodList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        ViewDataBinding bing;
        if (convertView == null){
            bing = DataBindingUtil.inflate(inflater, layoutID, viewGroup, false);
        } else {
            bing = DataBindingUtil.getBinding(convertView);
        }
        bing.setVariable(resID, foodList.get(i));
        return bing.getRoot();
    }


}
