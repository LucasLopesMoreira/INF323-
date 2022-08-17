
package inf300.servico;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import inf300.dominio.Address;
import inf300.dominio.Author;
import inf300.dominio.Book;
import inf300.dominio.Cart;
import inf300.dominio.Customer;
import inf300.dominio.Order;

public class BookstoreFuncionalTest {

    static Bookstore instance;

    @BeforeClass
    public static void setUpClass() {
        instance = Bookstore.getInstance();
    }

    @Test(timeout = 360000)
    public void testGetBestSellers1() {
        System.out.println("getBestSellers");
        boolean resultTest = true;
        Field field = null;
        List<Order> originalOrders = null;

        try {
            field = instance.getClass().getDeclaredField("ordersById");
            field.setAccessible(true);
            originalOrders = (List<Order>) field.get(instance);

	    String[] subjects = {"ARTS", "BIOGRAPHIES", "BUSINESS", "CHILDREN", "YOUTH", "TRAVEL"};
            List<Order> testOrders = new ArrayList<Order>();

            for (int j = 0; j < subjects.length; j++) {
                List<Book> books = instance.getBooksBySubject(subjects[j]).stream().limit(100)
                        .sorted(Comparator.comparingInt(Book::getId)).collect(Collectors.toList());
                int qty = 10000;
                for (Book book : books) {
                    for (int i = 0; i < qty; i++) {
                        Cart testCart = new Cart(0, null);
                        testCart.clear();
                        testCart.changeLine(book, 1);
                        Customer customer = new Customer(0, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, null, null, null);
                        testOrders.add(new Order(0, customer, null, testCart, null, null, null, "SHIPPED", null, null, null));
                    }
                    qty--;
                }
                field.set(instance, testOrders);
                List<Book> bestSellers = instance.getBestSellers(subjects[j]);
                if (!bestSellers.equals(books.subList(0, 50))) {
                    resultTest = false;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            resultTest = false;
        } finally {
            try {
                if (field != null && originalOrders != null) {
                    field.set(instance, originalOrders);
                    field.setAccessible(false);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        assertEquals(resultTest, true);
    }
}
 