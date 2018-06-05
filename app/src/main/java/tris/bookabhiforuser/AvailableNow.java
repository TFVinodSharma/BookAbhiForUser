package tris.bookabhiforuser;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AvailableNow extends AppCompatActivity {
TextView NameAvailable,SEbiExpert1,LongTermInvestment1;
Button ProceedButtonSecond;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_available_now);

        NameAvailable=findViewById(R.id.nameavailable);
        SEbiExpert1=findViewById(R.id.sebiexpert1);
        LongTermInvestment1=findViewById(R.id.longterminvestment1);

        ProceedButtonSecond=findViewById(R.id.proceedButtonsecond);
        ProceedButtonSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(AvailableNow.this,Payment.class);
                startActivity(i);
            }
        });

    }
}
