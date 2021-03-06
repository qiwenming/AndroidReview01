package com.qwm.androidreview.fragmentdemo;

import android.Manifest;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.qwm.androidreview.PermissionListener;
import com.qwm.androidreview.R;
import com.qwm.androidreview.gildedemo.GlideBaseTestActivity;

public class MyFragmentOne extends BaseFragment {


    private static final String TAG = "MyFragmentOne";
    
    private TextView contentTv;

    @Override
    public void initData() {

    }

    @Override
    public View initView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my_fragment_one, container, false);
        contentTv = (TextView) view.findViewById(R.id.tv_text);
        contentTv.setText(getClass().getSimpleName());
        view.findViewById(R.id.btn_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //有回调
                openFragment(new MyFragmentTwo(),true);
            }
        });
        return view;
    }

    @Override
    public void handlerCall(Bundle resultBundle) {
        super.handlerCall(resultBundle);
        String msg = resultBundle.getString("msg");
        contentTv.setText(msg);
    }

    //测试权限

}
