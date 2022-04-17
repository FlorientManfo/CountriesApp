
package net.tipam2022.countriesapp.models;

import android.os.Parcelable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CapitalInfo implements Parcelable
{

    private List<Double> latlng = new ArrayList<Double>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    public final static Creator<CapitalInfo> CREATOR = new Creator<CapitalInfo>() {


        @SuppressWarnings({
            "unchecked"
        })
        public CapitalInfo createFromParcel(android.os.Parcel in) {
            return new CapitalInfo(in);
        }

        public CapitalInfo[] newArray(int size) {
            return (new CapitalInfo[size]);
        }

    }
    ;

    protected CapitalInfo(android.os.Parcel in) {
        in.readList(this.latlng, (Double.class.getClassLoader()));
        this.additionalProperties = ((Map<String, Object> ) in.readValue((Map.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public CapitalInfo() {
    }

    /**
     * 
     * @param latlng
     */
    public CapitalInfo(List<Double> latlng) {
        super();
        this.latlng = latlng;
    }

    public List<Double> getLatlng() {
        return latlng;
    }

    public void setLatlng(List<Double> latlng) {
        this.latlng = latlng;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeList(latlng);
        dest.writeValue(additionalProperties);
    }

    public int describeContents() {
        return  0;
    }

}
