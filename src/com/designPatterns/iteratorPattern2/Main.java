package com.designPatterns.iteratorPattern2;

/**
 *
 *
 *  * If we change List object(declared in BrowseHistory class )  into array( for fix no. of Urls).
 *  * we need to change main method implementation.
 *  * We can solve this problem into iterator pattern.We need to modify only BrowseHistory class.
 * @Author Vaibhav
 */
public class Main {

    public static void main(String[] args) {
        var history = new BrowseHistory();
        history.push("www.vvs.com");
        history.push("www.vvsGlobal.com");
        history.push("www.vvsDigitalProduct.com");

        /*for (int h = 0; h < history.getUrls().size(); h++) {
            var url = history.getUrls().get(h);
            System.out.println("Urls " + url);
        }*/

        Iterator iterator = history.createIterator();
        while (iterator.hasNext()) {
            var url = iterator.current();
            System.out.println(url);
            iterator.next();
        }
    }
}
