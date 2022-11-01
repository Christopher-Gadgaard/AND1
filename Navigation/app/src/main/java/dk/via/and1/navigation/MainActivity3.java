package dk.via.and1.navigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button sendEmailButton = findViewById(R.id.sendEmailButton);
        sendEmailButton.setOnClickListener(view -> {
            sendEmail();
        });
    }

    public void sendEmail()
    {
        TextView emailTo = findViewById(R.id.editTextEmail);
        TextView emailSubject = findViewById(R.id.editTextSubject);
        TextView emailMessage = findViewById(R.id.editTextTextMultiLine);

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_EMAIL, emailTo.getText().toString());
        intent.putExtra(Intent.EXTRA_SUBJECT, emailSubject.getText().toString());
        intent.putExtra(Intent.EXTRA_TEXT,emailMessage.getText().toString());
        startActivity(intent);
    }
}