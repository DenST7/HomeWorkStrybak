import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * Created by Комп on 13.08.2016.
 */

public class Home8 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int age = Integer.parseInt(reader.readLine());
        int weight = Integer.parseInt(reader.readLine());
    }
    public void setAge(int age){
        age = age;                                          //знаю, что неправильно. но попытаться стоило
    }

    public Integer getAge(int age){
        return age;
    }
    
    public void setWeight(int weight){
        weight = weight;
    }
    public Integer getWeight(int weight){
        return weight;
    }
}
}
