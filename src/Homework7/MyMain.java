package Homework7;

import Class2.PractiseTwo;

public class MyMain {

    public static void main(String[] args) {
        Template t1 = new Template();
        double[] values = {2.5, 1.5, 10.5, 8.5};
        double sum = t1.addNumbers(values);

        int num = 7;
        boolean isItPrime = t1.primeOrNot(7);

        String word = "level";
        boolean result = t1.ifItsPalindrome("level");



        String[] value1 = {"Happy", "Healthy", "Beautiful",};
        String[] value2 = {"Happy", "Healthy", "Kind", "Beautiful"};
        t1.commonValues(value1,value2);

        PractiseTwo pr1 = new PractiseTwo();
        pr1.duplicateStr("nargis, idris, azfeer, nargis");











    }

    public double addNumbers(double[] arr) {
        double sum =0;
        for(int i=0; i<=arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
        return sum;
    }

    public static double multiplyNumbers(double[] arr) {
        double sum =0;
        for(int i=0; i<=arr.length; i++) {
            sum=sum*arr[i];
        }
        return sum;
    }
}
