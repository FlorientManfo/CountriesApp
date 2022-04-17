
package net.tipam2022.countriesapp.models;

import android.os.Parcelable;

import java.util.HashMap;
import java.util.Map;

public class Currencies implements Parcelable
{

    private Xaf xaf;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    public final static Creator<Currencies> CREATOR = new Creator<Currencies>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Currencies createFromParcel(android.os.Parcel in) {
            return new Currencies(in);
        }

        public Currencies[] newArray(int size) {
            return (new Currencies[size]);
        }

    }
    ;

    protected Currencies(android.os.Parcel in) {
        this.xaf = ((Xaf) in.readValue((Xaf.class.getClassLoader())));
        this.additionalProperties = ((Map<String, Object> ) in.readValue((Map.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Currencies() {
    }

    /**
     * 
     * @param xaf
     */
    public Currencies(Xaf xaf) {
        super();
        this.xaf = xaf;
    }

    public Xaf getXaf() {
        return xaf;
    }

    public void setXaf(Xaf xaf) {
        this.xaf = xaf;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(xaf);
        dest.writeValue(additionalProperties);
    }

    public int describeContents() {
        return  0;
    }

}
