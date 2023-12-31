package com.juaracoding;

public class NoTwo {
    public static void main(String[] args) {
        String numberData = data();

        while (!numberData.equals("5")) {
            System.out.println(numberData);
            if( numberData.length() > 2) {
                numberData= numberData.substring(1, numberData.length() -1);
            } else{
                break;
            }
        }
        System.out.println(numberData);
    }
    public static String data(){
        String angka ="";
        for (int i = 1; i < 10; i+=2) {
            if (i > 1){
                angka += "_"+ i;
            }else {
                angka += String.valueOf(i);
            }
        }
        return angka;
    }
}
