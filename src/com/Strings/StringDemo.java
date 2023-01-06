package com.Strings;

public class StringDemo {
    public static void main(String[] args) {
        String s ="Sreekanth";//by using string literal
        String s1 = new String("Surya");//by using new keyword
        String s2 = new String("surya");
        System.out.println(s1.length());//5
        System.out.println(s);
        System.out.println(s.trim());
       System.out.println(s.charAt(3));//e
        System.out.println(s.toLowerCase());//sreekanth
        System.out.println(s1.toUpperCase());//SURYA
        System.out.println(s.equals(s1));//false
        System.out.println(s1.equalsIgnoreCase(s2));//true
        System.out.println(s1.isEmpty());//false
        System.out.println(s.contains("h"));//true
        System.out.println(s.indexOf('k'));//4
        System.out.println(s.lastIndexOf('h')); //8
    }
}
