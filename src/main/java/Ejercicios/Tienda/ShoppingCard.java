package Ejercicios.Tienda;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShoppingCard {
    private Date created;
    private List<LineItem> lineItems = new ArrayList<>();
    private int cantidad;

    public ShoppingCard(List<LineItem> lineItems, int cantidad) {
        this.lineItems = lineItems;
        this.cantidad = cantidad;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

    public void añadir(Product product, int cantidad) {
        LineItem lineItem = new LineItem(product,cantidad);
        lineItems.add(lineItem);
    }
}
