package ua.hillel.RestTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import ua.hillel.RestTest.model.StoreModel;

import java.io.IOException;

public class RestTestRunner {

    @Test
    public void returnByStatus() throws IOException,NullPointerException {
        RestStoreController storeController = new RestStoreController();
        String responseCode = String.valueOf(storeController.returnByStatus());

        Assert.assertTrue(responseCode.equals("200"));
    }

    @Test
    public void placeNewOrderInStore() throws IOException{
        RestStoreController storeController = new RestStoreController();
        String responseCode = String.valueOf(storeController.placeNewOrder("newOrder"));
        Assert.assertTrue(responseCode.equals("200"));
    }
    @Test
    public void placeNewOrderStoreWithGSON() throws IOException{
        RestStoreController storeController = new RestStoreController();

        StoreModel store = new StoreModel();
        store.setId(6);
        store.setPetId(1602);
        store.setQuantity(2);
        store.setShipDate("2023-01-16T21:12:48.341Z");
        store.setStatus("approved");
        store.setComplete(true);

        StoreModel newOrder = storeController.placeNewOrderWithGSON(store);

        Assert.assertTrue(store.getComplete(), newOrder.toString());
    }
    @Test
    public void findByID() throws IOException {
        RestStoreController storeController = new RestStoreController();
        String responseCode = String.valueOf(storeController.findPurchaseById(10));
        Assert.assertEquals(responseCode, "404");
    }
    @Test
    public  void deleteOrderByID() throws IOException {
        RestStoreController storeController = new RestStoreController();
        String responseCode = String.valueOf(storeController.deleteOrderByID(5));
        Assert.assertTrue(responseCode.equals("200"));
    }

}
