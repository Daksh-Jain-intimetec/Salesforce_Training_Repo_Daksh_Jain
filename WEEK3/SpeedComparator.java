package WEEK3;

import java.util.*;

public class SpeedComparator implements Comparator<Plan>{
    @Override
    public int compare(Plan o1, Plan o2){
        return Double.compare(o1.getSpeed(), o2.getSpeed());
    }
}
