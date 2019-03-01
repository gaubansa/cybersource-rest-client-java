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

import Invokers.ApiException;
import Model.InlineResponse400;
import Model.ReportingV3ReportSubscriptionsGet200Response;
import Model.ReportingV3ReportSubscriptionsGet200ResponseSubscriptions;
import Model.Reportingv3ReportDownloadsGet400Response;
import Model.RequestBody1;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ReportSubscriptionsApi
 */
@Ignore
public class ReportSubscriptionsApiTest {

    private final ReportSubscriptionsApi api = new ReportSubscriptionsApi();

    
    /**
     * Create Report Subscription for a report name by organization
     *
     * Create a report subscription for your organization. The report name must be unique. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createSubscriptionTest() throws ApiException {
        RequestBody1 requestBody = null;
        String organizationId = null;
        api.createSubscription(requestBody, organizationId);

        // TODO: test validations
    }
    
    /**
     * Delete subscription of a report name by organization
     *
     * Delete a report subscription for your organization. You must know the unique name of the report you want to delete. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSubscriptionTest() throws ApiException {
        String reportName = null;
        api.deleteSubscription(reportName);

        // TODO: test validations
    }
    
    /**
     * Get all subscriptions
     *
     * View a summary of all report subscriptions. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllSubscriptionsTest() throws ApiException {
        ReportingV3ReportSubscriptionsGet200Response response = api.getAllSubscriptions();

        // TODO: test validations
    }
    
    /**
     * Get subscription for report name
     *
     * View the details of a report subscription, such as the report format or report frequency, using the report’s unique name. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSubscriptionTest() throws ApiException {
        String reportName = null;
        ReportingV3ReportSubscriptionsGet200ResponseSubscriptions response = api.getSubscription(reportName);

        // TODO: test validations
    }
    
}
