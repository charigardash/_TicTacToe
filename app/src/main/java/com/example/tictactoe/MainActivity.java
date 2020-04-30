package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button[] b=new Button[9];
    Button player1,player2,reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b[0]=findViewById(R.id.b1);
        b[1]=findViewById(R.id.b2);
        b[2]=findViewById(R.id.b3);
        b[3]=findViewById(R.id.b4);
        b[4]=findViewById(R.id.b5);
        b[5]=findViewById(R.id.b6);
        b[6]=findViewById(R.id.b7);
        b[7]=findViewById(R.id.b8);
        b[8]=findViewById(R.id.b9);
        player1=findViewById(R.id.button10);
        player2=findViewById(R.id.button11);
        reset=findViewById(R.id.reset);
    }
    int i=1;

    String x="X",o="O";
    public void onPress(View v) {
        if (v == b[0]) {
            if(!b[0].getText().equals(x)&&!b[0].getText().equals(o)) {
                if (i % 2 == 0) {
                    b[0].setText(o);
                } else if (i % 2 == 1) {
                    b[0].setText(x);
                }
                i++;
            }
        }
        if (v == b[1]) {
            if(!b[1].getText().equals(x)&&!b[1].getText().equals(o)) {
                if (i % 2 == 0) {
                    b[1].setText(o);
                } else if (i % 2 == 1) {
                    b[1].setText(x);
                }
                i++;
            }
        }
        if (v == b[2]) {
            if(!b[2].getText().equals(x)&&!b[2].getText().equals(o)) {
                if (i % 2 == 0) {
                    b[2].setText(o);
                } else if (i % 2 == 1) {
                    b[2].setText(x);
                }
                i++;
            }
        }
        if (v == b[3]) {
            if(!b[3].getText().equals(x)&&!b[3].getText().equals(o)) {
                if (i % 2 == 0) {
                    b[3].setText(o);
                } else if (i % 2 == 1) {
                    b[3].setText(x);
                }
                i++;
            }
        }
        if (v == b[4]) {
            if(!b[4].getText().equals(x)&&!b[4].getText().equals(o)) {
                if (i % 2 == 0) {
                    b[4].setText(o);
                } else if (i % 2 == 1) {
                    b[4].setText(x);
                }
                i++;
            }
        }
        if (v == b[5]) {
            if(!b[5].getText().equals(x)&&!b[5].getText().equals(o)) {
                if (i % 2 == 0) {
                    b[5].setText(o);
                } else if (i % 2 == 1) {
                    b[5].setText(x);
                }
                i++;
            }
        }
        if (v == b[6]) {
            if(!b[6].getText().equals(x)&&!b[6].getText().equals(o)) {
                if (i % 2 == 0) {
                    b[6].setText(o);
                } else if (i % 2 == 1) {
                    b[6].setText(x);
                }
                i++;
            }
        }
        if (v == b[7]) {
            if(!b[7].getText().equals(x)&&!b[7].getText().equals(o)) {
                if (i % 2 == 0) {
                    b[7].setText(o);
                } else if (i % 2 == 1) {
                    b[7].setText(x);
                }
                i++;
            }
        }
        if (v == b[8]) {
            if(!b[8].getText().equals(x)&&!b[8].getText().equals(o)) {
                if (i % 2 == 0) {
                    b[8].setText(o);
                } else if (i % 2 == 1) {
                    b[8].setText(x);
                }
                i++;
            }
        }

        if(v==reset){
            String s="PLAYER1",k="PLAYER2";
            b[0].setText("");
            b[1].setText("");
            b[2].setText("");
            b[3].setText("");
            b[4].setText("");
            b[5].setText("");
            b[6].setText("");
            b[7].setText("");
            b[8].setText("");
            player2.setText(k);
            player1.setText(s);
            i=1;
        }
        String p,r1="WON",r2="LOSS";
        for (int k = 0; k < 2; k++) {

            if(k==0){
                p=x;
            }
            else{
                p=o;
            }
            int t=0;
            for(int j=0;j<3;j++){
              if(b[j+t].getText().toString().equals(p)&&b[j+t+1].getText().toString().equals(p)&&b[j+2+t].getText().toString().equals(p))
              {
                  if(p.equals(x)) {
                      player1.setVisibility(View.VISIBLE);
                      player2.setVisibility(View.VISIBLE);
                      player1.setText(r1);
                      player2.setText(r2);

                      break;
                  }
                  else if(p.equals(o)) {
                      player1.setVisibility(View.VISIBLE);
                      player2.setVisibility(View.VISIBLE);
                      player1.setText(r2);
                      player2.setText(r1);

                      break;
                  }

              }
              t+=2;
            }
            for(int j=0;j<3;j++){
                if(b[j].getText().toString().equals(p)&&b[j+3].getText().toString().equals(p)&&b[j+6].getText().toString().equals(p)){
                    if(p.equals(x)) {
                        player1.setVisibility(View.VISIBLE);
                        player2.setVisibility(View.VISIBLE);
                        player1.setText(r1);
                        player2.setText(r2);

                        break;
                    }
                    if(p.equals(o)) {
                        player1.setVisibility(View.VISIBLE);
                        player2.setVisibility(View.VISIBLE);
                        player1.setText(r2);
                        player2.setText(r1);

                        break;
                    }
                }
            }
            if(b[0].getText().toString().equals(p)&&b[4].getText().toString().equals(p)&&b[8].getText().toString().equals(p)){
                if(p.equals(x)) {
                    player1.setVisibility(View.VISIBLE);
                    player2.setVisibility(View.VISIBLE);
                    player1.setText(r1);
                    player2.setText(r2);

                    break;
                }
                if(p.equals(o)) {
                    player1.setVisibility(View.VISIBLE);
                    player2.setVisibility(View.VISIBLE);
                    player1.setText(r2);
                    player2.setText(r1);

                    break;
                }
            }

            if(b[2].getText().toString().equals(p)&&b[4].getText().toString().equals(p)&&b[6].getText().toString().equals(p)){
                if(p.equals(x)) {
                    player1.setVisibility(View.VISIBLE);
                    player2.setVisibility(View.VISIBLE);
                    player1.setText(r1);
                    player2.setText(r2);

                    break;
                }
                if(p.equals(o)) {
                    player1.setVisibility(View.VISIBLE);
                    player2.setVisibility(View.VISIBLE);
                    player1.setText(r2);
                    player2.setText(r1);

                    break;
                }
            }
        }
    }
}
