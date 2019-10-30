package com.soft.homework.output;

import com.soft.homework.dto.ShapeDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class TriangleOutput implements Output {
    private static final Logger logger = LoggerFactory.getLogger(TriangleOutput.class);

    @Override
    public void printShape(List<ShapeDTO> shapes) {
        logger.info("============= Triangles list: ===============");
        for (ShapeDTO shapeDTO : shapes) {
            logger.info("[Triangle " + shapeDTO.getName() + "]: " + shapeDTO.getArea() + " cm");
        }
    }
}
