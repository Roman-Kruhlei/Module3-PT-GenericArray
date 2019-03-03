package com;

import java.util.*;

public class ArrayGeneric<T extends Number> {

    static Random r = new Random();
    LinkedList<LinkedList<T>> colList = new LinkedList<>();
    LinkedList<T> rList = new LinkedList<>();
    private Class<T> q;
    T w ;
    public static void main(String[] args) {
     ArrayGeneric<Integer> main = new ArrayGeneric<>();
            for (int qq = 0; qq < 10; qq++) {
                main.rList.add(r.nextInt(100));
                main.colList.add(main.rList);
            }
            try {
                for (Iterator<LinkedList<Integer>> colIter = main.colList.iterator();
                     ((ListIterator<LinkedList<Integer>>) colIter).nextIndex() < main.colList.size(); ) {
                    for (Iterator<Integer> rIter = main.rList.iterator()
                         ; ((ListIterator<Integer>) rIter).nextIndex() < main.rList.size(); ) {
                        System.out.print(colIter.next());
                        System.out.println();
                    }
                }
            }catch(NoSuchElementException e){}




    }
    public <T extends Number> void get(int rI,int cI){

        

    }
}
