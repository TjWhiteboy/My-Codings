public class functionpara {
    void sum(int num1,int num2)
    {
        System.out.println(num1+num2);
    }
    void sub(int num1,int num2)
    {
        System.out.println(num1-num2);
    }
    void mul(int num1,int num2)
    {
        System.out.println(num1*num2);
    }
    void div(int num1,int num2)
    {
        System.out.println(num1/num2);
    }
    public static void main(String[]args){
    functionpara obj1=new functionpara();
    obj1.sum(10,10);
    obj1.sub(10,10);
    obj1.mul(10,10);
    obj1.div(10,10);
}
}

