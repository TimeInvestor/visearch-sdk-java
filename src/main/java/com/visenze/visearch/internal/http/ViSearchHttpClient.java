package com.visenze.visearch.internal.http;

import com.google.common.collect.Multimap;

import java.io.File;
import java.io.InputStream;

public interface ViSearchHttpClient {

    String get(String url, Multimap<String, String> params);

    String post(String url, Multimap<String, String> params);

    String postImage(String url, Multimap<String, String> params, File file);

    String postImage(String url, Multimap<String, String> params, InputStream inputStream, String filename);

}
