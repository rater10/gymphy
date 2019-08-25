package e.utente.gymphy;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button back_and_biceps_button = (Button) findViewById(R.id.back_and_biceps_button);
        back_and_biceps_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_1 = new Intent(getApplicationContext(), BackAndBiceps.class);
                startActivity(intent_1);
            }
        });

        Button chest_and_triceps_button = (Button) findViewById(R.id.chest_and_triceps_button);
        chest_and_triceps_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_2 = new Intent(getApplicationContext(), ChestAndTriceps.class);
                startActivity(intent_2);
            }
        });

        Button legs_button = (Button) findViewById(R.id.legs_button);
        legs_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_3 = new Intent(getApplicationContext(), Legs.class);
                startActivity(intent_3);
            }
        });

        Button shoulders_and_traps_button = (Button) findViewById(R.id.shoulders_and_traps_button);
        shoulders_and_traps_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_4 = new Intent(getApplicationContext(), ShouldersAndTraps.class);
                startActivity(intent_4);
            }
        });

        Button cronometer_button = (Button) findViewById(R.id.cronometer_button);
        cronometer_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_5 = new Intent(getApplicationContext(), Cronometer.class);
                startActivity(intent_5);
            }
        });

        Button music_player_button = (Button) findViewById(R.id.music_player_button);
        music_player_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_6 = new Intent(getApplicationContext(), Player.class);
                startActivity(intent_6);
            }
        });

        /*Button maps_button = (Button) findViewById(R.id.maps_button);
        maps_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent maps_intent = new Intent(Intent.ACTION_VIEW);

                String searchLocation = "Gym One 3";
                String myUrl = "http://maps.google.com/maps?q="+searchLocation;
                maps_intent.setData(Uri.parse(myUrl));
                startActivity(maps_intent);
            }
        }); */

        Button maps_button = (Button) findViewById(R.id.maps_button);
        maps_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("google.navigation:q=Gym One 3+Aleea Studentilor,+Timisoara+Romania");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });

    }
}
