package com.example.vlastictactoe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public boolean Turn = false;
    public ArrayList buttons = new ArrayList<Button>();
    private static final int[] BUTTON_IDS = {
            R.id.btn_0_0,
            R.id.btn_0_1,
            R.id.btn_0_2,
            R.id.btn_1_0,
            R.id.btn_1_1,
            R.id.btn_1_2,
            R.id.btn_2_0,
            R.id.btn_2_1,
            R.id.btn_2_2,
    };

    public String GetSymbolForButton(){
        if(Turn)
        {
            Turn = false;
            return "O";
        }
        else
        {
            Turn = true;
            return "X";
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv_output = (TextView) findViewById(R.id.tv_output);
        Button btn_start = (Button) findViewById(R.id.btn_start);

        View.OnClickListener btn_clk = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button currentPressedButton = (Button) v;
                currentPressedButton.setText(GetSymbolForButton());
                currentPressedButton.setEnabled(false);
            }
        };


        for(int id : BUTTON_IDS) {
            Button button = (Button) findViewById(id);
            button.setOnClickListener(btn_clk);
            buttons.add(button);}
        }
    }

