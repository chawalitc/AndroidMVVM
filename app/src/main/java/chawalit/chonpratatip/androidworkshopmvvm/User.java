package chawalit.chonpratatip.androidworkshopmvvm;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import java.math.BigDecimal;

public class User extends BaseObservable {

    private String firstName;
    private String lastName;
    private BigDecimal age;

    User(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = new BigDecimal(18);
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

    @Bindable
    public BigDecimal getAge() {
        return age;
    }

    public void setAge(BigDecimal age) {
        this.age = age;
        notifyPropertyChanged(BR.age);
    }
}
