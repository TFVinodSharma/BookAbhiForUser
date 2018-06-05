package tris.bookabhiforuser;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Dell on 6/4/2018.
 */

public class PhysioAdapter extends RecyclerView.Adapter<PhysioAdapter.Versioview> {
    private String [] data1;
    private String [] data2;
    private String [] data3;
    private String [] data4;
    private String [] data5;
    private String [] data6;

    public PhysioAdapter(String[]data1,String[]data2,String[]data3,String[]data4,String[]data5,String[]data6){
        this.data1=data1;
        this.data2=data2;
        this.data3=data3;
        this.data4=data4;
        this.data5=data5;
        this.data6=data6;

    }

    @Override
    public Versioview onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.new_physiotherapy,parent,false);

        return new Versioview(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Versioview holder, int position) {
        String physiopnd=data1[position];
        holder.tv.setText(physiopnd);
        String physiornk=data2[position];
        holder.tv1.setText(physiornk);
        String physiowrk=data3[position];
        holder.tv2.setText(physiowrk);
        String physiortg=data4[position];
        holder.tv3.setText(physiortg);
        String physiorev=data5[position];
        holder.tv4.setText(physiorev);
        String physiofee=data6[position];
        holder.tv5.setText(physiofee);

    }

    @Override
    public int getItemCount() {
        return data1.length;
    }

    public class Versioview extends RecyclerView.ViewHolder {
        TextView tv,tv1,tv2,tv3,tv4,tv5;


        public Versioview(View itemView) {
            super(itemView);
            tv=itemView.findViewById(R.id.physioName);
            tv1=itemView.findViewById(R.id.physioRank);
            tv2=itemView.findViewById(R.id.physioWork);
            tv3=itemView.findViewById(R.id.physioRating);
            tv4=itemView.findViewById(R.id.physioReview);
            tv5=itemView.findViewById(R.id.physioFee);

        }
    }
}
