package enums;


public class Main {
    public static void main(String[] args) {

        ProductType[] productType = ProductType.values();

        for (ProductType products : productType
        ) {
            System.out.println(products);
        }

    }
}
