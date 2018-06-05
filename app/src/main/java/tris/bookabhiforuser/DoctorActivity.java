package tris.bookabhiforuser;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DoctorActivity extends AppCompatActivity {
TextView DoctorFilter;
Button DoctorBooking,DoctorAccount;
RecyclerView DoctorRecyclerView;


    public  String[] DoctorName={"Dr. Mathura Prasad","Dr.Jagannath Sharma","Dr. Ramdayal Sharma"};
    public  String[] DoctorRank={"20 years  ex ","6 years exp","3 years exp"};
    public String[] DoctorWork={"All Type Of Work","Heart Transplant","Kidney Tarnsplant"};
    public  String[] DoctorRating={"4.3 Rating","4.1 Rating","4.3 Rating"};

    public  String[] DoctorReview={"44 Reviews","44 Reviews","44 Reviews"};
    public String[] Doctorfee={"Rs 500","Rs 300","Rs 200"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor);
        DoctorFilter=findViewById(R.id.doctorFilter);
        DoctorBooking=findViewById(R.id.doctorBooking);
        DoctorAccount=findViewById(R.id.doctorAccount);

        DoctorRecyclerView=findViewById(R.id.docrecylerview);

        DoctorRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        DoctorRecyclerView.setAdapter(new DoctorAdapter(DoctorName,DoctorRank,DoctorWork,DoctorRating,DoctorReview,Doctorfee));





        DoctorAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(DoctorActivity.this,Account_Profile.class);
                startActivity(i);
            }
        });

        DoctorFilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(DoctorActivity.this, FilterActivty.class);
                startActivity(i);
            }
        });
        DoctorBooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(DoctorActivity.this, MyBooking.class);
                startActivity(i);
            }
        });


    }
}
