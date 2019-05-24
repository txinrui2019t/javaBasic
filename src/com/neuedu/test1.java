package com.neuedu;

public class test1 {
    /*
    将一个数进行拆分 拆分后 倒序输出
例如 153 将其 输出位351

     */
    public static void main(String[] args) {
      int i=520;
      int f=0;
      while (i !=0){
          f=i%10;
          System.out.print(f);
          i=i/10;
        }
    }
}
