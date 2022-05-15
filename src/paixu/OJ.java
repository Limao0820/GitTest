package paixu;

import java.util.Scanner;

/**
 * @author Yanko
 * @create 2022-04-17 12:26 PM
 */
public class OJ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//定义scanner，等待输入
        //获取输入的整数序列
        while (sc.hasNext()) {
            int m, x, y;
            m = sc.nextInt();
            for (int i = 0; i < m; i++) {
                x = sc.nextInt();
                y = sc.nextInt();
                int res = x + y;
                System.out.println(res);

            }
        }
    }

}
