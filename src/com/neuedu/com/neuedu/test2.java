package com.neuedu.com.neuedu;


import java.util.Scanner;

public class test2 {
//    打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。例如： 153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。
//            1.程序分析：利用for循环控制100-999个数，每个数分解出个位，十位，百位。
//public static void main(String[] args) {
//        for (int i=100;i<=999;i++){
//            int a=i/100;
//            int b=i%100/10;
//            int c=i%10;
//            if (i==a*a*a+b*b*b+c*c*c){
//            System.out.println(i);
//
//    }
//        }

//}




//    题目：利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下 的用C表示。
//public static void main(String[] args)
//        int a=70;
//        if(a>=90){
//            System.out.println("A");
//        }else if (a>=60&&a<=89){
//            System.out.println("B");
//        }else if (a<60){
//            System.out.println("C");
//        }
//

//}




//    题目：有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？ 1.程序分析：可填在百位、十位、个位的数字都是1、2、3、4。组成所有的排列后再去 掉不满足条件的排列。
//
//


 //   public static void main(String[] args) {
//
//    int i=0;  //保存百位上的数
//    int j=0;  //保存十位上的数
//    int k=0;  //保存各位上的数
//    int t=0;  //保存数字个数
//    for(i=1;i<=4;i++)
//    for(j=1;j<=4;j++)
//    for(k=1;k<=4;k++){
//        if(i!=j && j!=k && i!=k){
//            t+=1;
//            System.out.println(i*100+j*10+k);
//        }
//    }
//}
//}


//    计算9!
//public static void main(String[] args) {
//    long sum=1;
//    for (int i=1;i<10;i++){
//        sum*=i;
//        System.out.println(sum);
//    }
//}


//
//    分别计算1-100之间的奇数和 和偶数和
//public static void main(String[] args) {
//int a=0;int b=0;
//    for (int i=1;i<=100;i++){
//        if (i%2==0){
//            a+=i;
//        }else if (i%2!=0){
//            b+=i;
//        }
//    }
//    System.out.println("偶数和"+a);
//    System.out.println("奇数和"+b);
//}
//
//




//    一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。
//public static void main(String[] args) {
//Scanner input=new Scanner(System.in);
//int i=input.nextInt();
//int a=i/10000;
//int b=i%10000/1000;
//int c=i%1000/10;
//int d=i%100/10;
//int e=i%10;
//if (i>10000&&i<=99999){
//    if (a==e&&b==d){
//        System.out.println("次数是回文数");
//    }else {
//        System.out.println("此数不是回文数");
//    }
//    }
//
//}



//    判断一个年份是平年还是闰年
//public static void main(String[] args) {
//    Scanner input=new Scanner(System.in);
//    int i=input.nextInt();
//    if (i>1000&&i<=9999){
//        if(i%4==0&&i%100==0){
//            System.out.println("是平年");
//        }else if (i%400==0){
//            System.out.println("是闰年");
//        }
//    }
//}





//    编写程序，输入一个字符，判断它是否为小写字母，如果是，将它转换成大写字母，否则，不转换。
//public static void main(String[] args) throws Exception{
//  char a=(char)System.in.read();
//       if (a>='a'&&a<='z'){
//           a-=32;
//           System.out.println(a);
//       }else {
//           System.out.println(a);
//       }
//
//}





//    用 while 循环，计算 1~200 之间所有 3 的倍数之和。
//
public static void main(String[] args) {
    int a=1;

    while (true){
       if (a%3==0){
         break;
       }

    }
    System.out.println(a);
    a++;
}
//    一个整数的各位数字之和能被 9 整除，则该数也能被 9 整除。编程验证给定的整数能否被 9 整除。





}
