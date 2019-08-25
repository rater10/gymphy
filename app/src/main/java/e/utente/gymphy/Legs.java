package e.utente.gymphy;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Legs extends AppCompatActivity {

    private EditText legs_editText_1;
    private EditText legs_editText_2;
    private EditText legs_editText_3;
    private EditText legs_editText_4;
    private EditText legs_editText_5;
    private EditText legs_editText_6;

    private String legs_memo_1;
    private String legs_memo_2;
    private String legs_memo_3;
    private String legs_memo_4;
    private String legs_memo_5;
    private String legs_memo_6;

    private Button legs_save_button_1;
    private Button legs_save_button_2;
    private Button legs_save_button_3;
    private Button legs_save_button_4;
    private Button legs_save_button_5;
    private Button legs_save_button_6;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.legs_layout);

        //Leg Curl
        legs_editText_1 = (EditText) findViewById(R.id.legs_editText_1);
        legs_save_button_1 = (Button) findViewById(R.id.legs_save_button_1);

        SharedPreferences preferences_1 =getSharedPreferences("PREFS", 0);
        legs_memo_1 = preferences_1.getString("memo_1_3", "");
        legs_editText_1.setText(legs_memo_1);

        legs_save_button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                legs_memo_1 = legs_editText_1.getText().toString();
                SharedPreferences preferences =getSharedPreferences("PREFS", 0);
                SharedPreferences.Editor editor =preferences.edit();
                editor.putString("memo_1_3", legs_memo_1);
                editor.commit();
                Toast.makeText(Legs.this, "Memo saved", Toast.LENGTH_SHORT).show();
            }
        });

        //Leg Extension
        legs_editText_2 = (EditText) findViewById(R.id.legs_editText_2);
        legs_save_button_2 = (Button) findViewById(R.id.legs_save_button_2);

        SharedPreferences preferences_2 =getSharedPreferences("PREFS", 0);
        legs_memo_2 = preferences_2.getString("memo_2_3", "");
        legs_editText_2.setText(legs_memo_2);

        legs_save_button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                legs_memo_2 = legs_editText_2.getText().toString();
                SharedPreferences preferences =getSharedPreferences("PREFS", 0);
                SharedPreferences.Editor editor =preferences.edit();
                editor.putString("memo_2_3", legs_memo_2);
                editor.commit();
                Toast.makeText(Legs.this, "Memo saved", Toast.LENGTH_SHORT).show();
            }
        });

        //Leg Press
        legs_editText_3 = (EditText) findViewById(R.id.legs_editText_3);
        legs_save_button_3 = (Button) findViewById(R.id.legs_save_button_3);

        SharedPreferences preferences_3 =getSharedPreferences("PREFS", 0);
        legs_memo_3 = preferences_3.getString("memo_3_3", "");
        legs_editText_3.setText(legs_memo_3);

        legs_save_button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                legs_memo_3 = legs_editText_3.getText().toString();
                SharedPreferences preferences =getSharedPreferences("PREFS", 0);
                SharedPreferences.Editor editor =preferences.edit();
                editor.putString("memo_3_3", legs_memo_3);
                editor.commit();
                Toast.makeText(Legs.this, "Memo saved", Toast.LENGTH_SHORT).show();
            }
        });

        //Abductor Machine
        legs_editText_4 = (EditText) findViewById(R.id.legs_editText_4);
        legs_save_button_4 = (Button) findViewById(R.id.legs_save_button_4);

        SharedPreferences preferences_4 =getSharedPreferences("PREFS", 0);
        legs_memo_4 = preferences_4.getString("memo_4_3", "");
        legs_editText_4.setText(legs_memo_4);

        legs_save_button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                legs_memo_4 = legs_editText_4.getText().toString();
                SharedPreferences preferences =getSharedPreferences("PREFS", 0);
                SharedPreferences.Editor editor =preferences.edit();
                editor.putString("memo_4_3", legs_memo_4);
                editor.commit();
                Toast.makeText(Legs.this, "Memo saved", Toast.LENGTH_SHORT).show();
            }
        });

        //Adductor Machine
        legs_editText_5 = (EditText) findViewById(R.id.legs_editText_5);
        legs_save_button_5 = (Button) findViewById(R.id.legs_save_button_5);

        SharedPreferences preferences_5 =getSharedPreferences("PREFS", 0);
        legs_memo_5 = preferences_5.getString("memo_5_3", "");
        legs_editText_5.setText(legs_memo_5);

        legs_save_button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                legs_memo_5 = legs_editText_5.getText().toString();
                SharedPreferences preferences =getSharedPreferences("PREFS", 0);
                SharedPreferences.Editor editor =preferences.edit();
                editor.putString("memo_5_3", legs_memo_5);
                editor.commit();
                Toast.makeText(Legs.this, "Memo saved", Toast.LENGTH_SHORT).show();
            }
        });

        //Standing Calf Raises
        legs_editText_6 = (EditText) findViewById(R.id.legs_editText_6);
        legs_save_button_6 = (Button) findViewById(R.id.legs_save_button_6);

        SharedPreferences preferences_6 =getSharedPreferences("PREFS", 0);
        legs_memo_6 = preferences_6.getString("memo_6_3", "");
        legs_editText_6.setText(legs_memo_6);

        legs_save_button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                legs_memo_6 = legs_editText_6.getText().toString();
                SharedPreferences preferences =getSharedPreferences("PREFS", 0);
                SharedPreferences.Editor editor =preferences.edit();
                editor.putString("memo_6_3", legs_memo_6);
                editor.commit();
                Toast.makeText(Legs.this, "Memo saved", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
