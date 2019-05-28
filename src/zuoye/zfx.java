package zuoye;

public class zfx {
//    1 定义长方形类，含：
//    特征：宽、高（整型）；
//    方法：求周长、面积；
//    方法3个：（1）无参——宽、
//    高默认值为1；（2）1个参数——宽、
//    高均为参数值；（3）2个参数——宽、高各为参数值。
//    并对其进行测试
    //没有参数
    int width;
    int height;
    public void oblong(){
        int a=width*2+height*2;
        System.out.println("长方体的周长是："+a);
    }
    public  void ovlong(){
        int b=width*height;
        System.out.println("长方体的面积是："+b);
    }
    //有一个参数
    public  void oblong2(int i){
        int a=width*2+height*2;
        System.out.println("长方体的周长是："+a);
    }
    public  void ovlong2(int j) {
        int b = width * height;
        System.out.println("长方体的面积是：" + b);
    }
    //有两个参数
    public  void oblong3(int width,int height){
        int a=width*2+height*2;
        System.out.println("长方体的周长是："+a);
    }
    public  void ovlong3(int width,int height) {
        int b = width * height;
        System.out.println("长方体的面积是：" + b);
    }


















//4 编写一个Java程序，并满足如下要求：
//        1）编写一个Car类，具有：   特征：品牌(mark)——String类型   价格（price）、
//        速度（speed）——int型
//        功能：驾驶（void drive( )）    功能：变速（void speedChange(int newSpeed)），
//        把新速度赋给speed
//        3）定义主类E，在其main方法中创建Car类的两个对象：aodi和benchi的对
//        象并测试其对象的特性。
//











//        5 定义一个学生类 包括 姓名 年龄 分数的特征
//        创建五个学生对象 对其中特征进行赋值 赋值后 根据分数从大到小进行排序
//


}
