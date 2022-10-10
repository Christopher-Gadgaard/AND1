package dk.via.and1.navigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.sendButton);
        EditText editText = findViewById(R.id.sendEditText);
        button.setOnClickListener(view -> {
            Intent intent = new Intent(this, MainActivity2.class);
            String message = editText.getText().toString();
            intent.putExtra("message", message);
            startActivity(intent);
        });
    }
}