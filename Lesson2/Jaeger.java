public class Jaeger {
    
    private String mark;
    private String origin;
    private double height;
    private double weight;
    private int speed;
    private int strength;
    private int armor;

    public Jaeger() {

    }

    public Jaeger(String mark, String origin, double height,
            double weight, int speed, int strength, int armor) {
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.strength = strength;
        this.armor = armor;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getOrigin() {
        return origin;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }
    
    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getArmor() {
        return armor;
    }

    public void move() {
        System.out.printf("%s move one step\n", mark);
    }

    public void attack() {
        System.out.printf("%s attacking\n", mark);
    }

    public void drift() {
        System.out.printf("%s entering in drift\n", mark);
    }

    @Override
    public String toString() {
        return String.format("Mark: %s\nOrigin: %s\nHeight: %.2f\nWeight: %.2f\nSpeed: %d\nStrength: %d\nArmor: %d",
            mark, origin, height, weight, speed, strength, armor);
    }
}
