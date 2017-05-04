package com.example.mobsoft.mobsoftlab3.mock;

/**
 * Created by Jozso on 2017. 05. 04..
 */
import com.example.mobsoft.mobsoftlab3.mock.interceptors.MockInterceptor;
import okhttp3.Request;
import okhttp3.Response;

public class MockHttpServer {

    public static Response call(Request request) {
        MockInterceptor mockInterceptor = new MockInterceptor();
        return mockInterceptor.process(request);
    }
}