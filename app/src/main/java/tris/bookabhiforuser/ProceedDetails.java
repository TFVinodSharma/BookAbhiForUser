package tris.bookabhiforuser;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ProceedDetails extends AppCompatActivity {

    TextView FillName,Fillemail,FillNumber;
    EditText FillMode,FillQuery;
    Button Proceed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proceed_details);

        FillName=findViewById(R.id.fillname);
        Fillemail=findViewById(R.id.fillemail);
        FillNumber=findViewById(R.id.fillnumber);
        FillMode=findViewById(R.id.fillmode);
        FillQuery=findViewById(R.id.fillquery);
        Proceed=findViewById(R.id.proceedpayment);
        Proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent (ProceedDetails.this,Payment.class);
                startActivity(i);
            }
        });

    }
}
