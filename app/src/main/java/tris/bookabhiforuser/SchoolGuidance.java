package tris.bookabhiforuser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SchoolGuidance extends AppCompatActivity {
TextView SchoolFilter;
Button SchoolGuidance,SchoolAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school_guidance);
        SchoolFilter=findViewById(R.id.schoolFilter);
        SchoolGuidance=findViewById(R.id.schoolBooking);
        SchoolGuidance=findViewById(R.id.schoolAccount);

        SchoolAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(SchoolGuidance.this,Account_Profile.class);
                startActivity(i);
            }
        });

        SchoolFilter.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i=new Intent(SchoolGuidance.this, FilterActivty.class);
                startActivity(i);
            }
        });
        SchoolGuidance.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i=new Intent(SchoolGuidance.this, MyBooking.class);
                startActivity(i);
            }
        });


    }
}
