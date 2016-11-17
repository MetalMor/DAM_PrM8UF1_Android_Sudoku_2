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
        return getScores().get(i);
    }

    @Override
    public long getItemId(int i) {
        return getScore(i).getId();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null; // TODO: get view
    }

    public Score getScore(int i) {
        return (Score) getItem(i);
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
