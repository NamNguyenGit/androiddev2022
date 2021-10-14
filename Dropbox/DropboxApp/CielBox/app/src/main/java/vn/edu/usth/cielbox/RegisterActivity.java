package vn.edu.usth.cielbox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {
    private TextView backlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        backlogin = (TextView) findViewById(R.id.newbutton);
        backlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity1();
            }
        });
    }
    public void openActivity1(){
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
}