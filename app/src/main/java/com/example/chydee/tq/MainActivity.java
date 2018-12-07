package com.example.chydee.tq;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomSheetBehavior;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout llBottomSheet = findViewById(R.id.ll_bottomsheet);
        BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.from(llBottomSheet);

        final LinearLayout top = findViewById(R.id.top);

        bottomSheetBehavior.setBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {
            @Override
            public void onStateChanged(@NonNull View view, int i) {

            }

            @Override
            public void onSlide(@NonNull View view, float v) {
                if (v > 0.5f)
                    top.setAlpha(v);
            }
        });
    }

    public void Help(View view) {
    }

    public void Invite(View view) {
    }

    public void moreLives(View view) {
    }

    public void more(View view) {
    }
}
