package kg.itrun.collabone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "message";

    Button myButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        myButton = findViewById(R.id.expenses1);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent butImtent = new Intent(MainActivity.this,TasksActivity2.class);
                butImtent.putExtra(EXTRA_MESSAGE, "Hello test");
                startActivity(butImtent);
            }
        });
        //sdasdadd
    }
}