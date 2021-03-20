package com.designPatterns.strategyPatternSolution;

public class StrategyMain {
    public static void main(String[] args) {
        var imageStorage = new ImageStorage();
        imageStorage.store("A",new JPEGCompressor(),new BlackAndWhiteFilter());
        imageStorage.store("B",new PNGCompressor(),new BlackAndWhiteFilter());
    }
}
