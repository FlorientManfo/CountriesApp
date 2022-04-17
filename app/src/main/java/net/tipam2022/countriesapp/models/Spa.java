
package net.tipam2022.countriesapp.models;

import android.os.Parcelable;

import java.util.HashMap;
import java.util.Map;

public class Spa implements Parcelable
{

    private String official;
    private String common;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    public final static Creator<Spa> CREATOR = new Creator<Spa>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Spa createFromParcel(android.os.Parcel in) {
            return new Spa(in);
        }

        public Spa[] newArray(int size) {
            return (new Spa[size]);
        }

    }
    ;

    protected Spa(android.os.Parcel in) {
        this.official = ((String) in.readValue((String.class.getClassLoader())));
        this.common = ((String) in.readValue((String.class.getClassLoader())));
        this.additionalProperties = ((Map<String, Object> ) in.readValue((Map.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Spa() {
    }

    /**
     * 
     * @param common
     * @param official
     */
    public Spa(String official, String common) {
        super();
        this.official = official;
        this.common = common;
    }

    public String getOfficial() {
        return official;
    }

    public void setOfficial(String official) {
        this.official = official;
    }

    public String getCommon() {
        return common;
    }

    public void setCommon(String common) {
        this.common = common;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(official);
        dest.writeValue(common);
        dest.writeValue(additionalProperties);
    }

    public int describeContents() {
        return  0;
    }

}
