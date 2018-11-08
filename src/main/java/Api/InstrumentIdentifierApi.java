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

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cybersource.authsdk.core.MerchantConfig;
import com.google.gson.reflect.TypeToken;

import Invokers.ApiCallback;
import Invokers.ApiClient;
import Invokers.ApiException;
import Invokers.ApiResponse;
import Invokers.Configuration;
import Invokers.Pair;
import Invokers.ProgressRequestBody;
import Invokers.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import Model.Body1;
import Model.InlineResponse400;
import Model.TmsV1InstrumentidentifiersDelete409Response;
import Model.TmsV1InstrumentidentifiersPost200Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InstrumentIdentifierApi {
    private ApiClient apiClient;

    public InstrumentIdentifierApi() {
        this(Configuration.getDefaultApiClient());
    }

    public InstrumentIdentifierApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for tmsV1InstrumentidentifiersTokenIdDelete
     * @param profileId The id of a profile containing user specific TMS configuration. (required)
     * @param merchantConfig  (merchant details)
     * @param tokenId The TokenId of an Instrument Identifier. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call tmsV1InstrumentidentifiersTokenIdDeleteCall(String profileId,MerchantConfig merchantConfig, String tokenId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/tms/v1/instrumentidentifiers/{tokenId}"
            .replaceAll("\\{" + "tokenId" + "\\}", apiClient.escapeString(tokenId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (profileId != null)
        localVarHeaderParams.put("profile-id", apiClient.parameterToString(profileId));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=utf-8"
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
        return apiClient.buildCall(localVarPath, "DELETE",merchantConfig, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call tmsV1InstrumentidentifiersTokenIdDeleteValidateBeforeCall(String profileId,MerchantConfig merchantConfig, String tokenId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'profileId' is set
        if (profileId == null) {
            throw new ApiException("Missing the required parameter 'profileId' when calling tmsV1InstrumentidentifiersTokenIdDelete(Async)");
        }
        
        // verify the required parameter 'tokenId' is set
        if (tokenId == null) {
            throw new ApiException("Missing the required parameter 'tokenId' when calling tmsV1InstrumentidentifiersTokenIdDelete(Async)");
        }
        
        
        com.squareup.okhttp.Call call = tmsV1InstrumentidentifiersTokenIdDeleteCall(profileId,merchantConfig, tokenId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete an Instrument Identifier
     * 
     * @param profileId The id of a profile containing user specific TMS configuration. (required)
     * @param merchantConfig  (merchant details)
     * @param tokenId The TokenId of an Instrument Identifier. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void tmsV1InstrumentidentifiersTokenIdDelete(String profileId,MerchantConfig merchantConfig, String tokenId) throws ApiException {
        tmsV1InstrumentidentifiersTokenIdDeleteWithHttpInfo(profileId,merchantConfig, tokenId);
    }

    /**
     * Delete an Instrument Identifier
     * 
     * @param profileId The id of a profile containing user specific TMS configuration. (required)
     * @param tokenId The TokenId of an Instrument Identifier. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> tmsV1InstrumentidentifiersTokenIdDeleteWithHttpInfo(String profileId,MerchantConfig merchantConfig, String tokenId) throws ApiException {
        com.squareup.okhttp.Call call = tmsV1InstrumentidentifiersTokenIdDeleteValidateBeforeCall(profileId,merchantConfig, tokenId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete an Instrument Identifier (asynchronously)
     * 
     * @param profileId The id of a profile containing user specific TMS configuration. (required)
     * @param merchantConfig  (merchant details)
     * @param tokenId The TokenId of an Instrument Identifier. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call tmsV1InstrumentidentifiersTokenIdDeleteAsync(String profileId,MerchantConfig merchantConfig, String tokenId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = tmsV1InstrumentidentifiersTokenIdDeleteValidateBeforeCall(profileId,merchantConfig, tokenId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for tmsV1InstrumentidentifiersTokenIdGet
     * @param profileId The id of a profile containing user specific TMS configuration. (required)
     * @param merchantConfig  (merchant details)
     * @param tokenId The TokenId of an Instrument Identifier. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call tmsV1InstrumentidentifiersTokenIdGetCall(String profileId,MerchantConfig merchantConfig, String tokenId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/tms/v1/instrumentidentifiers/{tokenId}"
            .replaceAll("\\{" + "tokenId" + "\\}", apiClient.escapeString(tokenId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (profileId != null)
        localVarHeaderParams.put("profile-id", apiClient.parameterToString(profileId));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=utf-8"
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
        return apiClient.buildCall(localVarPath, "GET",merchantConfig, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call tmsV1InstrumentidentifiersTokenIdGetValidateBeforeCall(String profileId,MerchantConfig merchantConfig, String tokenId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'profileId' is set
        if (profileId == null) {
            throw new ApiException("Missing the required parameter 'profileId' when calling tmsV1InstrumentidentifiersTokenIdGet(Async)");
        }
        
        // verify the required parameter 'tokenId' is set
        if (tokenId == null) {
            throw new ApiException("Missing the required parameter 'tokenId' when calling tmsV1InstrumentidentifiersTokenIdGet(Async)");
        }
        
        
        com.squareup.okhttp.Call call = tmsV1InstrumentidentifiersTokenIdGetCall(profileId,merchantConfig, tokenId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Retrieve an Instrument Identifier
     * 
     * @param profileId The id of a profile containing user specific TMS configuration. (required)
     * @param merchantConfig  (merchant details)
     * @param tokenId The TokenId of an Instrument Identifier. (required)
     * @return TmsV1InstrumentidentifiersPost200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TmsV1InstrumentidentifiersPost200Response tmsV1InstrumentidentifiersTokenIdGet(String profileId,MerchantConfig merchantConfig, String tokenId) throws ApiException {
        ApiResponse<TmsV1InstrumentidentifiersPost200Response> resp = tmsV1InstrumentidentifiersTokenIdGetWithHttpInfo(profileId,merchantConfig, tokenId);
        return resp.getData();
    }

    /**
     * Retrieve an Instrument Identifier
     * 
     * @param profileId The id of a profile containing user specific TMS configuration. (required)
     * @param merchantConfig  (merchant details)
     * @param tokenId The TokenId of an Instrument Identifier. (required)
     * @return ApiResponse&lt;TmsV1InstrumentidentifiersPost200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TmsV1InstrumentidentifiersPost200Response> tmsV1InstrumentidentifiersTokenIdGetWithHttpInfo(String profileId,MerchantConfig merchantConfig, String tokenId) throws ApiException {
        com.squareup.okhttp.Call call = tmsV1InstrumentidentifiersTokenIdGetValidateBeforeCall(profileId,merchantConfig, tokenId, null, null);
        Type localVarReturnType = new TypeToken<TmsV1InstrumentidentifiersPost200Response>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieve an Instrument Identifier (asynchronously)
     * 
     * @param profileId The id of a profile containing user specific TMS configuration. (required)
     * @param merchantConfig  (merchant details)
     * @param tokenId The TokenId of an Instrument Identifier. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call tmsV1InstrumentidentifiersTokenIdGetAsync(String profileId,MerchantConfig merchantConfig, String tokenId, final ApiCallback<TmsV1InstrumentidentifiersPost200Response> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = tmsV1InstrumentidentifiersTokenIdGetValidateBeforeCall(profileId,merchantConfig, tokenId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TmsV1InstrumentidentifiersPost200Response>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for tmsV1InstrumentidentifiersTokenIdPatch
     * @param profileId The id of a profile containing user specific TMS configuration. (required)
     * @param merchantConfig  (merchant details)
     * @param tokenId The TokenId of an Instrument Identifier. (required)
     * @param body Please specify the previous transaction Id to update. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call tmsV1InstrumentidentifiersTokenIdPatchCall(String profileId,MerchantConfig merchantConfig, String tokenId, Body1 body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/tms/v1/instrumentidentifiers/{tokenId}"
            .replaceAll("\\{" + "tokenId" + "\\}", apiClient.escapeString(tokenId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (profileId != null)
        localVarHeaderParams.put("profile-id", apiClient.parameterToString(profileId));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=utf-8"
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
        return apiClient.buildCall(localVarPath, "PATCH",merchantConfig, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call tmsV1InstrumentidentifiersTokenIdPatchValidateBeforeCall(String profileId,MerchantConfig merchantConfig, String tokenId, Body1 body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'profileId' is set
        if (profileId == null) {
            throw new ApiException("Missing the required parameter 'profileId' when calling tmsV1InstrumentidentifiersTokenIdPatch(Async)");
        }
        
        // verify the required parameter 'tokenId' is set
        if (tokenId == null) {
            throw new ApiException("Missing the required parameter 'tokenId' when calling tmsV1InstrumentidentifiersTokenIdPatch(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling tmsV1InstrumentidentifiersTokenIdPatch(Async)");
        }
        
        
        com.squareup.okhttp.Call call = tmsV1InstrumentidentifiersTokenIdPatchCall(profileId,merchantConfig, tokenId, body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update a Instrument Identifier
     * 
     * @param profileId The id of a profile containing user specific TMS configuration. (required)
     * @param merchantConfig  (merchant details)
     * @param tokenId The TokenId of an Instrument Identifier. (required)
     * @param body Please specify the previous transaction Id to update. (required)
     * @return TmsV1InstrumentidentifiersPost200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TmsV1InstrumentidentifiersPost200Response tmsV1InstrumentidentifiersTokenIdPatch(String profileId,MerchantConfig merchantConfig, String tokenId, Body1 body) throws ApiException {
        ApiResponse<TmsV1InstrumentidentifiersPost200Response> resp = tmsV1InstrumentidentifiersTokenIdPatchWithHttpInfo(profileId,merchantConfig, tokenId, body);
        return resp.getData();
    }

    /**
     * Update a Instrument Identifier
     * 
     * @param profileId The id of a profile containing user specific TMS configuration. (required)
     * @param merchantConfig  (merchant details)
     * @param tokenId The TokenId of an Instrument Identifier. (required)
     * @param body Please specify the previous transaction Id to update. (required)
     * @return ApiResponse&lt;TmsV1InstrumentidentifiersPost200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TmsV1InstrumentidentifiersPost200Response> tmsV1InstrumentidentifiersTokenIdPatchWithHttpInfo(String profileId,MerchantConfig merchantConfig, String tokenId, Body1 body) throws ApiException {
        com.squareup.okhttp.Call call = tmsV1InstrumentidentifiersTokenIdPatchValidateBeforeCall(profileId,merchantConfig, tokenId, body, null, null);
        Type localVarReturnType = new TypeToken<TmsV1InstrumentidentifiersPost200Response>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update a Instrument Identifier (asynchronously)
     * 
     * @param profileId The id of a profile containing user specific TMS configuration. (required)
     * @param merchantConfig  (merchant details)
     * @param tokenId The TokenId of an Instrument Identifier. (required)
     * @param body Please specify the previous transaction Id to update. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call tmsV1InstrumentidentifiersTokenIdPatchAsync(String profileId,MerchantConfig merchantConfig, String tokenId, Body1 body, final ApiCallback<TmsV1InstrumentidentifiersPost200Response> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = tmsV1InstrumentidentifiersTokenIdPatchValidateBeforeCall(profileId,merchantConfig, tokenId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TmsV1InstrumentidentifiersPost200Response>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}