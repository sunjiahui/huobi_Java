package com.huobi.client;

import com.huobi.client.exception.HuobiApiException;

import java.net.Proxy;
import java.net.URL;

/**
 * The configuration for the request APIs
 */
public class RequestOptions {

  private String url = "https://api.huobi.pro";
  private Proxy proxy;

  public RequestOptions() {
  }

  public RequestOptions(RequestOptions option) {
    this.url = option.url;
    this.setProxy(option.getProxy());
  }

  /**
   * Set the URL for request.
   *
   * @param url The URL name like "https://api.huobi.pro".
   */
  public void setUrl(String url) {
    try {
      URL u = new URL(url);
    } catch (Exception e)
    {
      throw new HuobiApiException(
          HuobiApiException.INPUT_ERROR, "The URI is incorrect: " + e.getMessage());
    }
    this.url = url;
  }

  public String getUrl() {
    return url;
  }

  public Proxy getProxy() {
    return proxy;
  }

  public void setProxy(Proxy proxy) {
    this.proxy = proxy;
  }
}
