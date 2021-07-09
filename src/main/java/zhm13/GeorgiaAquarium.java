package zhm13;

import net.bytebuddy.asm.Advice;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.Throw;

public class GeorgiaAquarium extends BaseCalculation implements Price{

    public GeorgiaAquarium(int age, double baseRate) {
        super(age, baseRate);
    }

    @Override
    public void printInfo() {
        if (age >2){
        System.out.println("Georgia Aquarium standart price will be "+baseRate+" for "+age+" y.o.");
        }
        else {
            System.out.println("Free ticket");
        }
    }

    @Override
    public double getHolidayPrice() {
        return baseRate*2;
    }

    @Override
    public double get50offPrice() {
        return baseRate*0.5;
    }
}
