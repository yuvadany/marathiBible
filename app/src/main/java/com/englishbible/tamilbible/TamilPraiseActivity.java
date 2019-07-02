package com.englishbible.tamilbible;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class TamilPraiseActivity extends AppCompatActivity /*implements AdapterView.OnItemSelectedListener, GestureDetector.OnGestureListener*/ {
    Spinner praises_spinner;
    TextView praises_text;
    ScrollView scroll;
    String ta_verse;
    String sp1;
    GestureDetector gestureDetector;
    boolean test = true;
    private AdView mAdView;
    String[] praisesArray = {"1-100", "101-200", "201-300", "301-400", "401-500",
            "501-600", "601-700", "701-800", "801-900", "901-1000"};
    SharedPreferences sharedpreferences, sharedPreferencesReadMode;
    public static final String SHARED_PREF_FONT_SIZE = "font_size";
    public static final float TEXT_FONT_SIZE = 13;
    public static final String TEXT_FONT_SIZE_VAR = "text_float_size";
    public static final String SHARED_PREF_NIGHT_DAY_MODE = "Night_Day_Mode";
    public static final String TEXT_COLOUR_VAR = "Text_Colour_Var";
    public static final String BACKROUND_COLOUR_VAR = "Background_Colour_Var";
    public static final int BLACK_COLOUR = Color.parseColor("#000000");
    public static final int WHITE_COLOUR = Color.parseColor("#f2f2f2");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_praise);
        setTitle("ஸ்தோத்திர பலிகள் Sthothira Paligal");
        scroll = ((ScrollView) findViewById(R.id.scrollPraise));
        praises_text = ((TextView) findViewById(R.id.praises_text));
      /* praises_spinner = (Spinner) findViewById(R.id.praises_spinner);
        praises_spinner.setOnItemSelectedListener(this);
        gestureDetector = new GestureDetector(TamilPraiseActivity.this, TamilPraiseActivity.this);*/
        sharedpreferences = getSharedPreferences(SHARED_PREF_FONT_SIZE, Context.MODE_PRIVATE);
        sharedPreferencesReadMode = getSharedPreferences(SHARED_PREF_NIGHT_DAY_MODE, Context.MODE_PRIVATE);
        praises_text.setTextSize(TypedValue.COMPLEX_UNIT_DIP, sharedpreferences.getFloat(TEXT_FONT_SIZE_VAR, TEXT_FONT_SIZE));
        praises_text.setBackgroundColor(sharedPreferencesReadMode.getInt(BACKROUND_COLOUR_VAR, WHITE_COLOUR));
        praises_text.setTextColor(sharedPreferencesReadMode.getInt(TEXT_COLOUR_VAR, BLACK_COLOUR));
        praises_text.setText(getTamilPraises().toString());
        mAdView = (AdView) findViewById(R.id.adView);
        mAdView.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
            }

            @Override
            public void onAdClosed() {

            }

            @Override
            public void onAdFailedToLoad(int errorCode) {

            }

            @Override
            public void onAdLeftApplication() {

            }

            @Override
            public void onAdOpened() {
                super.onAdOpened();
            }
        });
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        // Back button starts
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        // Back button ends
    }

   /* @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stu

    }
*/
  /*  @Override
    public void onItemSelected(AdapterView<?> parent, View arg1, int arg2, long arg3) { *//* TODO Auto-generated method stub*//*
        String sp1 = String.valueOf(praises_spinner.getSelectedItem());
        switch (parent.getId()) {
            case R.id.praises_spinner: {
                String praises = "No verses";
                int id = 8;
                // Toast.makeText(MainActivity.this, sp1, Toast.LENGTH_SHORT).show();
                String list_praise = "praises_" + getList(sp1);
                //displayNext(sp1,praisesArray);
                displayPrevious(sp1, praisesArray);
                id = this.getResources().getIdentifier(list_praise, "raw", this.getPackageName());
                InputStream inputStream = getResources().openRawResource(id);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                int in;
                try {
                    in = inputStream.read();
                    while (in != -1) {
                        byteArrayOutputStream.write(in);
                        in = inputStream.read();
                    }
                    inputStream.close();
                    praises = byteArrayOutputStream.toString();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                sharedpreferences = getSharedPreferences(SHARED_PREF_FONT_SIZE, Context.MODE_PRIVATE);
                sharedPreferencesReadMode = getSharedPreferences(SHARED_PREF_NIGHT_DAY_MODE, Context.MODE_PRIVATE);
                praises_text.setTextSize(TypedValue.COMPLEX_UNIT_DIP, sharedpreferences.getFloat(TEXT_FONT_SIZE_VAR, TEXT_FONT_SIZE));
                praises_text.setBackgroundColor(sharedPreferencesReadMode.getInt(BACKROUND_COLOUR_VAR, WHITE_COLOUR));
                praises_text.setTextColor(sharedPreferencesReadMode.getInt(TEXT_COLOUR_VAR, BLACK_COLOUR));
                praises_text.setText(praises);
                scroll.fullScroll(ScrollView.FOCUS_UP);
            }
        }
    }
*/

    public StringBuffer getTamilPraises() {
        StringBuffer tamilPraises = new StringBuffer();
        try {
            int id = 8;
            int in;
            for (int i = 1; i <= 10; i++) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                id = this.getResources().getIdentifier(getTamilPraisesFile(i), "raw", this.getPackageName());
                InputStream inputStream = getResources().openRawResource(id);
                in = inputStream.read();
                while (in != -1) {
                    byteArrayOutputStream.write(in);
                    in = inputStream.read();
                }
                inputStream.close();
                tamilPraises.append(byteArrayOutputStream.toString());
            }
        } catch (Exception e) {
            System.out.println("getTamilPraises Error # " + e);
        }
        return tamilPraises;
    }

    public String getTamilPraisesFile(int i) {
        Map<Integer, String> bookName = new HashMap<Integer, String>();
        bookName.put(1, "1_100");
        bookName.put(2, "101_200");
        bookName.put(3, "201_300");
        bookName.put(4, "301_400");
        bookName.put(5, "401_500");
        bookName.put(6, "501_600");
        bookName.put(7, "601_700");
        bookName.put(8, "701_800");
        bookName.put(9, "801_900");
        bookName.put(10, "901_1000");
        return "praises_" + bookName.get(i);
    }

    public String getList(String number) {
        if (number.equalsIgnoreCase("1-100")) {
            return "1_100";
        } else if (number.equalsIgnoreCase("101-200")) {
            return "101_200";
        } else if (number.equalsIgnoreCase("101-200")) {
            return "101_200";
        } else if (number.equalsIgnoreCase("201-300")) {
            return "201_300";
        } else if (number.equalsIgnoreCase("301-400")) {
            return "301_400";
        } else if (number.equalsIgnoreCase("401-500")) {
            return "401_500";
        } else if (number.equalsIgnoreCase("501-600")) {
            return "501_600";
        } else if (number.equalsIgnoreCase("601-700")) {
            return "601_700";
        } else if (number.equalsIgnoreCase("701-800")) {
            return "701_800";
        } else if (number.equalsIgnoreCase("801-900")) {
            return "801_900";
        } else if (number.equalsIgnoreCase("901-1000")) {
            return "901_1000";
        }
        return "1_100";
    }


   /* @Override
    public void onLongPress(MotionEvent arg0) {

        // TODO Auto-generated method stub

    }

    @Override
    public boolean onScroll(MotionEvent arg0, MotionEvent arg1, float arg2, float arg3) {

        // TODO Auto-generated method stub

        return false;
    }

    @Override
    public void onShowPress(MotionEvent arg0) {

        // TODO Auto-generated method stub

    }

    @Override
    public boolean onSingleTapUp(MotionEvent arg0) {

        // TODO Auto-generated method stub

        return false;
    }*/

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {

        // TODO Auto-generated method stub

        return gestureDetector.onTouchEvent(motionEvent);
    }

   /* @Override
    public boolean onDown(MotionEvent arg0) {

        // TODO Auto-generated method stub

        return false;
    }

    @Override
    public boolean onFling(MotionEvent motionEvent1, MotionEvent motionEvent2, float X, float Y) {
        sp1 = String.valueOf(praises_spinner.getSelectedItem());
        if (motionEvent2.getX() - motionEvent1.getX() > 50) {
            test = true;
            displayPrevious(sp1, praisesArray);
            scroll.fullScroll(ScrollView.FOCUS_UP);
            return true;
        }

        if (motionEvent1.getX() - motionEvent2.getX() > 50) {
            test = true;
            displayNext(sp1, praisesArray);
            scroll.fullScroll(ScrollView.FOCUS_UP);
            return true;
        } else {
            return true;
        }
    }*/

    public void displayNext(String current, String[] array) {
        String list_praise = "praises_" + getList(current);
        if (test) {
            for (int i = 0; i < array.length; i++) {
                if (array[i].equalsIgnoreCase(current) && i < array.length - 1) {
                    //praises_spinner.setSelection(i+1);
                    praises_spinner.setSelection(i + 1);
                    /*  Toast.makeText(PraiseActivity.this, array[i + 1], Toast.LENGTH_SHORT).show();*/
                    list_praise = "praises_" + getList(array[i + 1]);
                    // praises_spinner.setSelection(i+1);
                    praises_text.setText(getFile(list_praise));
                    i = array.length;
                    test = false;
                    break;

                }
            }
        }
    }

    public void displayPrevious(String current, String[] array) {
        String list_praise = "praises_" + getList(current);
        if (test) {
            for (int i = 0; i < array.length; i++) {
                if (array[i].equalsIgnoreCase(current) && i > 0) {
                    praises_spinner.setSelection(i - 1);
                    /*Toast.makeText(PraiseActivity.this, array[i - 1], Toast.LENGTH_SHORT).show();*/
                    list_praise = "praises_" + getList(array[i - 1]);
                    // praises_spinner.setSelection(i-1);
                    praises_text.setText(getFile(list_praise));
                    i = array.length;
                    test = false;
                    break;
                }
            }
        }
    }


    public String getFile(String file) {
        int num = 5;
        int id = 8;
        id = this.getResources().getIdentifier(file, "raw", this.getPackageName());
        InputStream inputStream = getResources().openRawResource(id);
        {
            // BufferedReader br = new BufferedReader(inputStream);

        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int in;
        try {
            in = inputStream.read();
            while (in != -1) {
                byteArrayOutputStream.write(in);
                in = inputStream.read();
            }
            inputStream.close();
            ta_verse = byteArrayOutputStream.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ta_verse;
    }

    @Override
    public void onPause() {
        if (mAdView != null) {
            mAdView.pause();
        }
        super.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
        if (mAdView != null) {
            mAdView.resume();
        }
    }

    @Override
    public void onDestroy() {
        if (mAdView != null) {
            mAdView.destroy();
        }
        super.onDestroy();
    }

    // back option starts
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
    // back option ends
}