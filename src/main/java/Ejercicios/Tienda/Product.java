package Ejercicios.Tienda;

import java.util.function.Supplier;

public class Product {
    private String id;
    private String name;
    private String supplier;

    public Product(String name, String supplier) {
        this.name = name;
        this.supplier = supplier;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", supplier='" + supplier + '\'' +
                '}';
    }
}
