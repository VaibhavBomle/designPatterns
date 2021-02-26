package com.designPatterns.iteratorPattern1;

/**
 *
 * Problem in this implementation :
 * If we change List object(declared in BrowseHistory class )  into array( for fix no. of Urls).
 * we need to change main method implementation.
 * We can solve this problem into iterator pattern.
 *
 * In this implementation you only deal with URL Object . If Suppose requirement is to deal with Person or Product object
 * You need to change main  class  implementation with BrowserHistory implementation.
 * @Author Vaibhav
 */
public class Main {

    public static void main(String[] args) {
        var history = new BrowseHistory();
        history.push("www.vss.com");
        history.push("www.vvsGlobal.com");
        history.push("www.vvsDigitalProduct.com");

        for (int h = 0; h < history.getUrls().size(); h++) {
            var url = history.getUrls().get(h);
            System.out.println("Urls " + url);
        }
    }
}
