package Test_0331;

/*
��ƻ��
 ��Ŀ����
С��ȥ�������̵���ƻ������թ���̷�ʹ���������ף�ֻ�ṩ6��ÿ����8��ÿ���İ�װ(��װ���ɲ��)�� ����С������ֻ�빺��ǡ��n��ƻ����С���빺�����ٵĴ�������Я����������ܹ���ǡ��n��ƻ����С�׽����Ṻ��
��������:
����һ������n����ʾС���빺��n(1 �� n �� 100)��ƻ��
�������:
���һ��������ʾ������Ҫ����Ĵ��������������ǡ��n��ƻ�������-1
ʾ��1
����
20
���
3
 */
//import java.util.*;
//public class Main{
//    public static void main(String[] args){
//        System.out.println(solution());
//    }
//    public static int solution(){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int n8 = n/8;
//        int n6 = 0;
//        int d = n%8;
//        for(; d!=0 && n6<=n/6; n6++){
//            if(d == 6){
//                d = 0;
//            }else if(d != 6 && n8>0){
//                n8--;
//                d = n - n8*8 -(n6+1)*6;
//            }
//        }
//        return d == 0 ? n6+n8 : -1;
//    }
//}

/*
������
 ��Ŀ����
����һ������������д��������ж��ٶ������ĺ͵���������������������������������ֵС��1000��
�磬����Ϊ10, ����Ӧ��������Ϊ2�����������������ĺ�Ϊ10,�ֱ�Ϊ(5,5),(3,7)��
��������:
�������һ������n,(3 �� n < 1000)
�������:
�������
ʾ��1
����
10
���
2
 */
//import java.util.*;
//public class Main{
//    public static void main(String[] args){
//        System.out.println(solution());
//    }
//    public static int solution(){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int count = 0;
//        for(int i=2; i<=n/2; i++){
//            if(isprime(i) && isprime(n-i)){
//                count++;
//            }
//        }
//        return count;
//    }
//    public static boolean isprime(int n){
//        if(n != 2 && n%2 == 0){
//            return false;
//        }
//        for(int i=3; i<=Math.sqrt(n); i+=2){
//            if(n%i == 0){
//                return false;
//            }
//        }
//        return true;
//    }
//}

/*
��Ҫ��
 ��Ŀ����
����С����һ��W*H��������ӣ�������б��Ϊ0~H-1��������б��Ϊ0~W-1��ÿ������������Է�һ�鵰�⣬�������鵰���ŷ����þ��벻�ܵ���2��
����������������(x1,y1),(x2,y2)��ŷ����þ���Ϊ:
( (x1-x2) * (x1-x2) + (y1-y2) * (y1-y2) ) ������ƽ����
С����֪�������ԷŶ��ٿ鵰������������
��������:
ÿ������������񳤿�W,H���ÿո�ָ�.(1 �� W��H �� 1000)
�������:
���һ�������Էŵĵ�����
ʾ��1
����
3 2
���
4
 */
//import java.util.*;
//public class Main{
//    public static void main(String[] args){
//        System.out.println(solution());
//    }
//    public static int solution(){
//        Scanner sc = new Scanner(System.in);
//        int W = sc.nextInt();
//        int H = sc.nextInt();
//        int d1;
//        int d2;
//        int res = 0;
//        if(W%4 == 0){
//            d1 = W/2;
//            d2 = W/2;
//        }else if(W%4 == 1){
//            d1 = W/2 +1;
//            d2 = W/2;
//        }else if(W%4 == 2){
//            d1 = (W-2)/2 +2;
//            d2 = (W-2)/2;
//        }else{
//            d1 = (W-2)/2 +2;
//            d2 = (W-2)/2+1;
//        }
//        if(H%4 == 0){
//            res = H/2*(d1+d2);
//        }else if(H%4 == 1){
//            res = H/2*(d1+d2) +d1;
//        }else if(H%4 == 2){
//            res = (H-2)/2*(d1+d2) +d1*2;
//        }else{
//            res = (H-2)/2*(d1+d2) +d1*2+d2;
//        }
//        return res;
//    }
//}

/*
ͳ�ƻ���
��Ŀ����
�����Ĵ�����һ�������ͷ�����һ�����ַ��������硰level�����ߡ�noon���ȵȾ��ǻ��Ĵ��������ǳ�ϲ������ӵ�жԳ����Ļ��Ĵ������յ�ʱ�����õ���������ֱ����ַ���A���ַ���B���������ǳ�������û�а취���ַ���B�����ַ���Aʹ�������ַ�����һ�����Ĵ�������ܻ��������󣬰�����Ѱ���ж����ֲ���취����ʹ�´���һ�����Ĵ�������ַ���B�����λ�ò�ͬ�Ϳ���Ϊ��һ���İ취��
���磺
A = ��aba����B = ��b����������4�ְ�B����A�İ취��
* ��A�ĵ�һ����ĸ֮ǰ: "baba" ���ǻ��� 
* �ڵ�һ����ĸ��a��֮��: "abba" �ǻ��� 
* ����ĸ��b��֮��: "abba" �ǻ��� 
* �ڵڶ�����ĸ'a'֮�� "abab" ���ǻ��� 
�������������Ĵ�Ϊ2
��������:
ÿ���������ݹ����С�
��һ��Ϊ�ַ���A
�ڶ���Ϊ�ַ���B
�ַ������Ⱦ�С��100��ֻ����Сд��ĸ
�������:
���һ�����֣���ʾ���ַ���B�����ַ���A֮�󹹳�һ�����Ĵ��ķ�����
ʾ��1
����
aba
b
���
2
 */
import java.util.*;
public class Main{
    public static void main(String[] args){
        System.out.println(solution());
    }
    public static int solution(){
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        int count = 0;
        for(int i=0; i<A.length(); i++){
            String s = A.substring(0,i) +B + A.substring(i);
            if(isHuiwen(s)){
                count++;
            }
        }
        if(isHuiwen(A+B)){
            count++;
        }
        return count;
    }
    public static boolean isHuiwen(String s){
        for(int i=0,j=s.length()-1; i<s.length()/2; i++,j--){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
        }
        return true;
    }
}