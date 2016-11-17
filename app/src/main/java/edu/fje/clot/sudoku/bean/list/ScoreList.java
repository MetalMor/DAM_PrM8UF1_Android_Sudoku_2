package edu.fje.clot.sudoku.bean.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import edu.fje.clot.sudoku.bean.Score;
import edu.fje.clot.sudoku.comparator.ScoreComparator;

/**
 * Created by becari on 17/11/2016.
 */

public class ScoreList {

    private List<Score> _list = new ArrayList<>();

    public ScoreList() {
        // TODO: sacar lista de puntuaciones
    }

    public boolean add(Score score) {
        return getList().add(score);
    }
    public boolean addAll(Collection<Score> scores) {
        return getList().addAll(scores);
    }
    public boolean set(Score score) {
        int index = getList().indexOf(score);
        if(index < 0) return add(score);
        return getList().set(index, score).equals(score);
    }
    public Score get(int i) {
        return getList().get(i);
    }
    public Score remove(int i) {
        return getList().remove(i);
    }
    public Score remove(Score score) {
        return getList().remove(getList().indexOf(score));
    }
    public boolean contains(Score score) {
        return getList().contains(score);
    }

    public int count() {
        return getList().size();
    }
    public void sort() {
        Collections.sort(getList(), new ScoreComparator());
    }
    public List<Score> getTop(int n) {
        sort();
        return getList().subList(0, n);
    }
    public List<Score> getList() {
        if(_list == null) _list = new ArrayList<>();
        return _list;
    }
    public void setList(List<Score> list) {
        _list = list == null ? _list : list;
    }
}
