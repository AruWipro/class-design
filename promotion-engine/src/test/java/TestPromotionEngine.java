import model.Order;
import model.Product;
import model.ProductType;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPromotionEngine {
    static Product testProduct;
    static Order testOrder;

    static Product testProduct1;
    static Order testOrder1;


    static Order testOrder2;


    @BeforeClass
    public static void testSetup() {
        testProduct = new Product(ProductType.A,5);
        testOrder = new Order().addProduct(testProduct);

        testProduct1 = new Product(ProductType.B,5);
        testOrder1 = new Order().addProduct(testProduct1);

        testOrder2 = new Order().addProduct(testProduct1).addProduct(testProduct);


    }


    @Test
    public void testAPrice() {
        assertEquals("Price of 5A", Double.valueOf(230), Double.valueOf(testOrder.getPrice()));
    }

    @Test
    public void testBPrice() {
        assertEquals("Price of 5B", Double.valueOf(120), Double.valueOf(testOrder1.getPrice()));
    }


    @Test
    public void testABPrice() {
        assertEquals("Price 5A and 5B", Double.valueOf(350), Double.valueOf(testOrder2.getPrice()));
    }





}
