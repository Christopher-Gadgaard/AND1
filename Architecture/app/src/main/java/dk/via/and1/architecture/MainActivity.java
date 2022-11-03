package dk.via.and1.architecture;

import static android.content.ContentValues.TAG;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    MainActivityViewModel viewModel;
    TextView textView;
    ProgressBar progressBar;

    private final ActivityResultLauncher<Intent> activityResultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), result -> Log.d(TAG, "onActivityResult: "));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textview);
        progressBar = findViewById(R.id.progressBar);

        viewModel = new ViewModelProvider(this).get(MainActivityViewModel.class);
        viewModel.getMessage().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                textView.setText(s);
            }
        });

        viewModel.isLoading().observe(this, new Observer<Boolean>() {
            @Override
            public void onChanged(Boolean aBoolean) {
                int visibility = aBoolean ? View.VISIBLE : View.INVISIBLE;
                progressBar.setVisibility(visibility);
            }
        });
    }

    public void retrieveDataFromInternet(View view)
    {
        viewModel.retrieveData();
    }

    public void goToNotes(View view)
    {
        Intent intent = new Intent(this,MainActivity2.class);
        activityResultLauncher.launch(intent);
    }
}