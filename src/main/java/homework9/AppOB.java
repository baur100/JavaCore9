package homework9;

public class AppOB {
    public static void main(String[] args) {

        //PERSON

        PersonOB helen = new PersonOB();
        helen.setName("Helen");
        helen.setLastName("Smith");
        helen.setAge(40);
        helen.setGender("Female");
        System.out.println(helen.getLastName());

        PersonOB anna = new PersonOB("Anna", "Lee", 28, "Female");
        //System.out.println(anna.getAge());
        anna.printInfo();


        PersonOB peter = new PersonOB("Peter", 34);
        System.out.println(peter.getName());


    //CLOTHING
    ClothingOB shirt = new ClothingOB("Shirt", "Gucci",2,500);
    shirt.printClothing();

    ClothingOB dress = new ClothingOB();
    dress.setBrand("D&G");
    dress.setType("Dress");
    dress.setPrice(1000);
    dress.setAmount(8);
    dress.printClothing();



    //DOGS
        DogsOB eBulldog = new DogsOB();
        eBulldog.setBreed("English Bulldog");
        eBulldog.setColor("White and Brown");
        eBulldog.setHeight(50);
        eBulldog.setWeight(25);
        String bulldog = eBulldog.getBreed();
        System.out.println(bulldog);


        DogsOB husky = new DogsOB("Husky","Grey and White",60,28);
        System.out.println(husky.getColor());
        husky.printDog();


        //FURNITURE
         FurnitureOB chair=new FurnitureOB();
         chair.setAmount(7);
         chair.setColor("Cyan");
         chair.setName("Chair");
         chair.setPrice(99.99);
         chair.setMaterial("Plush");
        System.out.println(chair.getColor()+" "+chair.getMaterial()+" "+chair.getName());

        FurnitureOB sofa=new FurnitureOB("Grey","Plush","Sofa",199.00,1);
        sofa.printFurniture();
    }
}
