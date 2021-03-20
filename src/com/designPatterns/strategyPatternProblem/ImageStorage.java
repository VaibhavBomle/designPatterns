package com.designPatterns.strategyPatternProblem;

/**
 * @Author Vaibhav
 */
public class ImageStorage {

    public String filter;
    public String compressor;

    public ImageStorage(String filter, String compressor) {
        this.filter = filter;
        this.compressor = compressor;
    }

    public void store(String fileName) {
        if (compressor.equalsIgnoreCase("JPG")) {
            System.out.println("Compressing file " + fileName + " with JPG Format");
        } else if (compressor.equalsIgnoreCase("PNG")) {
            System.out.println("Compressing file " + fileName + " with PNG Format");
        }

        if (filter.equalsIgnoreCase("BlackAndWhite")) {
            System.out.println("Filtering file " + fileName + " with BlackAndWhite");
        } else if (filter.equalsIgnoreCase("Contrast")) {
            System.out.println("Filtering file " + fileName + " with Contrast");
        }
    }
}
