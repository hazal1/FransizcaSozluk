package com.example.fransizcasozluk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class NumbersActivity extends AppCompatActivity {


    List<Word>words=new ArrayList<>();
    ListView liste;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

       words.add(new Word("un","bir",R.drawable.bir , R.raw.bir));
       words.add(new Word("deux","iki",R.drawable.iki , R.raw.bir));
       words.add(new Word("trois","üç",R.drawable.uc , R.raw.bir));
       words.add(new Word("quarte","dört",R.drawable.dort , R.raw.bir));
       words.add(new Word("cinq","beş",R.drawable.bes , R.raw.bir));
       words.add(new Word("six","altı",R.drawable.alti , R.raw.bir));
       words.add(new Word("sept","yedi",R.drawable.yedi , R.raw.bir));
       words.add(new Word("huit","sekiz",R.drawable.sekiz , R.raw.bir));
       words.add(new Word("neuf","dokuz",R.drawable.dokuz , R.raw.bir));

       WordAdapter adapter = new WordAdapter(this,words,R.color.category_numbers);
       liste=(ListView)findViewById(R.id.list);
       liste.setAdapter(adapter);

    }
}
