package com.designPatterns.iteratorPattern.productCollection;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {

    List<Product> products = new ArrayList<>();

    public void push(Product product) {
        products.add(product);
    }

    public Product pop() {
        var lastIndex = products.size() - 1;
        var product = products.get(lastIndex);
        products.remove(product);
        return product;
    }

    public ProductIterator createProductIterator() {
        return new ProductIterator(this);
    }

    public class ProductIterator implements com.designPatterns.iteratorPattern.productCollection.ProductIterator {
        private ProductCollection productCollectionHistory;

        private int index;

        public ProductIterator(ProductCollection productCollectionHistory) {
            this.productCollectionHistory = productCollectionHistory;
        }

        @Override
        public boolean hasNext() {
            return index < productCollectionHistory.products.size();
        }

        @Override
        public void next() {
            index++;
        }

        @Override
        public Product current() {
            return productCollectionHistory.products.get(index);
        }
    }

}
