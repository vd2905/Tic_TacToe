package com.example.tictac_toe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class Game_Activity extends AppCompatActivity implements View.OnClickListener
{
    Button btn[] = new Button[9] ;
    int cnt = 0 ;
    ArrayList arraylist = new ArrayList() ;
    String b0,b1,b2,b3,b4,b5,b6,b7,b8;
    TextView text1 ;
    void win()
    {
        if(b0.equals(b1) && b1.equals(b2) && !b1.equals(""))//012
        {
            disable();
            Toast.makeText(this, "X WIN", Toast.LENGTH_SHORT).show();
        }
        else if(b3.equals(b4) && b4.equals(b5) && !b4.equals(""))//345
        {
            disable();
            Toast.makeText(this, "X WIN", Toast.LENGTH_SHORT).show();
        }
        else if(b6.equals(b7) && b7.equals(b8) && !b7.equals(""))//678
        {
            disable();
            Toast.makeText(this, "X WIN", Toast.LENGTH_SHORT).show();
        }
        else if(b0.equals(b3) && b3.equals(b6) && !b3.equals(""))//036
        {
            disable();
            Toast.makeText(this, "X WIN", Toast.LENGTH_SHORT).show();
        }
        else if(b1.equals(b4) && b4.equals(b7) && !b4.equals(""))//147
        {
            disable();
            Toast.makeText(this, "X WIN", Toast.LENGTH_SHORT).show();
        }
        else if(b2.equals(b5) && b5.equals(b8) && !b5.equals(""))//258
        {
            disable();
            Toast.makeText(this, "X WIN", Toast.LENGTH_SHORT).show();
        }
        else if(b0.equals(b4) && b4.equals(b8) && !b4.equals(""))//048
        {
            disable();
            Toast.makeText(this, "X WIN", Toast.LENGTH_SHORT).show();
        }
        else if(b2.equals(b4) && b4.equals(b6) && !b4.equals(""))//246
        {
            disable();
            Toast.makeText(this, "X WIN", Toast.LENGTH_SHORT).show();
        }
    }
    void disable()
    {
        for (int i = 0; i < btn.length; i++)
        {
            btn[i].setEnabled(false);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        text1 = findViewById(R.id.text1);
        for (int i=0;i<btn.length;i++)
        {
            int id=getResources().getIdentifier("btn"+i,"id",getPackageName());
            btn[i]=findViewById(id);
            btn[i].setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View view)
    {

        for (int i=0;i<btn.length;i++)
        {
            if(view.getId()==btn[i].getId())
            {
                btn[i].setText("X");
                arraylist.add(i);
                btn[i].setEnabled(false);
                cnt++;

                if(cnt<=4)
                {
                    while(true)
                    {
                        int min=0;
                        int max=8;
                        int r = new Random().nextInt(max - min) + min;
                        if(!arraylist.contains(r))
                        {
                            btn[r].setText("0");
                            arraylist.add(r);
                            btn[r].setEnabled(false);
                            break;
                        }
                        b1 = btn[1].getText().toString();
                        b2 = btn[2].getText().toString();
                        b3 = btn[3].getText().toString();
                        b4 = btn[4].getText().toString();
                        b5 = btn[5].getText().toString();
                        b6 = btn[6].getText().toString();
                        b7 = btn[7].getText().toString();
                        b8 = btn[8].getText().toString();
                        b0 = btn[0].getText().toString();

                        if(cnt>1)
                        {
                            win();
                        }
                    }
                }
            }

        }
        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                for (int i = 0; i < btn.length; i++)
                {
                    btn[i].setText("");
                    btn[i].setEnabled(true);
                    arraylist.clear();
                    cnt=0;
                }
            }
        });
    }
}