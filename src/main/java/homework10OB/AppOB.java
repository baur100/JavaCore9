package homework10OB;

import lesson10.Student;

public class AppOB {
    public static void main(String[] args) {

        GrandParentOB grandPa = new GrandParentOB("Rick", "Smith", 1939,
                "Red", "Green");

        {
            grandPa.printGrandParent();
        }


        GrandParentOB grandMa=new GrandParentOB("Laura","Smith",1942,
                "Brown","brown");{
                    grandMa.printGrandParent();
        }

        ChildrenOB son = new ChildrenOB("Sam","Smith",1968,"Red",
                "Brown","Biology","Cosmos","Scientist");{
                    son.printChild();
        }

        ChildrenOB daughter= new ChildrenOB("Mary","Smith",1972,
                "Brown","Green",
                "Philology","Sewing","Philologist");{
                    daughter.printChild();
        }
        GrandChildrenOB grandSon=new GrandChildrenOB("Sam","Smith",1990,
                "Brown","Green",
                "Hockey","Dentist","Comics");{
                    grandSon.printGrandChild();
        }

        GrandChildrenOB youngerGrandSon = new GrandChildrenOB("Ethan","Smith",1995,
                "Red","Brown","Baseball","Star Wars");{
                    youngerGrandSon.printYoungerGC();
        }



        // ENUMS

        SubjectOB[] allanSubs = {SubjectOB.ARCHITECTURE,SubjectOB.MATH,SubjectOB.TRIGONOMETRY,SubjectOB.ART};

        StudentOB allan=new StudentOB("Allan","Smith",allanSubs,NameOfSchool.NYC,SubjectOB.ARCHITECTURE);{
            allan.printStudent();   //How to print out correctly array of subjects?
        }

    }

}