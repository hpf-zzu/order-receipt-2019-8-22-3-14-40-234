package org.katas.refactoring;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String customerName;
    private String customerAddress;
    private List<LineItem> lineItems;
    public Order(String customerName, String customerAddress, List<LineItem> lineItems) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.lineItems = lineItems;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getCustomerAddress() {
        return customerAddress;
    }
    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }
    public void addLineItems(List<LineItem> lineItems) {
        this.lineItems.addAll(lineItems);
    }
    public List<LineItem> getLineItems() {
        ArrayList<LineItem> itemsList = (ArrayList<LineItem>) lineItems;
        return lineItems;
    }
}
