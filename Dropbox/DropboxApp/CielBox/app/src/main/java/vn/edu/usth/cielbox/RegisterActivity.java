package vn.edu.usth.cielbox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    private TextView backlogin;
    EditText editmail;
    EditText editpass1;
    EditText cfpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        editmail = (EditText) findViewById(R.id.newusername) ;
        editpass1 = (EditText) findViewById(R.id.newpassword);
        cfpass = (EditText) findViewById(R.id.cfpassword) ;

        backlogin = (TextView) findViewById(R.id.newbutton);
        backlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registeruser();
            }
        });
    }

    private void registeruser() {
        String emailuser = editmail.getEditableText().toString().trim();
        String passuser = editpass1.getEditableText().toString().trim();
        String cfpassuser = cfpass.getEditableText().toString().trim();
        if(emailuser.isEmpty()){
            Toast.makeText(this,"Email required",Toast.LENGTH_LONG).show();
        }
        else if(passuser.isEmpty()){
            Toast.makeText(this,"Password required",Toast.LENGTH_LONG).show();
        }
        else if(cfpassuser.isEmpty()){
            Toast.makeText(this,"Confirm Password required",Toast.LENGTH_LONG).show();
        }
        else if(!passuser.equals(cfpassuser)){
            Toast.makeText(this,"Confirm Password wrong",Toast.LENGTH_LONG).show();
        }
        else {
            openActivity1();
            Toast.makeText(this,"Register Succesfully ",Toast.LENGTH_LONG).show();
        }
    }

    public void openActivity1(){
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
}