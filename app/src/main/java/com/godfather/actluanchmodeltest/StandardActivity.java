package com.godfather.actluanchmodeltest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class StandardActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standard);
    }

    public void onClick(View v) {
        Intent intent = new Intent(this, StandardActivity.class);
        startActivity(intent);
    }
}
