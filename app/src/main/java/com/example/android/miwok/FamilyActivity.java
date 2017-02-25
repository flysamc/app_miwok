package com.example.android.miwok;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        ArrayList<Word> words = new ArrayList< >();
        words.add(new Word("әpә","father",R.drawable.family_father));
        words.add(new Word("әṭa","mother",R.drawable.family_mother));
        words.add(new Word("angsi","son",R.drawable.family_son));
        words.add(new Word("tune","daughter",R.drawable.family_daughter));
        words.add(new Word("taachi","older brother\n",R.drawable.family_older_brother));
        words.add(new Word("chalitti","younger brother\n",R.drawable.family_younger_brother));
        words.add(new Word("teṭe\n","older sister\n",R.drawable.family_older_sister));
        words.add(new Word("kolliti","younger sister\n",R.drawable.family_younger_sister));
        words.add(new Word("ama","grandmother",R.drawable.family_grandmother));
        words.add(new Word("paapa","grandfather",R.drawable.family_grandfather));






        WordAdapter adapter = new WordAdapter(this, words,R.color.category_family);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
