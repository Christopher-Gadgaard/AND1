package dk.via.and1.navigation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView textView = findViewById(R.id.MessageTextView);

        Bundle bundle = getIntent().getExtras();
        String message = bundle.getString("message");
        textView.setText(message);
    }
}