/**
 * Created by Комп on 13.08.2016.
 */
public class Home5 {
  public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());

    if((n - 10) < (m - 10))
        System.out.println("Ближе " + m);
    else
        System.out.println("Ближе " + n);    //про равенство в условии  не сказано -_-


    }

}
