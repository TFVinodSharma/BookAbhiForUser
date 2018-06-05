package tris.bookabhiforuser;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CMAGiudance extends AppCompatActivity {
TextView CmaFilter;
Button CmaBooking,CmaAccount;
RecyclerView CMaReccylerview;
    public  String[] CMaName={"Pt Mathura Prasad","Pt Jagannath Sharma","Pt. Ramdayal Sharma"};
    public  String[] CMaRank={"20 years  ex ","6 years exp","3 years exp"};
    public String[] CMaWork={"All Type Of Work","Vsatu Dosh","namkarn"};
    public  String[] CMaRating={"4.3 Rating","4.1 Rating","4.3 Rating"};

    public  String[] CMaReview={"44 Reviews","44 Reviews","44 Reviews"};
    public String[] CMafee={"Rs 500","Rs 300","Rs 200"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cmagiudance);
        CmaFilter=findViewById(R.id.cmaFilter);
        CmaBooking=findViewById(R.id.cmaBooking);
        CmaAccount=findViewById(R.id.cmaAccount);

        CMaReccylerview=findViewById(R.id.cmalistrecycler);
        CMaReccylerview.setLayoutManager(new LinearLayoutManager(this));
        CMaReccylerview.setAdapter(new CmaAdapter(CMaName,CMaRank,CMaWork,CMaRating,CMaReview,CMafee));

        CmaFilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(CMAGiudance.this, FilterActivty.class);
                startActivity(i);
            }
        });
        CmaBooking.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i=new Intent(CMAGiudance.this, MyBooking.class);
                startActivity(i);
            }
        });
        CmaAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(CMAGiudance.this,Account_Profile.class);
                startActivity(i);
            }
        });


    }
}
