package com.soft.homework.service;

import com.soft.homework.data.ShapeData;
import com.soft.homework.data.TriangleData;
import com.soft.homework.model.Shape;
import com.soft.homework.model.Triangle;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SortingByAreaTest {
    private Sorting sorting;
    private List<Shape> shapes;

    @Before
    public void setUp() {
        sorting = new SortingByArea();
        shapes = new ArrayList<>();
        shapes.add(new Triangle("name1", 10, 10, 8));
        shapes.add(new Triangle("name2", 14, 6, 9));
        shapes.add(new Triangle("name3", 4, 5, 6));
    }

    @Test
    public void sort() {
        List<ShapeData> actual = new ArrayList<>();
        actual.add(new TriangleData("name1", 36.66));
        actual.add(new TriangleData("name2", 18.41));
        actual.add(new TriangleData("name3", 9.92));

        List<ShapeData> expected = sorting.sort(shapes);

        Assert.assertEquals(actual.toString(), expected.toString());
    }
}