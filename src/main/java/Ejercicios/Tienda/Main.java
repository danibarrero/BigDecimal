package Ejercicios.Tienda;

public class Main {
    public static void main(String[] args) {
        WebUser user = new WebUser("user", "1234");
        Customer customer1 = new Customer("John Doe", "johndoe@example.com","5555555");
        Account account1 = new Account(user);
        Account account2 = new Account(customer1);

        Product producto1 = new Product("Movil", "corteingles");
        Product producto2 = new Product("Tv", "carrefour");
        Product producto3 = new Product("Play", "game");

        ShoppingCard carrito1 = account1.getShoppingCard();
        carrito1.añadir(producto1, 2);
        carrito1.añadir(producto2,1);

        ShoppingCard carrito2 = account2.getShoppingCard();
        carrito2.añadir(producto3, 1);

        Order order = new Order(carrito1);

    }
}
