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
import org.joda.time.LocalDate;
import Model.Reportingv3ReportDownloadsGet400Response;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ReportDownloadsApi
 */
@Ignore
public class ReportDownloadsApiTest {

    private final ReportDownloadsApi api = new ReportDownloadsApi();

    
    /**
     * Download a report
     *
     * Download a report using the unique report name and date. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void downloadReportTest() throws ApiException {
        LocalDate reportDate = null;
        String reportName = null;
        String organizationId = null;
        api.downloadReport(reportDate, reportName, organizationId);

        // TODO: test validations
    }
    
}
