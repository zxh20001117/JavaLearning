public class HelloWord {
    public static void main(String[] args){
        /**
         *控制台输出类
         */
        System.out.println("HelloWord!");

    }
}

class HiddenClass {
    static public int VarInt01;
    HiddenClass(){

        VarInt01 = 0;
    }
    public static void main(String[] args){
        int a=0;
        System.out.println(VarInt01);
        System.out.println(a);

    }
}
