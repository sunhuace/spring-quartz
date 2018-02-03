package cn.upshi.springquartz;

public class Main {

    public static void main(String[] args) {
        try {
            int i = test();
            System.out.println(i);
        } catch (Exception e) {
            System.out.println("this is the beginning of the gaeden tour...");
        }

    }


    public static int test() {
        int i = 1 / 0;
        return 2;
    }
}
