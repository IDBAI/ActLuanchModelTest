package com.godfather.actluanchmodeltest;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by Godfather on 2017/9/9.
 */

public class BaseActivity extends AppCompatActivity {
    private static final String TAG = "BaseActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d(TAG, "onCreate: " + getClass().getSimpleName()
                + " hashCode:" + this.hashCode()
                + " taskId:" + this.getTaskId());
        dumpTaskAffinity();

    }


    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);

        Log.d(TAG, "onNewIntent: " + getClass().getSimpleName()
                + " hashCode:" + this.hashCode()
                + " taskId:" + this.getTaskId());
        dumpTaskAffinity();

    }


    private void dumpTaskAffinity() {
        try {
            ActivityInfo activityInfo = this.getPackageManager().getActivityInfo(getComponentName(), PackageManager.GET_META_DATA);
            String taskAffinity = activityInfo.taskAffinity;
            Log.d(TAG, "dumpTaskAffinity: taskAffinity = " + taskAffinity);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }


    }
}
