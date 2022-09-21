package testData;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class APIVariables_OpenGame_Request {

   @SerializedName("PartnerId")
   @Expose
   private int PartnerId;

   @SerializedName("LanguageId")
   @Expose
   private String LanguageId;

   @SerializedName("Token")
   @Expose
   private String Token;

   @SerializedName("IsForMobile")
   @Expose
   private String IsForMobile;

   @SerializedName("GameId")
   @Expose
   private int GameId;

   @SerializedName("Domain")
   @Expose
   private String Domain;

   public int getPartnerId() {
      return PartnerId;
   }

   public void setPartnerId(int partnerId) {
      PartnerId = partnerId;
   }

   public String getLanguageId() {
      return LanguageId;
   }

   public void setLanguageId(String languageId) {
      LanguageId = languageId;
   }

   public String getToken() {
      return Token;
   }

   public void setToken(String token) {
      Token = token;
   }

   public String getIsForMobile() {
      return IsForMobile;
   }

   public void setIsForMobile(String isForMobile) {
      IsForMobile = isForMobile;
   }

   public int getGameId() {
      return GameId;
   }

   public void setGameId(int gameId) {
      GameId = gameId;
   }

   public String getDomain() {
      return Domain;
   }

   public void setDomain(String domain) {
      Domain = domain;
   }
}
