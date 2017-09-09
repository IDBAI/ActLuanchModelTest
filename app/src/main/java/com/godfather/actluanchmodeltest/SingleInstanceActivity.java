package com.godfather.actluanchmodeltest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SingleInstanceActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_instance);
    }


    public void onSingleInstanceClick(View view) {
        Intent intent = new Intent(this, Other2Activity.class);
        startActivity(intent);
    }
}
