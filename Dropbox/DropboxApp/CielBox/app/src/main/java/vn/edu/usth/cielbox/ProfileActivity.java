package vn.edu.usth.cielbox;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbarmenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.logout) {
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
        } else if (item.getItemId() == R.id.aboutus) {
            Intent intent = new Intent(this, AboutUsActivity.class);
            startActivity(intent);
        } else if (item.getItemId() == R.id.addimg) {
            Intent intent = new Intent(this, ImageActivity.class);
            startActivity(intent);
        }else if  (item.getItemId() == R.id.profile) {
            Intent intent = new Intent(this, ProfileActivity.class);
            startActivity(intent);
        }


        return super.onOptionsItemSelected(item);
    }
}