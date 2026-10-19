package oops2026;

import java.util.Objects;

class Product {
    private final int id;
    private final String name;


    Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Product other)) return false;
        return id == other.id && Objects.equals(name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Product{id=" + id + ", name='" + name + "'}";
    }
}

public class ObjectMethodsDemo {
    public static void main(String[] args) {
        Product p1 = new Product(101, "Laptop");
        Product p2 = new Product(101, "Laptop");

        System.out.println(p1.equals(p2));
        System.out.println(p1);
    }
}
