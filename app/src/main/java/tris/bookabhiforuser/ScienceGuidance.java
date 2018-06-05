package tris.bookabhiforuser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ScienceGuidance extends AppCompatActivity {
TextView ScienceFilter;
Button ScienceBooking,ScienceAccount;
RecyclerView ScienceRecyclerView;

    public  String[] ScienceName={"Pt Mathura Prasad","Pt Jagannath Sharma","Pt. Ramdayal Sharma"};
    public  String[] ScienceRank={"20 years  ex ","6 years exp","3 years exp"};
    public String[] ScienceWork={"All Type Of Work","Vsatu Dosh","namkarn"};
    public  String[] ScienceRating={"4.3 Rating","4.1 Rating","4.3 Rating"};

    public  String[] ScienceReview={"44 Reviews","44 Reviews","44 Reviews"};
    public String[] Sciencefee={"Rs 500","Rs 300","Rs 200"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science_guidance);
        ScienceBooking=findViewById(R.id.scienceBooking);
        ScienceFilter=findViewById(R.id.scienceFilter);

        ScienceAccount=findViewById(R.id.scienceAccount);

        ScienceRecyclerView=findViewById(R.id.sciencerecyclerview);

        ScienceRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        ScienceRecyclerView.setAdapter(new ScienceAdapter(ScienceName,ScienceRank,ScienceWork,ScienceRating,ScienceReview,Sciencefee));

        ScienceAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(ScienceGuidance.this,Account_Profile.class);
                startActivity(i);
            }
        });

        ScienceFilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(ScienceGuidance.this, FilterActivty.class);
                startActivity(i);
            }
        });
        ScienceBooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(ScienceGuidance.this, MyBooking.class);
                startActivity(i);
            }
        });


    }
}
