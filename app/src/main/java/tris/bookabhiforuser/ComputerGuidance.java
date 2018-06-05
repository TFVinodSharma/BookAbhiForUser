package tris.bookabhiforuser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ComputerGuidance extends AppCompatActivity {
TextView CompFiletr;
Button ComputerBooking,ComputerAccount;
RecyclerView ComputerReyclerView;
    public  String[] ComputerName={"Pt Mathura Prasad","Pt Jagannath Sharma","Pt. Ramdayal Sharma"};
    public  String[] ComputerRank={"20 years  ex ","6 years exp","3 years exp"};
    public String[] ComputerWork={"All Type Of Work","Vsatu Dosh","namkarn"};
    public  String[] ComputerRating={"4.3 Rating","4.1 Rating","4.3 Rating"};

    public  String[] ComputerReview={"44 Reviews","44 Reviews","44 Reviews"};
    public String[] Computerfee={"Rs 500","Rs 300","Rs 200"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer_guidance);
        CompFiletr=findViewById(R.id.compFilter);
        ComputerBooking=findViewById(R.id.computerBooking);
        ComputerAccount=findViewById(R.id.computerAccount);

        ComputerReyclerView=findViewById(R.id.computerrecyclerview);
        ComputerReyclerView.setLayoutManager(new LinearLayoutManager(this));
        ComputerReyclerView.setAdapter(new computerAdapter(ComputerName,ComputerRank,ComputerWork,ComputerRating,ComputerReview,Computerfee));

        CompFiletr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(ComputerGuidance.this, FilterActivty.class);
                startActivity(i);
            }
        });
        ComputerBooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(ComputerGuidance.this, MyBooking.class);
                startActivity(i);
            }
        });
        ComputerAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(ComputerGuidance.this,Account_Profile.class);
                startActivity(i);
            }
        });



    }
}
