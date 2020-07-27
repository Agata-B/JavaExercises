package enums;

import java.math.BigDecimal;

public class ProductService extends Product {
    public ProductService(String name, BigDecimal price, BigDecimal weight, ProductType productType) {
        super(name, price, weight, productType);
    }

    //TODO stworzyć metode ktora zwroci z listy tylko owoce
    // TODO ogarnć test jednostkowy
}
