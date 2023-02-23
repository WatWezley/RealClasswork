package chapter10;

import chapterNineAndTen.ArrayList;
import chapterNineAndTen.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

    public class ArrayListTest {


        List myArrayList;

        @BeforeEach
        public void startEachTestWith() {
            myArrayList = new ArrayList();
        }

        @Test
        public void arrayListCanBeCreatedTest() {
            assertNotNull(myArrayList);
       }

        @Test
        public void newArrayListIsEmptyTest() {
            assertTrue(myArrayList.isEmpty());
        }

       @Test
        public void addElement_ArrayListShouldNotBeEmptyTest() {
            myArrayList.add(34);
          assertFalse(myArrayList.isEmpty());
       }

      @Test
     public void addXRemoveX_ArrayListShouldBeEmpty() {
            myArrayList.add(34);
            myArrayList.remove(34);
            assertTrue(myArrayList.isEmpty());
            }

       @Test public void addXAndY_removeY_arrayShouldNotBeEmpty() {
            myArrayList.add(34);
            myArrayList.add(99);
           myArrayList.add(100);
            myArrayList.remove(99);
            assertFalse(myArrayList.isEmpty());
       }

        @Test
        public void removeFromEmptyArrayList_shouldThrowException() {
            assertThrows(IllegalArgumentException.class, () -> myArrayList.remove(34));
        }


        @Test
        public void addElement_arrayListSizeIncreases() {
           myArrayList.add(34);
           myArrayList.add(84);
            myArrayList.add(94, 0);
           assertEquals(3, myArrayList.size());
        }

        @Test
        public void insertElementInArrayList() {
           myArrayList.add(34);
            myArrayList.add(39);
            myArrayList.add(94, 0);
            assertEquals(94, myArrayList.get(0));
            assertEquals(34, myArrayList.get(1));
            assertEquals(3, myArrayList.size());
        }

        @Test
       public void addThreeElement_getSecondByIndex() {
            myArrayList.add(34);
            myArrayList.add(32);
            myArrayList.add(99);
            assertEquals(32, myArrayList.get(1));
        }

       @Test
       public void getIndexOfElementTest() {
           myArrayList.add(34);
           myArrayList.add(32);
           myArrayList.add(99);
           assertEquals(1, myArrayList.getIndexOf(32));
       }

        @Test
        public void arrayListIsElasticTest() {
            assertEquals(3, myArrayList.getCapacity());
            myArrayList.add(34);
            myArrayList.add(32);
            myArrayList.add(99);
            myArrayList.add(99);
            myArrayList.add(45);
            assertEquals(6, myArrayList.getCapacity());
            assertEquals(5, myArrayList.size());
            myArrayList.add(43);
            myArrayList.add(21);
            assertEquals(12, myArrayList.getCapacity());
            assertEquals(7, myArrayList.size());
        }

        @Test
       public void addXYZ_removeY_ZShouldBeInPositionOfY() {
           myArrayList.add(34);
           myArrayList.add(32);
           myArrayList.add(99);
           myArrayList.remove(32);
            myArrayList.add(100);
            myArrayList.add(45);
            myArrayList.add(75);
            myArrayList.remove(45);
            myArrayList.add(315);
           assertEquals(99, myArrayList.get(1));
           assertEquals(5, myArrayList.size());
           assertEquals(100, myArrayList.get(2));
           assertEquals(75, myArrayList.get(3));
       }


    }

