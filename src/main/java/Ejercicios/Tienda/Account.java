package Ejercicios.Tienda;

import java.util.Date;

public class Account {
    private String id;
    private Address billingAddress;
    private boolean isClosed;
    private Date open;
    private Date closed;
    private WebUser webuser;
    private Customer customer;
    private ShoppingCard shoppingCard;

    public Account(WebUser webuser) {
        this.webuser = webuser;
    }

    public Account(Customer customer) {
        this.customer = customer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed(boolean closed) {
        isClosed = closed;
    }

    public Date getOpen() {
        return open;
    }

    public void setOpen(Date open) {
        this.open = open;
    }

    public Date getClosed() {
        return closed;
    }

    public void setClosed(Date closed) {
        this.closed = closed;
    }

    public WebUser getWebuser() {
        return webuser;
    }

    public void setWebuser(WebUser webuser) {
        this.webuser = webuser;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ShoppingCard getShoppingCard() {
        return shoppingCard;
    }

    public void setShoppingCard(ShoppingCard shoppingCard) {
        this.shoppingCard = shoppingCard;
    }
}
