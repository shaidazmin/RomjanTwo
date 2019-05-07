package com.hatbd.romjantwo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String [] romjan;
    private ListView listView;

    private TextView seheri, iftari;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //setTitle("রমজানের সময় সূচি");

        listView = findViewById(R.id.list_view);

        seheri = findViewById(R.id.seheri_text_view);
        iftari = findViewById(R.id.iftari_text_view);

        romjan = getResources().getStringArray(R.array.romjan_date);

        ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(),android.R.layout.simple_expandable_list_item_1,romjan);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    case 0:

                        seheri.setText("সেহেরির শেষ\n সময়\n 4 : 52 am \n\n ফজরের আজান \n 3 : 58 am");
                        iftari.setText("ইফতারির \n সময়\n6 : 34 pm");

                    break;

                    case 1:

                        seheri.setText("সেহেরির শেষ\n সময়\n 4 : 51 am \n\n ফজরের আজান \n 3 : 57 am");
                        iftari.setText("ইফতারির \n সময়\n6 : 34 pm");

                    break;

                    case 2:

                        seheri.setText("সেহেরির শেষ\n সময়\n 4 : 50 am \n\n ফজরের আজান \n 3 : 56 am");
                        iftari.setText("ইফতারির \n সময়\n 6 : 35 pm");

                    break;

                    case 3:
                        
                        seheri.setText("সেহেরির শেষ\n সময়\n 4 : 49 am \n\n ফজরের আজান \n 3 : 56 am");
                        iftari.setText("ইফতারির \n সময়\n6 : 36 pm");
                    break;
                    case 4:
                        seheri.setText("সেহেরির শেষ\n সময়\n 4 : 49 am \n\n ফজরের আজান \n 3 : 55 am");
                        iftari.setText("ইফতারির \n সময়\n6 : 36 pm");
                    break;
                    case 5:
                        seheri.setText("সেহেরির শেষ\n সময়\n 4 : 48 am \n\n ফজরের আজান \n 3 : 57 am");
                        iftari.setText("ইফতারির \n সময়\n 6 : 36 pm");
                    break;
                }
            }
        });
    }
}
