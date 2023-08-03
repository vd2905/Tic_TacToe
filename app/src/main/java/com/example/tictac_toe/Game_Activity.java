package com.example.tictac_toe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class Game_Activity extends AppCompatActivity implements View.OnClickListener
{
    Button t[] = new Button[9] ;
    int cnt = 0 ;
    ArrayList list = new ArrayList() ;
    TextView txt1,txt2 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        txt1 = findViewById(R.id.result);
        txt2 = findViewById(R.id.restart);

        for (int i=0;i<t.length;i++)
        {
            int id=getResources().getIdentifier("btn"+i,"id",getPackageName());
            t[i]=findViewById(id);
            t[i].setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View view)
    {

        for (int i=0;i<t.length;i++)
        {
            if(view.getId()==t[i].getId())
            {
                t[i].setText("X");
                list.add(i);
                t[i].setEnabled(false);
                win();
                cnt++;

                if(cnt<=4)
                {
                    while(true)
                    {
                        int min=0;
                        int max=8;
                        int r = new Random().nextInt(max - min) + min;
                        if(!list.contains(r))
                        {
                            t[r].setText("0");
                            list.add(r);
                            t[r].setEnabled(false);
                            win();
                            break;
                        }
                    }
                }
            }

        }
        txt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                for (int i = 0; i < t.length; i++)
                {
                    t[i].setText("");
                    list.clear();
                    cnt=0;
                    t[i].setEnabled(true);
                    txt1.setText("");
                }
            }
        });
    }

    private void win() {
        if(t[0].getText().toString() == "X" && t[1].getText().toString() == "X" && t[2].getText().toString() == "X"){
            txt1.setText("Congratulation ! You Win");
            t[0].setEnabled(false);
            t[1].setEnabled(false);
            t[2].setEnabled(false);
            t[3].setEnabled(false);
            t[4].setEnabled(false);
            t[5].setEnabled(false);
            t[6].setEnabled(false);
            t[7].setEnabled(false);
            t[8].setEnabled(false);
        }
        if(t[0].getText().toString() == "X" && t[3].getText().toString() == "X" && t[6].getText().toString() == "X"){
            txt1.setText("Congratulation ! You Win");
            t[0].setEnabled(false);
            t[1].setEnabled(false);
            t[2].setEnabled(false);
            t[3].setEnabled(false);
            t[4].setEnabled(false);
            t[5].setEnabled(false);
            t[6].setEnabled(false);
            t[7].setEnabled(false);
            t[8].setEnabled(false);
        }
        if(t[0].getText().toString() == "X" && t[4].getText().toString() == "X" && t[8].getText().toString() == "X"){
            txt1.setText("Congratulation ! You Win");
            t[0].setEnabled(false);
            t[1].setEnabled(false);
            t[2].setEnabled(false);
            t[3].setEnabled(false);
            t[4].setEnabled(false);
            t[5].setEnabled(false);
            t[6].setEnabled(false);
            t[7].setEnabled(false);
            t[8].setEnabled(false);
        }
        if(t[1].getText().toString() == "X" && t[4].getText().toString() == "X" && t[7].getText().toString() == "X"){
            txt1.setText("Congratulation ! You Win");
            t[0].setEnabled(false);
            t[1].setEnabled(false);
            t[2].setEnabled(false);
            t[3].setEnabled(false);
            t[4].setEnabled(false);
            t[5].setEnabled(false);
            t[6].setEnabled(false);
            t[7].setEnabled(false);
            t[8].setEnabled(false);
        }
        if(t[2].getText().toString() == "X" && t[4].getText().toString() == "X" && t[6].getText().toString() == "X"){
            txt1.setText("Congratulation ! You Win");
            t[0].setEnabled(false);
            t[1].setEnabled(false);
            t[2].setEnabled(false);
            t[3].setEnabled(false);
            t[4].setEnabled(false);
            t[5].setEnabled(false);
            t[6].setEnabled(false);
            t[7].setEnabled(false);
            t[8].setEnabled(false);
        }
        if(t[2].getText().toString() == "X" && t[5].getText().toString() == "X" && t[8].getText().toString() == "X"){
            txt1.setText("Congratulation ! You Win");
            t[0].setEnabled(false);
            t[1].setEnabled(false);
            t[2].setEnabled(false);
            t[3].setEnabled(false);
            t[4].setEnabled(false);
            t[5].setEnabled(false);
            t[6].setEnabled(false);
            t[7].setEnabled(false);
            t[8].setEnabled(false);
        }
        if(t[3].getText().toString() == "X" && t[4].getText().toString() == "X" && t[5].getText().toString() == "X"){
            txt1.setText("Congratulation ! You Win");
            t[0].setEnabled(false);
            t[1].setEnabled(false);
            t[2].setEnabled(false);
            t[3].setEnabled(false);
            t[4].setEnabled(false);
            t[5].setEnabled(false);
            t[6].setEnabled(false);
            t[7].setEnabled(false);
            t[8].setEnabled(false);
        }
        if(t[6].getText().toString() == "X" && t[7].getText().toString() == "X" && t[8].getText().toString() == "X"){
            txt1.setText("Congratulation ! You Win");
            t[0].setEnabled(false);
            t[1].setEnabled(false);
            t[2].setEnabled(false);
            t[3].setEnabled(false);
            t[4].setEnabled(false);
            t[5].setEnabled(false);
            t[6].setEnabled(false);
            t[7].setEnabled(false);
            t[8].setEnabled(false);
        }

        if(t[0].getText().toString() == "O" && t[1].getText().toString() == "O" && t[2].getText().toString() == "O"){
            txt1.setText("Oops !! You lose...");
            t[0].setEnabled(false);
            t[1].setEnabled(false);
            t[2].setEnabled(false);
            t[3].setEnabled(false);
            t[4].setEnabled(false);
            t[5].setEnabled(false);
            t[6].setEnabled(false);
            t[7].setEnabled(false);
            t[8].setEnabled(false);
        }
        if(t[0].getText().toString() == "O" && t[3].getText().toString() == "O" && t[6].getText().toString() == "O"){
            txt1.setText("Oops !! You lose...");
            t[0].setEnabled(false);
            t[1].setEnabled(false);
            t[2].setEnabled(false);
            t[3].setEnabled(false);
            t[4].setEnabled(false);
            t[5].setEnabled(false);
            t[6].setEnabled(false);
            t[7].setEnabled(false);
            t[8].setEnabled(false);
        }
        if(t[0].getText().toString() == "O" && t[4].getText().toString() == "O" && t[8].getText().toString() == "O"){
            txt1.setText("Oops !! You lose...");
            t[0].setEnabled(false);
            t[1].setEnabled(false);
            t[2].setEnabled(false);
            t[3].setEnabled(false);
            t[4].setEnabled(false);
            t[5].setEnabled(false);
            t[6].setEnabled(false);
            t[7].setEnabled(false);
            t[8].setEnabled(false);
        }
        if(t[1].getText().toString() == "O" && t[4].getText().toString() == "O" && t[7].getText().toString() == "O"){
            txt1.setText("Oops !! You lose...");
            t[0].setEnabled(false);
            t[1].setEnabled(false);
            t[2].setEnabled(false);
            t[3].setEnabled(false);
            t[4].setEnabled(false);
            t[5].setEnabled(false);
            t[6].setEnabled(false);
            t[7].setEnabled(false);
            t[8].setEnabled(false);
        }
        if(t[2].getText().toString() == "O" && t[4].getText().toString() == "O" && t[6].getText().toString() == "O"){
            txt1.setText("Oops !! You lose...");
            t[0].setEnabled(false);
            t[1].setEnabled(false);
            t[2].setEnabled(false);
            t[3].setEnabled(false);
            t[4].setEnabled(false);
            t[5].setEnabled(false);
            t[6].setEnabled(false);
            t[7].setEnabled(false);
            t[8].setEnabled(false);
        }
        if(t[2].getText().toString() == "O" && t[5].getText().toString() == "O" && t[8].getText().toString() == "O"){
            txt1.setText("Oops !! You lose...");
            t[0].setEnabled(false);
            t[1].setEnabled(false);
            t[2].setEnabled(false);
            t[3].setEnabled(false);
            t[4].setEnabled(false);
            t[5].setEnabled(false);
            t[6].setEnabled(false);
            t[7].setEnabled(false);
            t[8].setEnabled(false);
        }
        if(t[3].getText().toString() == "O" && t[4].getText().toString() == "O" && t[5].getText().toString() == "O"){
            txt1.setText("Oops !! You lose...");
            t[0].setEnabled(false);
            t[1].setEnabled(false);
            t[2].setEnabled(false);
            t[3].setEnabled(false);
            t[4].setEnabled(false);
            t[5].setEnabled(false);
            t[6].setEnabled(false);
            t[7].setEnabled(false);
            t[8].setEnabled(false);
        }
        if(t[6].getText().toString() == "O" && t[7].getText().toString() == "O" && t[8].getText().toString() == "O"){
            txt1.setText("Oops !! You lose...");
            t[0].setEnabled(false);
            t[1].setEnabled(false);
            t[2].setEnabled(false);
            t[3].setEnabled(false);
            t[4].setEnabled(false);
            t[5].setEnabled(false);
            t[6].setEnabled(false);
            t[7].setEnabled(false);
            t[8].setEnabled(false);
        }
    }
}