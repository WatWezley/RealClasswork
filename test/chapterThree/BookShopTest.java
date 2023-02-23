package chapterThree;

import org.junit.jupiter.api.Test;
import tdd.BookShop;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookShopTest {


    @Test
    public void bookPrice1to4() {
        BookShop famiba = new BookShop();
        int totalCost = famiba.totalPrice(3);
        assertEquals(6000, totalCost);
    }

    @Test
    public void bookPrice5to9() {
        BookShop famiba = new BookShop();
        int totalCost = famiba.totalPrice(6);
        assertEquals(10800, totalCost);
    }

    @Test
    public void bookPrice10to29() {
        BookShop famiba = new BookShop();
        int totalCost = famiba.totalPrice(20);
        assertEquals(32000, totalCost);
    }

    @Test
    public void bookPrice30to49() {
        BookShop famiba = new BookShop();
        int totalCost = famiba.totalPrice(40);
        assertEquals(60000, totalCost);
    }

    @Test
    public void bookPrice50to99() {
        BookShop famiba = new BookShop();
        int totalCost = famiba.totalPrice(80);
        assertEquals(104000, totalCost);
    }

    @Test
    public void bookPrice100to199() {
        BookShop famiba = new BookShop();
        int totalCost = famiba.totalPrice(150);
        assertEquals(180000, totalCost);
    }


    @Test
    public void bookPrice200to499() {
        BookShop famiba = new BookShop();
        int totalCost = famiba.totalPrice(300);
        assertEquals(330000, totalCost);
    }
    @Test
    public void bookPrice500() {
        BookShop famiba = new BookShop();
        int totalCost = famiba.totalPrice(700);
        assertEquals(700000, totalCost);
    }
}