package com.stefanaleksic.habitrpg.Http;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

/**
 * Created by Stefan on 5/27/2015.
 * This class is going to do the bulk of the calling of the API.
 */
public class RawHttpClient {

    protected RawHttpClient(){

    }

    private static final String BASE_URL = "https://habitrpg.com/api/v2/";
    private static AsyncHttpClient client = new AsyncHttpClient();

    private static String API_KEY;
    private static String UUID;

    /**
     * Url get request method.
     *
     * @param url             The url one wants to send the get request to.
     * @param params          The parameters one wants to send.
     * @param responseHandler The callback class.
     */
    public static void get(String url, RequestParams params, AsyncHttpResponseHandler responseHandler) {
        client.get(getAbsoluteUrl(url), params, responseHandler);
    }

    /**
     * Url post request method.
     *
     * @param url                The url one wants to send the post request to.
     * @param params             The parameters one wants to send.
     * @param responseHandler    The callback class.
     * @param shouldAuthenticate Should the post request authenticate with the api key and uuid
     */
    public static void post(String url, RequestParams params, AsyncHttpResponseHandler responseHandler,
                            boolean shouldAuthenticate) {
        if (shouldAuthenticate) {

        }
        client.post(getAbsoluteUrl(url), params, responseHandler);
    }

    //Setter methods

    public static void setAPI_KEY(String API_KEY) {
        RawHttpClient.API_KEY = API_KEY;
    }

    public static void setUUID(String UUID) {
        RawHttpClient.UUID = UUID;
    }

    //End setter methods

    /**
     * Used in methods inside this class only.
     *
     * @param relativeUrl The url one wants to find absolute of.
     * @return Base url + the url given.
     */
    private static String getAbsoluteUrl(String relativeUrl) {
        return BASE_URL + relativeUrl;
    }

    /**
     * Priavte method that authenticates the request parameters with the api key and uuid.
     *
     * @param requestParams the request parameters one would like to change.
     *                      After this method, the request params will contain the api key and uuid.
     */
    private static void authenticateRequestParams(RequestParams requestParams) {
        requestParams.put("x-api-key", API_KEY);
        requestParams.put("x-api-user", UUID);
    }

}
