package zuoye2;
//1 有五个学生，每个学生有3门课的成绩，从键盘输入以上数据
//        （包括学生号，姓名，三门课成绩），计算出平均成绩

public class student {
    private String xuehao;
    private String sname;
    private int Chinese;
    private int English;
    private int Math;
    public void setXuehao(String xuehao1){
        xuehao=xuehao1;
    }
    public void setSname(String sname1){
        sname=sname1;
    }
    public void setChinese(int  Chinese1){
        Chinese=Chinese1;
    }
    public void setEnglish(int English1){
        English=English1;
    }
    public void setMath(int Math1){
        Math=Math1;
    }

    public String getXuehao(String xuehao1){
       return xuehao;
    }
    public String getSname(String sname1){
       return sname1;
    }
    public void getChinese(int  Chinese1){
        return ;
    }
    public void getEnglish(int English1){
        return ;
    }
    public void getMath(int Math1){
        return;
    }

}
