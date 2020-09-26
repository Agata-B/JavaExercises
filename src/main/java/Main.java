public class Main {

    private  static int zwiększaj (int a) {
        if(a++>10) {
            throw new IllegalArgumentException("za duza");
        }
        return a+1;
    }
    public static void main(String[] args) {
       int x = 8;

       zwiększaj(x);
        System.out.println(x+" ");
        int y = zwiększaj(x);
        System.out.println(x+y+" ");

        zwiększaj(y);
        System.out.println(y+" ");
        int z = zwiększaj(y);
        System.out.println(y+z+ " ");
        System.out.println(z);
    }
}
