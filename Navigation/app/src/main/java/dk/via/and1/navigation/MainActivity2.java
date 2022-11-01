package dk.via.and1.navigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView textView = findViewById(R.id.MessageTextView);
        Button sendButton = findViewById(R.id.replyButton);
        EditText editText = findViewById(R.id.ReplyEditText);

        Bundle bundle = getIntent().getExtras();
        String message = bundle.getString("message");
        textView.setText(message);

        sendButton.setOnClickListener(view -> {
            Intent intent = new Intent(this, MainActivity.class);
            String reply = editText.getText().toString();
            intent.putExtra("reply", reply);
            setResult(RESULT_OK,intent);
            finish();
        });


    }
}