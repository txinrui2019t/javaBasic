package zuoye;

import java.util.Scanner;

public class Cricle2 {
    public static void main(String[] args) {
        Cricle Cricle=new Cricle();
        System.out.println("请输入半径(不用输入负值)");
        Scanner input=new Scanner(System.in);
        int radius= input.nextInt();
        Cricle.setRadius(radius);

        System.out.println(Cricle.zhouchang());

    }

}
