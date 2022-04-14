package lesson7;

import java.math.*;
public class Example7_6{
    public static void main(String args[]){
        BigInteger n1=new BigInteger("987654321987654321987654321"),
                n2=new BigInteger("123456789123456789123456789"),
                result=null;
        result=n1.add(n2);
        System.out.println(n1+"+"+n2+"=");
        System.out.println(result);
        result=n1.subtract(n2);
        System.out.println(n1+"-"+n2+"=");
        System.out.println(result);
        result=n1.multiply(n2);
        System.out.println(n1+"*"+n2+"=");
        System.out.println(result);
        result=n1.divide(n2);
        System.out.println(n1+"/"+n2+"=");
        System.out.println(result);
        BigInteger m=new BigInteger("77889988"),
                COUNT=new BigInteger("0"),
                ONE=new BigInteger("1"),
                TWO=new BigInteger("2");
        for(BigInteger i=TWO;i.compareTo(m)<0;i=i.add(ONE)){
            if((n1.remainder(i).compareTo(BigInteger.ZERO))==0){
                COUNT=COUNT.add(ONE);
                System.out.println(m+"的因子:"+i);
            }
        }
        System.out.println(m+"一共有"+COUNT+"个因子");
    }
}
