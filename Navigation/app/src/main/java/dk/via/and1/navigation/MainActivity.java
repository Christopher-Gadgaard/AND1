package dk.via.and1.navigation;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.sendButton);
        EditText editText = findViewById(R.id.sendEditText);
        Button emailButton = findViewById(R.id.emailButton);
        Button webButton = findViewById(R.id.webButton);

        ActivityResultLauncher<Intent> activityResultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(),result -> {
            TextView textView = findViewById(R.id.replyTextView);
            if (result.getData() != null) {
                Bundle bundle = result.getData().getExtras();
                textView.setText(bundle.getString("reply"));
            }
        });

        button.setOnClickListener(view -> {
            Intent intent = new Intent(this, MainActivity2.class);
            String message = editText.getText().toString();
            intent.putExtra("message", message);
            activityResultLauncher.launch(intent);
        });

        emailButton.setOnClickListener(view -> {
            Intent intent = new Intent(this, MainActivity3.class);
            startActivity(intent);
        });

        webButton.setOnClickListener(view -> {
            Intent intent = new Intent(this,MainActivity4.class);

            activityResultLauncher.launch(intent);
        });
    }
}