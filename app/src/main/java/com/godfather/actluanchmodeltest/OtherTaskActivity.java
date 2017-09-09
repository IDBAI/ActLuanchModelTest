package com.godfather.actluanchmodeltest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OtherTaskActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_task);
    }


    public void onOtherTaskClick(View view) {
        Intent intent = new Intent(this, SingleTaskActivity.class);
        startActivity(intent);
    }
}
