package tris.bookabhiforuser;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CAGuidance extends AppCompatActivity {
TextView Filter;
Button CaBooking,CaAccount;
RecyclerView CARecycler;

    public  String[] CAName={"Pt Mathura Prasad","Pt Jagannath Sharma","Pt. Ramdayal Sharma"};
    public  String[] CARank={"20 years  ex ","6 years exp","3 years exp"};
    public String[] CAWork={"All Type Of Work","Vsatu Dosh","namkarn"};
    public  String[] CARating={"4.3 Rating","4.1 Rating","4.3 Rating"};

    public  String[] CAReview={"44 Reviews","44 Reviews","44 Reviews"};
    public String[] CAfee={"Rs 500","Rs 300","Rs 200"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caguidance);
        Filter=findViewById(R.id.filter);
        CaBooking=findViewById(R.id.caBooking);
        CaAccount=findViewById(R.id.caAccount);

        CARecycler=findViewById(R.id.carecycler);
        CARecycler.setLayoutManager(new LinearLayoutManager(this));
        CARecycler.setAdapter(new CAAdapter(CAName,CARank,CAWork,CARating,CAReview,CAfee));

        Filter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(CAGuidance.this,FilterActivty.class);
                startActivity(i);
            }
        });
        CaBooking.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i=new Intent(CAGuidance.this, MyBooking.class);
                startActivity(i);
            }
        });
        CaAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(CAGuidance.this,Account_Profile.class);
                startActivity(i);
            }
        });


    }
}
