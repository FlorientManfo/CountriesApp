
package net.tipam2022.countriesapp.models;

import android.os.Parcelable;

import java.util.HashMap;
import java.util.Map;

public class Demonyms implements Parcelable
{

    private Eng__1 eng;
    private Fra__2 fra;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    public final static Creator<Demonyms> CREATOR = new Creator<Demonyms>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Demonyms createFromParcel(android.os.Parcel in) {
            return new Demonyms(in);
        }

        public Demonyms[] newArray(int size) {
            return (new Demonyms[size]);
        }

    }
    ;

    protected Demonyms(android.os.Parcel in) {
        this.eng = ((Eng__1) in.readValue((Eng__1.class.getClassLoader())));
        this.fra = ((Fra__2) in.readValue((Fra__2.class.getClassLoader())));
        this.additionalProperties = ((Map<String, Object> ) in.readValue((Map.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Demonyms() {
    }

    /**
     * 
     * @param fra
     * @param eng
     */
    public Demonyms(Eng__1 eng, Fra__2 fra) {
        super();
        this.eng = eng;
        this.fra = fra;
    }

    public Eng__1 getEng() {
        return eng;
    }

    public void setEng(Eng__1 eng) {
        this.eng = eng;
    }

    public Fra__2 getFra() {
        return fra;
    }

    public void setFra(Fra__2 fra) {
        this.fra = fra;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(eng);
        dest.writeValue(fra);
        dest.writeValue(additionalProperties);
    }

    public int describeContents() {
        return  0;
    }

}
