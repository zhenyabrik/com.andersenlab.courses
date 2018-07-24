package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Start {

    public ArrayList<Car> cars = new ArrayList();

    public void createCarsArrayList() {

        Car car1 = new Car("bmw", 1990);
        Car car2 = new Car("opel", 2000);
        Car car3 = new Car("nissan");
        Car car4 = new Car("mercedes", 2017);

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);

        Collections.sort(cars);
        print();

        Collections.sort(cars, new CarNameComparator());
        print();

        Collections.sort(cars, new CarYearComparator());
        print();

    }
        public void print(){
            System.out.println();
            Iterator<Car> iterator = cars.iterator();
            while (iterator.hasNext()){
                Car car = iterator.next();
                System.out.println(car.getName() + " " + car.getYear());
            }
        }
}
