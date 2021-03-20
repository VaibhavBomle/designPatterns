package com.designPatterns.strategyPatternSolution;

public class BlackAndWhiteFilter implements  Filter{
    @Override
    public void apply(String fileName) {
        System.out.println("Filtering file "+fileName+" with BlackAndWhite Filter");
    }
}
