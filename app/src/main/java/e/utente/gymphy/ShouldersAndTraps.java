package e.utente.gymphy;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ShouldersAndTraps extends AppCompatActivity {

    private EditText shoulders_and_traps_editText_1;
    private EditText shoulders_and_traps_editText_2;
    private EditText shoulders_and_traps_editText_3;
    private EditText shoulders_and_traps_editText_4;

    private String shoulders_and_traps_memo_1;
    private String shoulders_and_traps_memo_2;
    private String shoulders_and_traps_memo_3;
    private String shoulders_and_traps_memo_4;

    private Button shoulders_and_traps_save_button_1;
    private Button shoulders_and_traps_save_button_2;
    private Button shoulders_and_traps_save_button_3;
    private Button shoulders_and_traps_save_button_4;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shoulders_and_traps_layout);

        //Arnold Press
        shoulders_and_traps_editText_1 = (EditText) findViewById(R.id.shoulders_and_traps_editText_1);
        shoulders_and_traps_save_button_1 = (Button) findViewById(R.id.shoulders_and_traps_save_button_1);

        SharedPreferences preferences_1 =getSharedPreferences("PREFS", 0);
        shoulders_and_traps_memo_1 = preferences_1.getString("memo_1_4", "");
        shoulders_and_traps_editText_1.setText(shoulders_and_traps_memo_1);

        shoulders_and_traps_save_button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shoulders_and_traps_memo_1 = shoulders_and_traps_editText_1.getText().toString();
                SharedPreferences preferences =getSharedPreferences("PREFS", 0);
                SharedPreferences.Editor editor =preferences.edit();
                editor.putString("memo_1_4", shoulders_and_traps_memo_1);
                editor.commit();
                Toast.makeText(ShouldersAndTraps.this, "Memo saved", Toast.LENGTH_SHORT).show();
            }
        });

        //Dumbbell Front Raise
        shoulders_and_traps_editText_2 = (EditText) findViewById(R.id.shoulders_and_traps_editText_2);
        shoulders_and_traps_save_button_2 = (Button) findViewById(R.id.shoulders_and_traps_save_button_2);

        SharedPreferences preferences_2 =getSharedPreferences("PREFS", 0);
        shoulders_and_traps_memo_2 = preferences_2.getString("memo_2_4", "");
        shoulders_and_traps_editText_2.setText(shoulders_and_traps_memo_2);

        shoulders_and_traps_save_button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shoulders_and_traps_memo_2 =shoulders_and_traps_editText_2.getText().toString();
                SharedPreferences preferences =getSharedPreferences("PREFS", 0);
                SharedPreferences.Editor editor =preferences.edit();
                editor.putString("memo_2_4",shoulders_and_traps_memo_2);
                editor.commit();
                Toast.makeText(ShouldersAndTraps.this, "Memo saved", Toast.LENGTH_SHORT).show();
            }
        });

        //Bent Over Dumbbell Raise
        shoulders_and_traps_editText_3 = (EditText) findViewById(R.id.shoulders_and_traps_editText_3);
        shoulders_and_traps_save_button_3 = (Button) findViewById(R.id.shoulders_and_traps_save_button_3);

        SharedPreferences preferences_3 =getSharedPreferences("PREFS", 0);
        shoulders_and_traps_memo_3 = preferences_3.getString("memo_3_4", "");
        shoulders_and_traps_editText_3.setText(shoulders_and_traps_memo_3);

        shoulders_and_traps_save_button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shoulders_and_traps_memo_3 = shoulders_and_traps_editText_3.getText().toString();
                SharedPreferences preferences =getSharedPreferences("PREFS", 0);
                SharedPreferences.Editor editor =preferences.edit();
                editor.putString("memo_3_4",shoulders_and_traps_memo_3);
                editor.commit();
                Toast.makeText(ShouldersAndTraps.this, "Memo saved", Toast.LENGTH_SHORT).show();
            }
        });

        //Dumbbell Shrug
        shoulders_and_traps_editText_4 = (EditText) findViewById(R.id.shoulders_and_traps_editText_4);
        shoulders_and_traps_save_button_4 = (Button) findViewById(R.id.shoulders_and_traps_save_button_4);

        SharedPreferences preferences_4 =getSharedPreferences("PREFS", 0);
        shoulders_and_traps_memo_4 = preferences_4.getString("memo_4_4", "");
        shoulders_and_traps_editText_4.setText(shoulders_and_traps_memo_4);

        shoulders_and_traps_save_button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shoulders_and_traps_memo_4 = shoulders_and_traps_editText_4.getText().toString();
                SharedPreferences preferences =getSharedPreferences("PREFS", 0);
                SharedPreferences.Editor editor =preferences.edit();
                editor.putString("memo_4_4", shoulders_and_traps_memo_4);
                editor.commit();
                Toast.makeText(ShouldersAndTraps.this, "Memo saved", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
