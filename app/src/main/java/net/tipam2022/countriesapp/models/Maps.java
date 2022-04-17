
package net.tipam2022.countriesapp.models;

import android.os.Parcelable;

import java.util.HashMap;
import java.util.Map;

public class Maps implements Parcelable
{

    private String googleMaps;
    private String openStreetMaps;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    public final static Creator<Maps> CREATOR = new Creator<Maps>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Maps createFromParcel(android.os.Parcel in) {
            return new Maps(in);
        }

        public Maps[] newArray(int size) {
            return (new Maps[size]);
        }

    }
    ;

    protected Maps(android.os.Parcel in) {
        this.googleMaps = ((String) in.readValue((String.class.getClassLoader())));
        this.openStreetMaps = ((String) in.readValue((String.class.getClassLoader())));
        this.additionalProperties = ((Map<String, Object> ) in.readValue((Map.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Maps() {
    }

    /**
     * 
     * @param openStreetMaps
     * @param googleMaps
     */
    public Maps(String googleMaps, String openStreetMaps) {
        super();
        this.googleMaps = googleMaps;
        this.openStreetMaps = openStreetMaps;
    }

    public String getGoogleMaps() {
        return googleMaps;
    }

    public void setGoogleMaps(String googleMaps) {
        this.googleMaps = googleMaps;
    }

    public String getOpenStreetMaps() {
        return openStreetMaps;
    }

    public void setOpenStreetMaps(String openStreetMaps) {
        this.openStreetMaps = openStreetMaps;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(googleMaps);
        dest.writeValue(openStreetMaps);
        dest.writeValue(additionalProperties);
    }

    public int describeContents() {
        return  0;
    }

}
