package WEEK3;

import java.util.*;

public class PriceComparator implements Comparator<Plan>{
    @Override
    public int compare(Plan o1, Plan o2) {
        return Double.compare(o1.getPlanPrice(),o2.getPlanPrice());
    };
}
