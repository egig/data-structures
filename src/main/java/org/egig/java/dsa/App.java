package org.egig.java.dsa;


class App
{
    public static void main( String[] args )
    {
        // Default constructor - let's put "0" into head element.
        MyLinkedList crunchifyList = new MyLinkedList();

        // add more elements to LinkedList
        crunchifyList.add("1");
        crunchifyList.add("2");
        crunchifyList.add("3");
        crunchifyList.add("4");
        crunchifyList.add("5");

        /*
         * Please note that primitive values can not be added into LinkedList directly. They must be converted to their
         * corresponding wrapper class.
         */

        System.out.println("Print: crunchifyList: \t\t" + crunchifyList);
        System.out.println(".size(): \t\t\t\t" + crunchifyList.size());
        System.out.println(".get(3): \t\t\t\t" + crunchifyList.get(3) + " (get element at index:3 - list starts from 0)");
        System.out.println(".remove(2): \t\t\t\t" + crunchifyList.remove(2) + " (element removed)");
        System.out.println(".get(3): \t\t\t\t" + crunchifyList.get(3) + " (get element at index:3 - list starts from 0)");
        System.out.println(".size(): \t\t\t\t" + crunchifyList.size());
        System.out.println("Print again: crunchifyList: \t" + crunchifyList);
    }
}
