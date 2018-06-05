package tris.bookabhiforuser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MatrimonialMatters extends AppCompatActivity {
TextView MatriFilter;
Button MatrimonialBooking,MatrimonialAccount;

RecyclerView MatriRecycler;
    public  String[] MatriName={"Pt Mathura Prasad","Pt Jagannath Sharma","Pt. Ramdayal Sharma"};
    public  String[] MatriRank={"20 years  ex ","6 years exp","3 years exp"};
    public String[] MatriWork={"All Type Of Work","Vsatu Dosh","namkarn"};
    public  String[] MatriRating={"4.3 Rating","4.1 Rating","4.3 Rating"};

    public  String[]MatriReview={"44 Reviews","44 Reviews","44 Reviews"};
    public String[] Matrifee={"Rs 500","Rs 300","Rs 200"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matrimonial_matters);
        MatriFilter=findViewById(R.id.matriFilter);
        MatrimonialBooking=findViewById(R.id.matrimonilaBooking);
        MatrimonialAccount=findViewById(R.id.matrimonialAccount);

        MatriRecycler=findViewById(R.id.matrimorecycler);
        MatriRecycler.setLayoutManager(new LinearLayoutManager(this));
        MatriRecycler.setAdapter(new MattrimonialAdapter(MatriName,MatriRank,MatriWork,MatriRating,MatriReview,Matrifee));

        MatriFilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MatrimonialMatters.this,FilterActivty.class);
                startActivity(i);
            }
        });
        MatrimonialBooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MatrimonialMatters.this, MyBooking.class);
                startActivity(i);
            }
        });
        MatrimonialAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MatrimonialMatters.this, Account_Profile.class);
                startActivity(i);
            }
        });

    }
}
