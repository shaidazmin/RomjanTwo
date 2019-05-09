package com.hatbd.romjantwo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private String [] romjan;
    private ListView listView;

    private TextView seheri, iftari, dateTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //setTitle("রমজানের সময় সূচি");

        listView = findViewById(R.id.list_view);

        seheri = findViewById(R.id.seheri_text_view);
        iftari = findViewById(R.id.iftari_text_view);
        dateTextView = findViewById(R.id.textView);

        String curentDate = new SimpleDateFormat("MMM dd, YYY", Locale.getDefault()).format(new Date());
        dateTextView.setText("এখন সময়\n"+curentDate);

        romjan = getResources().getStringArray(R.array.romjan_date);

        ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(),android.R.layout.simple_expandable_list_item_1,romjan);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    case 0:
                        seheri.setText("সেহেরির শেষ\n সময়\n 3 : 52 am \n\n ফজরের আজান \n 3 : 58 am");
                        iftari.setText("ইফতারির \n সময়\n 6 : 34 pm");
                    break;
                    case 1:
                        seheri.setText("সেহেরির শেষ\n সময়\n 3 : 51 am \n\n ফজরের আজান \n 3 : 57 am");
                        iftari.setText("ইফতারির \n সময়\n 6 : 34 pm");
                    break;
                    case 2:
                        seheri.setText("সেহেরির শেষ\n সময়\n 3 : 50 am \n\n ফজরের আজান \n 3 : 56 am");
                        iftari.setText("ইফতারির \n সময়\n 6 : 35 pm");
                    break;
                    case 3:
                        seheri.setText("সেহেরির শেষ\n সময়\n 3 : 50 am \n\n ফজরের আজান \n 3 : 56 am");
                        iftari.setText("ইফতারির \n সময়\n 6 : 36 pm");
                    break;
                    case 4:
                        seheri.setText("সেহেরির শেষ\n সময়\n 3 : 49 am \n\n ফজরের আজান \n 3 : 55 am");
                        iftari.setText("ইফতারির \n সময়\n 6 : 36 pm");
                    break;
                    case 5:
                        seheri.setText("সেহেরির শেষ\n সময়\n 3 : 49 am \n\n ফজরের আজান \n 3 : 55 am");
                        iftari.setText("ইফতারির \n সময়\n 6 : 36 pm");
                    break;
                     case 6:
                        seheri.setText("সেহেরির শেষ\n সময়\n 3 : 48 am \n\n ফজরের আজান \n 3 : 54 am");
                        iftari.setText("ইফতারির \n সময়\n 6 : 36 pm");
                    break;
                     case 7:
                        seheri.setText("সেহেরির শেষ\n সময়\n 3 : 48 am \n\n ফজরের আজান \n 3 : 54 am");
                        iftari.setText("ইফতারির \n সময়\n 6 : 37 pm");
                    break;
                     case 8:
                        seheri.setText("সেহেরির শেষ\n সময়\n 3 : 47 am \n\n ফজরের আজান \n 3 : 53 am");
                        iftari.setText("ইফতারির \n সময়\n 6 : 36 pm");
                    break;
                     case 9:
                        seheri.setText("সেহেরির শেষ\n সময়\n 3 : 47 am \n\n ফজরের আজান \n 3 : 53 am");
                        iftari.setText("ইফতারির \n সময়\n 6 : 38 pm");
                    break;


                     case 10:
                        seheri.setText("সেহেরির শেষ\n সময়\n 3 : 46 am \n\n ফজরের আজান \n 3 : 52 am");
                        iftari.setText("ইফতারির \n সময়\n 6 : 38 pm");
                    break;

                     case 11:
                        seheri.setText("সেহেরির শেষ\n সময়\n 3 : 46 am \n\n ফজরের আজান \n 3 : 52 am");
                        iftari.setText("ইফতারির \n সময়\n 6 : 39 pm");
                    break;

                     case 12:
                        seheri.setText("সেহেরির শেষ\n সময়\n 3 : 45 am \n\n ফজরের আজান \n 3 : 51 am");
                        iftari.setText("ইফতারির \n সময়\n 6 : 39 pm");
                    break;
                     case 13:
                        seheri.setText("সেহেরির শেষ\n সময়\n 3 : 44 am \n\n ফজরের আজান \n 3 : 50 am");
                        iftari.setText("ইফতারির \n সময়\n 6 : 40 pm");
                    break;
                     case 14:
                        seheri.setText("সেহেরির শেষ\n সময়\n 3 : 44 am \n\n ফজরের আজান \n 3 : 50 am");
                        iftari.setText("ইফতারির \n সময়\n 6 : 40 pm");
                    break;
                     case 15:
                        seheri.setText("সেহেরির শেষ\n সময়\n 3 : 43 am \n\n ফজরের আজান \n 3 : 49 am");
                        iftari.setText("ইফতারির \n সময়\n 6 : 36 pm");
                    break;
                     case 16:
                        seheri.setText("সেহেরির শেষ\n সময়\n 3 : 43 am \n\n ফজরের আজান \n 3 : 49 am");
                        iftari.setText("ইফতারির \n সময়\n 6 : 42 pm");
                    break;
                     case 17:
                        seheri.setText("সেহেরির শেষ\n সময়\n 3 : 42 am \n\n ফজরের আজান \n 3 : 48 am");
                        iftari.setText("ইফতারির \n সময়\n 6 : 42 pm");
                    break;
                     case 18:
                        seheri.setText("সেহেরির শেষ\n সময়\n 3 : 42 am \n\n ফজরের আজান \n 3 : 48 am");
                        iftari.setText("ইফতারির \n সময়\n 6 : 42 pm");
                    break;
                     case 19:
                        seheri.setText("সেহেরির শেষ\n সময়\n 3 : 41 am \n\n ফজরের আজান \n 3 : 47 am");
                        iftari.setText("ইফতারির \n সময়\n 6 : 43 pm");
                    break;
                     case 20:
                        seheri.setText("সেহেরির শেষ\n সময়\n 3 : 41 am \n\n ফজরের আজান \n 3 : 47 am");
                        iftari.setText("ইফতারির \n সময়\n 6 : 43 pm");
                    break;
                     case 21:
                        seheri.setText("সেহেরির শেষ\n সময়\n 3 : 40 am \n\n ফজরের আজান \n 3 : 46 am");
                        iftari.setText("ইফতারির \n সময়\n 6 : 44 pm");
                    break;
                     case 22:
                        seheri.setText("সেহেরির শেষ\n সময়\n 3 : 40 am \n\n ফজরের আজান \n 3 : 46 am");
                        iftari.setText("ইফতারির \n সময়\n 6 : 44 pm");
                    break;
                     case 23:
                        seheri.setText("সেহেরির শেষ\n সময়\n 3 : 40 am \n\n ফজরের আজান \n 3 : 46 am");
                        iftari.setText("ইফতারির \n সময়\n 6 : 45 pm");
                    break;
                     case 24:
                        seheri.setText("সেহেরির শেষ\n সময়\n 3 : 39 am \n\n ফজরের আজান \n 3 : 45 am");
                        iftari.setText("ইফতারির \n সময়\n 6 : 45 pm");
                    break;
                     case 25:
                        seheri.setText("সেহেরির শেষ\n সময়\n 3 : 39 am \n\n ফজরের আজান \n 3 : 45 am");
                        iftari.setText("ইফতারির \n সময়\n 6 : 46 pm");
                    break;
                     case 26:
                        seheri.setText("সেহেরির শেষ\n সময়\n 3 : 39 am \n\n ফজরের আজান \n 3 : 45 am");
                        iftari.setText("ইফতারির \n সময়\n 6 : 46 pm");
                    break;
                     case 27:
                        seheri.setText("সেহেরির শেষ\n সময়\n 3 : 39 am \n\n ফজরের আজান \n 3 : 45 am");
                        iftari.setText("ইফতারির \n সময়\n 6 : 46 pm");
                    break;
                     case 28:
                        seheri.setText("সেহেরির শেষ\n সময়\n 3 : 39 am \n\n ফজরের আজান \n 3 : 45 am");
                        iftari.setText("ইফতারির \n সময়\n 6 : 47 pm");
                    break;

                      case 29:
                        seheri.setText("সেহেরির শেষ\n সময়\n 3 : 39 am \n\n ফজরের আজান \n 3 : 45 am");
                        iftari.setText("ইফতারির \n সময়\n 6 : 47 pm");
                    break;
                }
            }
        });
    }
}
