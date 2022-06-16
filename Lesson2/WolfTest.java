public class WolfTest {
    
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.gender = "male";
        wolf.alias = "bloody beast";
        wolf.age = 3;
        wolf.weight = 25;
        wolf.color = "gray";
        System.out.println("Кличка: " + wolf.alias);
        System.out.println("Пол: " + wolf.gender);
        System.out.printf("Возраст: %d лет\n", wolf.age);
        System.out.printf("Вес: %d кг\n", wolf.weight);
        System.out.println("Окрас: " + wolf.color);
        wolf.sit();
        wolf.howl();
        wolf.walk();
        wolf.run();
        wolf.hunt();
    }
}
