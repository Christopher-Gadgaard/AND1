package dk.via.and1.persistence;

import android.app.Application;

import androidx.lifecycle.LiveData;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PersonRepo {

    private final PersonDao personDao;
    private static PersonRepo instance;
    private final LiveData<List<Person>> people;
    private final ExecutorService executorService;

    private PersonRepo(Application application) {
        PersonDatabase database = PersonDatabase.getInstance(application);
        personDao = database.personDao();
        people = personDao.getPeople();
        executorService = Executors.newFixedThreadPool(2);
    }

    public static synchronized PersonRepo getInstance(Application application) {
        if (instance == null) {
            instance = new PersonRepo(application);
        }
        return instance;
    }

    public LiveData<List<Person>> getPeople() {
        return people;
    }

    public void insert(Person person) {
        executorService.execute(() -> personDao.insert(person));
    }

    public void deletePeopleAll() {
        executorService.execute(personDao::deleteAllPeople);
    }
}
