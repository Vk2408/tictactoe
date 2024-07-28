package com.example.tictactoe;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    String b1,b2,b3,b4,b5,b6,b7,b8,b9;
    Button x1,x2,x3,x4,x5,x6,x7,x8,x9,reset;
    int flag=0,ct=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        init();


    }

    private void init()
    {
        x1=findViewById(R.id.b1);
        x2=findViewById(R.id.b2);
        x3=findViewById(R.id.b3);
        x4=findViewById(R.id.b4);
        x5=findViewById(R.id.b5);
        x6=findViewById(R.id.b6);
        x7=findViewById(R.id.b7);
        x8=findViewById(R.id.b8);
        x9=findViewById(R.id.b9);
        reset=findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replay();
            }
        });
    }

    public void check(View v)
    {
        Button curr=(Button) v;
        if(curr.getText().toString().equals(""))
        {
            ct++;
            if(flag==0) {
                curr.setText("X");
                flag=1;
            }
            else {
                curr.setText("O");
                flag=0;
            }
            if(ct>4) {
                b1 = x1.getText().toString();
                b2 = x2.getText().toString();
                b3 = x3.getText().toString();
                b4 = x4.getText().toString();
                b5 = x5.getText().toString();
                b6 = x6.getText().toString();
                b7 = x7.getText().toString();
                b8 = x8.getText().toString();
                b9 = x9.getText().toString();
                if ((b1.equals(b2) && (b2.equals(b3)) && !(b1.equals("")))) {
                    Toast.makeText(this, "winner is" + b1, Toast.LENGTH_SHORT).show();
                    replay();
                }
                else if (b1.equals(b4) && (b4.equals(b7)) && !(b1.equals(""))) {
                    Toast.makeText(this, "winner is" + b1, Toast.LENGTH_SHORT).show();
                    replay();
                }
                else if ((b1.equals(b5) && (b5.equals(b9)) && !(b1.equals("")))) {
                    Toast.makeText(this, "winner is" + b1, Toast.LENGTH_SHORT).show();
                    replay();
                }
                else if ((b5.equals(b2) && (b2.equals(b8)) && !(b2.equals("")))) {
                    Toast.makeText(this, "winner is" + b5, Toast.LENGTH_SHORT).show();
                    replay();
                }
                else if (b3.equals(b6) && (b6.equals(b9)) && !(b3.equals(""))) {
                    Toast.makeText(this, "winner is" + b3, Toast.LENGTH_SHORT).show();
                    replay();
                }
                else if (b3.equals(b5) && (b5.equals(b7)) && !(b7.equals(""))){
                    Toast.makeText(this, "winner is" + b3, Toast.LENGTH_SHORT).show();
                    replay();
                }
                else if (b4.equals(b5) && (b5.equals(b6)) && !(b4.equals(""))) {
                    Toast.makeText(this, "winner is" + b4, Toast.LENGTH_SHORT).show();
                    replay();
                }
                else if (b7.equals(b8) && (b8.equals(b9)) && !(b9.equals(""))) {
                    Toast.makeText(this, "winner is" + b7, Toast.LENGTH_SHORT).show();
                    replay();
                }
                else if(ct==9) {
                    Toast.makeText(this, "Game Draw", Toast.LENGTH_SHORT).show();
                    replay();
                }

            }


        }


    }
    public void replay()
    {
        x1.setText("");
        x2.setText("");
        x3.setText("");
        x4.setText("");
        x5.setText("");
        x6.setText("");
        x7.setText("");
        x8.setText("");
        x9.setText("");
        flag=0;
        ct=0;
    }

}