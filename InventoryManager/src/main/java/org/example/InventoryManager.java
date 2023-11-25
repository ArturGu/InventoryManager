package org.example;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InventoryManager {
    private final List<Product> products;

    public InventoryManager() {
        this.products = new ArrayList<>();
    }

    // Додавання товару
    public void addProduct(String name, String category, double price, int quantity) {
        Product newProduct = new Product(name, category, price, quantity);
        products.add(newProduct);
    }

    // Видалення товару
    public void removeProduct(String name) {
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getName().equalsIgnoreCase(name)) {
                iterator.remove();
                break;
            }
        }
    }

    // Виведення списку товарів за залишком
    public void displayProductsByQuantity() {
        System.out.println("Товари за залишком на складі:");
        for (Product product : products) {
            System.out.println(product.getName() + " - Залишок: " + product.getQuantity()+ "шт" +
            "\nЗагальна вартість: " +product.getQuantity() * product.getPrice()+ "₴" + "\n");
        }
    }

    // Виведення списку товарів за категорією
    public void displayProductsByCategory(String category) {
        System.out.println("Товари в категорії \"" + category + "\":");
        for (Product product : products) {
            if (product.getCategory().equalsIgnoreCase(category)) {
                System.out.println(product.getName() + " - Залишок: " + product.getQuantity() + "шт" + "\nЦіна 1шт: " + product.getPrice()
                + "₴" + "\nЗагальна вартість: " +product.getQuantity() * product.getPrice()+ "₴" + "\n");
            }
        }
    }
}
