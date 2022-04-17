
package net.tipam2022.countriesapp.models;

import android.os.Parcelable;

import java.util.HashMap;
import java.util.Map;

public class NativeName implements Parcelable
{

    private Eng eng;
    private Fra fra;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    public final static Creator<NativeName> CREATOR = new Creator<NativeName>() {


        @SuppressWarnings({
            "unchecked"
        })
        public NativeName createFromParcel(android.os.Parcel in) {
            return new NativeName(in);
        }

        public NativeName[] newArray(int size) {
            return (new NativeName[size]);
        }

    }
    ;

    protected NativeName(android.os.Parcel in) {
        this.eng = ((Eng) in.readValue((Eng.class.getClassLoader())));
        this.fra = ((Fra) in.readValue((Fra.class.getClassLoader())));
        this.additionalProperties = ((Map<String, Object> ) in.readValue((Map.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public NativeName() {
    }

    /**
     * 
     * @param fra
     * @param eng
     */
    public NativeName(Eng eng, Fra fra) {
        super();
        this.eng = eng;
        this.fra = fra;
    }

    public Eng getEng() {
        return eng;
    }

    public void setEng(Eng eng) {
        this.eng = eng;
    }

    public Fra getFra() {
        return fra;
    }

    public void setFra(Fra fra) {
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
