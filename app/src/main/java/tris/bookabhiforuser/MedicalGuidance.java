package tris.bookabhiforuser;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MedicalGuidance extends AppCompatActivity {
TextView MedicalFilter;
Button MedicalBooking,MedicalAccount;

RecyclerView MedicalRecycler;
    public  String[] MedicalName={"Pt Mathura Prasad","Pt Jagannath Sharma","Pt. Ramdayal Sharma"};
    public  String[] MedicalRank={"20 years  ex ","6 years exp","3 years exp"};
    public String[] MedicalWork={"All Type Of Work","Vsatu Dosh","namkarn"};
    public  String[] MedicalRating={"4.3 Rating","4.1 Rating","4.3 Rating"};

    public  String[] MedicalReview={"44 Reviews","44 Reviews","44 Reviews"};
    public String[] Medicalfee={"Rs 500","Rs 300","Rs 200"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical_guidance);
        MedicalFilter=findViewById(R.id.medcalFilter);
        MedicalBooking=findViewById(R.id.medicalBooking);

        MedicalAccount=findViewById(R.id.medicalAccount);


        MedicalRecycler=findViewById(R.id.medicalrecycler);
        MedicalRecycler.setLayoutManager(new LinearLayoutManager(this));
        MedicalRecycler.setAdapter(new MedicalAdapter(MedicalName,MedicalRank,MedicalWork,MedicalRating,MedicalReview,Medicalfee));

        MedicalAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MedicalGuidance.this,Account_Profile.class);
                startActivity(i);
            }
        });

        MedicalFilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MedicalGuidance.this, FilterActivty.class);
                startActivity(i);
            }
        });
        MedicalBooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MedicalGuidance.this, MyBooking.class);
                startActivity(i);
            }
        });


    }
}
