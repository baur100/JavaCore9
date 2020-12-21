package homeWork14SO03;

import java.util.ArrayList;

public class ClassArrayList {
    public static void main(String[] args) {

        ArrayList<Cars> cars = new ArrayList<>();
        cars.add(Cars.ACURA);
        cars.add(Cars.BMW);
        cars.add(Cars.DODGE);
        cars.add(Cars.HONDA);
        cars.add(Cars.VOLVO);
        cars.add(Cars.FORD);
        cars.add(Cars.AUDI);
        cars.add(Cars.CADILLAC);
        cars.add(Cars.TOYOTA);
        cars.add(Cars.NISSAN);
        System.out.println(cars);
        System.out.println(cars.size());
        System.out.println(cars.get(3));
        cars.set(3, Cars.BMW);
        System.out.println(cars);
        cars.remove(1);
        System.out.println(cars);
        for (Cars cc: cars){
            System.out.println(cc);
        }
    }
}
