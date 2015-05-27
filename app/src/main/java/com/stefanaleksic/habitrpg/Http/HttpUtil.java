package com.stefanaleksic.habitrpg.Http;

import com.google.gson.Gson;
import com.loopj.android.http.RequestParams;

/**
 * Created by Stefan on 5/27/2015.
 */
public class HttpUtil {

    /**
     * Gets the json representation of a Java object using Google's gson library.
     *
     * @param obj The Gsonizable object.
     * @return The JSON representation of the Gsonizable object.
     */
    public static String getJsonFromClass(Object obj) {
        Gson gson = new Gson();
        String jsonString = gson.toJson(obj);
        return jsonString;
    }
}
