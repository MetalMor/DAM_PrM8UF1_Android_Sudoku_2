package edu.fje.clot.sudoku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

import edu.fje.clot.sudoku.Util.Util;
import edu.fje.clot.sudoku.adapter.ScoreAdapter;
import edu.fje.clot.sudoku.bean.Score;
import edu.fje.clot.sudoku.bean.list.ScoreList;

public class MainActivity extends AppCompatActivity {

    private ScoreList _scores = new ScoreList();
    private ListView _scoresListView = (ListView) findViewById(R.id.scoresList);
    private Button _btnPlay = (Button) findViewById(R.id.play_button);
    private ScoreAdapter _adapter;
    private int[] _images = {
            R.drawable.gold,
            R.drawable.silver,
            R.drawable.medallabronze
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getScores().addAll(Util.getInitialScoreList());
        setContentView(R.layout.activity_main);
    }

    public ListView getScoresListView() {
        return _scoresListView;
    }
    public void setScoresListView(ListView scoresListView) {
        _scoresListView = scoresListView;
    }
    public Button getBtnPlay() {
        return _btnPlay;
    }
    public void setButtonPlay(Button btnPlay) {
        _btnPlay = btnPlay;
    }
    public ScoreAdapter getAdapter() {
        return _adapter;
    }
    public void setAdapter(ScoreAdapter adapter) {
        _adapter = adapter;
    }
    public int[] getImages() {
        return _images;
    }
    public void setImages(int[] images) {
        _images = images;
    }
    public ScoreList getScores() {
        return _scores;
    }
    public void setScores(ScoreList scores) {
        _scores = scores;
    }
}
