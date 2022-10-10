package dk.via.and1.interaction;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        TextView textView = findViewById(R.id.textView);
        EditText editText = findViewById(R.id.editText);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(editText.getText());
                Context context = getApplicationContext();
                Toast.makeText(context,editText.getText(), Toast.LENGTH_LONG).show();
            }
        });
    }


    public void progressButtons(View view) {
        ProgressBar progressBar = findViewById(R.id.progressBar);
        if(view.getId() == R.id.plusButton)
        {
            progressBar.setProgress(progressBar.getProgress() + 5,true);
        }
        else if (view.getId() == R.id.minusButton)
        {
            progressBar.setProgress(progressBar.getProgress() - 5, true);
        }
    }

    public void onClickLoginButton(View view) {
        EditText email = findViewById(R.id.editTextTextEmailAddress2);
        EditText password = findViewById(R.id.editTextTextPassword2);

        Context context = getApplicationContext();

        if (email.getText().toString().equalsIgnoreCase("user@email.com") && password.getText().toString().equals("ILOVEAND"))
        {
            Toast.makeText(context, "You Logged in", Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(context, "Try Again", Toast.LENGTH_LONG).show();
        }

        Intent intent  = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
}