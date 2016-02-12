package com.test.utils;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;
import com.sun.jersey.core.util.MultivaluedMapImpl;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

public class RestClient {
    public static WebResource getWebResource() {
        ClientConfig clientConfig = new DefaultClientConfig();
        clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
        Client client = Client.create(clientConfig);
        return client.resource(Config.getProperty("host"));
    }

    public static <T> T get(String path, Class<T> responseType) {
        return get(path, new MultivaluedMapImpl(), responseType);
    }

    public static <T> T get(String path, String token, Class<T> responseType) {
        return get(path, new MultivaluedMapImpl(), token, responseType);
    }

    public static <T> T get(String path, MultivaluedMap params, Class<T> responseType) {
        return getWebResource().path(path).queryParams(params).type(MediaType.APPLICATION_JSON_TYPE)
                .header("Content-Type", "application/json")
                .header("Accept", "application/com.dreamtrips.api+json;version=2")
                .header("Accept-Language", "en-us")
                .get(responseType);
    }

    public static <T> T get(String path, MultivaluedMap params, String token, Class<T> responseType) {
        return getWebResource().path(path).queryParams(params).type(MediaType.APPLICATION_JSON_TYPE)
                .header("Content-Type", "application/json")
                .header("Accept", "application/com.dreamtrips.api+json;version=2")
                .header("Accept-Language", "en-us")
                .header("Authorization", "Token token=" + token)
                .get(responseType);
    }

    public static <T> T post(String path, Object requestObj, Class<T> responseType) {
        return post(path, new MultivaluedMapImpl(), requestObj, responseType);
    }

    public static <T> T post(String path, String token, Object requestObj, Class<T> responseType) {
        return post(path, new MultivaluedMapImpl(), token, requestObj, responseType);
    }

    public static <T> T post(String path, MultivaluedMap params, Object requestObj, Class<T> responseType) {
        return getWebResource().path(path).queryParams(params).type(MediaType.APPLICATION_JSON_TYPE)
                .header("Content-Type", "application/json")
                .header("Accept", "application/com.dreamtrips.api+json;version=2")
                .header("Accept-Language", "en-us")
                .post(responseType, requestObj);
    }

    public static <T> T post(String path, MultivaluedMap params, String token, Object requestObj, Class<T> responseType) {
        return getWebResource().path(path).queryParams(params).type(MediaType.APPLICATION_JSON_TYPE)
                .header("Content-Type", "application/json")
                .header("Accept", "application/com.dreamtrips.api+json;version=2")
                .header("Accept-Language", "en-us")
                .header("Authorization", "Token token=" + token)
                .post(responseType, requestObj);
    }

    public static <T> T post(String path, Class<T> responseType) {
        return getWebResource().path(path).type(MediaType.APPLICATION_JSON_TYPE)
                .header("Content-Type", "application/json")
                .header("Accept", "application/com.dreamtrips.api+json;version=2")
                .header("Accept-Language", "en-us")
                .post(responseType);
    }

    public static <T> T put(String path, Object requestObj, Class<T> responseType) {
        return getWebResource().path(path).type(MediaType.APPLICATION_JSON_TYPE)
                .header("Content-Type", "application/json")
                .header("Accept", "application/com.dreamtrips.api+json;version=2")
                .header("Accept-Language", "en-us")
                .put(responseType, requestObj);
    }

    public static <T> T put(String path, Object requestObj, String token, Class<T> responseType) {
        return getWebResource().path(path).type(MediaType.APPLICATION_JSON_TYPE)
                .header("Content-Type", "application/json")
                .header("Accept", "application/com.dreamtrips.api+json;version=2")
                .header("Accept-Language", "en-us")
                .header("Authorization", "Token token=" + token)
                .put(responseType, requestObj);
    }

    public static <T> T delete(String path, Object requestObj, String token, Class<T> responseType) {
        return getWebResource().path(path).type(MediaType.APPLICATION_JSON_TYPE)
                .header("Content-Type", "application/json")
                .header("Accept", "application/com.dreamtrips.api+json;version=2")
                .header("Accept-Language", "en-us")
                .header("Authorization", "Token token=" + token)
                .delete(responseType, requestObj);
    }

    public static <T> T delete(String path, String token, Class<T> responseType) {
        return getWebResource().path(path).type(MediaType.APPLICATION_JSON_TYPE)
                .header("Content-Type", "application/json")
                .header("Accept", "application/com.dreamtrips.api+json;version=2")
                .header("Accept-Language", "en-us")
                .header("Authorization", "Token token=" + token)
                .delete(responseType);
    }

}
