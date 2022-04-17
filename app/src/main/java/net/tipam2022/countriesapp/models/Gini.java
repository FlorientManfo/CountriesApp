
package net.tipam2022.countriesapp.models;

import android.os.Parcelable;

import java.util.HashMap;
import java.util.Map;

public class Gini implements Parcelable
{

    private double _2014;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    public final static Creator<Gini> CREATOR = new Creator<Gini>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Gini createFromParcel(android.os.Parcel in) {
            return new Gini(in);
        }

        public Gini[] newArray(int size) {
            return (new Gini[size]);
        }

    }
    ;

    protected Gini(android.os.Parcel in) {
        this._2014 = ((double) in.readValue((double.class.getClassLoader())));
        this.additionalProperties = ((Map<String, Object> ) in.readValue((Map.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Gini() {
    }

    /**
     * 
     * @param _2014
     */
    public Gini(double _2014) {
        super();
        this._2014 = _2014;
    }

    public double get2014() {
        return _2014;
    }

    public void set2014(double _2014) {
        this._2014 = _2014;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(_2014);
        dest.writeValue(additionalProperties);
    }

    public int describeContents() {
        return  0;
    }

}
