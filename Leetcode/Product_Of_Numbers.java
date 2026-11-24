package Leetcode;

import java.util.*;

class Product_Of_Numbers {

    List<Integer> list;
    List<Integer> prefix;
    boolean zero = false;
    int size;

    public Product_Of_Numbers() {
        list = new ArrayList<>();
        prefix = new ArrayList<>();
        size = 0;
        prefix.add(1);
    }

    public void add(int num) {
        list.add(num);
        prefix.add(prefix.get(size) * num);
        size++;
        if (num == 0) {
            zero = true;
        }
        ;
    }

    public int getProduct(int k) {
        if (!zero) {
            return prefix.get(size) / prefix.get(size - k);
        } else {
            int prod = 1;

            int i = 0;

            while (k-- > 0) {

                prod *= list.get(size - 1 - i);

                i++;

            }

            return prod;
        }
    }

    public static void main(String[] args) {
        Product_Of_Numbers obj = new Product_Of_Numbers();

        obj.add(3);
        obj.add(0);
        obj.add(2);
        obj.add(5);
        obj.add(4);

        System.out.println("getProduct(2): " + obj.getProduct(2));
        System.out.println("getProduct(3): " + obj.getProduct(3));
        System.out.println("getProduct(4): " + obj.getProduct(4));

        obj.add(8);

        System.out.println("getProduct(2): " + obj.getProduct(2));
    }
}
