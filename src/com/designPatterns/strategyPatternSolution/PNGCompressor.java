package com.designPatterns.strategyPatternSolution;

public class PNGCompressor implements Compressor{
    @Override
    public void compress(String fileName) {
        System.out.println("Compressing file "+fileName+ " with PNG Format");
    }
}
