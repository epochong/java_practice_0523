import java.util.Scanner;

/**
 * @author wangchong
 * @date 2019/5/22 22:40
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class Code_02_DelContainsStr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        String b = input.nextLine();
        for (int i = 0; i < b.length(); i++) {
            a = a.replace(String.valueOf(b.charAt(i)),"");
        }
        System.out.println(a);
    }
}
