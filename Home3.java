import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Комп on 13.08.2016.
 */
public class Home3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        if(n % 2 == 0)
            System.out.println("четное");
        else
            System.out.println("нечетное");
    }
}
