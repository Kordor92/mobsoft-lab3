package com.example.mobsoft.mobsoftlab3.mock.interceptors;

/**
 * Created by Jozso on 2017. 05. 04..
 */

import android.net.Uri;
import android.util.Log;

import java.io.IOException;

import com.example.mobsoft.mobsoftlab3.network.NetworkConfig;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

import static com.example.mobsoft.mobsoftlab3.mock.interceptors.MockHelper.makeResponse;

public class MockInterceptor implements Interceptor {

    @Override
    public Response intercept(Chain chain) throws IOException {
        return process(chain.request());
    }

    public Response process(Request request) {

        Uri uri = Uri.parse(request.url().toString());

        Log.d("Test Http Client", "URL call: " + uri.toString());
        Headers headers = request.headers();


        if (uri.getPath().startsWith(NetworkConfig.ENDPOINT_PREFIX + "todo")) {
            return EventMock.process(request);
        }




        return makeResponse(request, headers, 404, "Unknown");

    }

}