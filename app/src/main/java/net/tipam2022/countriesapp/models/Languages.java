
package net.tipam2022.countriesapp.models;

import android.os.Parcelable;

import java.util.HashMap;
import java.util.Map;

public class Languages implements Parcelable
{

    private String eng;
    private String fra;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    public final static Creator<Languages> CREATOR = new Creator<Languages>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Languages createFromParcel(android.os.Parcel in) {
            return new Languages(in);
        }

        public Languages[] newArray(int size) {
            return (new Languages[size]);
        }

    }
    ;

    protected Languages(android.os.Parcel in) {
        this.eng = ((String) in.readValue((String.class.getClassLoader())));
        this.fra = ((String) in.readValue((String.class.getClassLoader())));
        this.additionalProperties = ((Map<String, Object> ) in.readValue((Map.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Languages() {
    }

    /**
     * 
     * @param fra
     * @param eng
     */
    public Languages(String eng, String fra) {
        super();
        this.eng = eng;
        this.fra = fra;
    }

    public String getEng() {
        return eng;
    }

    public void setEng(String eng) {
        this.eng = eng;
    }

    public String getFra() {
        return fra;
    }

    public void setFra(String fra) {
        this.fra = fra;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(eng);
        dest.writeValue(fra);
        dest.writeValue(additionalProperties);
    }

    public int describeContents() {
        return  0;
    }

}
