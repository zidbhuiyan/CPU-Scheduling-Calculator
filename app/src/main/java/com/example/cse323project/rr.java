package com.example.cse323project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class rr extends AppCompatActivity {

    EditText rr_at,rr_bt,rr_q;
    Button solve_rr;
    ScrollView rr_view;
    TextView awtp,attp;

    EditText[] gannChartArray = new EditText[18];
    EditText[] ctArray = new EditText[20];
    TextView[] wtp = new TextView[9];
    TextView[] ttp = new TextView[9];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rr);

        rr_at = (EditText) findViewById(R.id.rr_at);
        rr_bt = (EditText) findViewById(R.id.rr_bt);
        rr_q = (EditText) findViewById(R.id.rr_q);

        awtp = (TextView) findViewById(R.id.paw);
        attp = (TextView) findViewById(R.id.ptw);

        gannChartArray[0] = (EditText) findViewById(R.id.t1);
        gannChartArray[1] = (EditText) findViewById(R.id.t2);
        gannChartArray[2] = (EditText) findViewById(R.id.t3);
        gannChartArray[3] = (EditText) findViewById(R.id.t4);
        gannChartArray[4] = (EditText) findViewById(R.id.t5);
        gannChartArray[5] = (EditText) findViewById(R.id.t6);
        gannChartArray[6] = (EditText) findViewById(R.id.t7);
        gannChartArray[7] = (EditText) findViewById(R.id.t8);
        gannChartArray[8] = (EditText) findViewById(R.id.t9);
        gannChartArray[9] = (EditText) findViewById(R.id.t10);
        gannChartArray[10] = (EditText) findViewById(R.id.t11);
        gannChartArray[11] = (EditText) findViewById(R.id.t12);
        gannChartArray[12] = (EditText) findViewById(R.id.t13);
        gannChartArray[13] = (EditText) findViewById(R.id.t14);
        gannChartArray[14] = (EditText) findViewById(R.id.t15);
        gannChartArray[15] = (EditText) findViewById(R.id.t16);
        gannChartArray[16] = (EditText) findViewById(R.id.t17);
        gannChartArray[17] = (EditText) findViewById(R.id.t18);

        ctArray[0] = (EditText) findViewById(R.id.c1);
        ctArray[1] = (EditText) findViewById(R.id.c2);
        ctArray[2] = (EditText) findViewById(R.id.c3);
        ctArray[3] = (EditText) findViewById(R.id.c4);
        ctArray[4] = (EditText) findViewById(R.id.c5);
        ctArray[5] = (EditText) findViewById(R.id.c6);
        ctArray[6] = (EditText) findViewById(R.id.c7);
        ctArray[7] = (EditText) findViewById(R.id.c8);
        ctArray[8] = (EditText) findViewById(R.id.c9);
        ctArray[9] = (EditText) findViewById(R.id.c10);
        ctArray[10] = (EditText) findViewById(R.id.c11);
        ctArray[11] = (EditText) findViewById(R.id.c12);
        ctArray[12] = (EditText) findViewById(R.id.c13);
        ctArray[13] = (EditText) findViewById(R.id.c14);
        ctArray[14] = (EditText) findViewById(R.id.c15);
        ctArray[15] = (EditText) findViewById(R.id.c16);
        ctArray[16] = (EditText) findViewById(R.id.c17);
        ctArray[17] = (EditText) findViewById(R.id.c18);
        ctArray[18] = (EditText) findViewById(R.id.c19);
        ctArray[19] = (EditText) findViewById(R.id.c20);

        wtp[0] = (TextView) findViewById(R.id.pw1);
        wtp[1] = (TextView) findViewById(R.id.pw2);
        wtp[2] = (TextView) findViewById(R.id.pw3);
        wtp[3] = (TextView) findViewById(R.id.pw4);
        wtp[4] = (TextView) findViewById(R.id.pw5);
        wtp[5] = (TextView) findViewById(R.id.pw6);
        wtp[6] = (TextView) findViewById(R.id.pw7);
        wtp[7] = (TextView) findViewById(R.id.pw8);
        wtp[8] = (TextView) findViewById(R.id.pw9);

        ttp[0] = (TextView) findViewById(R.id.tw1);
        ttp[1] = (TextView) findViewById(R.id.tw2);
        ttp[2] = (TextView) findViewById(R.id.tw3);
        ttp[3] = (TextView) findViewById(R.id.tw4);
        ttp[4] = (TextView) findViewById(R.id.tw5);
        ttp[5] = (TextView) findViewById(R.id.tw6);
        ttp[6] = (TextView) findViewById(R.id.tw7);
        ttp[7] = (TextView) findViewById(R.id.tw8);
        ttp[8] = (TextView) findViewById(R.id.tw9);

        solve_rr = (Button) findViewById(R.id.solve_rr);

        rr_view = (ScrollView) findViewById(R.id.rr_view);

        rr_at.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                rr_view.setVisibility(View.GONE);
                rr_view.setVisibility(View.GONE);
                for(int i = 0; i<wtp.length; i++){
                    wtp[i].setVisibility(View.GONE);
                    ttp[i].setVisibility(View.GONE);
                }

                for(int i = 0; i<ctArray.length; i++){
                    ctArray[i].setVisibility(View.GONE);
                }

                for(int i = 0; i<gannChartArray.length; i++){
                    gannChartArray[i].setVisibility(View.GONE);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        rr_bt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                rr_view.setVisibility(View.GONE);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        rr_q.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                rr_view.setVisibility(View.GONE);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        solve_rr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    InputMethodManager imm = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
                } catch (Exception e) {
                    // TODO: handle exception
                }
                String rr_at_str =  rr_at.getText().toString();

                String rr_bt_str =  rr_bt.getText().toString();

                String rr_q_str =  rr_q.getText().toString();

                int[] at = method(rr_at_str);
                int[] bt = method(rr_bt_str);
                int q = Integer.parseInt(rr_q_str);
                int numberOfProcesses = at.length;

                int pid[] = new int[numberOfProcesses];

                int ta[] = new int[numberOfProcesses];
                int cct[] = new int[numberOfProcesses];
                int wt[] = new int[numberOfProcesses];
                int rt[] = new int[numberOfProcesses];
                int nrt[] = new int[numberOfProcesses];

                float avgwt=0, avgta=0;

                int rp = numberOfProcesses;
                int nrp = numberOfProcesses;

                int time=0;
                int tp=0;


                for(int i=0;i<numberOfProcesses;i++)
                {
                    pid[i] = i+1;
                }

                int temp;
                for (int i = 0; i < numberOfProcesses; i++) {
                    for (int j = i+1; j < numberOfProcesses; j++) {

                        if(at[i] > at[j]) {
                            temp = at[i];
                            at[i] = at[j];
                            at[j] = temp;

                            temp = pid[i];
                            pid[i] = pid[j];
                            pid[j] = temp;
                            temp = bt[i];
                            bt[i] = bt[j];
                            bt[j] = temp;
                        }
                    }
                }

                for(int i=0;i<numberOfProcesses;i++)
                {
                    rt[i] = bt[i];
                    nrt[i] = bt[i];
                }

                int x=0;
                while (nrp!=0){
                    if(nrt[x]>q){
                        nrt[x] = nrt[x] - q;
                        tp++;
                    }

                    else if(nrt[x]<=q && nrt[x] > 0){
                        nrt[x]= nrt[x] - nrt[x];
                        nrp--;
                        tp++;
                    }

                    x++;
                    if(x == numberOfProcesses){
                        x = 0;
                    }
                }


                int ct[] = new int[tp];
                int newpid[] = new int[tp];

                int i=0;


                for(int z=0;z<numberOfProcesses;z++){
                    wt[z]=0;
                    ta[z]=0;
                }


                int y=0;

                rr_view.setVisibility(View.VISIBLE);

                whil (rp!=0){

                    if(rt[i]>q){
                        rt[i] = rt[i] - q;
                        time += q;
                        ct[y]=time;
                        cct[i]=time;
                        newpid[y]=pid[i];
                        y++;
                    }

                    else if(rt[i]<=q && rt[i] > 0){
                        time+=rt[i];
                        ct[y]=time;
                        cct[i]=time;
                        newpid[y]=pid[i];
                        rt[i]= rt[i] - rt[i];
                        rp--;
                        y++;
                    }

                    i++;

                    if(i == numberOfProcesses){
                        i = 0;
                    }
                }

                for(int z = 0;z<numberOfProcesses;z++){
                    ta[z]=cct[z]-at[z];
                    wt[z]=ta[z]-bt[z];

                    ttp[z].setText("P"+pid[z]+" Turnaround time "+ta[z]);
                    ttp[z].setVisibility(View.VISIBLE);

                    wtp[z].setText("P"+pid[z]+" waiting time "+wt[z]);
                    wtp[z].setVisibility(View.VISIBLE);
                }

                for(int z=0;z<numberOfProcesses;z++)
                {
                    avgwt+= wt[z];
                    avgta+= ta[z];

                }

                awtp.setText("Average Waiting Time: "+(avgwt/numberOfProcesses));
                awtp.setVisibility(View.VISIBLE);

                attp.setText("Average Turnaround Time: "+(avgta/numberOfProcesses));
                attp.setVisibility(View.VISIBLE);

                ctArray[0].setVisibility(View.VISIBLE);
                ctArray[0].setText(String.valueOf(at[0]));

                for(int z=0;z<tp;z++){
                    gannChartArray[z].setText("P"+newpid[z]);
                    gannChartArray[z].setVisibility(View.VISIBLE);
                }


                if(tp<10){

                    for(int z=0;z<tp;z++){
                            ctArray[z+1].setVisibility(View.VISIBLE);
                            ctArray[z+1].setText(String.valueOf(ct[z]));

                    }

                }
                else{
                    for(int z=0;z<=tp;z++){
                        if(z<9){
                            ctArray[z+1].setVisibility(View.VISIBLE);
                            ctArray[z+1].setText(String.valueOf(ct[z]));}
                        else if(z==9){
                            ctArray[z+1].setVisibility(View.VISIBLE);
                            ctArray[z+1].setText(String.valueOf(ct[z-1]));
                        }

                        else if(z>9){
                            ctArray[z+1].setVisibility(View.VISIBLE);
                            ctArray[z+1].setText(String.valueOf(ct[z-1]));
                        }
                    }
                }

            }
        });
    }

    private int[] method(String str) {
        String[] splitArray = str.split(" ");
        int[] array = new int[splitArray.length];

        for (int i = 0; i < splitArray.length; i++) {
            array[i] = Integer.parseInt(splitArray[i]);
        }

        return array;
    }
}