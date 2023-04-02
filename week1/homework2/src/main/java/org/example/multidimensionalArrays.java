package org.example;

public class multidimensionalArrays {
    public static void main(String[] args) {
        String[][] provinces = new String[3][3];

        provinces[0][0] = "Istanbul";
        provinces[0][1] = "Bursa";
        provinces[0][2] = "Bilecik";
        provinces[1][0] = "Ankara";
        provinces[1][1] = "Konya";
        provinces[1][2] = "Kayseri";
        provinces[2][0] = "Diyarbakır";
        provinces[2][1] = "Urfa";
        provinces[2][2] = "Antep";

        for(String [] row: provinces) {
            for ( String province : row){
                System.out.println(province);
            }
        }
    }


}
