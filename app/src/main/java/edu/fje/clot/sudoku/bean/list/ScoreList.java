package edu.fje.clot.sudoku.bean.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import edu.fje.clot.sudoku.bean.Score;

/**
 * Created by becari on 17/11/2016.
 */

public class ScoreList {

    private List<Score> _list = new ArrayList<>();

    public ScoreList() {
        // TODO: sacar lista de puntuaciones
    }

    public boolean add(Score score) {
        if(contains(score) || score.getId() < 0)
            score.setId(getMaxId() + 1);
        return getList().add(score);
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
    private int getMaxId() {
        int id = 0;
        for (Score score: getList())
            if(score.getId() > id)
                id = score.getId();
        return id;
    }

    public int count() {
        return getList().size();
    }
    public List<Score> getTop(int n) {
        Collections.sort(getList());
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
