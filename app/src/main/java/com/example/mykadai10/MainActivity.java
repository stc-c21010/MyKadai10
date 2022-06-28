package com.example.mykadai10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btClick=findViewById(R.id.bc);
        HelloListener name=new HelloListener();
        HelloListener address=new HelloListener();
        btClick.setOnClickListener(name);
        btClick.setOnClickListener(address);
        Button btaclear=findViewById(R.id.bac);
        btaclear.setOnClickListener(address);
        Button btnclear=findViewById(R.id.bnc);
        btnclear.setOnClickListener(name);
    }
    private class HelloListener implements View.OnClickListener{
        @Override
        public void onClick(View view){
            EditText inputn=findViewById(R.id.etName);
            EditText inputa=findViewById(R.id.etaddress);
            TextView output=findViewById(R.id.tvOutput);
            int id=view.getId();
            switch (id){
                case R.id.bc:
                    String inputStr=inputn.getText().toString();
                    String is=inputa.getText().toString();
                    output.setText(is+"にお住いの"+inputStr+"さん、こんにちは！");
                    break;
                case R.id.bac:
                    String n=inputn.getText().toString();
                    String an=inputa.getText().toString();
                    inputa.setText("どこか");
                    output.setText(an+"にお住いの"+n+"さん、こんにちは！");
                    break;
                case R.id.bnc:
                    String nn=inputn.getText().toString();
                    String a=inputa.getText().toString();
                    inputn.setText("誰か");
                    output.setText(a+"にお住いの"+nn+"さん、こんにちは！");
                    break;
            }

        }
    }

}