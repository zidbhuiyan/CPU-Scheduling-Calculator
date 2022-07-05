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

public class sjfnp extends AppCompatActivity {

    EditText sjf_at,sjf_bt;
    Button solve_sjf;
    ScrollView sjf_view;
    TextView awtp,attp;

    EditText[] gannChartArray = new EditText[9];
    EditText[] ctArray = new EditText[10];
    TextView[] wtp = new TextView[9];
    TextView[] ttp = new TextView[9];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sjfnp);

        sjf_at = (EditText) findViewById(R.id.sjf_at);
        sjf_bt = (EditText) findViewById(R.id.sjf_bt);

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

        solve_sjf = (Button) findViewById(R.id.solve_sjf);

        sjf_view = (ScrollView) findViewById(R.id.sjf_view);

        sjf_at.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                sjf_view.setVisibility(View.GONE);
                sjf_view.setVisibility(View.GONE);
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

        sjf_bt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                sjf_view.setVisibility(View.GONE);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        solve_sjf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    InputMethodManager imm = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
                } catch (Exception e) {
                    // TODO: handle exception
                }
                String sjf_at_str =  sjf_at.getText().toString();

                String sjf_bt_str =  sjf_bt.getText().toString();

                int[] at = method(sjf_at_str);
                int[] bt = method(sjf_bt_str);
                int numberOfProcesses = at.length;

                int pid[] = new int[numberOfProcesses];
                int ct[] = new int[numberOfProcesses];
                int ta[] = new int[numberOfProcesses];
                int wt[] = new int[numberOfProcesses];

                int f[] = new int[numberOfProcesses];

                int st=0, tot=0;
                float avgwt=0, avgta=0;

                for(int i=0;i<numberOfProcesses;i++)
                {
                    pid[i] = i+1;
                    f[i] = 0;
                }

                while(true)
                {
                    int c=numberOfProcesses, min = 999999;

                    if (tot == numberOfProcesses)
                        break;

                    for (int i=0; i<numberOfProcesses; i++)
                    {

                        if ((at[i] <= st) && (f[i] == 0) && (bt[i]<min))
                        {
                            min=bt[i];
                            c=i;
                        }
                    }
                    if (c==numberOfProcesses)
                        st++;
                    else
                    {

                        ct[c]=st+bt[c];
                        st+=bt[c];
                        ta[c]=ct[c]-at[c];
                        wt[c]=ta[c]-bt[c];
                        f[c]=1;
                        pid[tot] = c + 1;
                        tot++;
                    }
                }

                sjf_view.setVisibility(View.VISIBLE);

                for(int i=0;i<numberOfProcesses;i++)
                {
                    avgwt+= wt[i];
                    avgta+= ta[i];

                }

                int temp;
                for (int i = 0; i < numberOfProcesses; i++) {
                    for (int j = i+1; j < numberOfProcesses; j++) {

                        if(wt[i] > wt[j]) {
                            temp = wt[i];
                            wt[i] = wt[j];
                            wt[j] = temp;
                        }

                        if(ta[i] > ta[j]){
                            temp = ta[i];
                            ta[i] = ta[j];
                            ta[j] = temp;
                        }

                        if(at[i] > at[j]){
                            temp = at[i];
                            at[i] = at[j];
                            at[j] = temp;
                        }
                        if(ct[i] > ct[j]){
                            temp = ct[i];
                            ct[i] = ct[j];
                            ct[j] = temp;
                        }
                    }
                }
                ctArray[0].setVisibility(View.VISIBLE);
                ctArray[0].setText(String.valueOf(at[0]));
                for(int i=0;i<numberOfProcesses;i++)
                {
                    System.out.print(pid[i] + " ");
                    gannChartArray[i].setText("P"+pid[i]);
                    gannChartArray[i].setVisibility(View.VISIBLE);

                    ttp[i].setText("P"+pid[i]+" Turnaround time "+ta[i]);
                    ttp[i].setVisibility(View.VISIBLE);

                    wtp[i].setText("P"+pid[i]+" waiting time "+wt[i]);
                    wtp[i].setVisibility(View.VISIBLE);

                    ctArray[i+1].setVisibility(View.VISIBLE);
                    ctArray[i+1].setText(String.valueOf(ct[i]));
                }

                awtp.setText("Average Waiting Time: "+(avgwt/numberOfProcesses));
                awtp.setVisibility(View.VISIBLE);

                attp.setText("Average Turnaround Time: "+(avgta/numberOfProcesses));
                attp.setVisibility(View.VISIBLE);
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