package th.ac.su.cp.horoscope;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button creat  = findViewById(R.id.button_create);
        Button lo  = findViewById(R.id.button_login);
        creat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  = new Intent(MainActivity.this,MainActivity2.class);
                Intent intent1  = new Intent(MainActivity.this,MainActivity3.class);
                startActivity(intent);
            }
        });


    }
}