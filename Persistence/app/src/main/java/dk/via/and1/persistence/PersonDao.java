package dk.via.and1.persistence;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface PersonDao {
    @Insert
    void insert(Person person);

    @Update
    void update(Person person);

    @Delete
    void delete(Person person);

    @Query("SELECT * FROM person_table ORDER BY uid DESC")
    LiveData<List<Person>> getPeople();

    @Query("Delete from person_table")
    void deleteAllPeople();
}

