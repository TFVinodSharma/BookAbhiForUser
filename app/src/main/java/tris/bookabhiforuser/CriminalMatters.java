package tris.bookabhiforuser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CriminalMatters extends AppCompatActivity {
TextView CriminalFilter;
Button CriminalAccount,CriminalBooking;

RecyclerView Criminallist;
    public  String[] CriminalName={"Pt Mathura Prasad","Pt Jagannath Sharma","Pt. Ramdayal Sharma"};
    public  String[] CriminalRank={"20 years  ex ","6 years exp","3 years exp"};
    public String[] CriminalWork={"All Type Of Work","Vsatu Dosh","namkarn"};
    public  String[] CriminalRating={"4.3 Rating","4.1 Rating","4.3 Rating"};

    public  String[] CriminalReview={"44 Reviews","44 Reviews","44 Reviews"};
    public String[] Criminalfee={"Rs 500","Rs 300","Rs 200"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criminal_matters);
        CriminalFilter=findViewById(R.id.criminalFilter);
        CriminalAccount=findViewById(R.id.criminalAccount);
        CriminalBooking=findViewById(R.id.criminalBooking);

        Criminallist=findViewById(R.id.criminallist);
        Criminallist.setLayoutManager(new LinearLayoutManager(this));
        Criminallist.setAdapter(new CriminalAdapter(CriminalName,CriminalRank,CriminalWork,CriminalRating,CriminalReview,Criminalfee));

        CriminalFilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(CriminalMatters.this, FilterActivty.class);
                startActivity(i);
            }
        });
        CriminalAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(CriminalMatters.this, Account_Profile.class);
                startActivity(i);
            }
        });
        CriminalBooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(CriminalMatters.this, MyBooking.class);
                startActivity(i);
            }
        });


    }
}
