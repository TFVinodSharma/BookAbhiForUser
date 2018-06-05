package tris.bookabhiforuser;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;

public class Taxation extends AppCompatActivity implements View.OnClickListener {
CardView Tax1,Tax2;
Button TaxationBooking,TaxationAccount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taxation);

        Tax1=findViewById(R.id.Tax1);
        Tax2=findViewById(R.id.Tax2);
        TaxationBooking=findViewById(R.id.taxationBooking);
        TaxationAccount=findViewById(R.id.taxAccount);

        Tax1.setOnClickListener(this);
        Tax2.setOnClickListener(this);
        TaxationBooking.setOnClickListener(this);
        TaxationAccount.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v==Tax1)
        {
            Intent i=new Intent(this,GstAcivity.class);
            startActivity(i);
        }
        else if (v==Tax2)
        {
            Intent i=new Intent(this,IncomeTaxActivity.class);
            startActivity(i);

        }
        else if (v==TaxationBooking)
        {
            Intent i=new Intent(this,MyBooking.class);
            startActivity(i);
        }
        else if (v==TaxationAccount)
        {
            Intent i= new Intent(this,Account_Profile.class);
            startActivity(i);
        }

    }
}
