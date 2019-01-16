package bible.englishbible.lugandabible;


import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.ScrollView;
import android.widget.SearchView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import android.media.MediaPlayer;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener, AdapterView.OnItemSelectedListener {
    //  DBHelper dbhelper = new DBHelper(this);
    public int book_number = 1;
    ScrollView first,second,third;
    public HashMap chaptersMap = new HashMap<String, Integer>();
    TextView hindi_verses, english_verses, single_view;
    ListView englishList, singleList,hindiList;
    Spinner book, chapter;
    String language = "both";
    Bundle bundle = new Bundle();
    ScrollView englishview;
    private Animation fab_open, fab_close, rotate_forward, rotate_backward;
    private FloatingActionButton fabShare, fab1, fab2, fab3, fab4;
    private Boolean isFabOpen = false;
    BooksChapters chapters = new BooksChapters();
    String defaulthint = "Search here";
    ArrayList<String> listitems,verseDate;
    Button closePopupBtn,shareVerse,shareVerseOnly,shareEearchResult,closeShareResult;
    PopupWindow popupWindow,popupWindowSearch;
    DrawerLayout verseLayout;
    TextView todayverse;
    String verseToday;
    DBHelper dbhelper = new DBHelper(this);
    String searchResult = "test";
    String verseSelected = "Amen";
    String verse_selected="Amen";
    String book_name = "Genesis";
    String chapter_number = "1";
    String header = "";
    private AdView mAdView;/*
    ImageButton start,stop ;
    static MediaPlayer mp=new MediaPlayer();
    boolean isPlaying = false;
    // French Bible mp3
    public String mp3_basic = "http://www.wordpocket.org/bibles/app/audio/42/";*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Popup Verse Starts
        verseToday = "Amen";
        Calendar cal = Calendar.getInstance();
        int doy = cal.get(Calendar.DAY_OF_YEAR);
        LayoutInflater layoutInflater = (LayoutInflater) MainActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View customView = layoutInflater.inflate(R.layout.versepopup,null);
        //creating media player
       /* start = (ImageButton) findViewById(R.id.play);
        stop = (ImageButton) findViewById(R.id.stop);
        stop.setVisibility(View.GONE);
        isPlaying = mp.isPlaying();
        try{
            //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3
            mp.setDataSource(mp3_basic+"1/1.mp3");
            mp.prepare();
        }catch(Exception e){e.printStackTrace();}

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start.setVisibility(View.GONE);
                stop.setVisibility(View.VISIBLE);
               *//* mp.start();
                start.setVisibility(View.GONE);
                pause.setVisibility(View.VISIBLE);*//*
                if (!isPlaying){
                    mp.start();
                    isPlaying = true;
                }else{
                    mp.seekTo(0);
                    mp.start();
                }
            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.pause();
                // mp.reset();
                stop.setVisibility(View.GONE);
                start.setVisibility(View.VISIBLE);
            }
        });*/
      /*  verseLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        closePopupBtn = (Button) customView.findViewById(R.id.closePopupBtn);
        shareVerse = (Button) customView.findViewById(R.id.shareVerse);
        todayverse = (TextView) customView.findViewById(R.id.versetoday);
        popupWindow = new PopupWindow(customView, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        // Getting daily verse

        // todayverse.setText("Amen");
        try {
        this.dbhelper.openDataBase();
        verseToday = dbhelper.getVerse(doy);
        todayverse.setText(verseToday);
        }catch(Exception e){

        }
        findViewById(R.id.drawer_layout).post(new Runnable() {
public void run() {
        popupWindow.showAtLocation(findViewById(R.id.drawer_layout), Gravity.CENTER, 0, 0);
        }
        });

        //close the popup window on button click
        closePopupBtn.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
        popupWindow.dismiss();
        }
        });
        shareVerse.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
        String app_url = "https://play.google.com/store/apps/details?id=com.englishbible.germanbible";
        verseToday = verseToday + "\n\n"+app_url;
        try {
        Intent localIntent2 = new Intent("android.intent.action.SEND");
        localIntent2.setType("text/plain");
        localIntent2.putExtra("android.intent.extra.SUBJECT", "Today's Word #");
        localIntent2.putExtra("android.intent.extra.TEXT", verseToday);
        startActivity(Intent.createChooser(localIntent2, "Today's  verse Share"));
        } catch (Exception e) {

        }*/
      /*  }
        });*/
        // Popup Verse Ends
        //share Verse/Search result starts

        //share Verse/Search result ends
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //Screen width set starts Jan 23 -2018 by Yuvaraj Palanisamy
        int width = getWindowManager().getDefaultDisplay().getWidth();
        //  int height = getWindowManager().getDefaultDisplay().getHeight();
        /*first = (ScrollView) findViewById(R.id.scrollView1);
        second = (ScrollView) findViewById(R.id.scrollView2);
        third = (ScrollView) findViewById(R.id.scrollView3);*/
        // Toast.makeText(getApplicationContext(), "Width " + width, Toast.LENGTH_LONG).show();
        //first.getLayoutParams().width = width / 2 - 5;
        //  second.getLayoutParams().
        /*RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) second.getLayoutParams();
        layoutParams.setMargins(width / 2 + 5, 0, 0, 0);
        second.setLayoutParams(layoutParams);*/
        //Screen width set starts Jan 23 -2018 by Yuvaraj Palanisamy Ends
        singleList = ((ListView) findViewById(R.id.SingleText));
        singleList.setVisibility(View.GONE);
        hindiList = ((ListView) findViewById(R.id.hindi_text));
        englishList = ((ListView) findViewById(R.id.english_text));
        book = (Spinner) findViewById(R.id.books_spinner);
        chapter = (Spinner) findViewById(R.id.chapters_spinner);
        /*// Chapter spinner starting point
        RelativeLayout.LayoutParams layoutParamsSpinner = (RelativeLayout.LayoutParams) second.getLayoutParams();
        layoutParamsSpinner.setMargins(width / 2, 0, 0, 0);
        chapter.setLayoutParams(layoutParamsSpinner);
        //*/
        //book spinner starts
        String[] booksArray = new String[66];
        booksArray = loadBooks();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, booksArray);
//set the spinners adapter to the previously created one.
        book.setAdapter(adapter);
        //book spinner ends
        book.setOnItemSelectedListener(this);
        chapter.setOnItemSelectedListener(this);
        // englishview = (ScrollView) findViewById(R.id.scrollView2);
        fabShare = (FloatingActionButton) findViewById(R.id.share);
        fabShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String app_url = "https://play.google.com/store/apps/details?id=bible.englishbible.lugandabible";
                try {
                    Intent localIntent2 = new Intent("android.intent.action.SEND");
                    localIntent2.setType("text/plain");
                    localIntent2.putExtra("android.intent.extra.SUBJECT", "The Holy Bible Luganda & English Bible Parallel");
                    localIntent2.putExtra("android.intent.extra.TEXT", "\nHi,\n Check on this Holy Bible Luganda & English  Parallel App\n\n" + app_url + " \n\n");
                    startActivity(Intent.createChooser(localIntent2, "Luganda & English Bible Share"));
                } catch (Exception e) {

                }
            }
        });
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        fab1 = (FloatingActionButton) findViewById(R.id.fab1);
        fab2 = (FloatingActionButton) findViewById(R.id.fab2);
        fab3 = (FloatingActionButton) findViewById(R.id.fab3);
        fab4 = (FloatingActionButton) findViewById(R.id.fab4);
        fab_open = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_open);
        fab_close = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_close);
        rotate_forward = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_forward);
        rotate_backward = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_backward);
        fab1.setOnClickListener(this);
        fab2.setOnClickListener(this);
        fab3.setOnClickListener(this);
        fab4.setOnClickListener(this);
        SearchView   localSearchView = (SearchView)findViewById(R.id.searchverse);
        localSearchView.setQueryHint(this.defaulthint);
        localSearchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            public boolean onQueryTextChange(String paramAnonymousString) {
                SearchView localSearchView = (SearchView) MainActivity.this.findViewById(R.id.searchverse);
                if ((paramAnonymousString == null) || ("".equals(paramAnonymousString))) {
                    localSearchView.setQueryHint("Type a word here");
                    // MainActivity.this.listitems = new ArrayList();
                    listitems = new ArrayList();
                    // MainActivity.this.listitems.add("Please Search with Song name");
                    // listitems.add("Please Search with different word");
                    ArrayAdapter localArrayAdapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, MainActivity.this.listitems);
                    ((ListView) MainActivity.this.findViewById(R.id.searchresult)).setAdapter(localArrayAdapter);
                }
                return true;
            }

            public boolean onQueryTextSubmit(String paramAnonymousString) {
                Object localObject[] = {"No matches Found"};
              /*  SearchView   localSearchView = (SearchView)findViewById(R.id.searchverse);
                 InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                 imm.hideSoftInputFromWindow(localSearchView.getWindowToken(), 0);*/
                try {
                    //  MainActivity.this.dbhelper.openDataBase();
                 /*   dbhelper.openDataBase();                   */
                    String[] arrayOfString = searchVerse(paramAnonymousString);
                    localObject = arrayOfString;
                    searchResult = arrayToString(arrayOfString);
                } catch (Exception localException) {
                    Log.d("Db Open issue ", localException.getMessage());
                }
                ArrayAdapter localArrayAdapter;
                ListView localListView;
                MainActivity.this.listitems = new ArrayList(Arrays.asList((Object[]) localObject));
                listitems = new ArrayList(Arrays.asList((Object[]) localObject));
                //localArrayAdapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, MainActivity.this.listitems);
                localArrayAdapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, listitems);
                localListView = (ListView) MainActivity.this.findViewById(R.id.searchresult);
                localListView.setAdapter(localArrayAdapter);
               /* localListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Bundle localBundle = new Bundle();
                    LayoutInflater layoutInflater = (LayoutInflater) MainActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                    verseSelected = ((TextView) view).getText().toString();
                    View customViewShare = layoutInflater.inflate(R.layout.sharesearch,null);
                    shareEearchResult = (Button) customViewShare.findViewById(R.id.shareSearchResult);
                    shareVerseOnly = (Button) customViewShare.findViewById(R.id.shareVerseOnly);
                    closeShareResult = (Button) customViewShare.findViewById(R.id.closeShareResult);
                    popupWindowSearch = new PopupWindow(customViewShare, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                *//*    shareVerseOnly.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            try {
                                Intent localIntent2 = new Intent("android.intent.action.SEND");
                                localIntent2.setType("text/plain");
                                localIntent2.putExtra("android.intent.extra.SUBJECT", "Share Word वचन  #");
                                localIntent2.putExtra("android.intent.extra.TEXT", verseSelected);
                                startActivity(Intent.createChooser(localIntent2, "Selected verse Share"));
                            } catch (Exception e) {

                            }
                        }
                    });
                    shareEearchResult.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            try {
                                Intent localIntent2 = new Intent("android.intent.action.SEND");
                                localIntent2.setType("text/plain");
                                localIntent2.putExtra("android.intent.extra.SUBJECT", "Share Search वचन  #");
                                localIntent2.putExtra("android.intent.extra.TEXT", searchResult);
                                startActivity(Intent.createChooser(localIntent2, "Share search Result"));
                            } catch (Exception e) {

                            }
                        }
                    });
                    closeShareResult.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            popupWindowSearch.dismiss();
                        }
                    });
                    //Toast.makeText(MainActivity.this,  searchResult , Toast.LENGTH_SHORT).show() ;
                    findViewById(R.id.drawer_layout).post(new Runnable() {
                        public void run() {
                            popupWindowSearch.showAtLocation(findViewById(R.id.drawer_layout), Gravity.CENTER, 0, 0);

                        }
                    });*//*
                }
            });*/
                return true;
            }
        });

        singleList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                book_name = String.valueOf(book.getSelectedItem());
                chapter_number = String.valueOf(chapter.getSelectedItem());
                verse_selected = book_name + " :" + chapter_number + "\n" + ((TextView) view).getText().toString();
                header = "Share " + book_name + " " + chapter_number + "'s verse via";
                try {
                    Intent localIntent2 = new Intent("android.intent.action.SEND");
                    localIntent2.setType("text/plain");
                    localIntent2.putExtra("android.intent.extra.SUBJECT", "Word #");
                    localIntent2.putExtra("android.intent.extra.TEXT", verse_selected);
                    startActivity(Intent.createChooser(localIntent2, header));
                } catch (Exception e) {

                }
            }
        });

        englishList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                book_name = String.valueOf(book.getSelectedItem());
                chapter_number = String.valueOf(chapter.getSelectedItem());
                verse_selected = book_name + " :" + chapter_number + "\n" + ((TextView) view).getText().toString();
                header = "Share " + book_name + " " + chapter_number + "'s verse via";
                try {
                    Intent localIntent2 = new Intent("android.intent.action.SEND");
                    localIntent2.setType("text/plain");
                    localIntent2.putExtra("android.intent.extra.SUBJECT", "Word #");
                    localIntent2.putExtra("android.intent.extra.TEXT", verse_selected);
                    startActivity(Intent.createChooser(localIntent2, header));
                } catch (Exception e) {

                }
            }
        });

        hindiList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                book_name = String.valueOf(book.getSelectedItem());
                chapter_number = String.valueOf(chapter.getSelectedItem());
                verse_selected = book_name + " :" + chapter_number + "\n" + ((TextView) view).getText().toString();
                header = "Share " + book_name + " " + chapter_number + "'s verse via";
                try {
                    Intent localIntent2 = new Intent("android.intent.action.SEND");
                    localIntent2.setType("text/plain");
                    localIntent2.putExtra("android.intent.extra.SUBJECT", "Word  #");
                    localIntent2.putExtra("android.intent.extra.TEXT", verse_selected);
                    startActivity(Intent.createChooser(localIntent2, header));
                } catch (Exception e) {

                }
            }
        });
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
    @Override
    public void onItemSelected(AdapterView<?> parent, View arg1, int arg2, long arg3) { /* TODO Auto-generated method stub*/
        String sp1 = String.valueOf(book.getSelectedItem());
        String sp2 = String.valueOf(chapter.getSelectedItem());
        /*first.fullScroll(ScrollView.FOCUS_UP);
        second.fullScroll(ScrollView.FOCUS_UP);
        third.fullScroll(ScrollView.FOCUS_UP);*/
        switch (parent.getId()) {
            case R.id.books_spinner: {
              /*  try {
                    if(true == mp.isPlaying()) {
                        mp.stop();
                    }
                    start.setVisibility(View.VISIBLE);
                    stop.setVisibility(View.GONE);
                    *//*if(mp!=null) {
                        pause.setVisibility(View.GONE);
                        start.setVisibility(View.VISIBLE);
                    }*//*
                    mp = new MediaPlayer();
                    mp.setDataSource(mp3_basic+getBook_number(sp1) + "/" + sp2.toString() + ".mp3");
                    // System.out.println("Chapter Change # " + mp3_basic + getBook_number(sp1) + "/" + sp2.toString() + ".mp3");
                    mp.prepare();
                    // mp.pause();
                } catch(Exception e)
                {
                    System.out.println(e);
                }*/
                int chapters = getBooksChapter(sp1); /*  verses.setText(sp1);*/
                Toast.makeText(getApplicationContext(), sp1, Toast.LENGTH_SHORT).show();
                List<String> list = new ArrayList<String>();
                for (int i = 0; i < chapters; i++) {
                    list.add(Integer.toString(i + 1));
                }
                ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
                dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                dataAdapter.notifyDataSetChanged();
                chapter.setAdapter(dataAdapter);
                //String Kannada_verses = dbhelper.getVerses("kan_bible", getBooks(sp1),1);
                String hindi_verse = "No verses";
                //raw text test starts
                int num = 5;
                int id = 8;
                id = this.getResources().getIdentifier("lug_1_1", "raw", this.getPackageName());
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
                    // System.out.println(" Next  " + byteArrayOutputStream.toString());
                    hindi_verse = byteArrayOutputStream.toString();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                //raw text test ends
                ArrayAdapter praiseArrayAdapter5 = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getVerse("1", "1", "lug_"));
                hindiList.setAdapter(praiseArrayAdapter5);
/*                hindi_verses.setText(hindi_verse);*/
                //  String enlish_verses = dbhelper.getVerses("eng_bible", getBooks(sp1),1);
                // english_verses.setText(enlish_verses);
                String enlish_verse = "Not Found";
                // english_verses.setText(getVerse("1", "1", "niv_"));
                ArrayAdapter praiseArrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getVerse("1", "1", "niv_"));
                englishList.setAdapter(praiseArrayAdapter);
                if ("hindi".equalsIgnoreCase(language)) {
                    praiseArrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getVerse("1", "1", "lug_"));
                    singleList.setAdapter(praiseArrayAdapter);
                } else if ("niv".equalsIgnoreCase(language)) {
                    //single_text.setText(getVerse("1", "1", "niv_"));
                    praiseArrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getVerse("1", "1", "niv_"));
                    singleList.setAdapter(praiseArrayAdapter);
                }
                break;
            }
            case R.id.chapters_spinner: {
                /*try{
                    if(true == mp.isPlaying()) {
                        mp.stop();
                    }
                    start.setVisibility(View.VISIBLE);
                    stop.setVisibility(View.GONE);
                 *//* if(mp!=null) {
                      pause.setVisibility(View.GONE);
                      start.setVisibility(View.VISIBLE);
                  }*//*

                    mp = new MediaPlayer();
                    mp.setDataSource(mp3_basic+getBook_number(sp1) + "/" + sp2.toString() + ".mp3");
                    //  System.out.println("Chapter Change # " + mp3_basic+getBook_number(sp1) + "/" + sp2.toString() + ".mp3");
                    mp.prepare();
                    //mp.pause();
                } catch(Exception e)
                {
                    System.out.println(e);
                }*/
                //third.fullScroll(ScrollView.FOCUS_UP);
                //String Kannada_verses = dbhelper.getVerses("kan_bible", getBooks(sp1),Integer.parseInt(sp2));
                String file = "lug_" + getBook_number(sp1) + "_" + Integer.parseInt(sp2);
                String hindi_verse = "test ";
                int id = 1;
                id = this.getResources().getIdentifier(file, "raw", this.getPackageName());
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
                    hindi_verse = byteArrayOutputStream.toString();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                ArrayAdapter praiseArrayAdapter6 = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getVerse(sp1, sp2, "lug_"));
                hindiList.setAdapter(praiseArrayAdapter6);
               /* hindi_verses.setText(hindi_verse);*/
                //String enlish_verses = dbhelper.getVerses("eng_bible", getBooks(sp1),Integer.parseInt(sp2));
                // english_verses.setText(enlish_verses);
                String enlish_verse = "Not Found";
                ArrayAdapter praiseArrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getVerse(sp1, sp2, "niv_"));
                englishList.setAdapter(praiseArrayAdapter);
                // english_verses.setText(getVerse(sp1, sp2, "niv_"));
                if ("hindi".equalsIgnoreCase(language)) {
                    ArrayAdapter praiseArrayAdapter1 = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getVerse(sp1, sp2, "lug_"));
                    singleList.setAdapter(praiseArrayAdapter1);
                    // single_text.setText(getVerse(sp1, sp2, "lug_"));
                } else if ("niv".equalsIgnoreCase(language)) {
                    ArrayAdapter praiseArrayAdapter2 = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getVerse(sp1, sp2, "niv_"));
                    singleList.setAdapter(praiseArrayAdapter2);
                    //single_text.setText(getVerse(sp1, sp2, "niv_"));
                }
                break;
            }

        }
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        Intent localIntent1;
        localIntent1 = new Intent(MainActivity.this, MainActivity.class);
        String sp1 = String.valueOf(book.getSelectedItem());
        String sp2 = String.valueOf(chapter.getSelectedItem());
        switch (id) {
            case R.id.fab1:
                animateFAB();
                break;
            case R.id.fab2: {
                singleList.setVisibility(View.VISIBLE);
                //single_text.setVisibility(View.VISIBLE);
                hindiList.setVisibility(View.GONE);
                englishList.setVisibility(View.GONE);
               /* try{
                    //  System.out.println("Inside Fab2 - French ");
                    if(true == mp.isPlaying()) {
                        mp.stop();
                        //   System.out.println(" Fab2 - French - Playing ");
                        stop.setVisibility(View.GONE);
                        start.setVisibility(View.VISIBLE);
                    }else {
                        stop.setVisibility(View.VISIBLE);
                        start.setVisibility(View.GONE);
                    }
                    mp = new MediaPlayer();
                    mp.setDataSource(mp3_basic+getBook_number(sp1) + "/" + sp2.toString() + ".mp3");
                    // System.out.println("Chapter Change # " + mp3_basic+getBook_number(sp1) + "/" + sp2.toString() + ".mp3");
                    mp.prepare();
                    //mp.pause();
                } catch(Exception e)
                {
                    System.out.println(e);
                }*/
                ArrayAdapter praiseArrayAdapter2 = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getVerse(sp1, sp2, "lug_"));
                singleList.setAdapter(praiseArrayAdapter2);
                language = "hindi";
                break;
            }
            case R.id.fab3: {
             /*   try {
                    // System.out.println("Inside Fab3 - English ");
                    if (true == mp.isPlaying()) {
                        //  System.out.println(" Fab3 - English - Playing - Stop it");
                        mp.stop();
                    }
                    start.setVisibility(View.GONE);
                    stop.setVisibility(View.GONE);
                }catch(Exception e)
                {
                    System.out.println(e.getMessage());
                }*/
                this.bundle.putString("verses", "In the beginning God created the heaven and the earth.");
                singleList.setVisibility(View.VISIBLE);
                hindiList.setVisibility(View.GONE);
                englishList.setVisibility(View.GONE);
                language = "niv";
                ArrayAdapter praiseArrayAdapter2 = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getVerse(sp1, sp2, "niv_"));
                singleList.setAdapter(praiseArrayAdapter2);
                break;
            }
            case R.id.fab4: {
                //try {
                    // System.out.println("Inside Fab4 - Both");
                 /*   if (true == mp.isPlaying()) {
                        mp.stop();
                        //  System.out.println(" Fab4 - Both - Playing - stop it");
                        start.setVisibility(View.VISIBLE);
                        stop.setVisibility(View.GONE);
                    } else
                    {
                        // System.out.println(" Fab4 - Both - Not Playing");
                        start.setVisibility(View.VISIBLE);
                        stop.setVisibility(View.GONE);
                    }
                    mp = new MediaPlayer();
                    mp.setDataSource(mp3_basic + getBook_number(sp1) + "/" + sp2.toString() + ".mp3");
                    // System.out.println("Chapter Change # " + mp3_basic + getBook_number(sp1) + "/" + sp2.toString() + ".mp3");
                    mp.prepare();
                }catch(Exception e)
                {
                    System.out.println(e.getMessage());
                }*/
                singleList.setVisibility(View.GONE);
                hindiList.setVisibility(View.VISIBLE);
                englishList.setVisibility(View.VISIBLE);
                ArrayAdapter praiseArrayAdapter2 = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getVerse(sp1, sp2, "niv_"));
                englishList.setAdapter(praiseArrayAdapter2);
                ArrayAdapter praiseArrayAdapter3 = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getVerse(sp1, sp2, "lug_"));
                hindiList.setAdapter(praiseArrayAdapter3);
                language = "both";
                break;
            }
        }
    }

    public void animateFAB() {

        if (isFabOpen) {
            fab2.startAnimation(rotate_backward);
            // fab2.startAnimation(fab_close);
            //  fab3.startAnimation(fab_close);
            // fab4.startAnimation(fab_close);
            fab2.startAnimation(fab_open);
            fab3.startAnimation(fab_open);
            fab4.startAnimation(fab_open);
            fab2.setClickable(true);
            fab3.setClickable(true);
            fab4.setClickable(true);
            isFabOpen = false;
        } else {

            fab1.startAnimation(rotate_forward);
            fab2.startAnimation(fab_open);
            fab3.startAnimation(fab_open);
            fab4.startAnimation(fab_open);
            fab2.setClickable(true);
            fab3.setClickable(true);
            fab4.setClickable(true);
            isFabOpen = true;

        }
    }

    public ArrayList getVerse(String sp1, String sp2, String bible) {
        String verses = "Not Found";
        String file = bible + getBook_number(sp1) + "_" + Integer.parseInt(sp2);
        ArrayList<String> versesArrayList = new ArrayList();
        int id = 1;
        String line;
        id = this.getResources().getIdentifier(file, "raw", this.getPackageName());
        InputStream inputStream = getResources().openRawResource(id);
        int in;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            while ((line = br.readLine()) != null) {
                versesArrayList.add(line);
            }
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return versesArrayList;
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement


        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.rate) {
            Intent intent=new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=bible.englishbible.lugandabible"));
            startActivity(intent);
        }else if (id == R.id.praises) {
            startActivity(new Intent(this, PraisesActivity.class));
        }else if (id == R.id.vod) {
            try {
                Calendar cal = Calendar.getInstance();
                int doy = cal.get(Calendar.DAY_OF_YEAR);
                //this.dbhelper.openDataBase();
                verseDate = dbhelper.getVerse(doy);
                Toast.makeText(MainActivity.this,verseDate.get(0), Toast.LENGTH_LONG).show();
            } catch (Exception e) {
            }
        } else if (id == R.id.songs) {
            startActivity(new Intent(this, SongsActivity.class));
        }
        else if (id == R.id.more) {
            Intent intent=new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://play.google.com/store/apps/developer?id=YUVARAJ+PALANISAMY"));
            startActivity(intent);
        }
        else if (id == R.id.nav_share) {
            String app_url = "https://play.google.com/store/apps/details?id=bible.englishbible.lugandabible";
            try {
                Intent localIntent2 = new Intent("android.intent.action.SEND");
                localIntent2.setType("text/plain");
                localIntent2.putExtra("android.intent.extra.SUBJECT", "Luganda & English  Bible ");
                localIntent2.putExtra("android.intent.extra.TEXT", "\nHi,\n Check on this Luganda & English  Parallel Holy Bible App\n\n" + app_url + " \n\n");
                startActivity(Intent.createChooser(localIntent2, "Luganda & English  Bible Share "));
            } catch (Exception e) {

            }
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


// }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stu

    }

    public String[] searchVerse (String verse ) {
        View view = this.getCurrentFocus();
        InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        String verses = "Not Found";
        StringBuffer sb = new StringBuffer();
        String file = "niv_1_1";
        String[] words = new String[2];

        int id = 1;
        words[0] = verse.substring(0, 1).toUpperCase() + verse.substring(1).toLowerCase();
        words[1] = verse.substring(0, 1).toLowerCase() + verse.substring(1).toLowerCase();
        //Toast.makeText(MainActivity.this, words[1], Toast.LENGTH_SHORT).show();
       /* for (int m=0; m<words.length; m++)
        {*/
        // verse = words[m];

        for (int i = 1; i <= 66; i++) {
            for (int j = 1; j <= chapters.getChaptersCount(i); j++) {
                file = "niv_" + i + "_" + j;
                id = this.getResources().getIdentifier(file, "raw", this.getPackageName());
                //  Toast.makeText(MainActivity.this,  this.getPackageName(), Toast.LENGTH_SHORT).show();
                InputStream inputStream = getResources().openRawResource(id);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                int in;
                String line;
                String result;
                try {
                    BufferedReader br = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
                    while ((line = br.readLine()) != null) {
                        if (line.contains(words[0]) || line.contains(words[1])) {
                            sb.append(chapters.getBookName(i) + ":" + j + "\n" + line + "\n");
                        }
                    }
                    verses = sb.toString();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        //Toast.makeText(MainActivity.this, msg, Toast.LENGTH_LONG).show();
        for (int i = 1; i <= 66; i++) {
            for (int j = 1; j <= chapters.getChaptersCount(i); j++) {
                file = "lug_" + i + "_" + j;
                id = this.getResources().getIdentifier(file, "raw", this.getPackageName());
                //  Toast.makeText(MainActivity.this,  this.getPackageName(), Toast.LENGTH_SHORT).show();
                InputStream inputStream = getResources().openRawResource(id);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                int in;
                String line;
                String result;
                try {
                    BufferedReader br = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
                    while ((line = br.readLine()) != null) {
                        if (line.contains(words[0]) || line.contains(words[1])) {
                            sb.append(chapters.getBookName(i) + ":" + j + "\n" + line + "\n");
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        if(null == sb.toString() || "".equalsIgnoreCase(sb.toString())) {
            Toast.makeText(MainActivity.this, " No match found" , Toast.LENGTH_SHORT).show();
        } else {
            sb.append("\n\n\n");
        }
        return stringbufferToArray(sb);

    }

    public String[] stringbufferToArray(StringBuffer paramStringBuffer)
    {
        ArrayList localArrayList = new ArrayList();
        StringTokenizer localStringTokenizer = new StringTokenizer(paramStringBuffer.toString(), "\n");
        while (localStringTokenizer.hasMoreTokens()) {
            localArrayList.add(localStringTokenizer.nextToken());
        }
        int i = localArrayList.size();
        String[] arrayOfString = new String[i];
        Iterator localIterator = localArrayList.iterator();
        for (int j = 0; (localIterator.hasNext()) && (i - 1 >= 0); j++)
        {
            arrayOfString[j] = localIterator.next().toString();
            i--;
        }
        return arrayOfString;
    }







    public String arrayToString(String[] array)
    {
        StringBuilder builder = new StringBuilder();
        for(String s : array) {
            builder.append(s+"\n");
        }
        String searchresult = builder.toString();
        return searchresult;
    }

    public String[] loadBooks()
    {
        String[] books = new String[66];
        BooksChapters booksChapters = new BooksChapters();
        for (int i=0; i<66; i++)
        {
            books[i] = booksChapters.getBookName(i+1);
        }
        return books;
    }


    public int getBooksChapter(String bookName)
    {
        BooksChapters booksChapters = new BooksChapters();
        String[] booksArray = new String[66];
        booksArray = loadBooks();
        for (int i=0; i<66; i++)
        {
            if ( booksArray[i].equalsIgnoreCase(bookName))
            {
                return booksChapters.getChaptersCount(i+1);
            }
        }
        return 1;
    }

    public int getBook_number(String bookName)
    {
        BooksChapters booksChapters = new BooksChapters();
        String[] booksArray = new String[66];
        booksArray = loadBooks();
        for (int i=0; i<66; i++)
        {
            if ( booksArray[i].equalsIgnoreCase(bookName))
            {
                return i+1;
            }
        }
        return 1;
    }
}
