package com.designPatterns.iteratorPattern3;

/**
 *
 * So in future you want to deal with ex. list of product or person object you don't need to
 * change the main method implementation, you only need to change BrowserHistory class implementation.
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
