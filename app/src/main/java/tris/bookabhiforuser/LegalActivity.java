package tris.bookabhiforuser;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;

public class LegalActivity extends AppCompatActivity  implements View.OnClickListener{

    CardView Legal1,Legal2,Legal3,Legal4,Legal5,Legal6,Legal7;
    Button LegalBooking,LegalAccount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legal);
        LegalBooking=findViewById(R.id.legalBooking);

        Legal1=findViewById(R.id.legal1);
        Legal2=findViewById(R.id.legal2);
        Legal3=findViewById(R.id.legal3);
        Legal4=findViewById(R.id.legal4);
        Legal5=findViewById(R.id.legal5);
        Legal6=findViewById(R.id.legal6);
        Legal7=findViewById(R.id.legal7);
        LegalAccount=findViewById(R.id.legalAccount);
    LegalAccount.setOnClickListener(this);
        LegalBooking.setOnClickListener(this);
        Legal1.setOnClickListener(this);
        Legal2.setOnClickListener(this);
        Legal3.setOnClickListener(this);
        Legal4.setOnClickListener(this);
        Legal5.setOnClickListener(this);
        Legal6.setOnClickListener(this);
        //Legal7.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v==Legal1)
        {
            Intent i=new Intent(this,CivilMatters.class);
            startActivity(i);
        }
        else if (v==Legal2)
        {
            Intent i=new Intent(this,CriminalMatters.class);
            startActivity(i);

        }
        else if (v==Legal3)
        {
            Intent i=new Intent(this,FamilyMatters.class);
            startActivity(i);

        }
        else if (v==Legal4)
        {
            Intent i=new Intent(this,MatrimonialMatters.class);
            startActivity(i);

        }
        else if (v==Legal5)
        {
            Intent i=new Intent(this,LaborMatters.class);
            startActivity(i);

        }
        else if (v==Legal6)
        {
            Intent i=new Intent(this,PatentLow.class);
            startActivity(i);

        }

        else if (v==LegalBooking)
        {
            Intent i=new Intent(this,MyBooking.class);
            startActivity(i);

        }


        else if (v==LegalAccount)
        {
            Intent i=new Intent(this,Account_Profile.class);
            startActivity(i);

        }






    }
}
