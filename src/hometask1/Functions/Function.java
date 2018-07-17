package hometask1.Functions;

import java.util.Scanner;

public class Function {

    public String number;

    public String scanNumber() {
        System.out.print("Введите номер телефона в формате +(380)9XXXXXXXX: ");
        java.util.Scanner scan = new Scanner(System.in);
        number = scan.next();
        System.out.println ("Вы ввели номер: " + number);
        return number;
    }

    public void validateNumber(String number){
        if (number.length() == 13 && number.startsWith("+380")) {
            System.out.println("Вы ввели корректный номер");
        }else{
            System.out.println("Введен не корректный номер, номер телефона должен состоять из 13 символов и содержать код страны (+380)");
        }
    }
}

