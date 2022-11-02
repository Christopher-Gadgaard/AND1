package dk.via.and1.ux.ui.slideshow;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Fragment2ViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public Fragment2ViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is fragment 2");
    }

    public LiveData<String> getText() {
        return mText;
    }
}