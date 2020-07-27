package enums;

import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class Product {

    private String name;
    private BigDecimal price;
    private BigDecimal weight;
    private ProductType productType;

    public Product(String name, BigDecimal price, BigDecimal weight, ProductType productType) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.productType = productType;
    }
}
