package dk.via.and1.interaction;

import static dk.via.and1.interaction.R.drawable.*;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        SwitchCompat aSwitch = findViewById(R.id.switch1);
        ImageView imageView = findViewById(R.id.imageView);

        aSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (aSwitch.isChecked()) {
                    imageView.setImageResource(sad);
                } else {
                    imageView.setImageResource(happy);
                }
            }
        });
    }

    public void onClickLoginButton2(View view) {
        EditText email = findViewById(R.id.editTextTextEmailAddress);
        EditText password = findViewById(R.id.editTextTextPassword);

        Context context = getApplicationContext();

        if (email.getText().toString().equalsIgnoreCase("user@email.com") && password.getText().toString().equals("ILOVEAND")) {
            Toast.makeText(context, "You Logged in", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(context, "Try Again", Toast.LENGTH_LONG).show();
        }
    }


    public void OnTextButtonClick(View view) {
        TextView textView = findViewById(R.id.textView4);

        textView.setText(getResources().getString(R.string.app_name));
    }
}