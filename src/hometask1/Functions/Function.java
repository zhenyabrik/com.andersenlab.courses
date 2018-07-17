package hometask1.Functions;

import hometask1.Phone.AbstractPhone;
import hometask1.Phone.MobilePhone;

import java.util.Scanner;

public class Function {

    AbstractPhone abstractPhone = new MobilePhone();
    MobilePhone mobilePhone = (MobilePhone)abstractPhone;

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
}

