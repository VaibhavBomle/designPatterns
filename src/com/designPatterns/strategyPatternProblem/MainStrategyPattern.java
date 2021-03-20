package com.designPatterns.strategyPatternProblem;

/**
 *
 * The problem in this pattern is that , it breaks the design principle
 * ImageStorage class contain all logic i.e filter and compress.
 * Suppose in future , requirement is to add different compressor and filter , for that
 * we need to modify or add more logic in one class ImageStorage due to this code length increase in
 * one class.
 * To avoid this we can go through Strategy pattern
 * @Author Vaibhav
 */
public class MainStrategyPattern {

    public static void main(String[] args) {
        var imageStorage = new ImageStorage("BlackAndWhite","JPG");
        imageStorage.store("A");
    }
}
