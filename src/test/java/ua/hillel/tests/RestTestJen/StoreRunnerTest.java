package ua.hillel.tests.RestTestJen;

import org.testng.Assert;
import org.testng.annotations.Test;
import ua.hillel.tests.RestTestJen.model.Store;

import java.io.IOException;


public class StoreRunnerTest {

    @Test
    public void returnByStatus() throws IOException,NullPointerException {
        StoreController storeController = new StoreController();
        String responseCode = String.valueOf(storeController.returnByStatus());

        Assert.assertTrue(responseCode.equals("200"));
    }

    @Test
    public void placeNewOrderInStore() throws IOException{
        StoreController storeController = new StoreController();
        String responseCode = String.valueOf(storeController.placeNewOrder("newOrder"));
        Assert.assertTrue(responseCode.equals("200"));
    }
    @Test
    public void placeNewOrderStoreWithGSON() throws IOException{
        StoreController storeController = new StoreController();

        Store store = new Store();
        store.setId(6);
        store.setPetId(1602);
        store.setQuantity(2);
        store.setShipDate("2023-01-16T21:12:48.341Z");
        store.setStatus("approved");
        store.setComplete(true);

        Store newOrder = storeController.placeNewOrderWithGSON(store);

        Assert.assertTrue(store.getComplete(), newOrder.toString());
    }
    @Test
    public void findByID() throws IOException {
        StoreController storeController = new StoreController();
        String responseCode = String.valueOf(storeController.findPurchaseById(10));
        Assert.assertTrue(responseCode.equals("200"));
    }
    @Test
    public  void deleteOrderByID() throws IOException {
        StoreController storeController = new StoreController();
        String responseCode = String.valueOf(storeController.deleteOrderByID(5));
        Assert.assertTrue(responseCode.equals("200"));
    }
}
