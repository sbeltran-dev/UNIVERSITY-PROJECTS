/*
Develop a Java program that uses object-oriented programming to manage the inventory of a store, controlling the products, their stock, and sales operations,
with the necessary validations. The program must allow: Registering new products, consulting product information, making sales (subtracting
units from the inventory), restocking products (adding units), and displaying the complete inventory.

Required validations:

For product registration:
A product with the following must not be allowed:
Duplicate code.
Price less than or equal to 0.
Negative initial quantity.
Empty or null name.

For sale:
It can only be made if there is enough quantity available.
If the requested quantity is greater than the stock, display an error message.
Negative quantities or quantities equal to zero are not accepted.

Consultation:
If the entered code does not exist, it must display an error message: Product not found in inventory.

General inventory:
It must display all products with their complete information (name, code, price, and stock).
If the inventory is empty, it must display: "There are no registered products."

It is suggested to create a Product class with the following private attributes: code, name, price, stock. A Client class with the client's general information
(client code and any data you consider necessary). And another class for Sale with the following private attributes: Client code, sale time,
list of selected products, and any other data you consider necessary. And create a class that contains the main method.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option;

        // * We initialize an ArrayList for each class.
        ArrayList<Product> products = new ArrayList<>();
        ArrayList<Client> clients = new ArrayList<>();
        ArrayList<Sale> sales = new ArrayList<>();

        Inventory_Products(products);
        Clients_Information(clients);

        // * Menu.
        do {
            System.out.println("\n|| MENU ||");
            System.out.println("1. Register new products.");
            System.out.println("2. Products information.");
            System.out.println("3. Make sale.");
            System.out.println("4. Refill products.");
            System.out.println("5. Show inventory.");
            System.out.println("0. Leave the system.");
            System.out.println("\nSelect an option:");
            option = input.nextInt();

            switch (option) {
                case 1:
                    Register_Products(products, input);
                    break;
                case 2:
                    Consult_Products(products, input);
                    break;
                case 3:
                    Make_Sale(products, clients, sales, input);
                    break;
                case 4:
                    Refill_Products(products, input);
                    break;
                case 5:
                    Show_Inventory(products);
                    break;
                case 0:
                    System.out.println("Leaving system...");
                    break;
            }
        } while(option != 0);
    }


    // * Functions.
    public static void Register_Products(ArrayList<Product> products, Scanner input) {
        System.out.println("=== REGISTER NEW PRODUCT ===");

        // * Code request.
        System.out.println("Input the product code: ");
        int product_code = input.nextInt();

        // * We validate if the code is duplicated.
        for (Product i : products) {
            if (i.getCode() == product_code) {
                System.out.println("ERROR. Code is duplicated.");
                return;
            }
        }

        // * Price request.
        System.out.println("Input the price of the product: ");
        float product_price = input.nextFloat();

        // * Validate.
        if (product_price <= 0) {
            System.out.println("ERROR. Price needs to be more than 0.");
            return;
        }

        // * Quantity request.
        System.out.println("Establish the quantity of the product: ");
        int product_stock = input.nextInt();

        // * Validate.
        if (product_stock < 0) {
            System.out.println("ERROR. Negative initial quantity.");
            return;
        }

        // * Name request.
        System.out.println("Type the product name: ");
        String product_name = input.nextLine();

        // * Validate if the name it's empty or is null.
        if (product_name.isEmpty() || product_name == null) {
            System.out.println("ERROR. Product name is empty or null.");
            return;
        }

        // * If all the validations are correct, we create the new product.
        Product new_product = new Product(product_code, product_stock, product_name, product_price);
        products.add(new_product);
        System.out.println("New product added successfully.");
    }

    public static void Consult_Products(ArrayList<Product> products, Scanner input) {
        System.out.println("=== CONSULT PRODUCT ===");

        // * Code request.
        System.out.println("Input the product code: ");
        int product_code = input.nextInt();

        // * Validate.
        for (Product i : products) {
            if (i.getCode() == product_code) {
                System.out.println("--- Product Information ---");
                System.out.println("Code: " + i.getCode());
                System.out.println("Name: " + i.getName());
                System.out.println("Price: " + i.getPrice());
                System.out.println("Stock: " + i.getStock());
                return;
            }
        }

        System.out.println("ERROR. Product not found.");
    }

    public static void Make_Sale(ArrayList<Product> products, ArrayList<Client> clients, ArrayList<Sale> sales, Scanner input) {
        System.out.println("=== MAKE SALE ===");

        // * Client code request.
        System.out.println("Input the client code: ");
        int client_code = input.nextInt();

        // * Validate.
        if (seek_client(clients, client_code) == null) {
            System.out.println("ERROR. Client not found.");
            return;
        }

        // * Sale hour request.
        System.out.println("Input the sale hour: ");
        int sale_hour = input.nextInt();

        // * Create list of products for the sale.
        ArrayList<Product> products_sale = new ArrayList<>();

        // * Ask for the code.
        System.out.println("Input product code: ");
        int product_code = input.nextInt();

        // * Validate.
        Product product = seek_product(products, product_code);

        if (product == null) {
            System.out.println("ERROR. Product not found.");
            return;
        }

        // * Ask for quantity.
        System.out.println("Input quantity: ");
        int quantity = input.nextInt();

        // * Validate if its positive.
        if (quantity <= 0) {
            System.out.println("ERROR. Quantity must be positive.");
            return;
        }

        // * Validate stock.
        if (quantity > product.getStock()) {
            System.out.println("ERROR. Not enough stock. Stock available: " + product.getStock());
            return;
        }

        // * Take away from the inventory.
        product.setStock(product.getStock() - quantity);
        products_sale.add(product);

        // * Create new sale.
        Sale new_sale = new Sale(client_code, sale_hour, products_sale);
        sales.add(new_sale);
        System.out.println("Sale made successfully.");
    }

    public static void Refill_Products(ArrayList<Product> products, Scanner input) {
        System.out.println("=== REFILL PRODUCTS ===");

        // * Code request.
        System.out.println("Input product code: ");

        int product_code = input.nextInt();

        // * Seek product.
        Product product = seek_product(products, product_code);

        if (product == null) {
            System.out.println("ERROR. Product not found.");
            return;
        }

        // * Show stock.
        System.out.println("Stock: " + product.getStock());

        // * Ask for quantity to refill.
        System.out.println("Input quantity: ");
        int quantity = input.nextInt();

        // * Validate if quantity is positive.
        if (quantity <= 0) {
            System.out.println("ERROR. Quantity must be positive.");
            return;
        }

        // * Add to the inventory.
        product.setStock(product.getStock() + quantity);
        System.out.println("New stock: " + product.getStock());
        System.out.println("Stock refilled successfully.");
    }

    public static void Show_Inventory(ArrayList<Product> products) {
        System.out.println("=== INVENTORY === ");

        // * Validate if the inventory is empty.
        if (products.isEmpty()) {
            System.out.println("There is no products in the inventory.");
            return;
        }

        // * Show all products.
        for (Product i: products) {
            System.out.println("Code: " + i.getCode());
            System.out.println("Name: " + i.getName());
            System.out.println("Price: " + i.getPrice());
            System.out.println("Stock: " + i.getStock());
            System.out.println();
        }

        System.out.println("Total products: " + products.size());
    }

    // * Reusable functions.
    public static Product seek_product(ArrayList<Product> products, int product_code) {
        for (Product i: products) {
            if (i.getCode() == product_code) {
                return i;
            }
        }
        return null;
    }

    public static Client seek_client(ArrayList<Client> clients, int client_code) {
        for (Client i: clients) {
            if (i.getCode() == client_code) {
                return i;
            }
        }
        return null;
    }

    // * Function to add the products.
    public static void Inventory_Products(ArrayList<Product> products) {
        products.add(new Product(1, 5, "Laptop", 800.00f));
        products.add(new Product(2, 20, "Mouse", 25.00f));
        products.add(new Product(3, 10, "Keyboard", 75.00f));
        products.add(new Product(4, 3, "Monitor", 300.00f));
    }

    // * Function to add clients.
    public static void Clients_Information(ArrayList<Client> clients) {
        clients.add(new Client(1, "Juan", "juan@gmail.com", "555-125", "Avenida Sur"));
        clients.add(new Client(2, "Wanda", "wanda@gmail.com", "555-325", "Lomas Norte"));
        clients.add(new Client(3, "Alex", "alex@gmail.com", "555-689", "Opodepede 11"));
        clients.add(new Client(4, "Kate", "kate@gmail.com", "555-666", "Pueblitos 39"));
    }
}
