package tris.bookabhiforuser;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PatentLow extends AppCompatActivity {
TextView PatentFilter;
Button PatentLawBooking,PatentlawAccount;

RecyclerView PatentRecycler;
    public  String[] PatentName={"Pt Mathura Prasad","Pt Jagannath Sharma","Pt. Ramdayal Sharma"};
    public  String[] PatentRank={"20 years  ex ","6 years exp","3 years exp"};
    public String[] PatentWork={"All Type Of Work","Vsatu Dosh","namkarn"};
    public  String[] PatentRating={"4.3 Rating","4.1 Rating","4.3 Rating"};

    public  String[] PatentReview={"44 Reviews","44 Reviews","44 Reviews"};
    public String[] Patentfee={"Rs 500","Rs 300","Rs 200"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patent_low);
        PatentFilter=findViewById(R.id.patentlawFilter);
        PatentLawBooking=findViewById(R.id.patentlawBooking);

        PatentRecycler=findViewById(R.id.patentRecycler);
        PatentRecycler.setLayoutManager(new LinearLayoutManager(this));
        PatentRecycler.setAdapter(new PatentAdapter(PatentName,PatentRank,PatentWork,PatentRating,PatentReview,Patentfee));


        PatentlawAccount=findViewById(R.id.patentlawAccount);

        PatentlawAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(PatentLow.this,Account_Profile.class);
                startActivity(i);
            }
        });

        PatentFilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(PatentLow.this,FilterActivty.class);
                startActivity(i);
            }
        });
        PatentLawBooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(PatentLow.this, MyBooking.class);
                startActivity(i);
            }
        });

    }
}
