
package net.tipam2022.countriesapp.models;

import android.os.Parcelable;

import java.util.HashMap;
import java.util.Map;

public class Fra__2 implements Parcelable
{

    private String f;
    private String m;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    public final static Creator<Fra__2> CREATOR = new Creator<Fra__2>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Fra__2 createFromParcel(android.os.Parcel in) {
            return new Fra__2(in);
        }

        public Fra__2 [] newArray(int size) {
            return (new Fra__2[size]);
        }

    }
    ;

    protected Fra__2(android.os.Parcel in) {
        this.f = ((String) in.readValue((String.class.getClassLoader())));
        this.m = ((String) in.readValue((String.class.getClassLoader())));
        this.additionalProperties = ((Map<String, Object> ) in.readValue((Map.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Fra__2() {
    }

    /**
     * 
     * @param f
     * @param m
     */
    public Fra__2(String f, String m) {
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
