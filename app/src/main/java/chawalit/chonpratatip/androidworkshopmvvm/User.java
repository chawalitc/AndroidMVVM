package chawalit.chonpratatip.androidworkshopmvvm;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class User extends BaseObservable {

    public String firstName;
    public String lastName;

    User(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Bindable
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(BR.firstName);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
