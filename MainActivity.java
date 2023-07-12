package com.example.calculator;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.MenuItem;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    public EditText e1,e2,e3;
    int num1, num2;
    public boolean getNumbers() {
        e1 = (EditText) findViewById(R.id.e1);
        e2 = (EditText) findViewById(R.id.e2);
        e3 = (EditText)findViewById(R.id.e3);
        String s1 = e1.getText().toString();
        String s2 = e2.getText().toString();
        if(s1.equals("") || s2.equals(""))
        {
            String result = "Please enter required values";

            e3.setText(result);
            return false;
        }
        else
        {
            num1 = Integer.parseInt(s1);
            num2 = Integer.parseInt(s2);
            return true;
        }
    }
    public boolean getNumber() {
        e1 = (EditText) findViewById(R.id.e1);
        e2 = (EditText) findViewById(R.id.e2);
        e3 = (EditText)findViewById(R.id.e3);
        String s1 = e1.getText().toString();
        String s2 = e2.getText().toString();
        if(s1.equals(""))
        {
            String result = "Please enter required value in Number1";
            e3.setText(result);
            return false;
        }
        else if(!s1.equals("") && !s2.equals(""))
        {
            String result = "Enter value Only in Number1";
            e3.setText(result);
            return false;
        }
        else
        {
            num1 = Integer.parseInt(s1);
// num2 = Integer.parseInt(s2);
            return true;
        }
    }
    public void doSum(View v) {
        if (getNumbers()) {
            int sum = num1 + num2;
            e3.setText(Integer.toString(sum));
        }
    }
    public void doSub(View v) {
        if (getNumbers()) {
            int sum = num1 - num2;
            e3.setText(Integer.toString(sum));
        }
    }
    public void doMul(View v) {
        if (getNumbers()) {
            int sum = num1 * num2;
            e3.setText(Integer.toString(sum));
        }
    }
    public void doDiv(View v) {
        if (getNumbers()) {
            double sum = num1 / (num2 * 1.0);

            e3.setText(Double.toString(sum));
        }
    }
    public void doMod(View v) {
        if (getNumbers()) {
            double sum = num1 % num2;
            e3.setText(Double.toString(sum));
        }
    }
    public void doPow(View v) {
        if (getNumbers()) {
            double sum = Math.pow(num1, num2);
            e3.setText(Double.toString(sum));
        }
    }
    public void doSqrt(View v) {
        if (getNumber()) {
            double sum = Math.sqrt(num1);
            e3.setText(Double.toString(sum));
        }
    }
    public void doExp(View v) {
        if (getNumber()) {
            double sum = Math.exp(num1);
            e3.setText(Double.toString(sum));
        }
    }
    public void doLog(View v) {
        if (getNumber()) {
            double sum = Math.log(num1);
            e3.setText(Double.toString(sum));
        }
    }
    public void doSin(View v) {
        if (getNumber()) {
            double sum = Math.sin(num1);
            e3.setText(Double.toString(sum));
        }
    }
    public void doCos(View v) {
        if (getNumber()) {
            double sum = Math.cos(num1);
            e3.setText(Double.toString(sum));
        }
    }
    public void doTan(View v) {
        if (getNumber()) {
            double sum = Math.tan(num1);
            e3.setText(Double.toString(sum));
        }
    }
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}