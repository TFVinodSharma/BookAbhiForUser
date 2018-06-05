package tris.bookabhiforuser;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EngineeringGuidance extends AppCompatActivity {
TextView EngFilter;
Button EngineeringBooking,EngineeringAccount;

RecyclerView EngineeringRecycler;
    public  String[] PanditjiName={"Pt Mathura Prasad","Pt Jagannath Sharma","Pt. Ramdayal Sharma"};
    public  String[] PanditjiRank={"20 years  ex ","6 years exp","3 years exp"};
    public String[] PanditjiWork={"All Type Of Work","Vsatu Dosh","namkarn"};
    public  String[] PanditjiRating={"4.3 Rating","4.1 Rating","4.3 Rating"};
    public  String[] PanditjiReview={"44 Reviews","44 Reviews","44 Reviews"};
    public String[] Panditjifee={"Rs 500","Rs 300","Rs 200"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_engineering_guidance);
        EngineeringBooking=findViewById(R.id.engineeringBooking);
        EngineeringAccount=findViewById(R.id.engineeringAccount);

        EngineeringRecycler=findViewById(R.id.engineeringRecyler);
        EngineeringRecycler.setLayoutManager(new LinearLayoutManager(this));
        EngineeringRecycler.setAdapter(new EngineeringAdapter(PanditjiName,PanditjiRank,PanditjiWork,PanditjiRating,PanditjiReview,Panditjifee));

        EngineeringAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(EngineeringGuidance.this,Account_Profile.class);
                startActivity(i);
            }
        });


        EngFilter=findViewById(R.id.engfilter);
        EngFilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(EngineeringGuidance.this,FilterActivty.class);
                startActivity(i);
            }
        });
        EngineeringBooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(EngineeringGuidance.this, MyBooking.class);
                startActivity(i);
            }
        });

    }
}
