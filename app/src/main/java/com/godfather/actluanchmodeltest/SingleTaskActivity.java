package com.godfather.actluanchmodeltest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SingleTaskActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_task);
    }


    public void onSingleTaskClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.btnsingleTask01:
                intent = new Intent(this, SingleTaskActivity.class);
                startActivity(intent);
                break;

            case R.id.btnsingleTask02:
                intent = new Intent(this,OtherTaskActivity.class);
                startActivity(intent);

                break;
        }
    }
}
