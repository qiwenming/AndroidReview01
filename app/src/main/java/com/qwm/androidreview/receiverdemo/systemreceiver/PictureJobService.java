package com.qwm.androidreview.receiverdemo.systemreceiver;

import android.annotation.TargetApi;
import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.util.Log;
import android.widget.Toast;

import java.util.List;

public class PictureJobService extends JobService {

    public static final int PICTURE_CODE = 1003;
    private static final String TAG = "PictureJobService";

    private Handler mHandler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            jobFinished((JobParameters)msg.obj,false);
            Log.i(TAG, "handleMessage: -------------");
        }
    };

    @Override
    public boolean onStartJob(JobParameters params) {
        if(Build.VERSION.SDK_INT>=24) {
            String[] authorities = params.getTriggeredContentAuthorities();
            Uri[] uris = params.getTriggeredContentUris();
            for(String au : authorities){
                Log.i(TAG, "authority : "+au);
            }
            for (Uri uri : uris){
                Log.i(TAG,"uri : "+uri.toString());
            }
        }
        mHandler.sendMessage(Message.obtain(mHandler,PICTURE_CODE,params));
        return true;
    }

    @Override
    public boolean onStopJob(JobParameters params) {
        mHandler.removeMessages(PICTURE_CODE);
        return false;
    }
}
