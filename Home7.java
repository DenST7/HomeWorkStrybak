import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * Created by Комп on 13.08.2016.
 */
public class Home7 {
  public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double a = Integer.parseInt(reader.readLine());
        double b = Integer.parseInt(reader.readLine());
        double c = Integer.parseInt(reader.readLine());
        double d = b * b - 4 * a * c;

        if (d < 0)
            System.out.println("Корней нету");
        else if (d == 0)
            System.out.println(-b / (2 * a));
        else
        {
            System.out.println("Первый корень равен " + ((-b + Math.sqrt(d) ) / (2 * a)));
            System.out.println("Второй корень равен " + ((-b - Math.sqrt(d)) / (2 * a)));
        }
    }

}
