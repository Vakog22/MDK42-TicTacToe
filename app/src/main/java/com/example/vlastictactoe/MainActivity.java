package com.example.vlastictactoe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.Console;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public int Turns;
    public boolean Turn;
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
    TextView tv_output;
    Button btn_0_0;
    Button btn_0_1;
    Button btn_0_2;
    Button btn_1_0;
    Button btn_1_1;
    Button btn_1_2;
    Button btn_2_0;
    Button btn_2_1;
    Button btn_2_2;
    public String GetSymbolForButton(){
        if(Turn)
        {
            return "O";
        }
        else
        {
            return "X";
        }
    }

    public void ChangeTurn(){
        Turn=!Turn;
    }

    public void  LockBoard() {
        for(int i=0; i<9; i++)
        {
            Button j = (Button)buttons.get(i);
            j.setEnabled(false);
        }
    }

    public void SetButtonColor(Button btn, String sym)
    {
        switch (sym) {
            case "X":
                btn.setBackground(getDrawable(R.drawable.sp_cross_cell));
                btn.setTextColor(getColor(R.color.black));
                break;
            case "O":
                btn.setBackground(getDrawable(R.drawable.sp_circle_cell));
                btn.setTextColor(getColor(R.color.black));
                break;

        }

    }

    public String CheckWin()
    {
        if ((btn_0_0.getText() == btn_0_1.getText() && btn_0_1.getText() == btn_0_2.getText()) && btn_0_0.getText().length() != 0)
        {
            ChangeTurn();
            btn_0_0.setBackground(getDrawable(R.drawable.sp_winning_cell));
            btn_0_1.setBackground(getDrawable(R.drawable.sp_winning_cell));
            btn_0_2.setBackground(getDrawable(R.drawable.sp_winning_cell));
            LockBoard();
            return "Победа " + GetSymbolForButton();
        }
        if ((btn_1_0.getText() == btn_1_1.getText() && btn_1_1.getText() == btn_1_2.getText()) && btn_1_0.getText().length() != 0)
        {
            ChangeTurn();
            btn_1_0.setBackground(getDrawable(R.drawable.sp_winning_cell));
            btn_1_1.setBackground(getDrawable(R.drawable.sp_winning_cell));
            btn_1_2.setBackground(getDrawable(R.drawable.sp_winning_cell));
            LockBoard();
            return "Победа " + GetSymbolForButton();
        }
        if ((btn_2_0.getText() == btn_2_1.getText() && btn_2_1.getText() == btn_2_2.getText()) && btn_2_0.getText().length() != 0)
        {
            ChangeTurn();
            btn_2_0.setBackground(getDrawable(R.drawable.sp_winning_cell));
            btn_2_1.setBackground(getDrawable(R.drawable.sp_winning_cell));
            btn_2_2.setBackground(getDrawable(R.drawable.sp_winning_cell));
            LockBoard();
            return "Победа " + GetSymbolForButton();
        }


        if ((btn_0_0.getText() == btn_1_0.getText() && btn_1_0.getText() == btn_2_0.getText()) && btn_0_0.getText().length() != 0)
        {
            ChangeTurn();
            btn_0_0.setBackground(getDrawable(R.drawable.sp_winning_cell));
            btn_1_0.setBackground(getDrawable(R.drawable.sp_winning_cell));
            btn_2_0.setBackground(getDrawable(R.drawable.sp_winning_cell));
            LockBoard();
            return "Победа " + GetSymbolForButton();
        }
        if ((btn_0_1.getText() == btn_1_1.getText() && btn_1_1.getText() == btn_2_1.getText()) && btn_0_1.getText().length() != 0)
        {
            ChangeTurn();
            btn_0_1.setBackground(getDrawable(R.drawable.sp_winning_cell));
            btn_1_1.setBackground(getDrawable(R.drawable.sp_winning_cell));
            btn_2_1.setBackground(getDrawable(R.drawable.sp_winning_cell));
            LockBoard();
            return "Победа " + GetSymbolForButton();
        }
        if ((btn_0_2.getText() == btn_1_2.getText() && btn_1_2.getText() == btn_2_2.getText()) && btn_0_2.getText().length() != 0)
        {
            ChangeTurn();
            btn_0_2.setBackground(getDrawable(R.drawable.sp_winning_cell));
            btn_1_2.setBackground(getDrawable(R.drawable.sp_winning_cell));
            btn_2_2.setBackground(getDrawable(R.drawable.sp_winning_cell));
            LockBoard();
            return "Победа " + GetSymbolForButton();
        }

        if ((btn_0_0.getText() == btn_1_1.getText() && btn_1_1.getText() == btn_2_2.getText()) && btn_0_0.getText().length() != 0)
        {
            ChangeTurn();
            btn_0_0.setBackground(getDrawable(R.drawable.sp_winning_cell));
            btn_1_1.setBackground(getDrawable(R.drawable.sp_winning_cell));
            btn_2_2.setBackground(getDrawable(R.drawable.sp_winning_cell));
            LockBoard();
            return "Победа " + GetSymbolForButton();
        }
        if ((btn_0_2.getText() == btn_1_1.getText() && btn_1_1.getText() == btn_2_0.getText()) && btn_0_2.getText().length() != 0)
        {
            ChangeTurn();
            btn_0_2.setBackground(getDrawable(R.drawable.sp_winning_cell));
            btn_1_1.setBackground(getDrawable(R.drawable.sp_winning_cell));
            btn_2_0.setBackground(getDrawable(R.drawable.sp_winning_cell));
            LockBoard();
            return "Победа " + GetSymbolForButton();
        }

        if (Turns == 9)
        {
            return "Ничья";
        }

        return "Ход " + GetSymbolForButton();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_output = (TextView) findViewById(R.id.tv_output);
        Button btn_start = (Button) findViewById(R.id.btn_start);
        btn_0_0 = findViewById(R.id.btn_0_0);
        btn_0_1 = findViewById(R.id.btn_0_1);
        btn_0_2 = findViewById(R.id.btn_0_2);
        btn_1_0 = findViewById(R.id.btn_1_0);
        btn_1_1 = findViewById(R.id.btn_1_1);
        btn_1_2 = findViewById(R.id.btn_1_2);
        btn_2_0 = findViewById(R.id.btn_2_0);
        btn_2_1 = findViewById(R.id.btn_2_1);
        btn_2_2 = findViewById(R.id.btn_2_2);

        View.OnClickListener btn_clk = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button currentPressedButton = (Button) v;
                currentPressedButton.setText(GetSymbolForButton());
                SetButtonColor(currentPressedButton, GetSymbolForButton());
                currentPressedButton.setEnabled(false);
                ChangeTurn();
                Turns++;
                tv_output.setText(CheckWin());
            }
        };

        View.OnClickListener btn_start_clk = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int i=0; i<9; i++)
                {
                    Button j = (Button)buttons.get(i);
                    j.setEnabled(true);
                    j.setText("");
                    j.setBackground(getDrawable(R.drawable.sp_basic_cell));
                }
                Turn = false;
                Turns=0;
                tv_output.setText("Ход " + GetSymbolForButton());
            }
        };

        btn_start.setOnClickListener(btn_start_clk);

        for(int id : BUTTON_IDS) {
            Button button = (Button) findViewById(id);
            button.setOnClickListener(btn_clk);
            button.setEnabled(false);
            buttons.add(button);}
        }
    }
