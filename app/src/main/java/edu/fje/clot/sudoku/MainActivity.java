package edu.fje.clot.sudoku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView _scoresListView = (ListView) findViewById(R.id.scoresList);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: insertar elementos iniciales a la lista
        setContentView(R.layout.activity_main);
    }

    public ListView getScoresListView() {
        return _scoresListView;
    }
    private void setScoresListView(ListView scoresListView) {
        _scoresListView = scoresListView;
    }
}
