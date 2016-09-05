package com.lljackie.test3_view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et_input;
    private Button bt_change;
    private TextView tv_output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_input = (EditText) findViewById(R.id.et_input);
        bt_change = (Button) findViewById(R.id.bt_change);

        bt_change.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                et_input.setText("在这停顿！");
            }
        });
    }

    public void onCheckBoxClick(View view) {
        tv_output = (TextView) findViewById(R.id.tv_output);
        tv_output.setText(((CheckBox)view).getText().toString());
    }

    public void onRadioButtonClick(View view) {
        tv_output = (TextView) findViewById(R.id.tv_output);
        tv_output.setText(((RadioButton)view).getText().toString());
    }
}