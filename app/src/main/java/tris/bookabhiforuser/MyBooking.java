package tris.bookabhiforuser;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MyBooking extends AppCompatActivity implements View.OnClickListener {
    TextView HelpUser;
    Button MyBookings, Account,Cancel1,Cancel2,Cancel3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_booking);
        MyBookings = findViewById(R.id.mybooking);
        Account = findViewById(R.id.account);
        Cancel1=findViewById(R.id.cancel1);
        Cancel2=findViewById(R.id.cance22);
        Cancel3=findViewById(R.id.cancel33);
       // HelpUser = findViewById(R.id.helpUser);
        MyBookings.setOnClickListener(this);
        Account.setOnClickListener(this);
     //   HelpUser.setOnClickListener(this);
        Cancel1.setOnClickListener(this);
        Cancel2.setOnClickListener(this);
        Cancel3.setOnClickListener(this);
/*
        HelpUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MyBooking.this, UserHelp.class);
                startActivity(i);
            }
        });
*/

    }

    @Override
    public void onClick(View v) {
        if (v == HelpUser)
        {
            Intent i = new Intent(MyBooking.this, UserHelp.class);
            startActivity(i);
        }
        else if (v==Account)
        {
            Intent i=new Intent(MyBooking.this,Account_Profile.class);
            startActivity(i);
        }
        else if (v==MyBookings)
        {
            Intent i=new Intent(MyBooking.this, MyBooking.class);
            startActivity(i);
        }
        else if (v==Cancel1)
        {
            Intent i=new Intent(MyBooking.this, CancelActivity.class);
            startActivity(i);
        }
        else if (v==Cancel2)
        {
            Intent i=new Intent(MyBooking.this, CancelActivity.class);
            startActivity(i);
        }
        else if (v==Cancel3)
        {
            Intent i=new Intent(MyBooking.this, CancelActivity.class);
            startActivity(i);
        }

    }
}
