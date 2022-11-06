package dk.via.and1.persistence;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView1;
    EditText editText1;
    Button button1;

    SharedPreferences prefs1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = findViewById(R.id.textView1);
        editText1 = findViewById(R.id.editText1);
        button1 = findViewById(R.id.button1);

        prefs1 = getSharedPreferences("prefs",MODE_PRIVATE);
    }

    public void getMyText(View v)
    {
        textView1.setText(editText1.getText().toString());
    }

    @Override
    protected void onPause() {
        super.onPause();
        SharedPreferences.Editor editor = prefs1.edit();
        editor.putString("myText", editText1.getText().toString());
        editor.apply();
    }

    @Override
    protected void onResume() {
        super.onResume();
        textView1.setText(prefs1.getString("myText","Suck this"));
    }
}