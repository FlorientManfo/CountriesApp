
package net.tipam2022.countriesapp.models;

import android.os.Parcelable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Car implements Parcelable
{

    private List<String> signs = new ArrayList<String>();
    private String side;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    public final static Creator<Car> CREATOR = new Creator<Car>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Car createFromParcel(android.os.Parcel in) {
            return new Car(in);
        }

        public Car[] newArray(int size) {
            return (new Car[size]);
        }

    }
    ;

    protected Car(android.os.Parcel in) {
        in.readList(this.signs, (String.class.getClassLoader()));
        this.side = ((String) in.readValue((String.class.getClassLoader())));
        this.additionalProperties = ((Map<String, Object> ) in.readValue((Map.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Car() {
    }

    /**
     * 
     * @param side
     * @param signs
     */
    public Car(List<String> signs, String side) {
        super();
        this.signs = signs;
        this.side = side;
    }

    public List<String> getSigns() {
        return signs;
    }

    public void setSigns(List<String> signs) {
        this.signs = signs;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeList(signs);
        dest.writeValue(side);
        dest.writeValue(additionalProperties);
    }

    public int describeContents() {
        return  0;
    }

}
