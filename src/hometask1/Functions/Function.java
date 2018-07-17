package hometask1.Functions;

import hometask1.Phone.AbstractPhone;
import hometask1.Phone.MobilePhone;

import java.util.*;

public class Function {

    AbstractPhone abstractPhone = new MobilePhone();
    MobilePhone mobilePhone = (MobilePhone)abstractPhone;

    Random random = new Random();

    public String number;

    public String scanNumber() {
        System.out.print(mobilePhone.ENTERCORRECTNUMBERMESSAGE);
        java.util.Scanner scan = new Scanner(System.in);
        number = scan.next();
        System.out.println (abstractPhone.ENTEREDNUMBERMESSAGE + number);
        return number;
    }

    public void validateNumber(String number){
        if (number.length() == 13 && number.startsWith("+380")) {
            System.out.println(abstractPhone.CORRECTNUMBERMESSAGE);
        }else{
            System.out.println(mobilePhone.UNCORRECTNUMBERMESSAGE);
        }
    }

    public int genInt(int from, int to) {
        int tmp = 0;
        if (to >= from)
            tmp = (int) (from + Math.round((Math.random() * (to - from))));
        return tmp;
    }

    public void averageValue(){
        int[] numbers = {5, 8, 12, -18, -54, 84, -35, 17, genInt(1,100)};
        double average = 0;
        if (numbers.length > 0) {
            double sum = 0;
            for (int j = 0; j < numbers.length; j++) {
                sum += numbers[j];
            }
            average = sum / numbers.length + genInt(1,100);
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("Среднее арифметическое массива: " + average);
    }

    public void factorialOfNumber(){
        int i,fact=1;
        int number = genInt(1,10);
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("Факториал с числа " + number + " = " + fact);
    }

    public void fibonacciRow(){
        int limit = genInt(2,10);
        long[] series = new long[limit];
        series[0] = 0;
        series[1] = 1;
        for(int i=2; i < limit; i++){
            series[i] = series[i-1] + series[i-2];
        }
        System.out.println("Ряд Фибоначчи с " + limit + " чисел:");
        for(int i=0; i< limit; i++){
            System.out.print(series[i] + " ");
        }
    }
}







