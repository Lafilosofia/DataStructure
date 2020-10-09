package Algorithm.AbstractDataType;

/**
 * 用java接口来描述复数的抽象数据类型.假设复数的操作只包含:构造一个实部和虚部为给定值的复数
 * 读取和修改服饰的实部和虚部.以及两个复数的求和.
 */
/*
public class Complex implements IComplex{

    private double real;    //实部
    private double imag;    //虚部
    //构造一个函数
    public Complex(double real,double imag){
        this.real = real;
        this.imag = imag;
    }
    //取实部
    public double getReal(){
        return real;
    }
    //修改实部
    public void setReal(double real){
        this.real = real;
    }
    //取虚部
    public double getImag(){
        return imag;
    }
    //修改虚部
    public void setImag(double imag){
        this.imag = imag;
    }
    //两个实数的求和
    public void add(IPlurality Z){
        if (Z != null){
            real += Z.getReal();
            imag += Z.getImag();
        }
    }
}

interface IComplex{
    public double getReal();            //取实部
    public void setReal(double real);   //修改实部
    public double getImag();            //取虚部
    public void setImag(double imag);   //修改虚部
    public void add(IPlurality Z);      //两个实数的和

}
*/