package lambda;

public class LambdaMain {
    public static void main(String[] args) {


        /* class OperacjeKlasa implements operacje {
            @Override
            public int apply(int a) {
               return 0;
            }
        */

        /* old Java beafore 1.8
        Operacje operacje = new Operacje() {
            @Override
            public int apply(int a) {
                return a + 2;
            }
        };
        */

        Operacje operacje = a -> a + 2;
        int result = operacje.apply(2);
        System.out.println(result);
    }

    @FunctionalInterface
    interface Operacje {
        int apply(int a);
    }
}
