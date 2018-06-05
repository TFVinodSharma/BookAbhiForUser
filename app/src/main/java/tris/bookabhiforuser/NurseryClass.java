package tris.bookabhiforuser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NurseryClass extends AppCompatActivity {
TextView NurseryFilter;
Button  NurseryBooking,NurseryAccount;

RecyclerView NurRecyclerView;

    public  String[] NurName={"Mrs. Rathi","Ms . Divya","Ms. rama"};
    public  String[] NurRank={"5 years  ex ","6 years exp","3 years exp"};
    public String[] NurWork={"All Type Of Work","play","Speacking","Reading"};
    public  String[] NurRating={"4.3 Rating","4.1 Rating","4.3 Rating","4.3 Rating"};

    public  String[] NurReview={"44 Reviews","44 Reviews","44 Reviews","44 Reviews"};
    public String[] Nurfee={"Rs 500","Rs 300","Rs 200","Rs 200"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nursery_class);
        NurseryFilter=findViewById(R.id.nurFilter);
        NurseryBooking=findViewById(R.id.nurseryBooking);
        NurseryAccount=findViewById(R.id.nurseryAccount);

        NurRecyclerView=findViewById(R.id.nurrecyclerview);
        NurRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        NurRecyclerView.setAdapter(new NurseryAdapter(NurName,NurRank,NurWork,NurRating,NurReview,Nurfee));


        NurseryAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(NurseryClass.this,Account_Profile.class);
                startActivity(i);
            }
        });

        NurseryFilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(NurseryClass.this, FilterActivty.class);
                startActivity(i);
            }
        });
        NurseryBooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(NurseryClass.this, MyBooking.class);
                startActivity(i);
            }
        });


    }
}
