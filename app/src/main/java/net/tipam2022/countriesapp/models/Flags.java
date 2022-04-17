
package net.tipam2022.countriesapp.models;

import android.os.Parcelable;

import java.util.HashMap;
import java.util.Map;

public class Flags implements Parcelable
{

    private String png;
    private String svg;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    public final static Creator<Flags> CREATOR = new Creator<Flags>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Flags createFromParcel(android.os.Parcel in) {
            return new Flags(in);
        }

        public Flags[] newArray(int size) {
            return (new Flags[size]);
        }

    }
    ;

    protected Flags(android.os.Parcel in) {
        this.png = ((String) in.readValue((String.class.getClassLoader())));
        this.svg = ((String) in.readValue((String.class.getClassLoader())));
        this.additionalProperties = ((Map<String, Object> ) in.readValue((Map.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Flags() {
    }

    /**
     * 
     * @param svg
     * @param png
     */
    public Flags(String png, String svg) {
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
