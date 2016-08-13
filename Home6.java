import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Комп on 13.08.2016.
 */
public class Home6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int s = (a * b) / 2;
        System.out.println("Площадь " + s);
        double p = a + b + Math.sqrt(a * a + b * b);
        System.out.println("Периметр " + p);

    }
}
