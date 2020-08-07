import java.io.*;

public class Hello02{
  public static void main(String[] args) throws IOException{
    String str;
    int i;
    double d;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("文字を入力してください。");
    str = br.readLine();
    System.out.println("整数を入力してください。");
    i = Integer.parseInt(br.readLine());
    System.out.println("小数を入力してください。");
    d = Double.parseDouble(br.readLine());

    System.out.println("\n文字は " + str + "\n整数は " + i + "\n小数は " + d + "\nですね。");
  }
}
