package com.huobi.client.impl;

import okhttp3.Request;

import java.net.Proxy;

public class RestApiRequest<T> {

  public Proxy proxy;
  public Request request;
  RestApiJsonParser<T> jsonParser;
}
