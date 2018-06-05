package tris.bookabhiforuser;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PhysiotherapistGuidance extends AppCompatActivity {
TextView PhysioFilter;
Button PhyBooking,PhyAccount;
    RecyclerView PhysioRecyclerview;
    public  String[] PhysioName={"Pt Mathura Prasad","Pt Jagannath Sharma","Pt. Ramdayal Sharma"};
    public  String[] PhysioRank={"20 years  ex ","6 years exp","3 years exp"};
    public String[] PhysioWork={"All Type Of Work","Vsatu Dosh","namkarn"};
    public  String[] PhysioRating={"4.3 Rating","4.1 Rating","4.3 Rating"};

    public  String[] PhysioReview={"44 Reviews","44 Reviews","44 Reviews"};
    public String[] Physiofee={"Rs 500","Rs 300","Rs 200"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physiotherapist_guidance);
        PhysioFilter=findViewById(R.id.phyfilter);
        PhyBooking=findViewById(R.id.phyBooking);
        PhyAccount=findViewById(R.id.physioAccount);
        PhysioRecyclerview=findViewById(R.id.physiorecyclerview);
        PhysioRecyclerview.setLayoutManager(new LinearLayoutManager(this));
        PhysioRecyclerview.setAdapter(new PhysioAdapter(PhysioName,PhysioRank,PhysioWork,PhysioRating,PhysioReview,Physiofee));


        PhyAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(PhysiotherapistGuidance.this,Account_Profile.class);
                startActivity(i);
            }
        });


        PhysioFilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(PhysiotherapistGuidance.this,FilterActivty.class);
                startActivity(i);
            }
        });
        PhyBooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(PhysiotherapistGuidance.this, MyBooking.class);
                startActivity(i);
            }
        });

    }
}
