package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {


    private MediaPlayer mMediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        final ArrayList<Word> words = new ArrayList< >();
        words.add(new Word("minto wuksus","Where are you going?\n",R.raw.phrase_where_are_you_going));
        words.add(new Word("tinnә oyaase'nә","What is your name?",R.raw.phrase_what_is_your_name));
        words.add(new Word("oyaaset...","My name is...",R.raw.phrase_my_name_is));
        words.add(new Word("michәksәs?","How are you feeling?",R.raw.phrase_how_are_you_feeling));
        words.add(new Word("kuchi achit\n","I’m feeling good.\n",R.raw.phrase_im_feeling_good));
        words.add(new Word("әәnәs'aa?\n","Are you coming?\n",R.raw.phrase_are_you_coming));
        words.add(new Word("hәә’ әәnәm\n","Yes, I’m coming.\n",R.raw.phrase_yes_im_coming));
        words.add(new Word("hәә’ әәnәm\n","Let’s go.\n",R.raw.phrase_lets_go));
        words.add(new Word("yoowutis","I'm coming",R.raw.phrase_im_coming));
        words.add(new Word("әnni'nem","Come here.\n",R.raw.phrase_come_here));






        WordAdapter adapter = new WordAdapter(this, words,R.color.category_phrases);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // Get the {@link Word} object at the given position the user clicked on
                Word word = words.get(position);

                // Create and setup the {@link MediaPlayer} for the audio resource associated
                // with the current word
                mMediaPlayer = MediaPlayer.create(PhrasesActivity.this, word.getMusicResourceId());

                // Start the audio file
                mMediaPlayer.start();
            }
        });
    }
}
