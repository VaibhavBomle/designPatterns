package com.designPatterns.iteratorPattern.productCollection;

public interface ProductIterator {

    public boolean hasNext();

    public void next();

    public Product current();


}
