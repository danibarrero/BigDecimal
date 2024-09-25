package Ejercicios.Tienda;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        WebUser user = new WebUser("user", "1234");
        Customer customer1 = new Customer("John Doe", "johndoe@example.com","5555555");
        Account account1 = new Account(user);
        Account account2 = new Account(customer1);

        Product producto1 = new Product("Movil", "corteingles");
        Product producto2 = new Product("Tv", "carrefour");
        Product producto3 = new Product("Play", "game");


        LineItem item1 = new LineItem(producto1, 2);
        LineItem item2 = new LineItem(producto2, 1);
        LineItem item3 = new LineItem(producto3, 1);
        List<LineItem> items = List.of(item1, item2, item3);

        ShoppingCard carrito1 = new ShoppingCard(items, 2);

        account1.setShoppingCard(carrito1);

        System.out.println(account1.getShoppingCard().getLineItems());



    }
}
