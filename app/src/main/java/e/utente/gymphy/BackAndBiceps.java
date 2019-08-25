package e.utente.gymphy;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class BackAndBiceps extends AppCompatActivity {

    private EditText back_and_biceps_editText_1;
    private EditText back_and_biceps_editText_2;
    private EditText back_and_biceps_editText_3;
    private EditText back_and_biceps_editText_4;
    private EditText back_and_biceps_editText_5;
    private EditText back_and_biceps_editText_6;

    private String back_and_biceps_memo_1;
    private String back_and_biceps_memo_2;
    private String back_and_biceps_memo_3;
    private String back_and_biceps_memo_4;
    private String back_and_biceps_memo_5;
    private String back_and_biceps_memo_6;

    private Button back_and_biceps_save_button_1;
    private Button back_and_biceps_save_button_2;
    private Button back_and_biceps_save_button_3;
    private Button back_and_biceps_save_button_4;
    private Button back_and_biceps_save_button_5;
    private Button back_and_biceps_save_button_6;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.back_and_biceps_layout);

        //Lat Pulldowns
        back_and_biceps_editText_1 = (EditText) findViewById(R.id.back_and_biceps_editText_1);
        back_and_biceps_save_button_1 = (Button) findViewById(R.id.back_and_biceps_save_button_1);

        SharedPreferences preferences_1 =getSharedPreferences("PREFS", 0);
        back_and_biceps_memo_1 = preferences_1.getString("memo_1", "");
        back_and_biceps_editText_1.setText(back_and_biceps_memo_1);

        back_and_biceps_save_button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                back_and_biceps_memo_1 = back_and_biceps_editText_1.getText().toString();
                SharedPreferences preferences =getSharedPreferences("PREFS", 0);
                SharedPreferences.Editor editor =preferences.edit();
                editor.putString("memo_1", back_and_biceps_memo_1);
                editor.commit();
                Toast.makeText(BackAndBiceps.this, "Memo saved", Toast.LENGTH_SHORT).show();
            }
        });

        //Wide-Grip Seated Cable Row
        back_and_biceps_editText_2 = (EditText) findViewById(R.id.back_and_biceps_editText_2);
        back_and_biceps_save_button_2 = (Button) findViewById(R.id.back_and_biceps_save_button_2);

        SharedPreferences preferences_2 =getSharedPreferences("PREFS", 0);
        back_and_biceps_memo_2 = preferences_2.getString("memo_2", "");
        back_and_biceps_editText_2.setText(back_and_biceps_memo_2);

        back_and_biceps_save_button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                back_and_biceps_memo_2 = back_and_biceps_editText_2.getText().toString();
                SharedPreferences preferences =getSharedPreferences("PREFS", 0);
                SharedPreferences.Editor editor =preferences.edit();
                editor.putString("memo_2", back_and_biceps_memo_2);
                editor.commit();
                Toast.makeText(BackAndBiceps.this, "Memo saved", Toast.LENGTH_SHORT).show();
            }
        });

        //Dumbbell Row
        back_and_biceps_editText_3 = (EditText) findViewById(R.id.back_and_biceps_editText_3);
        back_and_biceps_save_button_3 = (Button) findViewById(R.id.back_and_biceps_save_button_3);

        SharedPreferences preferences_3 =getSharedPreferences("PREFS", 0);
        back_and_biceps_memo_3 = preferences_3.getString("memo_3", "");
        back_and_biceps_editText_3.setText(back_and_biceps_memo_3);

        back_and_biceps_save_button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                back_and_biceps_memo_3 = back_and_biceps_editText_3.getText().toString();
                SharedPreferences preferences =getSharedPreferences("PREFS", 0);
                SharedPreferences.Editor editor =preferences.edit();
                editor.putString("memo_3", back_and_biceps_memo_3);
                editor.commit();
                Toast.makeText(BackAndBiceps.this, "Memo saved", Toast.LENGTH_SHORT).show();
            }
        });

        //Preacher Curls
        back_and_biceps_editText_4 = (EditText) findViewById(R.id.back_and_biceps_editText_4);
        back_and_biceps_save_button_4 = (Button) findViewById(R.id.back_and_biceps_save_button_4);

        SharedPreferences preferences_4 =getSharedPreferences("PREFS", 0);
        back_and_biceps_memo_4 = preferences_4.getString("memo_4", "");
        back_and_biceps_editText_4.setText(back_and_biceps_memo_4);

        back_and_biceps_save_button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                back_and_biceps_memo_4 = back_and_biceps_editText_4.getText().toString();
                SharedPreferences preferences =getSharedPreferences("PREFS", 0);
                SharedPreferences.Editor editor =preferences.edit();
                editor.putString("memo_4", back_and_biceps_memo_4);
                editor.commit();
                Toast.makeText(BackAndBiceps.this, "Memo saved", Toast.LENGTH_SHORT).show();
            }
        });

        //Dumbbell Curls
        back_and_biceps_editText_5 = (EditText) findViewById(R.id.back_and_biceps_editText_5);
        back_and_biceps_save_button_5 = (Button) findViewById(R.id.back_and_biceps_save_button_5);

        SharedPreferences preferences_5 =getSharedPreferences("PREFS", 0);
        back_and_biceps_memo_5 = preferences_5.getString("memo_5", "");
        back_and_biceps_editText_5.setText(back_and_biceps_memo_5);

        back_and_biceps_save_button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                back_and_biceps_memo_5 = back_and_biceps_editText_5.getText().toString();
                SharedPreferences preferences =getSharedPreferences("PREFS", 0);
                SharedPreferences.Editor editor =preferences.edit();
                editor.putString("memo_5", back_and_biceps_memo_5);
                editor.commit();
                Toast.makeText(BackAndBiceps.this, "Memo saved", Toast.LENGTH_SHORT).show();
            }
        });

        //Standing Cable Row
        back_and_biceps_editText_6 = (EditText) findViewById(R.id.back_and_biceps_editText_6);
        back_and_biceps_save_button_6 = (Button) findViewById(R.id.back_and_biceps_save_button_6);

        SharedPreferences preferences_6 =getSharedPreferences("PREFS", 0);
        back_and_biceps_memo_6 = preferences_6.getString("memo_6", "");
        back_and_biceps_editText_6.setText(back_and_biceps_memo_6);

        back_and_biceps_save_button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                back_and_biceps_memo_6 = back_and_biceps_editText_6.getText().toString();
                SharedPreferences preferences =getSharedPreferences("PREFS", 0);
                SharedPreferences.Editor editor =preferences.edit();
                editor.putString("memo_6", back_and_biceps_memo_6);
                editor.commit();
                Toast.makeText(BackAndBiceps.this, "Memo saved", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
