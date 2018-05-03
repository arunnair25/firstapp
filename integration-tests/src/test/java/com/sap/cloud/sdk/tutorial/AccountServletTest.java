package com.sap.cloud.sdk.tutorial;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.arquillian.test.api.ArquillianResource;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URISyntaxException;
import java.net.URL;

import com.sap.cloud.sdk.testutil.MockUtil;

import static com.jayway.restassured.RestAssured.when;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.isEmptyOrNullString;
import static org.hamcrest.Matchers.not;

@RunWith(Arquillian.class)
public class AccountServletTest {
	private static final MockUtil mockUtil = new MockUtil();
    private static final Logger logger = LoggerFactory.getLogger(AccountServletTest.class);

    @ArquillianResource
    private URL baseUrl;

    @Deployment
    public static WebArchive createDeployment()
    {
        return TestUtil.createDeployment(AccountServlet.class);
    }

    @BeforeClass
    public static void beforeClass() throws URISyntaxException
    {
        mockUtil.mockDefaults();
        mockUtil.mockErpDestination();
    }

    @Before
    public void before()
    {
        RestAssured.baseURI = baseUrl.toExternalForm();
    }

    @Test
    public void testService()
    {
        when().
                get("/accounts").
                then().
                statusCode(200).
                contentType(ContentType.JSON).
                body("$", hasSize(greaterThan(0))).
                body("[0].Provider", not(isEmptyOrNullString()));
    }
}