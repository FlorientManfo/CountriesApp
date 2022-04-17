
package net.tipam2022.countriesapp.models;

import android.os.Parcelable;

import java.util.HashMap;
import java.util.Map;

public class Deu implements Parcelable
{

    private String official;
    private String common;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    public final static Creator<Deu> CREATOR = new Creator<Deu>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Deu createFromParcel(android.os.Parcel in) {
            return new Deu(in);
        }

        public Deu[] newArray(int size) {
            return (new Deu[size]);
        }

    }
    ;

    protected Deu(android.os.Parcel in) {
        this.official = ((String) in.readValue((String.class.getClassLoader())));
        this.common = ((String) in.readValue((String.class.getClassLoader())));
        this.additionalProperties = ((Map<String, Object> ) in.readValue((Map.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Deu() {
    }

    /**
     * 
     * @param common
     * @param official
     */
    public Deu(String official, String common) {
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
