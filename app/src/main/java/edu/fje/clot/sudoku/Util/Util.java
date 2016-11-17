package edu.fje.clot.sudoku.Util;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import edu.fje.clot.sudoku.bean.Score;

/**
 * Created by m0r on 17/11/16.
 */

public class Util {
    public static List<Score> getInitialScoreList() {
        GregorianCalendar calendar = new GregorianCalendar();
        List<Score> list = new ArrayList<>();
        calendar.set(2016,10,20,12,30,0);
        list.add(new Score(1000, calendar.getTime()));
        calendar.set(2016,9,30,11,30,0);
        list.add(new Score(1500, calendar.getTime()));
        calendar.set(2016,8,20,12,30,0);
        list.add(new Score(400, calendar.getTime()));
        calendar.set(2016,10,10,11,10,0);
        list.add(new Score(700, calendar.getTime()));
        return list;
    }
}
