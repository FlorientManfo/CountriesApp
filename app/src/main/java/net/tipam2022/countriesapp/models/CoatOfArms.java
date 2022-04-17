
package net.tipam2022.countriesapp.models;

import android.os.Parcelable;

import java.util.HashMap;
import java.util.Map;

public class CoatOfArms implements Parcelable
{

    private String png;
    private String svg;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    public final static Creator<CoatOfArms> CREATOR = new Creator<CoatOfArms>() {


        @SuppressWarnings({
            "unchecked"
        })
        public CoatOfArms createFromParcel(android.os.Parcel in) {
            return new CoatOfArms(in);
        }

        public CoatOfArms[] newArray(int size) {
            return (new CoatOfArms[size]);
        }

    }
    ;

    protected CoatOfArms(android.os.Parcel in) {
        this.png = ((String) in.readValue((String.class.getClassLoader())));
        this.svg = ((String) in.readValue((String.class.getClassLoader())));
        this.additionalProperties = ((Map<String, Object> ) in.readValue((Map.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public CoatOfArms() {
    }

    /**
     * 
     * @param svg
     * @param png
     */
    public CoatOfArms(String png, String svg) {
        super();
        this.png = png;
        this.svg = svg;
    }

    public String getPng() {
        return png;
    }

    public void setPng(String png) {
        this.png = png;
    }

    public String getSvg() {
        return svg;
    }

    public void setSvg(String svg) {
        this.svg = svg;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(png);
        dest.writeValue(svg);
        dest.writeValue(additionalProperties);
    }

    public int describeContents() {
        return  0;
    }

}
