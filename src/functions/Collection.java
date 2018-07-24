package functions;

import java.util.ArrayList;
import java.util.Collections;

public class Collection {

    ArrayList<String> mobilePhoneList = new ArrayList();
    public void createArrayList(){
        mobilePhoneList.add("samsung"); //0
        mobilePhoneList.add("nokia");   //1
        mobilePhoneList.add("apple");   //2
        mobilePhoneList.add("lg");      //3
        mobilePhoneList.add("meizu");   //4
        mobilePhoneList.add("xiaomi");  //5
        System.out.println(mobilePhoneList);

        mobilePhoneList.add(2, "oppo");
        System.out.println(mobilePhoneList);

        mobilePhoneList.remove(4);
        System.out.println(mobilePhoneList);

        mobilePhoneList.ensureCapacity(2);
        System.out.println(mobilePhoneList);

        Collections.sort(mobilePhoneList);
        System.out.println(mobilePhoneList);
    }
}
