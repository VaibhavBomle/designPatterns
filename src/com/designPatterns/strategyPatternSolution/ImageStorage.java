package com.designPatterns.strategyPatternSolution;

/**
 * Implemented Strategy Pattern
 * @Author Vaibhav
 */
public class ImageStorage {

    public void store(String fileName,Compressor compressor, Filter filter){
        compressor.compress(fileName);
        filter.apply(fileName);
    }

}
