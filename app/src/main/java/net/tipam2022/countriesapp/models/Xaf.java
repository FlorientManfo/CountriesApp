
package net.tipam2022.countriesapp.models;

import android.os.Parcelable;

import java.util.HashMap;
import java.util.Map;

public class Xaf implements Parcelable
{

    private String name;
    private String symbol;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    public final static Creator<Xaf> CREATOR = new Creator<Xaf>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Xaf createFromParcel(android.os.Parcel in) {
            return new Xaf(in);
        }

        public Xaf[] newArray(int size) {
            return (new Xaf[size]);
        }

    }
    ;

    protected Xaf(android.os.Parcel in) {
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.symbol = ((String) in.readValue((String.class.getClassLoader())));
        this.additionalProperties = ((Map<String, Object> ) in.readValue((Map.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Xaf() {
    }

    /**
     * 
     * @param symbol
     * @param name
     */
    public Xaf(String name, String symbol) {
        super();
        this.name = name;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(name);
        dest.writeValue(symbol);
        dest.writeValue(additionalProperties);
    }

    public int describeContents() {
        return  0;
    }

}
