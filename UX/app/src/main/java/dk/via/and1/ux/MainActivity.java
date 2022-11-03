package dk.via.and1.ux;

import static android.content.ContentValues.TAG;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private final ActivityResultLauncher<Intent> activityResultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), result -> Log.d(TAG, "onActivityResult: "));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton floatingActionButton = findViewById(R.id.floatingActionButton);

        floatingActionButton.setOnClickListener(view -> {
            Toast.makeText(this,"Bye",Toast.LENGTH_SHORT).show();
            activityResultLauncher.launch(new Intent(this,MainActivity5.class));
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();
        if (itemId == R.id.toastButton) {
            Toast.makeText(this, "Hello, World!", Toast.LENGTH_LONG).show();
        } else if (itemId == R.id.viewItem1) {
            Intent intent = new Intent(this,MainActivity.class);
            activityResultLauncher.launch(intent);
        }else if (itemId == R.id.viewItem2) {
            Intent intent = new Intent(this,MainActivity2.class);
            activityResultLauncher.launch(intent);
        }else if (itemId == R.id.viewItem3) {

            Intent intent = new Intent(this,MainActivity3.class);
            activityResultLauncher.launch(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}