import java.util.Scanner;

public class Homework {
    interface IOperator {
        int operation(int a, int b);
    }
    interface IVerifyProperty {
        boolean hasProperty(int a);
    }
    public static boolean isEven(int n){
        if(n%2==0)
            return true;
        return false;
    }
    public static boolean isNegative(int n){
        if(n<0)
            return true;
        return false;
    }
    public static boolean equalsZero(int n){
        if(n==0)
            return true;
        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("EX1***************************");
        IOperator sum=(a,b)->a+b;
        IOperator dif=(a,b)->a-b;
        IOperator p=(a,b)->a*b;
        IOperator div=(a,b)->a/b;
        IOperator mod=(a,b)->a%b;
        System.out.println("Suma este egala cu "+sum.operation(5,10));
        System.out.println("Diferenta este egala cu "+dif.operation(5,10));
        System.out.println("Produsul este egal cu "+p.operation(5,10));
        System.out.println("Impartirea este egala cu "+div.operation(5,10));
        System.out.println("Modulul este egal cu "+mod.operation(5,10));

        System.out.println("\nEX2***************************");

        System.out.println("I.folosind expresii lambda:");
        IVerifyProperty par= x ->  x%2==0?true:false;
        System.out.println("\tNumarul 5 este par?"+par.hasProperty(5));
        System.out.println("\tNumarul 4 este par?"+par.hasProperty(4));

        IVerifyProperty negativ=x-> {if(x<0) return true;return false;};
        System.out.println("\tNumarul 5 este negativ?"+negativ.hasProperty(5));
        System.out.println("\tNumarul -4 este negativ?"+negativ.hasProperty(-4));

        IVerifyProperty zero=x-> {if(x==0) return true;return false;};
        System.out.println("\tNumarul 0 este egal cu zero?"+zero.hasProperty(0));
        System.out.println("\tNumarul -4 este egal cu zero?"+zero.hasProperty(-4));

        System.out.println("II.folosind referinta catre metode:");
        IVerifyProperty par1= Homework::isEven;
        System.out.println("\tNumarul 5 este par?"+par1.hasProperty(5));
        System.out.println("\tNumarul 4 este par?"+par1.hasProperty(4));

        IVerifyProperty negativ1=Homework::isNegative;
        System.out.println("\tNumarul 5 este negativ?"+negativ1.hasProperty(5));
        System.out.println("\tNumarul -4 este negativ?"+negativ1.hasProperty(-4));

        IVerifyProperty zero1=Homework::equalsZero;
        System.out.println("\tNumarul 0 este egal cu zero?"+zero1.hasProperty(0));
        System.out.println("\tNumarul -4 este egal cu zero?"+zero1.hasProperty(-4));
    }
}
