package View.lib;

import java.util.Comparator;

public class ComparableQueue<T extends Comparable<T>> extends NumberQueue<T> {
    private  final class QueueComparator implements Comparator<T> {

        @Override
        public int compare(T obj1, T obj2) {

            return obj1.compareTo(obj2);
        }

        @Override
        public Comparator<T> reversed() {

            return new ReversedQueueComparator();

        }




    }
    private  final class ReversedQueueComparator implements Comparator<T> {
        @Override
        public int compare(T obj1, T obj2) {

            return obj2.compareTo(obj1);
        }

        @Override
        public Comparator<T> reversed() {


            return new QueueComparator();

        }
    }}


