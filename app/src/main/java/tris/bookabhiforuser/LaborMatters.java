package tris.bookabhiforuser;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LaborMatters extends AppCompatActivity {
TextView LaborFilter;
Button  LaborBooking,LaborAccount;

RecyclerView LaborRec;
    public  String[] LaborName={"Pt Mathura Prasad","Pt Jagannath Sharma","Pt. Ramdayal Sharma"};
    public  String[] LaborRank={"20 years  ex ","6 years exp","3 years exp"};
    public String[] LaborWork={"All Type Of Work","Vsatu Dosh","namkarn"};
    public  String[] LaborRating={"4.3 Rating","4.1 Rating","4.3 Rating"};

    public  String[] LaborReview={"44 Reviews","44 Reviews","44 Reviews"};
    public String[] Laborfee={"Rs 500","Rs 300","Rs 200"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_labor_matters);
        LaborBooking=findViewById(R.id.laborBooking);
        LaborFilter=findViewById(R.id.laborFilter);
        LaborAccount=findViewById(R.id.laborAccount);

        LaborRec=findViewById(R.id.laborRecycler);
        LaborRec.setLayoutManager(new LinearLayoutManager(this));
        LaborRec.setAdapter(new LaborAdapter(LaborName,LaborRank,LaborWork,LaborRating,LaborReview,Laborfee));
        LaborFilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(LaborMatters.this,FilterActivty.class);
                startActivity(i);
            }
        });
        LaborBooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(LaborMatters.this, MyBooking.class);
                startActivity(i);
            }
        });
        LaborAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(LaborMatters.this, Account_Profile.class);
                startActivity(i);
            }
        });


    }
}
