package zuoye;

import java.util.Scanner;

public class zfx2 {


    public static void main(String[] args) {
        zfx zfx = new zfx();
        zfx.width = 1;
        zfx.height = 1;
        System.out.println("无参");
        zfx.oblong();
        zfx.ovlong();
        System.out.println("有一个参数");
        zfx.oblong2(5);
        zfx.ovlong2(3);
        System.out.println("有两个参数");
        zfx.oblong3(3, 7);
        zfx.ovlong3(6, 8);


//第二题
//    Scanner input=new Scanner(System.in);
//    System.out.print("请输入半径");
//   radius=input.nextDouble(){
//       if (radius<0){
//           System.out.println("你输入的半径错误：");
//       }else {
//           yuan  radius=new yuan(radius);
//           System.out.println("圆的周长为："+radius.getLength());
//           System.out.println("圆的面积为："+radius.getArea());
//       }
//    }

        //  }


    }
}