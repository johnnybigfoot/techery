package com.test;

import com.test.domain.model.request.AuthorizeRequest;
import com.test.domain.model.request.BucketRequest;
import com.test.domain.model.response.Authorize;
import com.test.domain.model.response.Bucket;
import com.test.domain.model.response.Category;
import com.test.domain.model.response.Location;
import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class BaseFlowTest extends BaseTest {
    private String username = "65664426";
    private String password = username;

    @Test
    public void authorizeTest() {
        AuthorizeRequest authorizeRequest = new AuthorizeRequest(username, password);
        Authorize authorizeResponse = authorize(authorizeRequest);
        Assert.assertNotNull("Token shouldn't be null!", authorizeResponse.getToken());
    }

    @Test
    public void getLocationsTest() {
        AuthorizeRequest authorizeRequest = new AuthorizeRequest(username, password);
        Authorize authorizeResponse = authorize(authorizeRequest);
        String token = authorizeResponse.getToken();
        try {
            Location[] locations = getLocations(token);
        } catch (Exception e) {
            e.printStackTrace();
            org.junit.Assert.fail("Error on getting Locations");
        }
    }

    @Test
    public void getCategoriesTest() {
        try {
            Category[] categories = getCategories();
        } catch (Exception e) {
            e.printStackTrace();
            org.junit.Assert.fail("Error on getting Categories");
        }
    }

    @Test
    public void createBucketTest() {
        AuthorizeRequest authorizeRequest = new AuthorizeRequest(username, password);
        Authorize authorizeResponse = authorize(authorizeRequest);
        String token = authorizeResponse.getToken();
        BucketRequest bucketRequest = new BucketRequest("location", new Random().nextInt(1000));
        bucketRequest.setCategory_id(1);
        bucketRequest.setDescription("some fake descr");
        bucketRequest.setFriends(new String[]{"imaginaryFriend"});
        bucketRequest.setStatus("new");
        bucketRequest.setTarget_data("2016-12-12 12:00:00");
        Bucket bucket = createBucket(token, bucketRequest);
        Assert.assertNotNull("Error on bucket creation!", bucket.getUid());
//        System.out.println("Bucket created: " + bucket);
    }

    @Test
    public void getAllBucketsTest() {
        AuthorizeRequest authorizeRequest = new AuthorizeRequest(username, password);
        Authorize authorizeResponse = authorize(authorizeRequest);
        String token = authorizeResponse.getToken();
        BucketRequest bucketRequest = new BucketRequest("location", new Random().nextInt(1000));
        bucketRequest.setCategory_id(1);
        bucketRequest.setDescription("some fake descr");
        bucketRequest.setFriends(new String[]{"imaginaryFriend"});
        bucketRequest.setStatus("new");
        bucketRequest.setTarget_data("2016-12-12 12:00:00");
        Bucket bucket = createBucket(token, bucketRequest);
//        Arrays.asList(getBuckets(token)).stream().forEach(b -> System.out.println(b));
        Assert.assertTrue("Error on getting buckets list!", getBuckets(token).length > 0);
    }

    @Test
    public void updateBucketTest() {
        AuthorizeRequest authorizeRequest = new AuthorizeRequest(username, password);
        Authorize authorizeResponse = authorize(authorizeRequest);
        String token = authorizeResponse.getToken();
        BucketRequest bucketRequest = new BucketRequest("location", new Random().nextInt(1000));
        bucketRequest.setCategory_id(1);
        bucketRequest.setDescription("some fake descr");
        bucketRequest.setFriends(new String[]{"imaginaryFriend"});
        bucketRequest.setStatus("new");
        bucketRequest.setTarget_data("2016-12-12 12:00:00");
        Bucket bucket = createBucket(token, bucketRequest);
        bucket.setDescription("NewDescription");
        String updatedBucket = updateBucket(token, bucket);
        Assert.assertTrue("Error on bucket update!", updatedBucket.contains("NewDescription"));
    }

    @Test
    public void deleteBucketTest() {
        AuthorizeRequest authorizeRequest = new AuthorizeRequest(username, password);
        Authorize authorizeResponse = authorize(authorizeRequest);
        String token = authorizeResponse.getToken();
        BucketRequest bucketRequest = new BucketRequest("location", new Random().nextInt(1000));
        bucketRequest.setCategory_id(1);
        bucketRequest.setDescription("some fake descr");
        bucketRequest.setFriends(new String[]{"imaginaryFriend"});
        bucketRequest.setStatus("new");
        bucketRequest.setTarget_data("2016-12-12 12:00:00");
        Bucket bucket = createBucket(token, bucketRequest);
        deleteBucket(token, bucket.getId());
        Assert.assertFalse("Bucket wasn't removed!", containsBucketWithId(getBuckets(token), bucket.getId()));
    }

    @Test
    public void getBucketInfoTest() {
        AuthorizeRequest authorizeRequest = new AuthorizeRequest(username, password);
        Authorize authorizeResponse = authorize(authorizeRequest);
        String token = authorizeResponse.getToken();
        BucketRequest bucketRequest = new BucketRequest("location", new Random().nextInt(1000));
        bucketRequest.setCategory_id(1);
        bucketRequest.setDescription("some fake descr");
        bucketRequest.setFriends(new String[]{"imaginaryFriend"});
        bucketRequest.setStatus("new");
        bucketRequest.setTarget_data("2016-12-12 12:00:00");
        Bucket bucket = createBucket(token, bucketRequest);
        String bucketInfo = getBucketInfo(token, bucket.getId());
//        System.out.println(bucketInfo);
        Assert.assertNotNull("Error on bucket get info!", bucketInfo);
    }
}