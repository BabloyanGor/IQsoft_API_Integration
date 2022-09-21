package testData;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class APIVariables_OpenGame_Response {
    @SerializedName("cod")
    @Expose
    private int cod;
    @SerializedName("ResponseCode")
    @Expose
    private int ResponseCode;
    @SerializedName("Description")
    @Expose
    private String Description;

    @SerializedName("ResponseObject")
    @Expose
    private String ResponseObject;

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
    public int getResponseCode() {
        return ResponseCode;
    }

    public void setResponseCode(int responseCode) {
        ResponseCode = responseCode;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getResponseObject() {
        return ResponseObject;
    }

    public void setResponseObject(String responseObject) {
        ResponseObject = responseObject;
    }
}
