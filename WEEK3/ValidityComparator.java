package WEEK3;

import java.util.*;

public class ValidityComparator implements Comparator<Plan>{
    @Override
    public int compare(Plan o1, Plan o2){
        return o1.getValidity() - o2.getValidity();
    }
}
