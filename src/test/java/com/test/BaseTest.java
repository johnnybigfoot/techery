package com.test;

import com.sun.jersey.api.client.WebResource;
import com.test.domain.model.request.AuthorizeRequest;
import com.test.domain.model.request.BucketRequest;
import com.test.domain.model.response.Authorize;
import com.test.domain.model.response.Bucket;
import com.test.domain.model.response.Category;
import com.test.domain.model.response.Location;
import com.test.utils.RestClient;

public class BaseTest {
    protected WebResource webResource;
    public static final String AUTHORIZE = "/api/sessions";
    public static final String LOCATIONS = "/api/bucket_list/locations";
    public static final String CATEGORIES = "/api/categories";
    public static final String BUCKET = "/api/bucket_list_items";

    protected Authorize authorize(AuthorizeRequest authorizeRequest) {
        return RestClient.post(AUTHORIZE, authorizeRequest, Authorize.class);
    }

    protected Location[] getLocations(String token) {
        return RestClient.get(LOCATIONS, token, Location[].class);
    }

    protected Category[] getCategories() {
        return RestClient.get(CATEGORIES, Category[].class);
    }

    protected Bucket createBucket(String token, BucketRequest bucketRequest) {
        return RestClient.post(BUCKET, token, bucketRequest, Bucket.class);
    }

    protected Bucket[] getBuckets(String token) {
        return RestClient.get(BUCKET, token, Bucket[].class);
    }

    protected Bucket getBucketInfo(String token, int bucketId) {
        return RestClient.get(BUCKET + "/" + bucketId, token, Bucket.class);
    }

    protected Bucket updateBucket(String token, Bucket bucket) {
        return RestClient.put(BUCKET + "/" + bucket.getId(), bucket, token, Bucket.class);
    }

    protected String deleteBucket(String token, int bucketId) {
        return RestClient.delete(BUCKET + "/" + bucketId, token, String.class);
    }
}
