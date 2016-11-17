package edu.fje.clot.sudoku.comparator;

import java.util.Comparator;

import edu.fje.clot.sudoku.bean.Score;

/**
 * Created by m0r on 17/11/16.
 */

public class ScoreComparator implements Comparator {
    @Override
    public int compare(Object o, Object t1) {
        return ((Score) o).compareTo(t1);
    }
}
