/*
 * CyberSource Merged Spec
 * All CyberSource API specs merged together. These are available at https://developer.cybersource.com/api/reference/api-reference.html
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

import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.InputStream;


import Model.CreateReportSubscriptionRequest;
import Model.InlineResponse4001;
import Model.PredefinedSubscriptionRequestBean;
import Model.ReportingV3ReportSubscriptionsGet200Response;
import Model.ReportingV3ReportSubscriptionsGet200ResponseSubscriptions;
import Model.Reportingv3ReportDownloadsGet400Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ReportSubscriptionsApi {
    private static Logger logger = LogManager.getLogger(ReportSubscriptionsApi.class);
    
    private ApiClient apiClient;

    public ReportSubscriptionsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ReportSubscriptionsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createStandardOrClassicSubscription
     * @param predefinedSubscriptionRequestBean Report subscription request payload (required)
     * @param organizationId Valid Organization Id (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call createStandardOrClassicSubscriptionCall(PredefinedSubscriptionRequestBean predefinedSubscriptionRequestBean, String organizationId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = predefinedSubscriptionRequestBean;
        
        // create path and map variables
        String localVarPath = "/reporting/v3/predefined-report-subscriptions";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (organizationId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "organizationId", organizationId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/hal+json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json;charset=utf-8"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().newBuilder().addNetworkInterceptor(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private okhttp3.Call createStandardOrClassicSubscriptionValidateBeforeCall(PredefinedSubscriptionRequestBean predefinedSubscriptionRequestBean, String organizationId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'predefinedSubscriptionRequestBean' is set
        if (predefinedSubscriptionRequestBean == null) {
        	logger.error("Missing the required parameter 'predefinedSubscriptionRequestBean' when calling createStandardOrClassicSubscription(Async)");
            throw new ApiException("Missing the required parameter 'predefinedSubscriptionRequestBean' when calling createStandardOrClassicSubscription(Async)");
        }
        
        
        okhttp3.Call call = createStandardOrClassicSubscriptionCall(predefinedSubscriptionRequestBean, organizationId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create a Standard or Classic Subscription
     * Create or update an already existing classic or standard subscription. 
     * @param predefinedSubscriptionRequestBean Report subscription request payload (required)
     * @param organizationId Valid Organization Id (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void createStandardOrClassicSubscription(PredefinedSubscriptionRequestBean predefinedSubscriptionRequestBean, String organizationId) throws ApiException {
    	logger.info("CALL TO METHOD 'createStandardOrClassicSubscription' STARTED");
        this.apiClient.setComputationStartTime(System.nanoTime());
        createStandardOrClassicSubscriptionWithHttpInfo(predefinedSubscriptionRequestBean, organizationId);

    }

    /**
     * Create a Standard or Classic Subscription
     * Create or update an already existing classic or standard subscription. 
     * @param predefinedSubscriptionRequestBean Report subscription request payload (required)
     * @param organizationId Valid Organization Id (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> createStandardOrClassicSubscriptionWithHttpInfo(PredefinedSubscriptionRequestBean predefinedSubscriptionRequestBean, String organizationId) throws ApiException {
        okhttp3.Call call = createStandardOrClassicSubscriptionValidateBeforeCall(predefinedSubscriptionRequestBean, organizationId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Create a Standard or Classic Subscription (asynchronously)
     * Create or update an already existing classic or standard subscription. 
     * @param predefinedSubscriptionRequestBean Report subscription request payload (required)
     * @param organizationId Valid Organization Id (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call createStandardOrClassicSubscriptionAsync(PredefinedSubscriptionRequestBean predefinedSubscriptionRequestBean, String organizationId, final ApiCallback<Void> callback) throws ApiException {

        this.apiClient.setComputationStartTime(System.nanoTime());
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

        okhttp3.Call call = createStandardOrClassicSubscriptionValidateBeforeCall(predefinedSubscriptionRequestBean, organizationId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for createSubscription
     * @param createReportSubscriptionRequest Report subscription request payload (required)
     * @param organizationId Valid Organization Id (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call createSubscriptionCall(CreateReportSubscriptionRequest createReportSubscriptionRequest, String organizationId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = createReportSubscriptionRequest;
        
        // create path and map variables
        String localVarPath = "/reporting/v3/report-subscriptions";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (organizationId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "organizationId", organizationId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/hal+json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().newBuilder().addNetworkInterceptor(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private okhttp3.Call createSubscriptionValidateBeforeCall(CreateReportSubscriptionRequest createReportSubscriptionRequest, String organizationId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'createReportSubscriptionRequest' is set
        if (createReportSubscriptionRequest == null) {
        	logger.error("Missing the required parameter 'createReportSubscriptionRequest' when calling createSubscription(Async)");
            throw new ApiException("Missing the required parameter 'createReportSubscriptionRequest' when calling createSubscription(Async)");
        }
        
        
        okhttp3.Call call = createSubscriptionCall(createReportSubscriptionRequest, organizationId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create Report Subscription for a Report Name by Organization
     * Create a report subscription for your organization. The report name must be unique. 
     * @param createReportSubscriptionRequest Report subscription request payload (required)
     * @param organizationId Valid Organization Id (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void createSubscription(CreateReportSubscriptionRequest createReportSubscriptionRequest, String organizationId) throws ApiException {
    	logger.info("CALL TO METHOD 'createSubscription' STARTED");
        this.apiClient.setComputationStartTime(System.nanoTime());
        createSubscriptionWithHttpInfo(createReportSubscriptionRequest, organizationId);

    }

    /**
     * Create Report Subscription for a Report Name by Organization
     * Create a report subscription for your organization. The report name must be unique. 
     * @param createReportSubscriptionRequest Report subscription request payload (required)
     * @param organizationId Valid Organization Id (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> createSubscriptionWithHttpInfo(CreateReportSubscriptionRequest createReportSubscriptionRequest, String organizationId) throws ApiException {
        okhttp3.Call call = createSubscriptionValidateBeforeCall(createReportSubscriptionRequest, organizationId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Create Report Subscription for a Report Name by Organization (asynchronously)
     * Create a report subscription for your organization. The report name must be unique. 
     * @param createReportSubscriptionRequest Report subscription request payload (required)
     * @param organizationId Valid Organization Id (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call createSubscriptionAsync(CreateReportSubscriptionRequest createReportSubscriptionRequest, String organizationId, final ApiCallback<Void> callback) throws ApiException {

        this.apiClient.setComputationStartTime(System.nanoTime());
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

        okhttp3.Call call = createSubscriptionValidateBeforeCall(createReportSubscriptionRequest, organizationId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for deleteSubscription
     * @param reportName Name of the Report to Delete (required)
     * @param organizationId Valid Organization Id (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call deleteSubscriptionCall(String reportName, String organizationId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/reporting/v3/report-subscriptions/{reportName}"
            .replaceAll("\\{" + "reportName" + "\\}", apiClient.escapeString(reportName.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (organizationId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "organizationId", organizationId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/hal+json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json;charset=utf-8"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().newBuilder().addNetworkInterceptor(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteSubscriptionValidateBeforeCall(String reportName, String organizationId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'reportName' is set
        if (reportName == null) {
        	logger.error("Missing the required parameter 'reportName' when calling deleteSubscription(Async)");
            throw new ApiException("Missing the required parameter 'reportName' when calling deleteSubscription(Async)");
        }
        
        
        okhttp3.Call call = deleteSubscriptionCall(reportName, organizationId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete Subscription of a Report Name by Organization
     * Delete a report subscription for your organization. You must know the unique name of the report you want to delete. 
     * @param reportName Name of the Report to Delete (required)
     * @param organizationId Valid Organization Id (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteSubscription(String reportName, String organizationId) throws ApiException {
    	logger.info("CALL TO METHOD 'deleteSubscription' STARTED");
        this.apiClient.setComputationStartTime(System.nanoTime());
        deleteSubscriptionWithHttpInfo(reportName, organizationId);

    }

    /**
     * Delete Subscription of a Report Name by Organization
     * Delete a report subscription for your organization. You must know the unique name of the report you want to delete. 
     * @param reportName Name of the Report to Delete (required)
     * @param organizationId Valid Organization Id (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteSubscriptionWithHttpInfo(String reportName, String organizationId) throws ApiException {
        okhttp3.Call call = deleteSubscriptionValidateBeforeCall(reportName, organizationId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete Subscription of a Report Name by Organization (asynchronously)
     * Delete a report subscription for your organization. You must know the unique name of the report you want to delete. 
     * @param reportName Name of the Report to Delete (required)
     * @param organizationId Valid Organization Id (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call deleteSubscriptionAsync(String reportName, String organizationId, final ApiCallback<Void> callback) throws ApiException {

        this.apiClient.setComputationStartTime(System.nanoTime());
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

        okhttp3.Call call = deleteSubscriptionValidateBeforeCall(reportName, organizationId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getAllSubscriptions
     * @param organizationId Valid Organization Id (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getAllSubscriptionsCall(String organizationId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/reporting/v3/report-subscriptions";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (organizationId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "organizationId", organizationId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/hal+json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json;charset=utf-8"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().newBuilder().addNetworkInterceptor(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private okhttp3.Call getAllSubscriptionsValidateBeforeCall(String organizationId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        okhttp3.Call call = getAllSubscriptionsCall(organizationId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get All Subscriptions
     * View a summary of all report subscriptions. 
     * @param organizationId Valid Organization Id (optional)
     * @return ReportingV3ReportSubscriptionsGet200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ReportingV3ReportSubscriptionsGet200Response getAllSubscriptions(String organizationId) throws ApiException {
    	logger.info("CALL TO METHOD 'getAllSubscriptions' STARTED");
        this.apiClient.setComputationStartTime(System.nanoTime());
        ApiResponse<ReportingV3ReportSubscriptionsGet200Response> resp = getAllSubscriptionsWithHttpInfo(organizationId);
        logger.info("CALL TO METHOD 'getAllSubscriptions' ENDED");
        return resp.getData();
    }

    /**
     * Get All Subscriptions
     * View a summary of all report subscriptions. 
     * @param organizationId Valid Organization Id (optional)
     * @return ApiResponse&lt;ReportingV3ReportSubscriptionsGet200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ReportingV3ReportSubscriptionsGet200Response> getAllSubscriptionsWithHttpInfo(String organizationId) throws ApiException {
        okhttp3.Call call = getAllSubscriptionsValidateBeforeCall(organizationId, null, null);
        Type localVarReturnType = new TypeToken<ReportingV3ReportSubscriptionsGet200Response>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get All Subscriptions (asynchronously)
     * View a summary of all report subscriptions. 
     * @param organizationId Valid Organization Id (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getAllSubscriptionsAsync(String organizationId, final ApiCallback<ReportingV3ReportSubscriptionsGet200Response> callback) throws ApiException {

        this.apiClient.setComputationStartTime(System.nanoTime());
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

        okhttp3.Call call = getAllSubscriptionsValidateBeforeCall(organizationId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ReportingV3ReportSubscriptionsGet200Response>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSubscription
     * @param reportName Name of the Report to Retrieve (required)
     * @param organizationId Valid Organization Id (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getSubscriptionCall(String reportName, String organizationId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/reporting/v3/report-subscriptions/{reportName}"
            .replaceAll("\\{" + "reportName" + "\\}", apiClient.escapeString(reportName.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (organizationId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "organizationId", organizationId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/hal+json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json;charset=utf-8"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().newBuilder().addNetworkInterceptor(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private okhttp3.Call getSubscriptionValidateBeforeCall(String reportName, String organizationId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'reportName' is set
        if (reportName == null) {
        	logger.error("Missing the required parameter 'reportName' when calling getSubscription(Async)");
            throw new ApiException("Missing the required parameter 'reportName' when calling getSubscription(Async)");
        }
        
        
        okhttp3.Call call = getSubscriptionCall(reportName, organizationId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Subscription for Report Name
     * View the details of a report subscription, such as the report format or report frequency, using the report’s unique name. 
     * @param reportName Name of the Report to Retrieve (required)
     * @param organizationId Valid Organization Id (optional)
     * @return ReportingV3ReportSubscriptionsGet200ResponseSubscriptions
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ReportingV3ReportSubscriptionsGet200ResponseSubscriptions getSubscription(String reportName, String organizationId) throws ApiException {
    	logger.info("CALL TO METHOD 'getSubscription' STARTED");
        this.apiClient.setComputationStartTime(System.nanoTime());
        ApiResponse<ReportingV3ReportSubscriptionsGet200ResponseSubscriptions> resp = getSubscriptionWithHttpInfo(reportName, organizationId);
        logger.info("CALL TO METHOD 'getSubscription' ENDED");
        return resp.getData();
    }

    /**
     * Get Subscription for Report Name
     * View the details of a report subscription, such as the report format or report frequency, using the report’s unique name. 
     * @param reportName Name of the Report to Retrieve (required)
     * @param organizationId Valid Organization Id (optional)
     * @return ApiResponse&lt;ReportingV3ReportSubscriptionsGet200ResponseSubscriptions&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ReportingV3ReportSubscriptionsGet200ResponseSubscriptions> getSubscriptionWithHttpInfo(String reportName, String organizationId) throws ApiException {
        okhttp3.Call call = getSubscriptionValidateBeforeCall(reportName, organizationId, null, null);
        Type localVarReturnType = new TypeToken<ReportingV3ReportSubscriptionsGet200ResponseSubscriptions>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Subscription for Report Name (asynchronously)
     * View the details of a report subscription, such as the report format or report frequency, using the report’s unique name. 
     * @param reportName Name of the Report to Retrieve (required)
     * @param organizationId Valid Organization Id (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getSubscriptionAsync(String reportName, String organizationId, final ApiCallback<ReportingV3ReportSubscriptionsGet200ResponseSubscriptions> callback) throws ApiException {

        this.apiClient.setComputationStartTime(System.nanoTime());
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

        okhttp3.Call call = getSubscriptionValidateBeforeCall(reportName, organizationId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ReportingV3ReportSubscriptionsGet200ResponseSubscriptions>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
