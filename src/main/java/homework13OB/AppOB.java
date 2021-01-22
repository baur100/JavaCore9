package homework13OB;

public class AppOB {
    public static void main(String[] args) {
        //        Create an interface and 2 classes which implements it
//        Create 2 objects of each class
//        Assign one object to interface type
 CatOB cat = new CatOB("Calamari");
 AnimalOB cat2=new CatOB("Salmon");
 AnimalOB dog = new DogOB("Sausages");
 DogOB dog2=new DogOB("Meat");


 AnimalOB[]food = {dog,cat,dog2,cat2};
 for (AnimalOB f:food){
     f.draw();
 }


    }
}
