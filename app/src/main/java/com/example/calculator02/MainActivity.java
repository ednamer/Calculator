package com.example.calculator02;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

        Button button0, button1, button2, button3, button4, button5, button6,
                button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
                buttonMul, button10, buttonC, buttonEqual;
        EditText calculate;

        float mValueOne, mValueTwo;

        boolean Addition, mSubtract, Multiplication, Division;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            button0 = (Button) findViewById(R.id.button0);
            button1 = (Button) findViewById(R.id.button1);
            button2 = (Button) findViewById(R.id.button2);
            button3 = (Button) findViewById(R.id.button3);
            button4 = (Button) findViewById(R.id.button4);
            button5 = (Button) findViewById(R.id.button5);
            button6 = (Button) findViewById(R.id.button6);
            button7 = (Button) findViewById(R.id.button7);
            button8 = (Button) findViewById(R.id.button8);
            button9 = (Button) findViewById(R.id.button9);
            button10 = (Button) findViewById(R.id.button10);
            buttonAdd = (Button) findViewById(R.id.buttonadd);
            buttonSub = (Button) findViewById(R.id.buttonsub);
            buttonMul = (Button) findViewById(R.id.buttonmul);
            buttonDivision = (Button) findViewById(R.id.buttondiv);
            buttonC = (Button) findViewById(R.id.buttonC);
            buttonEqual = (Button) findViewById(R.id.buttoneql);
            calculate = (EditText) findViewById(R.id.edt1);


            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    calculate.setText(calculate.getText() + "1");
                }
            });

            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    calculate.setText(calculate.getText() + "2");
                }
            });

            button3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    calculate.setText(calculate.getText() + "3");
                }
            });

            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    calculate.setText( calculate.getText() + "4");
                }
            });

            button5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    calculate.setText( calculate.getText() + "5");
                }
            });

            button6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    calculate.setText( calculate.getText() + "6");
                }
            });

            button7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    calculate.setText( calculate.getText() + "7");
                }
            });

            button8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    calculate.setText( calculate.getText() + "8");
                }
            });

            button9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    calculate.setText( calculate.getText() + "9");
                }
            });

            button0.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    calculate.setText( calculate.getText() + "0");
                }
            });

            buttonAdd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if ( calculate == null) {
                        calculate.setText("");
                    } else {
                        mValueOne = Float.parseFloat( calculate.getText() + "");
                        Addition = true;
                        calculate.setText(null);
                    }
                }
            });

            buttonSub.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mValueOne = Float.parseFloat( calculate.getText() + "");
                    mSubtract = true;
                    calculate.setText(null);
                }
            });

            buttonMul.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mValueOne = Float.parseFloat( calculate.getText() + "");
                    Multiplication = true;
                    calculate.setText(null);
                }
            });

            buttonDivision.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mValueOne = Float.parseFloat( calculate.getText() + "");
                    Division = true;
                    calculate.setText(null);
                }
            });

            buttonEqual.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mValueTwo = Float.parseFloat( calculate.getText() + "");

                    if (Addition == true) {
                        calculate.setText(mValueOne + mValueTwo + "");
                        Addition = false;
                    }

                    if (mSubtract == true) {
                        calculate.setText(mValueOne - mValueTwo + "");
                        mSubtract = false;
                    }

                    if (Multiplication == true) {
                        calculate.setText(mValueOne * mValueTwo + "");
                        Multiplication = false;
                    }

                    if (Division == true) {
                        calculate.setText(mValueOne / mValueTwo + "");
                        Division = false;
                    }
                }
            });

            buttonC.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    calculate.setText("");
                }
            });

            button10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    calculate.setText(calculate.getText() + ".");
                }
            });
        }
    }

