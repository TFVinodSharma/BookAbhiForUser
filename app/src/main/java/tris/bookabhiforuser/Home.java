package tris.bookabhiforuser;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Home extends AppCompatActivity implements View.OnClickListener
{
CardView Education,Investment,Taxation,Legal,Astrology,Life,Tutor,Doctor,Others;
TextView UserName;
Button HomeAccount,HomeBooking;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        UserName=findViewById(R.id.username);

        HomeAccount=findViewById(R.id.homeAccount);
        HomeBooking=findViewById(R.id.homeBooking);


        Education=findViewById(R.id.card1);
        Investment=findViewById(R.id.card2);
        Taxation=findViewById(R.id.card3);
        Legal=findViewById(R.id.card4);
        Astrology=findViewById(R.id.card5);
        Life=findViewById(R.id.card6);
        Tutor=findViewById(R.id.card7);
        Doctor=findViewById(R.id.card8);
        Others=findViewById(R.id.card9);


        Education.setOnClickListener(this);
        Investment.setOnClickListener(this);
        Taxation.setOnClickListener(this);
        Legal.setOnClickListener(this);
        Astrology.setOnClickListener(this);
        Life.setOnClickListener(this);
        Tutor.setOnClickListener(this);
        Doctor.setOnClickListener(this);
        HomeAccount.setOnClickListener(this);
        HomeBooking.setOnClickListener(this);


        // Others.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        if (v==Education)
        {
            Intent i=new Intent(this,Education.class);
            startActivity(i);
        }

        else if (v==Investment)
        {
/*
            LinearLayout ln=(LinearLayout)findViewById(R.id.cantainer1);
            FragmentManager fm=getSupportFragmentManager();
            FragmentTransaction ft=fm.beginTransaction();
            ft.replace(R.id.cantainer1, new InvestmentFrag());
            ft.commit();
            ln .setVisibility(View.VISIBLE);
*/
            Intent i=new Intent(this,InvestmentActivity.class);
            startActivity(i);

        }
        else if (v==Taxation)
        {
            Intent i=new Intent(this,Taxation.class);
            startActivity(i);

        }
        else if (v==Legal)
        {
            Intent i=new Intent(this,LegalActivity.class);
            startActivity(i);

        }
        else if (v==Astrology)
        {
            Intent i=new Intent(this,Astrology.class);
            startActivity(i);

        }
        else if (v==Life)
        {
        Intent i=new Intent(this,LifeMangement.class);
        startActivity(i);
        }
        else if (v==Tutor)
        {

            Intent i =new Intent(this,TutorActivity.class);
            startActivity(i);
        }
        else if (v==Doctor)
        {
        Intent i=new Intent(this,DoctorActivity.class);
        startActivity(i);
        }
        else if (v==HomeAccount)
        {
            Intent i=new Intent(this,Account_Profile.class);
            startActivity(i);
        }
        else if (v==HomeBooking)
        {
            Intent i=new Intent(this,MyBooking.class);
            startActivity(i);
        }

    }
}
