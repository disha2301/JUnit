package com.gevernova;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ListManagerTest {
    ListManager manager;
    List<Integer> list;

    @BeforeEach
    void setUp() {
        this.manager = new ListManager();
        this.list = new ArrayList<>();
    }

    // Positive test cases

    @Test
    void testAddElement() {
        manager.addElement(list, 5);
        manager.addElement(list, 10);
        Assertions.assertTrue(list.contains(5));
        Assertions.assertTrue(list.contains(10));
        Assertions.assertEquals(2, manager.getSize(list));
    }

    @Test
    void testRemoveElement() {
        list.add(1);
        list.add(2);
        list.add(3);
        manager.removeElement(list, 2);
        Assertions.assertFalse(list.contains(2));
        Assertions.assertEquals(2, manager.getSize(list));
    }

    @Test
    void testGetSize() {
        Assertions.assertEquals(0, manager.getSize(list));
        list.add(100);
        Assertions.assertEquals(1, manager.getSize(list));
    }

    // Negative test cases

    @Test
    void testRemoveElementNotInList() {
        list.add(1);
        list.add(3);
        manager.removeElement(list, 2);  // 2 is not in list
        Assertions.assertEquals(2, manager.getSize(list));
        Assertions.assertFalse(list.contains(2));
    }

    @Test
    void testAddElementNullList() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            manager.addElement(null, 5);
        });
    }

    @Test
    void testRemoveElementNullList() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            manager.removeElement(null, 5);
        });
    }

    @Test
    void testGetSizeNullList() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            manager.getSize(null);
        });
    }
}
