class DateTypeInt{
    public static void main(String[] args){
        int a = 10;
        int b = 010;
        int c = 0x10;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        long y = 2147483648L;
        System.out.println(y);
        int x = (int) y;
        System.out.println(x);
    }
}

class DateTypeFloat{
    public static void main(String[] args){
        float a = (float)15456651126.2;
        System.out.println(a);
    }
}

class DateTypeChar{
    public static void main(String[] args){
        char a = 97;
        System.out.println(a);
    }
}