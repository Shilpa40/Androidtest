package com.concretepage.android;

import java.util.Calendar;
import android.os.Bundle;
import android.widget.TextView;

import android.app.Activity;

public class TimeDemoActivity extends Activity {
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    @Override
    public void onStart() {
        super.onStart();
        TextView textView = (TextView) findViewById(R.id.text_view);
        Calendar  calender = Calendar.getInstance();
        textView.setText(calender.getTime().toString());
    }
}
