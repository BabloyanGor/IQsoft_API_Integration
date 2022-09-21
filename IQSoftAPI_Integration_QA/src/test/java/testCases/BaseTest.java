package testCases;

import com.google.gson.Gson;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.*;
import testData.APISVariables_Authorization_Request;
import utilities.DriverFactory;
import utilities.ReadConfig;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;


public class BaseTest extends DriverFactory {
    public static Logger logger;
    ReadConfig readConfig = new ReadConfig();

    //Variables for Authorization API
    public int partnerID = readConfig.getPartnerID();
    public String callbackUrl = readConfig.getCallbackUrl();
    public String productID = readConfig.getProductID();
    public String sessionToken = readConfig.getSessionToken();
    public String currencyId = readConfig.getCurrencyId();
    public String languageId = readConfig.getLanguageId();
    /////////////////////////////////////////////////////////////




    public String platform = readConfig.getPlatform();
    public String userID = readConfig.getUserID();
    public String currency = readConfig.getCurrency();
    public String betAmount = readConfig.getBetAmount();
    public String apiUrl = readConfig.getApiUrl();

    public BaseTest() {
    }

    public void writeInExel(ArrayList<String> errorSrcXl, String src, String shitName) throws IOException {
        String target = System.getProperty("user.dir") + src;
        XSSFWorkbook workbook = new XSSFWorkbook();
        FileOutputStream file = new FileOutputStream(target);
        XSSFSheet sheet = workbook.createSheet(shitName);
        sheet.setColumnWidth(0, 20000);
        int l = 0;
        for (String err : errorSrcXl) {
            XSSFRow row = sheet.createRow(l);
            row.createCell(0).setCellValue(err);
            l++;
        }
        workbook.write(file);
        workbook.close();
    }

    public String authorizationAPI() throws UnirestException {
        Gson gson = new Gson();
        Unirest.setTimeouts(0, 0);
        APISVariables_Authorization_Request apisVariables_authorization_request = new APISVariables_Authorization_Request();
        apisVariables_authorization_request.setToken(sessionToken);
        apisVariables_authorization_request.setCurrencyId(currencyId);
        apisVariables_authorization_request.setPartnerId(partnerID);
        apisVariables_authorization_request.setProductId(productID);
        apisVariables_authorization_request.setLanguageId(languageId);
        String authorizationBodyValue = gson.toJson(apisVariables_authorization_request);

        HttpResponse<String> response = Unirest.post(callbackUrl + "/Authorization")
                .header("Content-Type", "application/json")
                .body(authorizationBodyValue)
                //.body("{\"Token\":" + sessionToken + ", \"CurrencyId\": "+currencyId+", \"PartnerId\":" + partnerID + ", \"ProductId\":"+ productID +", \"LanguageId\": \"\"}")
                .asString();
        String authorizationAPIBody = response.getBody();
        return authorizationAPIBody;
    }



    @BeforeSuite
    public void setup() throws InterruptedException {
        logger = Logger.getLogger("API");
        PropertyConfigurator.configure("Log4j.properties");
        logger.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>  Test Suite was started ");
    }


    @AfterMethod
    public void tearDown() {
        logger.info("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<  Test finished ");
    }

    @AfterSuite
    public void Finish() {
        logger.info("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<  Test Suite finished  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
    }
}
