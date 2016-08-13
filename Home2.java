/**
 * Created by Комп on 13.08.2016.
 */
public class Home2 {

    public static void main(String[] args){
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
