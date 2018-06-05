package tris.bookabhiforuser;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;

public class TutorActivity extends AppCompatActivity  implements View.OnClickListener{


    CardView Tut1,Tut2,Tut3,Tut4,Tut5,Tut6,Tut7,Tut8,Tut9,Tut10,Tut11,Tut12,Tut13;

    Button TutorAccount,TutorBooking;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutor);

        Tut1=findViewById(R.id.tutor1);
        Tut2=findViewById(R.id.tutor2);
        Tut3=findViewById(R.id.tutor3);
        Tut4=findViewById(R.id.tutor4);
        Tut5=findViewById(R.id.tutor5);
        Tut6=findViewById(R.id.tutor6);
        Tut7=findViewById(R.id.tutor7);
        Tut8=findViewById(R.id.tutor8);
        Tut9=findViewById(R.id.tutor9);
        Tut10=findViewById(R.id.tutor10);
        Tut11=findViewById(R.id.tutor11);
        Tut12=findViewById(R.id.tutor12);
        Tut13=findViewById(R.id.tutor13);
        TutorAccount=findViewById(R.id.tutorAccount);
        TutorBooking=findViewById(R.id.tutorBooking);

        Tut1.setOnClickListener(this);
        Tut2.setOnClickListener(this);
        Tut3.setOnClickListener(this);
        Tut4.setOnClickListener(this);
        Tut5.setOnClickListener(this);
        Tut6.setOnClickListener(this);
        Tut7.setOnClickListener(this);
        Tut8.setOnClickListener(this);
        Tut9.setOnClickListener(this);
        Tut10.setOnClickListener(this);
        Tut11.setOnClickListener(this);
        Tut12.setOnClickListener(this);
        Tut13.setOnClickListener(this);
        TutorBooking.setOnClickListener(this);
        TutorAccount.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if (v==Tut1)
        {
            Intent i=new Intent(this,NurseryClass.class);
            startActivity(i);
        }
        else if (v==Tut2)
        {
            Intent i=new Intent(this,Class1to5.class);
            startActivity(i);

        }
        else if (v==Tut3)
        {
            Intent i=new Intent(this,Class6to10.class);
            startActivity(i);

        }
        else if (v==Tut4)
        {
            Intent i=new Intent(this,Class11to12.class);
            startActivity(i);

        }
        else if (v==Tut5)
        {
            Intent i=new Intent(this,EnglishGuidance.class);
            startActivity(i);

        }
        else if (v==Tut6)
        {
            Intent i=new Intent(this,MathmaticsGuidance.class);
            startActivity(i);

        }
        else if (v==Tut7)
        {
            Intent i=new Intent(this,ScienceGuidance.class);
            startActivity(i);

        }
        else if (v==Tut8)
        {
            Intent i=new Intent(this,DanceGuidance.class);
            startActivity(i);

        }
        else if (v==Tut9)
        {
            Intent i=new Intent(this,SportsGuidance.class);
            startActivity(i);

        }
        else if (v==Tut10)
        {
            Intent i=new Intent(this,ComputerGuidance.class);
            startActivity(i);

        }
        else if (v==Tut11)
        {
            Intent i=new Intent(this,ForeignDegreeGuidance.class);
            startActivity(i);

        }
        else if (v==Tut12)
        {
            Intent i=new Intent(this,YogaGuidance.class);
            startActivity(i);

        }
        else if (v==Tut13)
        {
            Intent i=new Intent(this,PhysiotherapistGuidance.class);
            startActivity(i);

        }
        else if(v==TutorAccount)
        {
            Intent i=new Intent(this,Account_Profile.class);
            startActivity(i);
        }
        else if (v==TutorBooking)
        {
            Intent i=new Intent (this,MyBooking.class);
            startActivity(i);
        }


    }
}
