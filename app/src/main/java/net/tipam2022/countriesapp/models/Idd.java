
package net.tipam2022.countriesapp.models;

import android.os.Parcelable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Idd implements Parcelable
{

    private String root;
    private List<String> suffixes = new ArrayList<String>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    public final static Creator<Idd> CREATOR = new Creator<Idd>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Idd createFromParcel(android.os.Parcel in) {
            return new Idd(in);
        }

        public Idd[] newArray(int size) {
            return (new Idd[size]);
        }

    }
    ;

    protected Idd(android.os.Parcel in) {
        this.root = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.suffixes, (String.class.getClassLoader()));
        this.additionalProperties = ((Map<String, Object> ) in.readValue((Map.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Idd() {
    }

    /**
     * 
     * @param suffixes
     * @param root
     */
    public Idd(String root, List<String> suffixes) {
        super();
        this.root = root;
        this.suffixes = suffixes;
    }

    public String getRoot() {
        return root;
    }

    public void setRoot(String root) {
        this.root = root;
    }

    public List<String> getSuffixes() {
        return suffixes;
    }

    public void setSuffixes(List<String> suffixes) {
        this.suffixes = suffixes;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(root);
        dest.writeList(suffixes);
        dest.writeValue(additionalProperties);
    }

    public int describeContents() {
        return  0;
    }

}
