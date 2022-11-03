package dk.via.and1.architecture;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2ViewModel extends ViewModel {

    private MutableLiveData <List<String>> notes;

    public MainActivity2ViewModel()
    {
        notes = new MutableLiveData<>();
        List<String> newList = new ArrayList<>();
        notes.setValue(newList);
    }

    public LiveData<List<String>> getNotes()
    {
        return notes;
    }

    public void addNote(String note)
    {
        List<String> currentNotes = notes.getValue();
        assert currentNotes != null;
        currentNotes.add(note);
        notes.setValue(currentNotes);
    }

    public void deleteAllNotes(){
        List<String> currentNotes = notes.getValue();
        assert currentNotes != null;
        currentNotes.clear();
        notes.setValue(currentNotes);
    }

}
