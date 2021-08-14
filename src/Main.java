// Tasks 7 & 8

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MyList myList = new MyList(new Integer[]{5, 4, 8,0,-4,6,3,7,8,});
        System.out.println("Max item = " + myList.getMaxItem());
        System.out.println("2nd Max item = " + myList.getSecondMaxItem());
        System.out.println("Min item = " + myList.getMinItem());
    }
}

class MyList {
    private ArrayList<Integer> myList;
    private int maxItem;
    private int minItem;
    private int secondMaxItem;

    public MyList(Integer[] array) {
        this.myList = new ArrayList<Integer>();
        this.maxItem = Integer.MIN_VALUE;
        this.minItem = (Integer.MAX_VALUE);
        this.secondMaxItem = Integer.MIN_VALUE ;
        for (int item : array) {
            this.myList.add(item);
        }
    }

    public int getMaxItem() {
        Iterator<Integer> iterator = this.myList.iterator();
        while (iterator.hasNext()) {
            maxItem = Math.max(maxItem, iterator.next());
        }
        return maxItem;
    }
    public int getSecondMaxItem() {
        Iterator<Integer> iterator = this.myList.iterator();
        while (iterator.hasNext()) {
            int temp = iterator.next();
            maxItem = Math.max(maxItem,temp);
            if (maxItem <= temp) secondMaxItem=Math.max(secondMaxItem,temp);
        //    if (maxItem != temp) secondMaxItem=Math.max(secondMaxItem,temp);  Changed so thaht if there is a tie for max, 2nd highest is that element.
        }
        return secondMaxItem;
    }

    public int getMinItem() {
        Iterator<Integer> iterator = this.myList.iterator();
        while (iterator.hasNext()) {
            minItem = Math.min(minItem, iterator.next());
        }
        return minItem;
    }

    /*public void printMyList() {
        Iterator<Integer> iterator = myList.iterator();
        while (iterator.hasNext()) System.out.print(iterator.next() + " ");
        System.out.println("");
    }

    public void addItems(Integer[] array) {
        for (int item : array) {
            this.myList.add(item);
        }
    }*/
}


