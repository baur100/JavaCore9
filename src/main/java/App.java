public class App {
    public static void main(String[] args)
    {
        System.out.println("Hello, World");
        Person olga=new Person();
        olga.name="Olga";
        olga.age=51;
        olga.sex=true;
        olga.lastName="Borovikova";
        olga.printPerson();

        Person egor=new Person();
        egor.name="Egor";
        egor.age=10;
        egor.sex=false;
        egor.lastName="Borovikov";
        egor.printPerson();
        egor.printSex();



    }
}
