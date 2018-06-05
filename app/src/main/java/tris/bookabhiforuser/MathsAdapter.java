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

public class MathsAdapter extends RecyclerView.Adapter<MathsAdapter.Versioview> {

    private String [] data1;
    private String [] data2;
    private String [] data3;
    private String [] data4;
    private String [] data5;
    private String [] data6;

    public MathsAdapter(String[]data1,String[]data2,String[]data3,String[]data4,String[]data5,String[]data6){
        this.data1=data1;
        this.data2=data2;
        this.data3=data3;
        this.data4=data4;
        this.data5=data5;
        this.data6=data6;

    }

    @NonNull
    @Override
    public Versioview onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.new_maths,parent,false);

        return new Versioview(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Versioview holder, int position) {
        String mathspnd=data1[position];
        holder.tv.setText(mathspnd);
        String mathsrnk=data2[position];
        holder.tv1.setText(mathsrnk);
        String mathswrk=data3[position];
        holder.tv2.setText(mathswrk);
        String mathsrtg=data4[position];
        holder.tv3.setText(mathsrtg);
        String mathsrev=data5[position];
        holder.tv4.setText(mathsrev);
        String mathsfee=data6[position];
        holder.tv5.setText(mathsfee);

    }

    @Override
    public int getItemCount() {
        return data1.length;
    }

    public class Versioview extends RecyclerView.ViewHolder {
        TextView tv,tv1,tv2,tv3,tv4,tv5;


        public Versioview(View itemView) {
            super(itemView);
            tv=itemView.findViewById(R.id.mathsname);
            tv1=itemView.findViewById(R.id.mathsrank);
            tv2=itemView.findViewById(R.id.mathswork);
            tv3=itemView.findViewById(R.id.mathsrating);
            tv4=itemView.findViewById(R.id.mathsreviews);
            tv5=itemView.findViewById(R.id.mathsrupee);

        }
    }
}
