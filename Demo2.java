import java.util.HashMap;
import java.util.Scanner;

public class Demo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.printf("请输入一个字符串");
        String s = sc.next();
        HashMap<Character,Integer> map=new HashMap<>();
        for (char c:
             s.toCharArray()) {
            if (map.containsKey(c)){
                Integer integer = map.get(c);
                integer++;
                map.put(c,integer);
            }else {
                map.put(c,1);
            }
        }
        for (Character cr:
             map.keySet()) {
            Integer va = map.get(cr);
            System.out.printf(cr+"="+va);

        }
    }
}
