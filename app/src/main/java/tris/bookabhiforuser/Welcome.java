package tris.bookabhiforuser;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Welcome extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 3000;

    TextView NameofWelcomePerson;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        NameofWelcomePerson=findViewById(R.id.nameofwelcomeperson);

/*
        SharedPreferences sp=getSharedPreferences("My_Data",MODE_PRIVATE);
        if (sp.getString("c",null))
*/

/*
        Bundle bundle=getIntent().getExtras();
        String a=bundle.getString("c");
        NameofWelcomePerson.setText(a);
*/


        new Handler().postDelayed(new Runnable() {


            @Override
            public void run() {
                Intent i = new Intent(Welcome.this, Home.class);
                startActivity(i);

                finish();
            }
        }, SPLASH_TIME_OUT);



    }
}
