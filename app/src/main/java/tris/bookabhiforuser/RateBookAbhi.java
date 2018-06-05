package tris.bookabhiforuser;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class RateBookAbhi extends AppCompatActivity {
RatingBar Rate;
Button RatingButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate_book_abhi);
        Rate=findViewById(R.id.giverating);
        RatingButton=findViewById(R.id.reviewratingbutton);
        RatingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    float no= Rate.getRating();
                    Toast.makeText(RateBookAbhi.this, "choosen "+no, Toast.LENGTH_SHORT).show();

                    LayerDrawable stars = (LayerDrawable) Rate.getProgressDrawable();
                    stars.getDrawable(2).setColorFilter(Color.YELLOW, PorterDuff.Mode.SRC_ATOP);

                }
        });
    }
}
