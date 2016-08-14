/**
 * Created by Комп on 13.08.2016.
 */
public class Home2 {

    public static void main(String[] args){         //не совсем понял задание. поэтому два варианта. это первый
        String name1 = "spot";
        String says1 = "Ruff!";
        Dog spot = new Dog(name1, says1);
        String name2 = "scruffy";
        String says2 = "Wurf!";
        Dog scruffy = new Dog(name2, says2);

    }

    public static class Dog {
        String name;
        String says;

        public Dog(String name, String says) {
            this.name = name;
            this.says = says;
        }
    }
}



private class Home21 {                     //второй вариант
    Dog dog1 = new Dog();
    Dog dog2 = new Dog();
    dog1.name = "spot";
    dog1.says = "Ruff";
    dog2.name = "scruffy";
    dog2.says = "Wurf";

    public static class Dog {
        String name;
        String says;

        public Dog(String name, String says) {
            this.name = name;
            this.says = says;
        }
    }

}
