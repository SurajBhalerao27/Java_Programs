package practice;

public class Demo1{
    public static void main(String[] args){
        Demo1 d  = new Demo1();
        d.print("Suraj",1);
        d.print("demo");
    }
    public String print(String msg,int a){
        return msg;
    }
    public void print(String msg){
            System.out.println(msg);
    }
}