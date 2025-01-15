package view;

import controller.Controller;
import model.Produkte;

import java.util.Scanner;

public class View {

    private final Controller controller = new Controller();
    private final Scanner scanner = new Scanner(System.in);

    public void start() {
        while (true) {
            System.out.println("\"\n----- GOT Handelsnetzwerk -----\"");
            System.out.println("1. Add Product");
            System.out.println("2. Update Product");
            System.out.println("3. Delete Product");
            System.out.println("4. Show All Products");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> addProduct();
                case 2 -> updateProduct();
                case 3 -> deleteProduct();
                case 4 -> showAllProducts();

                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void addProduct() {
        System.out.println("Product ID: ");
        int productID = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Product Name: ");
        String name = scanner.nextLine();
        System.out.print("Herkunftsregion: ");
        String herkunftsregion = scanner.nextLine();

        controller.addProdukte(new Produkte(productID,name, herkunftsregion));
        System.out.println("Product added successfully!");
    }

    private void updateProduct() {
        System.out.println("Product ID: ");
        int productID = scanner.nextInt();
        scanner.nextLine();
        System.out.print("New Product Name: ");
        String name = scanner.nextLine();
        System.out.print("New Herkunftsregion: ");
        String herkunftsregion = scanner.nextLine();

        controller.updateProdukte(productID, name, herkunftsregion);
        System.out.println("Product updated successfully!");
    }

    private void deleteProduct() {
        System.out.println("Product ID: ");
        int productID = scanner.nextInt();
        scanner.nextLine();
        controller.deleteProduct(productID);
        System.out.println("Product deleted successfully!");
    }
    private void showAllProducts() {
        if (controller.getProdukte().isEmpty()) {
            System.out.println("No products found.");
            return;
        }
        controller.getProdukte().forEach(System.out::println);
    }
}
