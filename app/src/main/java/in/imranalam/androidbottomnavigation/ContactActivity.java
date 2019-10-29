package in.imranalam.androidbottomnavigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ContactActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView mBottomNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        mBottomNav = findViewById(R.id.bottom_nav);
        mBottomNav.setOnNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Activity mActivity = null;
        switch (item.getItemId()) {
            case R.id.nav_home:
                Intent m_A = new Intent(this, MainActivity.class);
                startActivity(m_A);
                finish();
                break;
            case R.id.nav_about:
//                Intent m_B = new Intent(this, ContactActivity.class);
//                startActivity(m_B);
//                finish();
                break;
            case R.id.nav_gallery:
                Intent m_C = new Intent(this, UserProfileActivity.class);
                startActivity(m_C);
                finish();
                break;
        }
        return true;
    }
}