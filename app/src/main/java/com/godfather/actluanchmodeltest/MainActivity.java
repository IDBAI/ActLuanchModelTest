package com.godfather.actluanchmodeltest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onMainClick(View view) {
        Intent intent;
        switch (view.getId()) {

            case R.id.start_StandarActivity:
                intent = new Intent(this, StandardActivity.class);
                startActivity(intent);
                break;
            case R.id.start_SingleTopActivity:
                intent = new Intent(this, SingleTopActivity.class);
                startActivity(intent);
                break;
            case R.id.start_SingleTaskActivity:
                intent = new Intent(this, SingleTaskActivity.class);
                startActivity(intent);
                break;
            case R.id.start_SingleInstanceActivity:
                intent = new Intent(this, SingleInstanceActivity.class);
                startActivity(intent);
                break;
        }

    }
}
