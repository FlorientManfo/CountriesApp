
package net.tipam2022.countriesapp.models;

import android.os.Parcelable;

import java.util.HashMap;
import java.util.Map;

public class Eng__1 implements Parcelable
{

    private String f;
    private String m;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    public final static Creator<Eng__1> CREATOR = new Creator<Eng__1>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Eng__1 createFromParcel(android.os.Parcel in) {
            return new Eng__1(in);
        }

        public Eng__1 [] newArray(int size) {
            return (new Eng__1[size]);
        }

    }
    ;

    protected Eng__1(android.os.Parcel in) {
        this.f = ((String) in.readValue((String.class.getClassLoader())));
        this.m = ((String) in.readValue((String.class.getClassLoader())));
        this.additionalProperties = ((Map<String, Object> ) in.readValue((Map.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Eng__1() {
    }

    /**
     * 
     * @param f
     * @param m
     */
    public Eng__1(String f, String m) {
        super();
        this.f = f;
        this.m = m;
    }

    public String getF() {
        return f;
    }

    public void setF(String f) {
        this.f = f;
    }

    public String getM() {
        return m;
    }

    public void setM(String m) {
        this.m = m;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(f);
        dest.writeValue(m);
        dest.writeValue(additionalProperties);
    }

    public int describeContents() {
        return  0;
    }

}
