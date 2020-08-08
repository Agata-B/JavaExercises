package lambda;

import org.apache.commons.lang3.StringUtils;

import java.util.function.Predicate;

public class MainPredicate {
    public static void main(String[] args) {

        String name = "Jan";

        /*Predicate<String> startingWithLowerCase = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return StringUtils.isAllLowerCase(name.substring(0,1));
            }
        };
        */

        Predicate<String> startingWithLowerCase =
                t -> StringUtils.isAllLowerCase(name.substring(0,1));

        String substring = name.substring(0,1);
        if(StringUtils.isAllLowerCase(name.substring(0,1))){
            System.out.println("mała litera");
        }
    }
}
