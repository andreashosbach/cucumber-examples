package business;

public class CucumberJar {
    private int cucumbers;

    public void setCucumbers(int cucumbers) {
        this.cucumbers = cucumbers;
    }

    public int getCucumbers() {
        return cucumbers;
    }

    public void addCucumbers(int cucumbers) {
        this.cucumbers += cucumbers;
    }

    public void removeCucumbers(int cucumbers) {
        this.cucumbers -= cucumbers;
    }
}
