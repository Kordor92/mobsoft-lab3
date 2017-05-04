package com.example.mobsoft.mobsoftlab3.mock.interceptors;

/**
 * Created by Jozso on 2017. 05. 04..
 */

import android.net.Uri;

import com.example.mobsoft.mobsoftlab3.network.NetworkConfig;
import com.example.mobsoft.mobsoftlab3.repository.MemoryRepository;
import com.example.mobsoft.mobsoftlab3.utils.GsonHelper;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import java.util.*;

import com.example.mobsoft.mobsoftlab3.model.Event;

import static com.example.mobsoft.mobsoftlab3.mock.interceptors.MockHelper.makeResponse;

public class EventMock {
    public static Response process(Request request) {
        Uri uri = Uri.parse(request.url().toString());

        String responseString;
        int responseCode;
        Headers headers = request.headers();


        if (uri.getPath().equals(NetworkConfig.ENDPOINT_PREFIX + "event/join") && request.method().equals("POST")) {
            MemoryRepository memoryRepository = new MemoryRepository();
            memoryRepository.open(null);
            List<String> l = new ArrayList<String>();
            l.add("asd");
            l.add("asd");
            memoryRepository.joinEvent(new Event(1, "asd","asd","asd",1,l,"X"));
            responseString = "JE";
            responseCode = 200;
		}else if (uri.getPath().equals(NetworkConfig.ENDPOINT_PREFIX + "event/create") && request.method().equals("POST")) {
            MemoryRepository memoryRepository = new MemoryRepository();
            memoryRepository.open(null);
            List<String> l = new ArrayList<String>();
            l.add("asd");
            l.add("asd");
            memoryRepository.createEvent(1, "asd","asd","asd",1,l);
            responseString = GsonHelper.getGson().toJson(memoryRepository.getEvents());
            responseCode = 200;

        }else if (uri.getPath().equals(NetworkConfig.ENDPOINT_PREFIX + "event") && request.method().equals("Get")) {
			MemoryRepository memoryRepository = new MemoryRepository();
			memoryRepository.open(null);

			responseString = GsonHelper.getGson().toJson(memoryRepository.getEvent(Integer.parseInt(uri.getQueryParameter("id"))));
			responseCode = 200;

        } else if (uri.getPath().equals(NetworkConfig.ENDPOINT_PREFIX + "event/all") && request.method().equals("Get")) {
            MemoryRepository memoryRepository = new MemoryRepository();
            memoryRepository.open(null);
            responseString = GsonHelper.getGson().toJson(memoryRepository.getEvents());
            responseCode = 200;

        }else if (uri.getPath().equals(NetworkConfig.ENDPOINT_PREFIX + "event/my") && request.method().equals("Get")) {
            MemoryRepository memoryRepository = new MemoryRepository();
            memoryRepository.open(null);
            responseString = GsonHelper.getGson().toJson(memoryRepository.getMyEvents());
            responseCode = 200;

        }else {
            responseString = "ERROR";
            responseCode = 503;
        }

        return makeResponse(request, headers, responseCode, responseString);
    }
}
