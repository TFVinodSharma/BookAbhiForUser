package tris.bookabhiforuser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class HelpActivity extends AppCompatActivity {
    Button Call,Chat,Email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        Call=findViewById(R.id.call);
        Chat=findViewById(R.id.chat);
        Email=findViewById(R.id.email);
    }
}
