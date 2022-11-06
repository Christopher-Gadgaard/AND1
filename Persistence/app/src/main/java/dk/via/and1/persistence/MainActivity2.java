package dk.via.and1.persistence;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity
{

    private MainActivity2ViewModel viewModel;
    private EditText firstName;
    private EditText lastName;
    private TextView fullName;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        firstName = findViewById(R.id.firstNameEditText);
        lastName = findViewById(R.id.lastNameEditText);
        fullName = findViewById(R.id.fullNamesTextView);

        viewModel = new ViewModelProvider(this).get(MainActivity2ViewModel.class);
        viewModel.getPeople().observe(this, people ->
        {
            if (!people.isEmpty())
            {
                fullName.setText("");
                for (Person person : people)
                {
                    fullName.append(person.getFirstName() + " " + person.getLastName() + "\n");
                }

            } else
            {
                fullName.setText("Empty");
            }
        });
    }

    public void savePerson(View v)
    {
        viewModel.insert(new Person(firstName.getText().toString(),lastName.getText().toString()));
        firstName.setText("");
        lastName.setText("");
    }

    public void deletePeople(View v)
    {
        viewModel.deleteAllPeople();
    }
}