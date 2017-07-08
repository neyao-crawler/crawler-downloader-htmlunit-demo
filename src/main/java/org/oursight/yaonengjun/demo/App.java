package org.oursight.yaonengjun.demo;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

import java.io.IOException;

/**
 * Hello world!
 */
public class App {
  public static void main(String[] args) throws IOException {
    long t0 = System.currentTimeMillis();
//    String url = "http://angularjs.cn";
    String url = "https://www.itslaw.com/bj";
//    WebClient webClient = new WebClient();
    WebClient webClient = new WebClient(BrowserVersion.FIREFOX_52);
    final HtmlPage page = webClient.getPage(url);

//    final String pageAsXml = page.asXml();

    final String pageAsText = page.asText();

    long t2 = System.currentTimeMillis();
    System.out.println(pageAsText);
    System.out.println("Load page text: " + (t2-t0) + " ms");

  }
}
