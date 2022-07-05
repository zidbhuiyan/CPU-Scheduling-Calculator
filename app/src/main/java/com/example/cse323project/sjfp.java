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

public class sjfp extends AppCompatActivity {

    EditText sjfp_at,sjfp_bt;
    Button solve_sjfp;
    ScrollView sjfp_view;
    TextView awtp,attp;

    EditText[] gannChartArray = new EditText[18];
    EditText[] ctArray = new EditText[20];
    TextView[] wtp = new TextView[9];
    TextView[] ttp = new TextView[9];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sjfp);

        sjfp_at = (EditText) findViewById(R.id.sjfp_at);
        sjfp_bt = (EditText) findViewById(R.id.sjfp_bt);

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

        solve_sjfp = (Button) findViewById(R.id.solve_sjfp);

        sjfp_view = (ScrollView) findViewById(R.id.sjfp_view);

        sjfp_at.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                sjfp_view.setVisibility(View.GONE);
                sjfp_view.setVisibility(View.GONE);
                for(int i = 0; i<9; i++){
                    wtp[i].setVisibility(View.GONE);
                    ttp[i].setVisibility(View.GONE);
                    gannChartArray[i].setVisibility(View.GONE);
                }

                for(int i = 0; i<10; i++){
                    ctArray[i].setVisibility(View.GONE);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        sjfp_bt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                sjfp_view.setVisibility(View.GONE);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        solve_sjfp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    InputMethodManager imm = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
                } catch (Exception e) {
                    // TODO: handle exception
                }
                String sjfp_at_str =  sjfp_at.getText().toString();

                String sjfp_bt_str =  sjfp_bt.getText().toString();

                int[] at = method(sjfp_at_str);
                int[] bt = method(sjfp_bt_str);
                int numberOfProcesses = at.length;

                int pid[] = new int[numberOfProcesses];
                int ta[] = new int[numberOfProcesses];
                int wt[] = new int[numberOfProcesses];
                int cct[] = new int[numberOfProcesses];
                int nrt[] = new int[numberOfProcesses];
                int rt[] = new int[numberOfProcesses];
                int temp_at[] = new int[numberOfProcesses];

                int nf[] = new int[numberOfProcesses];
                int f[] = new int[numberOfProcesses];

                int nst=0, ntot=0,nnp=numberOfProcesses,ntp=0,nz=0,nq=0;
                int st=0, tot=0,np=numberOfProcesses,tp=0,z=0,q=0;
                float avgwt=0, avgta=0;

                for(int i=0;i<numberOfProcesses;i++)
                {
                    pid[i] = i+1;
                    nf[i] = 0;
                    f[i] = 0;
                    nrt[i] = bt[i];
                    rt[i] = bt[i];
                    temp_at[i] = at[i];
                }

                int tempo;
                for (int i = 0; i < numberOfProcesses; i++) {
                    for (int j = i+1; j < numberOfProcesses; j++) {

                        if(temp_at[i] > temp_at[j]) {
                            tempo = temp_at[i];
                            temp_at[i] = temp_at[j];
                            temp_at[j] = tempo;
                        }
                    }
                }

                while(true)
                {
                    int nc=numberOfProcesses, nmin = 999999;

                    if (nnp == 0)
                        break;

                    for (int ni=0; ni<numberOfProcesses; ni++)
                    {

                        if ((at[ni] <= nst) && (nf[ni] == 0) && (nrt[ni]<nmin))
                        {
                            nmin=nrt[ni];
                            nc=ni;
                        }
                    }
                    if (nc==numberOfProcesses)
                        nst++;
                    else
                    {

                        if(nz < numberOfProcesses-1){
                            nq=temp_at[nz+1]-temp_at[nz];
                        }

                        if(nrt[nc]>nq && nz < numberOfProcesses-1){
                            nst+=nq;
                            nrt[nc] = nrt[nc] - nq;
                            nf[nc]=0;
                            ntp++;
                            nz++;
                        }


                        else {

                            nst+=nrt[nc];
                            nrt[nc]= nrt[nc] - nrt[nc];
                            nf[nc]=1;
                            nnp--;
                            ntp++;

                        }

                        ntot++;

                        if(ntot == numberOfProcesses){
                            ntot = 0;
                        }
                    }
                }

                int ct[] = new int[ntp];
                int newpid[] = new int[ntp];

                while(true)
                {
                    int c=numberOfProcesses, min = 999999,minat=99999;

                    if (np == 0)
                        break;

                    for (int i=0; i<numberOfProcesses; i++)
                    {

                        if ((at[i] <= st) && (f[i] == 0) && (rt[i]<=min))
                        {
                            if(rt[i]<min){
                                min=rt[i];
                                minat=at[i];
                                c=i;
                            }

                            else if(rt[i] == min){
                               if(at[i] < minat){
                                   min=rt[i];
                                   minat=at[i];
                                   c=i;
                               }
                            }

                        }
                    }
                    if (c==numberOfProcesses)
                        st++;
                    else
                    {

                        if(z < numberOfProcesses-1){
                            q=temp_at[z+1]-temp_at[z];
                        }

                        if(rt[c]>q && z < numberOfProcesses-1){
                            st+=q;
                            rt[c] = rt[c] - q;
                            newpid[tp] = pid[c];
                            ct[tp]=st;
                            cct[c]=st;
                            f[c]=0;
                            tp++;
                            z++;

                        }

                        else {

                            st+=rt[c];
                            ct[tp]=st;
                            cct[c]=st;
                            rt[c]= rt[c] - rt[c];
                            newpid[tp] = c + 1;
                            f[c]=1;
                            np--;
                            tp++;
                        }

                        tot++;
                        if(tot == numberOfProcesses){
                            tot = 0;
                        }
                    }
                }

                sjfp_view.setVisibility(View.VISIBLE);



                for(int i = 0;i<numberOfProcesses;i++){
                    ta[i]=cct[i]-at[i];
                    wt[i]=ta[i]-bt[i];

                    ttp[i].setText("P"+pid[i]+" Turnaround time "+ta[i]);
                    ttp[i].setVisibility(View.VISIBLE);

                    wtp[i].setText("P"+pid[i]+" waiting time "+wt[i]);
                    wtp[i].setVisibility(View.VISIBLE);
                }

                for(int p=0;p<tp;p++){
                    gannChartArray[p].setText("P"+newpid[p]);
                    gannChartArray[p].setVisibility(View.VISIBLE);
                }

                for(int i=0;i<numberOfProcesses;i++)
                {
                    avgwt+= wt[i];
                    avgta+= ta[i];

                }

                awtp.setText("Average Waiting Time: "+(avgwt/numberOfProcesses));
                awtp.setVisibility(View.VISIBLE);

                attp.setText("Average Turnaround Time: "+(avgta/numberOfProcesses));
                attp.setVisibility(View.VISIBLE);

                ctArray[0].setVisibility(View.VISIBLE);
                ctArray[0].setText(String.valueOf(temp_at[0]));


                if(tp<10){

                    for(int i=0;i<tp;i++){
                        ctArray[i+1].setVisibility(View.VISIBLE);
                        ctArray[i+1].setText(String.valueOf(ct[i]));

                    }

                }
                else{
                    for(int i=0;i<=tp;i++){
                        if(i<9){
                            ctArray[i+1].setVisibility(View.VISIBLE);
                            ctArray[i+1].setText(String.valueOf(ct[i]));}
                        else if(i==9){
                            ctArray[i+1].setVisibility(View.VISIBLE);
                            ctArray[i+1].setText(String.valueOf(ct[i-1]));
                        }

                        else if(i>9){
                            ctArray[i+1].setVisibility(View.VISIBLE);
                            ctArray[i+1].setText(String.valueOf(ct[i-1]));
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