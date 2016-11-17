package edu.fje.clot.sudoku.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Locale;

import edu.fje.clot.sudoku.R;
import edu.fje.clot.sudoku.bean.Score;
import edu.fje.clot.sudoku.bean.list.ScoreList;

/**
 * Created by becari on 17/11/2016.
 */

public class ScoreAdapter extends BaseAdapter {

    private Context _context;
    private ScoreList _scores = new ScoreList();
    private SimpleDateFormat _dateFormat = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault());
    private LayoutInflater _inflater;
    private int[] _images;

    public ScoreAdapter(Context context,  ScoreList scores, int[] images) {
        setContext(context);
        setScores(scores);
        setImages(images);
    }

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
        setInflater((LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE));
        View itemView = getInflater().inflate(R.layout.item_score_list, viewGroup, false);

        TextView tvScore = (TextView) itemView.findViewById(R.id.item_score);
        TextView tvDate = (TextView) itemView.findViewById(R.id.item_date);
        ImageView vImage = (ImageView) itemView.findViewById(R.id.item_image);

        getScores().sort();
        Score score = (Score) getItem(i);

        tvScore.setText(String.valueOf(score.getValue()));
        tvDate.setText(getDateFormat().format(score.getDate()));
        if(i < 3) vImage.setImageResource(getImages()[i]);

        return itemView;
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
    public int[] getImages() {
        return _images;
    }
    public void setImages(int[] images) {
        _images = images;
    }
    public LayoutInflater getInflater() {
        return _inflater;
    }
    public void setInflater(LayoutInflater inflater) {
        _inflater = inflater;
    }
    public SimpleDateFormat getDateFormat() {
        return _dateFormat;
    }
    public void setDateFormat(SimpleDateFormat dateFormat) {
        _dateFormat = dateFormat;
    }
}
