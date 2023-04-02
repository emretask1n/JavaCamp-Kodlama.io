package org.example;

public class findNumber {
    public static void main(String[] args) {
        int[] numbers = new int[]{1,2,3,4,5,6};
        int searchFor = 5;
        System.out.println(findANumber(numbers, searchFor));
    }

    private static boolean findANumber(int[] numbers, int searchFor) {
        for(int number : numbers){
            if(number==searchFor){
                return true;
            }
        }
        return false;
    }

}
