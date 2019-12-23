package com.example.scientificcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView input, signBox;
    String sign, value1, value2, specialFunction;
    Double num1, num2, result;
    boolean hasDot, hasSpecFunc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = findViewById(R.id.input);
        signBox = findViewById(R.id.sign);

        hasDot = false;
        hasSpecFunc = false;
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_0(View view) {
        input.setText(input.getText() + "0");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_1(View view) {
        input.setText(input.getText() + "1");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_2(View view) {
        input.setText(input.getText() + "2");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_3(View view) {
        input.setText(input.getText() + "3");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_4(View view) {
        input.setText(input.getText() + "4");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_5(View view) {
        input.setText(input.getText() + "5");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_6(View view) {
        input.setText(input.getText() + "6");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_7(View view) {
        input.setText(input.getText() + "7");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_8(View view) {
        input.setText(input.getText() + "8");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_9(View view) {
        input.setText(input.getText() + "9");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_point(View view) {
        if (!hasDot) {
            if (input.getText().equals("")) {

                input.setText("0.");
            } else {

                input.setText(input.getText() + ".");
            }

            hasDot = true;
        }

    }

    public void btnClick_add(View view) {
        sign = "+";
        value1 = input.getText().toString();
        input.setText(null);
        signBox.setText("+");
        hasDot = false;
    }

    public void btnClick_subtract(View view) {
        sign = "-";
        value1 = input.getText().toString();
        input.setText(null);
        signBox.setText("-");
        hasDot = false;
    }

    public void btnClick_multiply(View view) {
        sign = "*";
        value1 = input.getText().toString();
        input.setText(null);
        signBox.setText("×");
        hasDot = false;
    }

    public void btnClick_divide(View view) {
        sign = "/";
        value1 = input.getText().toString();
        input.setText(null);
        signBox.setText("÷");
        hasDot = false;
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_log(View view) {
        specialFunction = "log";
        hasSpecFunc = true;
        input.setText(null);
        signBox.setText("log");
        hasDot = false;
    }
    @SuppressLint("SetTextI18n")
    public void btnClick_ln(View view) {
        specialFunction = "ln";
        hasSpecFunc = true;
        input.setText(null);
        signBox.setText("ln");
        hasDot = false;
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_exponent(View view) {
        value1 = input.getText().toString();
        specialFunction = "exponent";
        hasSpecFunc = true;
        input.setText(null);
        signBox.setText("xⁿ");
        hasDot = false;
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_root(View view) {
        specialFunction = "root";
        hasSpecFunc = true;
        input.setText(null);
        signBox.setText("√");
        hasDot = false;
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_fact(View view) {
        specialFunction = "fact";
        hasSpecFunc = true;
        input.setText(null);
        signBox.setText("!");
        hasDot = false;
    }

    public void btnClick_mod(View view) {
        value1 = input.getText().toString();
        specialFunction = "mod";
        hasSpecFunc = true;
        input.setText(null);
        signBox.setText("%");
        hasDot = false;
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_sin(View view) {
        specialFunction = "sin";
        hasSpecFunc = true;
        input.setText(null);
        signBox.setText("sin");
        hasDot = false;
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_cos(View view) {
        specialFunction = "cos";
        hasSpecFunc = true;
        input.setText(null);
        signBox.setText("cos");
        hasDot = false;
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_tan(View view) {
        specialFunction = "tan";
        hasSpecFunc = true;
        input.setText(null);
        signBox.setText("tan");
        hasDot = false;
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_equals(View view) {
        if (( specialFunction == null && sign == null) || input.getText().equals("")) {
            signBox.setText("Error!");
        }
        else if(specialFunction != null){
            switch (specialFunction){
                default:
                    break;
                case "log" :
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    input.setText(Math.log10(num1) + "");
                    specialFunction = null;
                    hasSpecFunc = false;
                    signBox.setText(null);
                    break;
                case "ln" :
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    input.setText(Math.log(num1) + "");
                    specialFunction = null;
                    hasSpecFunc = false;
                    signBox.setText(null);
                    break;
                case "exponent" :
                    num1 = Double.parseDouble(value1);
                    value2 = input.getText().toString();
                    num2 = Double.parseDouble(value2);
                    input.setText(Math.pow(num1,num2) + "");
                    specialFunction = null;
                    hasSpecFunc = false;
                    signBox.setText(null);
                    break;
                case "root" :
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    input.setText(Math.sqrt(num1) + "");
                    specialFunction = null;
                    hasSpecFunc = false;
                    signBox.setText(null);
                    break;
                case "fact" :
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    int i = Integer.parseInt(value1) - 1 ;
                    while(i>0){
                        num1 = num1*i;
                        i--;
                    }
                    specialFunction = null;
                    hasSpecFunc = false;
                    signBox.setText(null);
                    break;
                case "mod" :
                    num1 = Double.parseDouble(value1);
                    value2 = input.getText().toString();
                    num2 = Double.parseDouble(value2);
                    input.setText(String.valueOf(num1%num2) );
                    specialFunction = null;
                    hasSpecFunc = false;
                    signBox.setText(null);
                    break;
                case "sin" :
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    input.setText(Math.sin(num1) + "");
                    specialFunction = null;
                    hasSpecFunc = false;
                    signBox.setText(null);
                    break;
                case "cos" :
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    input.setText(Math.cos(num1) + "");
                    specialFunction = null;
                    hasSpecFunc = false;
                    signBox.setText(null);
                    break;
                case "tan" :
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    input.setText(Math.tan(num1) + "");
                    specialFunction = null;
                    hasSpecFunc = false;
                    signBox.setText(null);
                    break;
            }
        }
        else if ((sign.equals("+") || sign.equals("-") || sign.equals("*") || sign.equals("/")) && value1.equals("")) {
            signBox.setText("Error!");
        } else {
            switch (sign) {
                default:
                    break;
                case "log":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    input.setText(Math.log10(num1) + "");
                    sign = null;
                    signBox.setText(null);
                    break;
                case "ln":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    input.setText(Math.log(num1) + "");
                    sign = null;
                    signBox.setText(null);
                    break;
                case "power":
                    num1 = Double.parseDouble((value1));
                    value2 = input.getText().toString();
                    num2 = Double.parseDouble(value2);
                    input.setText(Math.pow(num1, num2) + "");
                    sign = null;
                    signBox.setText(null);
                    break;
                case "root":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble((value1));
                    input.setText(Math.sqrt(num1) + "");
                    sign = null;
                    signBox.setText(null);
                    break;
                case "factorial":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble((value1));
                    int i = Integer.parseInt(value1) - 1;

                    while (i > 0) {
                        num1 = num1 * i;
                        i--;
                    }

                    input.setText(num1 + "");
                    sign = null;
                    signBox.setText(null);
                    break;
                case "sin":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble((value1));
                    input.setText(Math.sin(num1) + "");
                    sign = null;
                    signBox.setText(null);
                    break;
                case "cos":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble((value1));
                    input.setText(Math.cos(num1) + "");
                    sign = null;
                    signBox.setText(null);
                    break;
                case "tan":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble((value1));
                    input.setText(Math.tan(num1) + "");
                    sign = null;
                    signBox.setText(null);
                    break;
                case "+":
                    value2 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    num2 = Double.parseDouble(value2);
                    result = num1 + num2;
                    input.setText(result + "");
                    sign = null;
                    signBox.setText(null);
                    break;
                case "-":
                    value2 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    num2 = Double.parseDouble(value2);
                    result = num1 - num2;
                    input.setText(result + "");
                    sign = null;
                    signBox.setText(null);
                    break;
                case "*":
                    value2 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    num2 = Double.parseDouble(value2);
                    result = num1 * num2;
                    input.setText(result + "");
                    sign = null;
                    signBox.setText(null);
                    break;
                case "/":
                    value2 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    num2 = Double.parseDouble(value2);
                    result = num1 / num2;
                    input.setText(result + "");
                    sign = null;
                    signBox.setText(null);
                    break;
            }

        }
    }


    public void btnClick_backspace(View view) {
        if (input.getText().equals("")) {
            input.setText(null);
        } else {
            int len = input.getText().length();
            String s = input.getText().toString();
            if (s.charAt(len - 1) == '.') {
                hasDot = false;
                input.setText(input.getText().subSequence(0, input.getText().length() - 1));

            } else {
                input.setText(input.getText().subSequence(0, input.getText().length() - 1));
            }
        }
    }

    public void btnClick_C(View view) {

        input.setText(null);
        signBox.setText(null);
        value1 = null;
        value2 = null;
        sign = null;
        hasDot = false;
    }
}
