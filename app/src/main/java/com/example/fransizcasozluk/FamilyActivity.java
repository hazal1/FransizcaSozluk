package com.example.fransizcasozluk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class FamilyActivity extends AppCompatActivity {

    List<Word> words=new ArrayList<>();
    ListView liste;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        words.add(new Word("un","Anne",R.drawable.mother , R.raw.bir));
        words.add(new Word("deux","Baba",R.drawable.father , R.raw.bir));
        words.add(new Word("trois","Kız Kardeş",R.drawable.daughter , R.raw.bir));
        words.add(new Word("quarte","Erkek Kardeş",R.drawable.boy , R.raw.bir));
        words.add(new Word("cinq","Dede",R.drawable.grandfather , R.raw.bir));
        words.add(new Word("six","Nine",R.drawable.grandmother , R.raw.bir));


        WordAdapter adapter = new WordAdapter(this,words,R.color.category_family);
        liste=(ListView)findViewById(R.id.list);
        liste.setAdapter(adapter);
    }
}
