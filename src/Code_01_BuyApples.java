import java.util.Scanner;

/**
 * @author wangchong
 * @date 2019/5/22 22:18
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class Code_01_BuyApples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int time = n / 8;
        int sum = 0;
        for (int i = time; i >= 0; i--){
            for (int j = 0;; j++) {
                if (i * 8 + j * 6 == n) {
                    sum = i + j;
                    break;
                } else if (i * 8 + j * 6 > n) {
                    break;
                }

            }
            if (sum != 0) {
                System.out.println(sum);
                break;
            }
        }
        if (sum == 0) {
            System.out.println(-1);
        }

    }
}
