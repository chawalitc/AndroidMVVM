package chawalit.chonpratatip.androidworkshopmvvm;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;
import chawalit.chonpratatip.androidworkshopmvvm.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements ClickHandler{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        ActivityMainBinding binding
                = DataBindingUtil.setContentView(this, R.layout.activity_main);

        User user = new User("Chawalit", "Chonpratatip");
        binding.setUser(user);
        binding.setQty(20);
        binding.setHandler(this);
    }

    @Override
    public void onButtonClick(User user) {
        Toast.makeText(this, "User"+user.getFirstName()
                + " clicked!", Toast.LENGTH_LONG).show();
    }
}
