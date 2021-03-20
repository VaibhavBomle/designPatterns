package com.designPatterns.strategyPatternSolution;

public class JPEGCompressor implements  Compressor{
    @Override
    public void compress(String fileName) {
        System.out.println("Compressing Image "+fileName+" in JPEG Format");
    }
}
