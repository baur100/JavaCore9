package lesson12SO03;

public class SO03L12App1 {
    public static void main(String[] args) {
        int a = 5;
        int b = a;

        b = 6;
        System.out.println("a = "+a + "b = "+b);

        SO03L12Fruit f1 = new SO03L12Fruit("Apple");
        SO03L12Fruit f2 = f1;

        f2.setName("Pineapple");
        System.out.println("f1 = "+f1.getName()+" f2 = "+f2.getName());

        int[] arr = {1,1,2};
        int[] arr2 = arr;
        arr2[0] = 5;
        System.out.println(arr[0]);

        SO03L12Fruit fruit = new SO03L12Fruit(f1.getName());



    }
}
