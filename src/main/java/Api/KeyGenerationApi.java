/*
 * CyberSource Flex API
 * Simple PAN tokenization service
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package Api;

import Invokers.ApiCallback;
import Invokers.ApiClient;
import Invokers.ApiException;
import Invokers.ApiResponse;
import Invokers.Configuration;
import Invokers.Pair;
import Invokers.ProgressRequestBody;
import Invokers.ProgressResponseBody;

import com.cybersource.authsdk.core.MerchantConfig;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;



import Model.GeneratePublicKeyRequest;
import Model.FlexV1KeysPost200Response;
import Model.InlineResponseDefault;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KeyGenerationApi {
    private ApiClient apiClient;

    public KeyGenerationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public KeyGenerationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for generatePublicKey
     * @param generatePublicKeyRequest  (optional)
     * @param merchantConfig  (merchant details)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call generatePublicKeyCall(GeneratePublicKeyRequest generatePublicKeyRequest,MerchantConfig merchantConfig, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = generatePublicKeyRequest;
        
        // create path and map variables
        String localVarPath = "/flex/v1/keys/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json;charset=utf-8"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST",merchantConfig, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call generatePublicKeyValidateBeforeCall(GeneratePublicKeyRequest generatePublicKeyRequest,MerchantConfig merchantConfig, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = generatePublicKeyCall(generatePublicKeyRequest,merchantConfig, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Generate Key
     * Generate a one-time use public key and key ID to encrypt the card number in the follow-on Tokenize Card request. The key used to encrypt the card number on the cardholder’s device or browser is valid for 15 minutes and must be used to verify the signature in the response message. CyberSource recommends creating a new key for each order. Generating a key is an authenticated request initiated from your servers, prior to requesting to tokenize the card data from your customer’s device or browser.
     * @param generatePublicKeyRequest  (optional)
     * @param merchantConfig  (merchant details)
     * @return FlexV1KeysPost200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FlexV1KeysPost200Response generatePublicKey(GeneratePublicKeyRequest generatePublicKeyRequest,MerchantConfig merchantConfig) throws ApiException {
        ApiResponse<FlexV1KeysPost200Response> resp = generatePublicKeyWithHttpInfo(generatePublicKeyRequest,merchantConfig);
        return resp.getData();
    }

    /**
     * Generate Key
     * Generate a one-time use public key and key ID to encrypt the card number in the follow-on Tokenize Card request. The key used to encrypt the card number on the cardholder’s device or browser is valid for 15 minutes and must be used to verify the signature in the response message. CyberSource recommends creating a new key for each order. Generating a key is an authenticated request initiated from your servers, prior to requesting to tokenize the card data from your customer’s device or browser.
     * @param generatePublicKeyRequest  (optional)
     * @param merchantConfig  (merchant details)
     * @return ApiResponse&lt;FlexV1KeysPost200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FlexV1KeysPost200Response> generatePublicKeyWithHttpInfo(GeneratePublicKeyRequest generatePublicKeyRequest,MerchantConfig merchantConfig) throws ApiException {
        com.squareup.okhttp.Call call = generatePublicKeyValidateBeforeCall(generatePublicKeyRequest,merchantConfig, null, null);
        Type localVarReturnType = new TypeToken<FlexV1KeysPost200Response>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Generate Key (asynchronously)
     * Generate a one-time use public key and key ID to encrypt the card number in the follow-on Tokenize Card request. The key used to encrypt the card number on the cardholder’s device or browser is valid for 15 minutes and must be used to verify the signature in the response message. CyberSource recommends creating a new key for each order. Generating a key is an authenticated request initiated from your servers, prior to requesting to tokenize the card data from your customer’s device or browser.
     * @param generatePublicKeyRequest  (optional)
     * @param merchantConfig  (merchant details)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call generatePublicKeyAsync(GeneratePublicKeyRequest generatePublicKeyRequest,MerchantConfig merchantConfig, final ApiCallback<FlexV1KeysPost200Response> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = generatePublicKeyValidateBeforeCall(generatePublicKeyRequest,merchantConfig, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FlexV1KeysPost200Response>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}