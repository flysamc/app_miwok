package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        ArrayList<Word> words = new ArrayList< >();
        words.add(new Word("minto wuksus","Where are you going?\n"));
        words.add(new Word("tinnә oyaase'nә","What is your name?"));
        words.add(new Word("oyaaset...","My name is..."));
        words.add(new Word("michәksәs?","How are you feeling?"));
        words.add(new Word("kuchi achit\n","I’m feeling good.\n"));
        words.add(new Word("әәnәs'aa?\n","Are you coming?\n"));
        words.add(new Word("hәә’ әәnәm\n","Yes, I’m coming.\n"));
        words.add(new Word("hәә’ әәnәm\n","Let’s go.\n"));
        words.add(new Word("yoowutis","nine"));
        words.add(new Word("әnni'nem","Come here.\n"));






        WordAdapter adapter = new WordAdapter(this, words,R.color.category_phrases);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
