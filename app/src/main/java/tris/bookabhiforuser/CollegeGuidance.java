package tris.bookabhiforuser;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CollegeGuidance extends AppCompatActivity {
TextView ColllegeFilter;
Button CollegeBooking,CollegeAccount;

RecyclerView CollgeRecyler;
    public  String[] CollgeName={"Pt Mathura Prasad","Pt Jagannath Sharma","Pt. Ramdayal Sharma"};
    public  String[] CollgeRank={"20 years  ex ","6 years exp","3 years exp"};
    public String[] CollgeWork={"All Type Of Work","Vsatu Dosh","namkarn"};
    public  String[] CollgeRating={"4.3 Rating","4.1 Rating","4.3 Rating"};

    public  String[]CollgeReview={"44 Reviews","44 Reviews","44 Reviews"};
    public String[] Collgefee={"Rs 500","Rs 300","Rs 200"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_college_guidance);
        ColllegeFilter=findViewById(R.id.collegeFilter);
        CollegeBooking=findViewById(R.id.collegeBooking);
        CollegeAccount=findViewById(R.id.collegeAccount);
        CollgeRecyler=findViewById(R.id.collegelisttrec);
        CollgeRecyler.setLayoutManager(new LinearLayoutManager(this));
    CollgeRecyler.setAdapter(new CollegeAdapter(CollgeName,CollgeRank,CollgeWork,CollgeRating,CollgeReview,Collgefee));
        ColllegeFilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(CollegeGuidance.this, FilterActivty.class);
                startActivity(i);
            }
        });
        CollegeBooking.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i=new Intent(CollegeGuidance.this, MyBooking.class);
                startActivity(i);
            }
        });
        CollegeAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(CollegeGuidance.this,Account_Profile.class);
                startActivity(i);
            }
        });


    }
}
