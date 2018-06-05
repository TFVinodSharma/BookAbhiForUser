package tris.bookabhiforuser;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
EditText Email,Password;
TextView ForgetPassword;
Button  LoginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Email=findViewById(R.id.useremail);
        Password=findViewById(R.id.userpassword);
        ForgetPassword=findViewById(R.id.forgetpasswordtextview);
        LoginButton=findViewById(R.id.loginbutton);

        LoginButton.setOnClickListener(this);
        ForgetPassword.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        if (v.getId()==R.id.loginbutton)
        {
            SharedPreferences sp=getSharedPreferences("My_Data",MODE_PRIVATE);


            String Email1=Email.getText().toString();
            String Pass=Password.getText().toString();
            if (Email1.equals(sp.getString("A",null))&& Pass.equals(sp.getString("B",null))){
                startActivity(new Intent(this,Home.class));
            }
            else
            {
                Toast.makeText(this, "Incorrect Email or Password", Toast.LENGTH_SHORT).show();
            }


        }
/*
        else if (v.getId()==R.id.forgetpasswordtextview)
        {
            Intent i=new Intent(LoginActivity.this,ForgetPassword.class);
            startActivity(i);
        }
*/


    }
}
