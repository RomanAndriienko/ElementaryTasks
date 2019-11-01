package com.soft.homework.output;

import com.soft.homework.data.ShapeData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class ConsoleOutput implements Output {
    private static final Logger logger = LoggerFactory.getLogger(ConsoleOutput.class);

    @Override
    public void printShape(List<ShapeData> shapes) {
        logger.info("============= Triangles list: ===============");
        for (ShapeData data : shapes) {
            logger.info("[Triangle " + data.getName() + "]: " + data.getArea() + " cm");
        }
    }
}
