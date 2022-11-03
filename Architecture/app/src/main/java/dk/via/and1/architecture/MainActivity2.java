package dk.via.and1.architecture;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

public class MainActivity2 extends AppCompatActivity {

    EditText noteEditText;
    Button addNoteButton;
    Button deleteButton;
    TextView noteTextView;

    MainActivity2ViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        noteEditText = findViewById(R.id.noteEditText);
        addNoteButton = findViewById(R.id.addNoteButton);
        deleteButton = findViewById(R.id.deleteButton);
        noteTextView = findViewById(R.id.noteTextView);

        viewModel = new ViewModelProvider(this).get(MainActivity2ViewModel.class);
        viewModel.getNotes().observe(this, new Observer<List<String>>() {
            @Override
            public void onChanged(List<String> notes) {
                noteTextView.setText("");
                for (String note: notes) {
                    noteTextView.append(note+"\n");
                }
            }
        });
    }

    public void addNote(View v)
    {
        viewModel.addNote(noteEditText.getText().toString());
    }

    public void deleteAllNotes(View v)
    {
        viewModel.deleteAllNotes();
    }
}