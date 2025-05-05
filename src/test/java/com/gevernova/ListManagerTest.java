package com.gevernova;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ListManagerTest {
    ListManager manager;
    List<Integer> list;

    public ListManagerTest() {
    }

    @BeforeEach
    void setUp() {
        this.manager = new ListManager();
        this.list = new ArrayList();
    }

    @Test
    void testAddElement() {
        this.manager.addElement(this.list, 5);
        this.manager.addElement(this.list, 10);
        Assertions.assertTrue(this.list.contains(5));
        Assertions.assertTrue(this.list.contains(10));
        Assertions.assertEquals(2, this.manager.getSize(this.list));
    }

    @Test
    void testRemoveElement() {
        this.list.add(1);
        this.list.add(2);
        this.list.add(3);
        this.manager.removeElement(this.list, 2);
        Assertions.assertFalse(this.list.contains(2));
        Assertions.assertEquals(2, this.manager.getSize(this.list));
    }

    @Test
    void testGetSize() {
        Assertions.assertEquals(0, this.manager.getSize(this.list));
        this.list.add(100);
        Assertions.assertEquals(1, this.manager.getSize(this.list));
    }
}
