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
import Model.AuthReversalRequest;
import Model.PtsV2PaymentsPost502Response;
import Model.PtsV2PaymentsReversalsPost201Response;
import Model.PtsV2PaymentsReversalsPost400Response;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ReversalApi
 */
@Ignore
public class ReversalApiTest {

    private final ReversalApi api = new ReversalApi();

    
    /**
     * Process an Authorization Reversal
     *
     * Include the payment ID in the POST request to reverse the payment amount.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void authReversalTest() throws ApiException {
        String id = null;
        AuthReversalRequest authReversalRequest = null;
        PtsV2PaymentsReversalsPost201Response response = api.authReversal(id, authReversalRequest);

        // TODO: test validations
    }
    
}
