//user name : artiwari
// problem : https://codeforces.com/problemset/problem/282/A
import java.io.*;
import java.util.Scanner;
public class cf {
 
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        if (System.getProperty("ONLINE_JUDGE") == null) {
            try {
                System.setOut(new PrintStream(
                    new FileOutputStream("output.txt")));
                in = new Scanner(new File("input.txt"));
            }catch (Exception e) {
            }
        }
        int t=in.nextInt();
int ans=0;
 while(t-- > 0)
 {   
 String s=in.next();
 char ch=s.charAt(1);
 if(ch=='+')
  ans++;
else
 ans--;
 }
 System.out.println(ans);
}
    }
