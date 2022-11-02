package dk.via.and1.ux.ui.gallery;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Fragment1ViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public Fragment1ViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Fragment 1");
    }

    public LiveData<String> getText() {
        return mText;
    }
}