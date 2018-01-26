package com.example.khansaahsan.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.khansaahsan.DB.RecordDBHandler;

public class MainActivity extends AppCompatActivity {

    RecordDBHandler handler;
    float num1,num2= -0;
    boolean operator = false;
    String operation = "n";
    float ans = 0;

    EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.editText);
        handler = new RecordDBHandler(this);

       Button btn1 = findViewById(R.id.button1);
       Button btn2 = findViewById(R.id.button2);
       Button btn3 = findViewById(R.id.button3);
       Button btn4 = findViewById(R.id.button4);
       Button btn5 = findViewById(R.id.button5);
       Button btn6 = findViewById(R.id.button6);
       Button btn7 = findViewById(R.id.button7);
       Button btn8 = findViewById(R.id.button8);
       Button btn9 = findViewById(R.id.button9);
       Button btn0 = findViewById(R.id.button0);
       Button btnAns = findViewById(R.id.buttonAns);
       Button btnAdd = findViewById(R.id.buttonAdd);
       Button btnSubtract = findViewById(R.id.buttonSubtract);
       Button btnMul = findViewById(R.id.buttonMul);
       Button btnDiv = findViewById(R.id.buttonDiv);
       Button btnCLR = findViewById(R.id.buttonCLR);
       Button btnHstry = findViewById(R.id.buttonHistory);
       Button buttonDel = findViewById(R.id.buttonDelete);

       btn1.setOnClickListener(new View.OnClickListener()
       {
           public void onClick(View V)
           {
               if(!operator)
               {
                   num1 = (num1*10)+1;
                   text.setText(Float.toString(num1));
               }
               else
               {
                   num2 = (num2*10)+1;
                   text.setText(Float.toString(num2));
               }
           }

       });

        btn2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View V)
            {
                if(!operator)
                {
                    num1 = (num1*10)+2;
                    text.setText(Float.toString(num1));
                }
                else
                {
                    num2 = (num2*10)+2;
                    text.setText(Float.toString(num2));
                }
            }

        });

        btn3.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View V)
            {
                if(!operator)
                {
                    num1 = (num1*10)+3;
                    text.setText(Float.toString(num1));
                }
                else
                {
                    num2 = (num2*10)+3;
                    text.setText(Float.toString(num2));
                }
            }

        });

        btn4.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View V)
            {
                if(!operator)
                {
                    num1 = (num1*10)+4;
                    text.setText(Float.toString(num1));
                }
                else
                {
                    num2 = (num2*10)+4;
                    text.setText(Float.toString(num2));
                }
            }

        });

        btn5.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View V)
            {
                if(!operator)
                {
                    num1 = (num1*10)+5;
                    text.setText(Float.toString(num1));
                }
                else
                {
                    num2 = (num2*10)+5;
                    text.setText(Float.toString(num2));
                }
            }

        });

        btn6.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View V)
            {
                if(!operator)
                {
                    num1 = (num1*10)+6;
                    text.setText(Float.toString(num1));
                }
                else
                {
                    num2 = (num2*10)+6;
                    text.setText(Float.toString(num2));
                }
            }

        });

        btn7.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View V)
            {
                if(!operator)
                {
                    num1 = (num1*10)+7;
                    text.setText(Float.toString(num1));
                }
                else
                {
                    num2 = (num2*10)+7;
                    text.setText(Float.toString(num2));
                }
            }

        });

        btn8.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View V)
            {
                if(!operator)
                {
                    num1 = (num1*10)+8;
                    text.setText(Float.toString(num1));
                }
                else
                {
                    num2 = (num2*10)+8;
                    text.setText(Float.toString(num2));
                }
            }

        });

        btn9.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View V)
            {
                if(!operator)
                {
                    num1 = (num1*10)+9;
                    text.setText(Float.toString(num1));
                }
                else
                {
                    num2 = (num2*10)+9;
                    text.setText(Float.toString(num2));
                }
            }

        });

        btn0.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View V)
            {
                if(!operator)
                {
                    num1 = (num1*10);
                    text.setText(Float.toString(num1));
                }
                else
                {
                    num2 = (num2*10);
                    text.setText(Float.toString(num2));
                }
            }

        });

        btnAdd.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View V)
            {
               if(!operator)
               {
                   operator = true;
                   operation = "+";
                   text.setText("");
               }
               else
               {
                   calculate_save();
                   num1 = ans;
                   num2 = 0;

               }
            }

        });

        btnSubtract.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View V)
            {
                if(!operator)
                {
                    operator = true;
                    operation = "-";
                    text.setText("");
                }
                else
                {
                    calculate_save();
                    num1 = ans;
                    num2 = 0;

                }
            }

        });

        btnMul.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View V)
            {
                if(!operator)
                {
                    operator = true;
                    operation = "*";
                    text.setText("");
                }
                else
                {
                    calculate_save();
                    num1 = ans;
                    num2 = 0;

                }
            }

        });


        btnDiv.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View V)
            {
                if(!operator)
                {
                    operator = true;
                    operation = "/";
                    text.setText("");
                }
                else
                {
                    calculate_save();
                    num1 = ans;
                    num2 = 0;

                }
            }

        });

        btnAns.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View V)
            {
                calculate_save();
                reset();
            }

        });

        btnHstry.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View V)
            {

                Intent intent = new Intent(getApplicationContext(),showRecordActivity.class);
                startActivity(intent);

            }

        });


        buttonDel.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View V)
            {
                handler.delete();

            }

        });

    }

    void calculate_save()
    {
        operator = false;
        switch (operation)
        {
            case "+":
                ans = num1+num2;
                break;
            case "-":
                ans = num1-num2;
                break;
            case "*":
                ans = num1*num2;
                break;
            case "/":
                ans = (float)num1/(float)num2;
                break;
            case "n":
                ans = num1;
        }
        text.setText(Float.toString(ans));
        handler.insert(num1,operation,num2,ans);
    }

    void reset()
    {
        num1 = num2 = -0;
        operation = "n";
        operator = false;
    }
}
