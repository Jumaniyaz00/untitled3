package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>(5);
        Scanner scanner = new Scanner(System.in);
        String q = scanner.nextLine();
        String w = scanner.nextLine();
        String e = scanner.nextLine();
        String r = scanner.nextLine();
        String t = scanner.nextLine();
        a.add(q);
        a.add(w);
        a.add(e);
        a.add(r);
        a.add(t);
        Iterator iter = a.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        System.out.println("...............................");
        ArrayList<String> b = new ArrayList<>(5);
        b.add(scanner.nextLine());
        b.add(scanner.nextLine());
        b.add(scanner.nextLine());
        b.add(scanner.nextLine());
        b.add(scanner.nextLine());

        Iterator iter0 = b.iterator();
        while (iter0.hasNext()) {
            System.out.println(iter0.next());
        }
        System.out.println(".......");

        ArrayList<String> c = new ArrayList<>(5);
        c.add(a.get(0) + b.get(4));
        c.add(a.get(1) + b.get(3));
        c.add(a.get(2) + b.get(2));
        c.add(a.get(3) + b.get(1));
        c.add(a.get(4) + b.get(0));
        Iterator iter3 = c.iterator();
        while (iter3.hasNext()) {
            System.out.println(iter3.next());
        }
        System.out.println(".......");
        Collections.sort(c, Comparator.comparingInt(String::length));
        Iterator<String> iterator4 = c.iterator();
        while (iterator4.hasNext()) {
            System.out.println(iterator4.next());
        }
    }
}