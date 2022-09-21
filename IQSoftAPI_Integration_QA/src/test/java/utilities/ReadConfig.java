package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
    Properties pro;

    public ReadConfig()
    {
        File src = new File("./Configuration/config.properties");

        try {
            FileInputStream fis = new FileInputStream(src);
            pro = new Properties();
            pro.load(fis);
        } catch (Exception e) {
            System.out.println("Exception is " + e.getMessage());
        }
    }

    public int getPartnerID()
    {
        return Integer.parseInt(pro.getProperty("PartnerId"));
    }
    public String getCallbackUrl()
    {
        return pro.getProperty("callbackUrl");
    }
    public String getProductID()
    {
        return pro.getProperty("productID");
    }
    public String getSessionToken()
    {
        return pro.getProperty("SessionToken");
    }
    public String getCurrencyId()
    {
        return pro.getProperty("CurrencyId");
    }
    public String getLanguageId()
    {
        return pro.getProperty("LanguageId");
    }




    public String getPlatform()
    {
        return pro.getProperty("Platform");
    }
    public String getUserID()
    {
        return pro.getProperty("UserID");
    }
    public String getCurrency()
    {
        return pro.getProperty("Currency");
    }
    public String getBetAmount()
    {
        return pro.getProperty("BetAmount");
    }
    public String getApiUrl()
    {
        return pro.getProperty("apiUrl");
    }





}
