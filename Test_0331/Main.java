package Test_0331;

/*
买苹果
 题目描述
小易去附近的商店买苹果，奸诈的商贩使用了捆绑交易，只提供6个每袋和8个每袋的包装(包装不可拆分)。 可是小易现在只想购买恰好n个苹果，小易想购买尽量少的袋数方便携带。如果不能购买恰好n个苹果，小易将不会购买。
输入描述:
输入一个整数n，表示小易想购买n(1 ≤ n ≤ 100)个苹果
输出描述:
输出一个整数表示最少需要购买的袋数，如果不能买恰好n个苹果则输出-1
示例1
输入
20
输出
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
素数对
 题目描述
给定一个正整数，编写程序计算有多少对质数的和等于输入的这个正整数，并输出结果。输入值小于1000。
如，输入为10, 程序应该输出结果为2。（共有两对质数的和为10,分别为(5,5),(3,7)）
输入描述:
输入包括一个整数n,(3 ≤ n < 1000)
输出描述:
输出对数
示例1
输入
10
输出
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
不要二
 题目描述
二货小易有一个W*H的网格盒子，网格的行编号为0~H-1，网格的列编号为0~W-1。每个格子至多可以放一块蛋糕，任意两块蛋糕的欧几里得距离不能等于2。
对于两个格子坐标(x1,y1),(x2,y2)的欧几里得距离为:
( (x1-x2) * (x1-x2) + (y1-y2) * (y1-y2) ) 的算术平方根
小易想知道最多可以放多少块蛋糕在网格盒子里。
输入描述:
每组数组包含网格长宽W,H，用空格分割.(1 ≤ W、H ≤ 1000)
输出描述:
输出一个最多可以放的蛋糕数
示例1
输入
3 2
输出
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
统计回文
题目描述
“回文串”是一个正读和反读都一样的字符串，比如“level”或者“noon”等等就是回文串。花花非常喜欢这种拥有对称美的回文串，生日的时候她得到两个礼物分别是字符串A和字符串B。现在她非常好奇有没有办法将字符串B插入字符串A使产生的字符串是一个回文串。你接受花花的请求，帮助她寻找有多少种插入办法可以使新串是一个回文串。如果字符串B插入的位置不同就考虑为不一样的办法。
例如：
A = “aba”，B = “b”。这里有4种把B插入A的办法：
* 在A的第一个字母之前: "baba" 不是回文 
* 在第一个字母‘a’之后: "abba" 是回文 
* 在字母‘b’之后: "abba" 是回文 
* 在第二个字母'a'之后 "abab" 不是回文 
所以满足条件的答案为2
输入描述:
每组输入数据共两行。
第一行为字符串A
第二行为字符串B
字符串长度均小于100且只包含小写字母
输出描述:
输出一个数字，表示把字符串B插入字符串A之后构成一个回文串的方法数
示例1
输入
aba
b
输出
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