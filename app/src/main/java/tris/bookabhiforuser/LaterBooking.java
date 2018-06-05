package tris.bookabhiforuser;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LaterBooking extends AppCompatActivity {
TextView NamelaterBooking,SebiExpert,LongtermInvestment;
Button ProceedButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_later_booking);

        NamelaterBooking=findViewById(R.id.nameinlatertime);
        SebiExpert=findViewById(R.id.sebiexpert);
        LongtermInvestment=findViewById(R.id.longterminvestment);
        ProceedButton=findViewById(R.id.proceedButton);
        ProceedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(LaterBooking.this,Payment.class);
                startActivity(i);
            }
        });
    }
}
