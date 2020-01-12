package com.example.admin.mapboxthesis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.android.volley.RequestQueue;

public class Reading_Activity extends AppCompatActivity {

    public static RequestQueue mQueue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reading_);

        /**
         * Device 1
         */
        Button temp_1 = findViewById(R.id.temperature);
        Button hum_1 = findViewById(R.id.humidity);
        Button CO_1 = findViewById(R.id.carb_monox);
        Button CO2_1 = findViewById(R.id.carb_diox);
        Button PM = findViewById(R.id.pm);
        Button dsh1 = findViewById(R.id.dashboard1);

        temp_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTemp1();
            }
        });
        hum_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHum1();
            }
        });
        CO_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCO1();
            }
        });
        CO2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCO2_1();
            }
        });
        dsh1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDash1();
            }
        });
        PM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPM();
            }
        });


        /**
         * Device 2
         */
        Button temp_2 = findViewById(R.id.temperature2);
        Button hum_2= findViewById(R.id.humidity2);
        Button CO_2 = findViewById(R.id.carb_monox2);
        Button CO2_2 = findViewById(R.id.carb_diox2);
        Button dsh2 = findViewById(R.id.dashboard2);
        Button PM_2 = findViewById(R.id.pm2);

        temp_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTemp2();
            }
        });
        hum_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHum2();
            }
        });
        CO_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCO2();
            }
        });
        CO2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCO2_2();
            }
        });
        dsh2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDash2();
            }
        });
        PM_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPM2();
            }
        });


        /**
         * Device 3
         */
        Button temp_3 = findViewById(R.id.temperature3);
        Button hum_3= findViewById(R.id.humidity3);
        Button CO_3 = findViewById(R.id.carb_monox3);
        Button CO2_3 = findViewById(R.id.carb_diox3);
        Button dsh3 = findViewById(R.id.dashboard3);
        Button PM_3 = findViewById(R.id.pm3);

        temp_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTemp3();
            }
        });
        hum_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHum3();
            }
        });
        CO_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCO3();
            }
        });
        CO2_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCO2_3();
            }
        });
        dsh3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDash3();
            }
        });
        PM_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPM3();
            }
        });

    }

    /**
     * Opening of new Activities
     */

    /**
     * Device 1
     */
    public void openTemp1() {
        Intent intent = new Intent(this, temp1_chart.class);
        startActivity(intent);
    }
    public void openHum1() {
        Intent intent = new Intent(this, hum1_chart.class);
        startActivity(intent);
    }
    public void openCO1() {
        Intent intent = new Intent(this, co1_chart.class);
        startActivity(intent);
    }
    public void openCO2_1() {
        Intent intent = new Intent(this, co2_1_chart.class);
        startActivity(intent);
    }
    public void openDash1(){
        Intent intent = new Intent(this, dashboard1.class);
        startActivity(intent);
    }
    public void openPM(){
        Intent intent = new Intent(this, pm_chart.class);
        startActivity(intent);
    }


    /**
     * Device 2
     */
    public void openTemp2() {
        Intent intent = new Intent(this, temp2_chart.class);
        startActivity(intent);
    }
    public void openHum2() {
        Intent intent = new Intent(this, hum2_chart.class);
        startActivity(intent);
    }
    public void openCO2() {
        Intent intent = new Intent(this, co2_chart.class);
        startActivity(intent);
    }
    public void openCO2_2() {
        Intent intent = new Intent(this, co2_2_chart.class);
        startActivity(intent);
    }
    public void openDash2(){
        Intent intent = new Intent(this, dashboard2.class);
        startActivity(intent);
    }
    public void openPM2(){
        Intent intent = new Intent(this, pm2_chart.class);
        startActivity(intent);
    }

    /**
     * Device 3
     */    public void openTemp3() {
        Intent intent = new Intent(this, temp3_chart.class);
        startActivity(intent);
    }
    public void openHum3() {
        Intent intent = new Intent(this, hum3_chart.class);
        startActivity(intent);
    }
    public void openCO3() {
        Intent intent = new Intent(this, co3_chart.class);
        startActivity(intent);
    }
    public void openCO2_3() {
        Intent intent = new Intent(this, co2_3_chart.class);
        startActivity(intent);
    }
    public void openDash3(){
        Intent intent = new Intent(this, dashboard3.class);
        startActivity(intent);
    }
    public void openPM3(){
        Intent intent = new Intent(this, pm3_chart.class);
        startActivity(intent);
    }


}

