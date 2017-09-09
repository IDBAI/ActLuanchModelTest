package com.godfather.actluanchmodeltest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SingleTopActivity extends BaseActivity {
    private static final String TAG = "SingleTopActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_top);
    }


    public void onSingleTopClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.single:
                intent = new Intent(this, SingleTopActivity.class);
                startActivity(intent);
                break;
            case R.id.other:
                intent = new Intent(this, OtherActivity.class);
                startActivity(intent);
                break;
        }

    }

}
