package com.coderfaysal.duaamal;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    HashMap<String, String> hashMap;
    ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        AllItemList();


        FaysalAdapter faysalAdapter = new FaysalAdapter();
        listView.setAdapter(faysalAdapter);

    }




    private class FaysalAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return arrayList.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @SuppressLint({"ViewHolder", "InflateParams"})
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            LayoutInflater layoutInflater = getLayoutInflater();
            convertView = layoutInflater.inflate(R.layout.main_item, null);

            TextView text_view = convertView.findViewById(R.id.mainText);
            LinearLayout main_lay = convertView.findViewById(R.id.main_lay);


            HashMap<String, String> hashMap = arrayList.get(position);
            String it_text = hashMap.get("title");
            String it_arabic_text = hashMap.get("arabic");
            String it_bangla_text = hashMap.get("bangla");


            text_view.setText(it_text);

            main_lay.setOnClickListener( view -> {

                DetailsActivity.MAIN_TEXT = it_text;
                DetailsActivity.ARABIC_TEXT = it_arabic_text;
                DetailsActivity.BANGLA_TEXT = it_bangla_text;


                startActivity(new Intent(MainActivity.this, DetailsActivity.class));
            });


            return convertView;
        }
    }



    public void AllItemList(){

        // New Content

        hashMap = new HashMap<>();
        hashMap.put("title", "হেদায়েত লাভের দোয়া -");
        hashMap.put("arabic", "اللَّهُمَّ أَلْهِمْنِي رُشْدِي، وَأَعِذْنِي مِنْ شَرِّ نَفْسِي");
        hashMap.put("bangla", "উচ্চারণ : আল্লাহুম্মা আলহিমনি রুশদি, ওয়া আয়িজনি মিন শাররি নাফসি।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "দ্রুত সুস্থ হওয়ার দোয়া -");
        hashMap.put("arabic", "اللَّهُمَّ رَبَّ النَّاسِ أَذْهِبْ الْبَاسَ اشْفِهِ وَأَنْتَ الشَّافِي لَا شِفَاءَ إِلَّا شِفَاؤُكَ شِفَاءً لَا يُغَادِرُ سَقَمًا");
        hashMap.put("bangla", "উচ্চারণ : আল্লাহুম্মা রাব্বান নাসি উজহিবাল বা’সি, ইশফিহি ওয়া আনতাশ-শাফি, লা শিফায়া ইল্লা শিফায়ুকা শিফায়ান লা ইউগাদিরু সাকমা।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "বাহনে চড়ার দোয়া -");
        hashMap.put("arabic", "بِسْمِ اللهِ تَوَكَّلْتُ عَلَى اللهِ وَ لَا حَوْلَ وَ لَا قُوَّةَ اِلَّا بِاللَّه");
        hashMap.put("bangla", "উচ্চারণ : বিসমিল্লাহি তাওয়াক্কালতু আলাল্লাহ, লা-হাওলা ওয়ালা কুওয়াতা ইল্লা বিল্লাহ।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "নৌকা বা জাহাজে ভ্রমণের দোয়া -");
        hashMap.put("arabic", "بِسْمِ اللَّهِ مَجْرَاهَا وَمُرْسَاهَا إِنَّ رَبِّي لَغَفُورٌ رَحِيم");
        hashMap.put("bangla", "উচ্চারণ : বিসমিল্লাহি মাজরিহা ওয়া মুরসা-হা, ইন্না রাব্বি লা গাফুরুর রহিম।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "ঘুমানোর আগে দোয়া-");
        hashMap.put("arabic", "اَللَّهُمَّ بِاسْمِكَ أَمُوتُ وَأَحْيَا");
        hashMap.put("bangla", "উচ্চারণ- আল্লাহুম্মা বিসমিকা আমুতু ওয়া আহইয়া।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "ঘুম থেকে ওঠার পরের দোয়া-");
        hashMap.put("arabic", "الْحَمْدُ لِلَّهِ الَّذِي أَحْيَانَا بَعْدَ مَا أَمَاتَنَا وَإِلَيْهِ النُّشُور");
        hashMap.put("bangla", "উচ্চারণ- আলহামদু লিল্লাহিল লাজি আহইয়ানা বা’দা মা আমাতানা ওয়া ইলাইহিন নুশুর।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "ওযুর নিয়ত -");
        hashMap.put("arabic", "উচ্চারনঃ নাওয়াইতু আন আতাওয়াজ্জায়া লিরাফয়িল হাদাসি ওয়া ইস্তিবাহাতা লিছছালাতি ওয়া তাকাররুবান ইলাল্লাহি তা’য়ালা।");
        hashMap.put("bangla", "অর্থ: আমি ওযুর নিয়ত করছি যে নাপাকি দূর করার জন্য বিশুদ্ধরূপে নামাজ আদায়ের উদ্দেশ্য এবং আল্লাহ তা’য়ালা।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "মসজিদে প্রবেশের দোয়া -");
        hashMap.put("arabic", "بِسْمِ اللهِ اَللهُمَّ صَلِّى عَلَى مُحَمَّد");
        hashMap.put("bangla", "উচ্চারণ : ‘বিসমিল্লাহি আল্লাহুম্মা সাল্লি আলা মুহাম্মাদ।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "মসজিদ থেকে বের হওয়ার দোয়া -");
        hashMap.put("arabic", "اَللهُمَّ اِنِّىْ أَسْأَلُكَ مِنْ فَضْلِك");
        hashMap.put("bangla", "উচ্চারণ : ‘আল্লাহুম্মা ইন্নি আসআলুকা মিন ফাদলিকা।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "্ত্রীর মাথায় হাত রেখে দোয়া -");
        hashMap.put("arabic", "اللَّهُمَّ إِنِّي أَسْأَلُكَ خَيْرَهَا، وَخَيْرَ مَا جَبَلْتَهَا عَلَيْهِ، وَأَعُوذُ بِكَ مِنْ شَرِّهَا، وَشَرِّ مَا جَبَلْتَهَا عَلَيْهِ،");
        hashMap.put("bangla", "উচ্চারণ : আল্লাহুম্মা ইন্নি আসআলুকা খাইরাহা; ওয়া খাইরা মা জাবালতাহা আলাইহি; ওয়া আউজুবিকা মিন শাররিহা; ওয়া শাররি মা জাবালতাহা আলাইহি।’ (আবু দাউদ)");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "সহবাসের সময় দোয়া -");
        hashMap.put("arabic", "بِسْمِ اللَّهِ ، اللَّهُمَّ جَنِّبْنَا الشَّيْطَانَ ، وَجَنِّبْ الشَّيْطَانَ مَا رَزَقْتَنَا");
        hashMap.put("bangla", "উচ্চারণ : বিসমিল্লাহি আল্লাহুম্মা জান্নিবনাশ শায়ত্বানা, ওয়া জান্নিবিশ শায়ত্বানা মা রাজাক্বতানা।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "বীর্যপাতের সময় দোয়া -");
        hashMap.put("arabic", "اللّهُمَّ لآ تَجْعَلْ لِلشَّيْطَانِ فِيْمَا رَزَقْتَنِيْ نَصِيْبًا");
        hashMap.put("bangla", "উচ্চারণ : আল্লাহুম্মা লা তাজআল লিশ্শাইতানি ফিমা রাযাকতানী নাসীবান।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "মাথাব্যথা থেকে মুক্তির দোয়া-");
        hashMap.put("arabic", "لَا يُصَدَّعُونَ عَنْهَا وَلَا يُنزِفُون");
        hashMap.put("bangla", "উচ্চারণ : লা ইউসাদ্দাউনা আনহা ওয়া লা ইউনজিফুন।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "জ্বর থেকে মুক্তির দোয়া-");
        hashMap.put("arabic", "بِسْمِ اللَّهِ الْكَبِيرِ أَعُوذُ بِاللَّهِ الْعَظِيمِ مِنْ شَرِّ عِرْقٍ نَعَّارٍ وَمِنْ شَرِّ حَرِّ النَّار");
        hashMap.put("bangla", "উচ্চারণ : বিসমিল্লাহিল কাবির আউজুবিল্লাহিল আজিমি মিন শাররি কুল্লি ইরকিন না’আর ওয়া মিন শাররি হাররিন নার।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "ব্যথা দূর করার দোয়া-");
        hashMap.put("arabic", "أَعُوذُ بِعِزَّةِ اللَّهِ وَقُدْرَتِهِ مِنْ شَرِّ مَا أَجِدُ وَأُحَاذِر");
        hashMap.put("bangla", "উচ্চারণ : বিসমিল্লাহি আউজু বিইজ্জাতিল্লাহি ওয়া কুদরাতিহি মিন শাররি মা আঝিদু ওয়া উহাজিরু।");
        arrayList.add(hashMap);


    }






}