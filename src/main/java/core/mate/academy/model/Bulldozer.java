package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int bladeSize;

    public Bulldozer() {

    }

    public int getBladeSize() {
        return bladeSize;
    }

    public void setBladeSize(int bladeSize) {
        this.bladeSize = bladeSize;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
