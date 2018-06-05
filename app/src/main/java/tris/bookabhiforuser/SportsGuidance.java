package tris.bookabhiforuser;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SportsGuidance extends AppCompatActivity {
TextView SportsGuidanceFilter;
Button SportsBooking,SportsAccount;

RecyclerView SportsRecyclerview;

    public  String[] SportsName={"Mathura Prasad"," Jagannath Sharma","Ramdayal Sharma"};
    public  String[] SportsRank={"20 years  ex ","6 years exp","3 years exp"};
    public String[] SportsWork={"All Type Of Work","Vsatu Dosh","namkarn"};
    public  String[] SportsRating={"4.3 Rating","4.1 Rating","4.3 Rating"};

    public  String[] SportsReview={"44 Reviews","44 Reviews","44 Reviews"};
    public String[] Sportsfee={"Rs 500","Rs 300","Rs 200"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports_guidance);
        SportsGuidanceFilter=findViewById(R.id.sportFilter);
        SportsBooking=findViewById(R.id.sportsBooking);
        SportsAccount=findViewById(R.id.sportsAccount);

        SportsRecyclerview=findViewById(R.id.sportrecyclerview);
        SportsRecyclerview.setLayoutManager(new LinearLayoutManager(this));

        SportsRecyclerview.setAdapter(new SportsAdaptern(SportsName,SportsRank,SportsWork,SportsRating,SportsReview,Sportsfee));

        SportsAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(SportsGuidance.this,Account_Profile.class);
                startActivity(i);
            }
        });

        SportsGuidanceFilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(SportsGuidance.this, FilterActivty.class);
                startActivity(i);
            }
        });
        SportsBooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(SportsGuidance.this, MyBooking.class);
                startActivity(i);
            }
        });


    }
}
