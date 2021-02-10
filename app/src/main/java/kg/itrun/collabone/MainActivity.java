package kg.itrun.collabone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "message";

    Button tasksButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tasksButton = findViewById(R.id.expenses1);
        tasksButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this,TasksActivity2.class);
                myIntent.putExtra(EXTRA_MESSAGE, "Hello test");
                startActivity(myIntent);
            }
        });

        // another comment
        //sdasdadd
    }
}