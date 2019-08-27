package org.katas.refactoring;

import java.util.List;

public class Order {
    private String name;
    private String address;
    private List<LineItem> itemList;

    public Order(String nm, String addr, List<LineItem> li) {
        this.name = nm;
        this.address = addr;
        this.itemList = li;
    }

    public String getCustomerName() {
        return name;
    }

    public String getCustomerAddress() {
        return address;
    }

    public List<LineItem> getLineItems() {
        return itemList;
    }
}
