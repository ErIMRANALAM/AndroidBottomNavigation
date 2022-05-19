package in.imranalam.androidbottomnavigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView mBottomNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBottomNav = findViewById(R.id.bottom_nav);
        mBottomNav.setOnNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();
        if (itemId != R.id.nav_home) {
            if (itemId == R.id.nav_about) {
                Intent m_B = new Intent(this, ContactActivity.class);
                startActivity(m_B);
                finish();
            } else if (itemId == R.id.nav_gallery) {
                Intent m_C = new Intent(this, UserProfileActivity.class);
                startActivity(m_C);
                finish();
            }
        }
        return true;
    }
}