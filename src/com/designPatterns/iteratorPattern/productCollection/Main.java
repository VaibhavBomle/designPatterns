package com.designPatterns.iteratorPattern.productCollection;

/**
 * @Author Vaibhav
 */
public class Main {

    public static void main(String[] args) {
        ProductCollection productCollection = new ProductCollection();
        productCollection.push(new Product("BMD",3000000));
        productCollection.push(new Product("TESLA",4000000));
        productCollection.push(new Product("AUDI",1000000));

       ProductIterator productIterator =  productCollection.createProductIterator();
       while (productIterator.hasNext()){
           Product product = productIterator.current();
           System.out.println(product);
           productIterator.next();
       }
    }
}
