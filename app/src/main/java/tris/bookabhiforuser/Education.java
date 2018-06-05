package tris.bookabhiforuser;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Education extends AppCompatActivity  implements View.OnClickListener{
TextView UserName1;
Button  EducationBooking,EducationAccount;

CardView Edu2,Edu3,Edu4,Edu5,Edu6,Edu7,Edu8,Edu9,Edu10,Edu11,Edu12;
    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education);
        EducationBooking=findViewById(R.id.educationBooking);
        EducationAccount=findViewById(R.id.educationAccount);

       // Edu1=findViewById(R.id.edu1);
        Edu2=findViewById(R.id.edu2);
        Edu3=findViewById(R.id.edu3);
        Edu4=findViewById(R.id.edu4);
        Edu5=findViewById(R.id.edu5);
        Edu6=findViewById(R.id.edu6);
        Edu7=findViewById(R.id.edu7);
        Edu8=findViewById(R.id.edu8);
        Edu9=findViewById(R.id.edu9);
        Edu10=findViewById(R.id.edu10);
        Edu11=findViewById(R.id.edu11);
        Edu12=findViewById(R.id.edu12);

/*
        Edu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Education.this,SchoolGuidance.class);
                startActivity(i);
            }
        });
*/


      //  UserName1=findViewById(R.id.username1);

    EducationBooking.setOnClickListener(this);
    EducationAccount.setOnClickListener(this);
      //  Edu1.setOnClickListener(this);
        Edu2.setOnClickListener(this);
        Edu3.setOnClickListener(this);
        Edu4.setOnClickListener(this);
        Edu5.setOnClickListener(this);
        Edu6.setOnClickListener(this);
        Edu7.setOnClickListener(this);
        Edu8.setOnClickListener(this);
        Edu9.setOnClickListener(this);
        Edu10.setOnClickListener(this);
        Edu11.setOnClickListener(this);
       // Edu12.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if (v==Edu2)
        {
            Intent i=new Intent(this,CollegeGuidance.class);
            startActivity(i);

        }
/*
        if (v==Edu1)
        {
            Intent i= new Intent (this,SchoolGuidance.class);
            startActivity(i);
        }
*/
        else if (v==Edu3)
        {
            Intent i=new Intent(this,CMAGiudance.class);
            startActivity(i);

        }
        else if (v==Edu4)
        {
            Intent i=new Intent(this,CAGuidance.class);
            startActivity(i);

        }
        else if (v==Edu5)
        {
            Intent i=new Intent(this,CSGuidance.class);
            startActivity(i);

        }
        else if (v==Edu6)
        {

            Intent i=new Intent(this,CivilGuidance.class);
            startActivity(i);

        }
        else if (v==Edu7)
        {
            Intent i=new Intent(this,LawGuidance.class);
            startActivity(i);

        }
        else if (v==Edu8)
        {

            Intent i=new Intent(this,ForeignDegreeGuidance.class);
            startActivity(i);

        }
        else if (v==Edu9)
        {

            Intent i=new Intent(this,MBAGuidance.class);
            startActivity(i);

        }
        else if (v==Edu10)
        {

            Intent i=new Intent(this,MedicalGuidance.class);
            startActivity(i);

        }
        else if (v==Edu11)
        {
            Intent i=new Intent(this,EngineeringGuidance.class);
            startActivity(i);

        }
        /*
        else if (v==Edu12)
        {
            Intent i=new Intent(this,SchoolGuidance.class);
            startActivity(i);
*/
        else if (v==EducationBooking)
        {
            Intent i=new Intent(this,MyBooking.class);
            startActivity(i);
        }
        else if (v==EducationAccount)
        {
            Intent i=new Intent(this,Account_Profile.class);
            startActivity(i);
        }






    }
    /*public void onClick1(View v)
    {
        Intent i=new Intent(this,SchoolGuidance.class);
        startActivity(i);
    }*/
}
