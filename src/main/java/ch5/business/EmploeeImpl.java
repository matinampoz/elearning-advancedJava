package ch5.business;

public class EmploeeImpl implements IEmploee{
    private String name;

    public EmploeeImpl(String name) {
        this.name = name;
    }

    @Override
    public void sendGreetings(IGreetings greetings) {
        greetings.send();
    }

    @Override
    public String toString() {
        return name;
    }
}
