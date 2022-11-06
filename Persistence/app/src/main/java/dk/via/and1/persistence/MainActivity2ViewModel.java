package dk.via.and1.persistence;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;


public class MainActivity2ViewModel extends AndroidViewModel
{

    private final PersonRepo repo;

    public MainActivity2ViewModel(Application application)
    {
        super(application);
        repo = PersonRepo.getInstance(application);
    }

    public LiveData<List<Person>> getPeople()
    {
        return repo.getPeople();
    }

    public void insert(final Person person)
    {
        repo.insert(person);
    }

    public void deleteAllPeople()
    {
        repo.deletePeopleAll();
    }
}
