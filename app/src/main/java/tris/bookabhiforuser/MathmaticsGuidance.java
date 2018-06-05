package tris.bookabhiforuser;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MathmaticsGuidance extends AppCompatActivity {
TextView MathmaFilter;
Button  MathBooking,MathAccount;

RecyclerView MathsRecyclerview;

    public  String[] MathsName={"Pt Mathura Prasad","Pt Jagannath Sharma","Pt. Ramdayal Sharma"};
    public  String[] MathsRank={"20 years  ex ","6 years exp","3 years exp"};
    public String[] MathsWork={"All Type Of Work","Vsatu Dosh","namkarn"};
    public  String[] MathsRating={"4.3 Rating","4.1 Rating","4.3 Rating"};

    public  String[] MathsReview={"44 Reviews","44 Reviews","44 Reviews"};
    public String[] Mathsfee={"Rs 500","Rs 300","Rs 200"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mathmatics_guidance);

        MathmaFilter=findViewById(R.id.mathFilter);
        MathBooking=findViewById(R.id.mathBooking);
        MathAccount=findViewById(R.id.mathAccount);


        MathsRecyclerview=findViewById(R.id.mathsRecyclerview);

        MathsRecyclerview.setLayoutManager(new LinearLayoutManager(this));

        MathsRecyclerview.setAdapter(new MathsAdapter(MathsName,MathsRank,MathsWork,MathsRating,MathsReview,Mathsfee));

        MathmaFilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MathmaticsGuidance.this, FilterActivty.class);
                startActivity(i);
            }
        });
        MathBooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MathmaticsGuidance.this, MyBooking.class);
                startActivity(i);
            }
        });
        MathAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MathmaticsGuidance.this, Account_Profile.class);
                startActivity(i);
            }
        });



    }
}
