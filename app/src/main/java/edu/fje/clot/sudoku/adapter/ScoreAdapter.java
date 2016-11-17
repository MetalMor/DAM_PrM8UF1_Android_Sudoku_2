package edu.fje.clot.sudoku.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

import edu.fje.clot.sudoku.bean.Score;
import edu.fje.clot.sudoku.bean.list.ScoreList;

/**
 * Created by becari on 17/11/2016.
 */

public class ScoreAdapter extends BaseAdapter {

    private Context _context;
    private ScoreList _scores = new ScoreList();

    // TODO: imagenes

    @Override
    public int getCount() {
        return _scores.count();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }

    public Context getContext() {
        return _context;
    }
    public void setContext(Context context) {
        _context = context;
    }
    public ScoreList getScores() {
        if(_scores == null) _scores = new ScoreList();
        return _scores;
    }
    public void setScores(ScoreList scores) {
        _scores = scores == null ? new ScoreList() : scores;
    }
}
