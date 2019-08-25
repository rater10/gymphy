package e.utente.gymphy;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ChestAndTriceps extends AppCompatActivity {

    private EditText chest_and_triceps_editText_1;
    private EditText chest_and_triceps_editText_2;
    private EditText chest_and_triceps_editText_3;
    private EditText chest_and_triceps_editText_4;
    private EditText chest_and_triceps_editText_5;
    private EditText chest_and_triceps_editText_6;

    private String chest_and_triceps_memo_1;
    private String chest_and_triceps_memo_2;
    private String chest_and_triceps_memo_3;
    private String chest_and_triceps_memo_4;
    private String chest_and_triceps_memo_5;
    private String chest_and_triceps_memo_6;

    private Button chest_and_triceps_save_button_1;
    private Button chest_and_triceps_save_button_2;
    private Button chest_and_triceps_save_button_3;
    private Button chest_and_triceps_save_button_4;
    private Button chest_and_triceps_save_button_5;
    private Button chest_and_triceps_save_button_6;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chest_and_triceps_layout);

        //Bench Press
        chest_and_triceps_editText_1 = (EditText) findViewById(R.id.chest_and_triceps_editText_1);
        chest_and_triceps_save_button_1 = (Button) findViewById(R.id.chest_and_triceps_save_button_1);

        SharedPreferences preferences_1 =getSharedPreferences("PREFS", 0);
        chest_and_triceps_memo_1 = preferences_1.getString("memo_1_2", "");
        chest_and_triceps_editText_1.setText(chest_and_triceps_memo_1);

        chest_and_triceps_save_button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chest_and_triceps_memo_1 = chest_and_triceps_editText_1.getText().toString();
                SharedPreferences preferences =getSharedPreferences("PREFS", 0);
                SharedPreferences.Editor editor =preferences.edit();
                editor.putString("memo_1_2", chest_and_triceps_memo_1);
                editor.commit();
                Toast.makeText(ChestAndTriceps.this, "Memo saved", Toast.LENGTH_SHORT).show();
            }
        });

        //Machine Fly
        chest_and_triceps_editText_2 = (EditText) findViewById(R.id.chest_and_triceps_editText_2);
        chest_and_triceps_save_button_2 = (Button) findViewById(R.id.chest_and_triceps_save_button_2);

        SharedPreferences preferences_2 =getSharedPreferences("PREFS", 0);
        chest_and_triceps_memo_2 = preferences_2.getString("memo_2_2", "");
        chest_and_triceps_editText_2.setText(chest_and_triceps_memo_2);

        chest_and_triceps_save_button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chest_and_triceps_memo_2 = chest_and_triceps_editText_2.getText().toString();
                SharedPreferences preferences =getSharedPreferences("PREFS", 0);
                SharedPreferences.Editor editor =preferences.edit();
                editor.putString("memo_2_2", chest_and_triceps_memo_2);
                editor.commit();
                Toast.makeText(ChestAndTriceps.this, "Memo saved", Toast.LENGTH_SHORT).show();
            }
        });

        //Machine Chest Press
        chest_and_triceps_editText_3 = (EditText) findViewById(R.id.chest_and_triceps_editText_3);
        chest_and_triceps_save_button_3 = (Button) findViewById(R.id.chest_and_triceps_save_button_3);

        SharedPreferences preferences_3 =getSharedPreferences("PREFS", 0);
        chest_and_triceps_memo_3 = preferences_3.getString("memo_3_2", "");
        chest_and_triceps_editText_3.setText(chest_and_triceps_memo_3);

        chest_and_triceps_save_button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chest_and_triceps_memo_3 = chest_and_triceps_editText_3.getText().toString();
                SharedPreferences preferences =getSharedPreferences("PREFS", 0);
                SharedPreferences.Editor editor =preferences.edit();
                editor.putString("memo_3_2", chest_and_triceps_memo_3);
                editor.commit();
                Toast.makeText(ChestAndTriceps.this, "Memo saved", Toast.LENGTH_SHORT).show();
            }
        });

        //Double Rope Triceps
        chest_and_triceps_editText_4 = (EditText) findViewById(R.id.chest_and_triceps_editText_4);
        chest_and_triceps_save_button_4 = (Button) findViewById(R.id.chest_and_triceps_save_button_4);

        SharedPreferences preferences_4 =getSharedPreferences("PREFS", 0);
        chest_and_triceps_memo_4 = preferences_4.getString("memo_4_2", "");
        chest_and_triceps_editText_4.setText(chest_and_triceps_memo_4);

        chest_and_triceps_save_button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chest_and_triceps_memo_4 = chest_and_triceps_editText_4.getText().toString();
                SharedPreferences preferences =getSharedPreferences("PREFS", 0);
                SharedPreferences.Editor editor =preferences.edit();
                editor.putString("memo_4_2", chest_and_triceps_memo_4);
                editor.commit();
                Toast.makeText(ChestAndTriceps.this, "Memo saved", Toast.LENGTH_SHORT).show();
            }
        });

        //One-Arm Cable Triceps
        chest_and_triceps_editText_5 = (EditText) findViewById(R.id.chest_and_triceps_editText_5);
        chest_and_triceps_save_button_5 = (Button) findViewById(R.id.chest_and_triceps_save_button_5);

        SharedPreferences preferences_5 =getSharedPreferences("PREFS", 0);
        chest_and_triceps_memo_5 = preferences_5.getString("memo_5_2", "");
        chest_and_triceps_editText_5.setText(chest_and_triceps_memo_5);

        chest_and_triceps_save_button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chest_and_triceps_memo_5 = chest_and_triceps_editText_5.getText().toString();
                SharedPreferences preferences =getSharedPreferences("PREFS", 0);
                SharedPreferences.Editor editor =preferences.edit();
                editor.putString("memo_5_2", chest_and_triceps_memo_5);
                editor.commit();
                Toast.makeText(ChestAndTriceps.this, "Memo saved", Toast.LENGTH_SHORT).show();
            }
        });

        //Close-Grip Bench Press
        chest_and_triceps_editText_6 = (EditText) findViewById(R.id.chest_and_triceps_editText_6);
        chest_and_triceps_save_button_6 = (Button) findViewById(R.id.chest_and_triceps_save_button_6);

        SharedPreferences preferences_6 =getSharedPreferences("PREFS", 0);
        chest_and_triceps_memo_6 = preferences_6.getString("memo_6_2", "");
        chest_and_triceps_editText_6.setText(chest_and_triceps_memo_6);

        chest_and_triceps_save_button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chest_and_triceps_memo_6 = chest_and_triceps_editText_6.getText().toString();
                SharedPreferences preferences =getSharedPreferences("PREFS", 0);
                SharedPreferences.Editor editor =preferences.edit();
                editor.putString("memo_6_2", chest_and_triceps_memo_6);
                editor.commit();
                Toast.makeText(ChestAndTriceps.this, "Memo saved", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
