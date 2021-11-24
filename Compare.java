package Assignment5;
import java.io.*;
import java.util.*;
public class Compare {
        public static void main(String[] args)
        {
            // List initialization
            List<Integer> l = new ArrayList<>();

            // Add elements in the list
            l.add(20);
            l.add(15);
            l.add(198);
            l.add(49);
            l.add(36);

            // Minimum in the list
            int minimum = Collections.min(l);

            // Maximum in the list
            int maximum = Collections.max(l);

            if (minimum == maximum) {
                System.out.println("All elements are equal");
            }
            else {
                System.out.println("Min value of our list : "
                        + minimum);
                System.out.println("Max value of our list : "
                        + maximum);
            }
        }
    }


