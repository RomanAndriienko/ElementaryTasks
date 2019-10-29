package com.soft.homework.output;

import com.soft.homework.model.Shape;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class TriangleOutput implements Output {
    private static final Logger logger = LoggerFactory.getLogger(TriangleOutput.class);
    @Override
    public void printShape(List<Shape> shapes) {
        logger.info(String.valueOf(shapes));
    }
}
