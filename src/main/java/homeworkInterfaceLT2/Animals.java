package homeworkInterfaceLT2;

public interface Animals extends Life{
    void getHabitat();

    @Override
    void info();

    @Override
    void getLifeSpan();

    @Override
    void getDiet();

    @Override
    void getProcreation();

    @Override
    void getSize();
}
