package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InventoryManager inventoryManager = new InventoryManager();

        // Додавання товарів для прикладу
        inventoryManager.addProduct("Худі", "Одяг", 1000, 50);
        inventoryManager.addProduct("Ноутбук Lenovo", "Електроніка", 30000, 10);
        inventoryManager.addProduct("Книга 'Java Basics'", "Книги", 300, 20);

        // Меню для користувача
        int choice;
        do {
            System.out.println("\nОберіть опцію:");
            System.out.println("1. Додати товар");
            System.out.println("2. Видалити товар");
            System.out.println("3. Вивести товари за залишком");
            System.out.println("4. Вивести товари за категорією");
            System.out.println("0. Вийти");

            choice = scanner.nextInt();
            scanner.nextLine(); // Очистка буфера

            switch (choice) {
                case 1:
                    System.out.print("Введіть назву товару: ");
                    String name = scanner.nextLine();
                    System.out.print("Введіть категорію товару: ");
                    String category = scanner.nextLine();
                    System.out.print("Введіть ціну товару: ");
                    double price = scanner.nextDouble();
                    System.out.print("Введіть кількість товару: ");
                    int quantity = scanner.nextInt();

                    inventoryManager.addProduct(name, category, price, quantity);
                    System.out.println("Товар додано!");
                    break;
                case 2:
                    System.out.print("Введіть назву товару, який потрібно видалити: ");
                    String productToRemove = scanner.nextLine();

                    inventoryManager.removeProduct(productToRemove);
                    System.out.println("Товар видалено!");
                    break;
                case 3:
                    inventoryManager.displayProductsByQuantity();
                    break;
                case 4:
                    System.out.print("Введіть категорію для виведення товарів: ");
                    String categoryToDisplay = scanner.nextLine();

                    inventoryManager.displayProductsByCategory(categoryToDisplay);
                    break;
                case 0:
                    System.out.println("Програма завершена.");
                    break;
                default:
                    System.out.println("Неправильний вибір. Спробуйте ще раз.");
            }

        } while (choice != 0);

        scanner.close();
    }
}
