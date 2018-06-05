package tris.bookabhiforuser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DanceGuidance extends AppCompatActivity {
TextView DanceFilter;
Button DanceBooking,DanceAccount;

RecyclerView DanceRecyclerView;

    public  String[] DanceName={"Pt Mathura Prasad","Pt Jagannath Sharma","Pt. Ramdayal Sharma"};
    public  String[] DanceRank={"20 years  ex ","6 years exp","3 years exp"};
    public String[] DanceWork={"All Type Of Work","Vsatu Dosh","namkarn"};
    public  String[] DanceRating={"4.3 Rating","4.1 Rating","4.3 Rating"};

    public  String[] DanceReview={"44 Reviews","44 Reviews","44 Reviews"};
    public String[] Dancefee={"Rs 500","Rs 300","Rs 200"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dance_guidance);
        DanceFilter=findViewById(R.id.danceFilter);
        DanceBooking=findViewById(R.id.danceBooking);
        DanceAccount=findViewById(R.id.danceAccount);

        DanceRecyclerView=findViewById(R.id.dancerecyclerview);
        DanceRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        DanceRecyclerView.setAdapter(new DanceAdapter(DanceName,DanceRank,DanceWork,DanceRating,DanceReview,Dancefee));
       // DanceRecyclerView=findViewById(R.id.dancerecyclerview);




        DanceAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(DanceGuidance.this,Account_Profile.class);
                startActivity(i);
            }
        });

        DanceFilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(DanceGuidance.this, FilterActivty.class);
                startActivity(i);
            }
        });
        DanceBooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(DanceGuidance.this, MyBooking.class);
                startActivity(i);
            }
        });


    }
}
