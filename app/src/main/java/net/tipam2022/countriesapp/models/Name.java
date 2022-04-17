
package net.tipam2022.countriesapp.models;

import android.os.Parcelable;

import java.util.HashMap;
import java.util.Map;

public class Name implements Parcelable
{

    private String common;
    private String official;
    private NativeName nativeName;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    public final static Creator<Name> CREATOR = new Creator<Name>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Name createFromParcel(android.os.Parcel in) {
            return new Name(in);
        }

        public Name[] newArray(int size) {
            return (new Name[size]);
        }

    }
    ;

    protected Name(android.os.Parcel in) {
        this.common = ((String) in.readValue((String.class.getClassLoader())));
        this.official = ((String) in.readValue((String.class.getClassLoader())));
        this.nativeName = ((NativeName) in.readValue((NativeName.class.getClassLoader())));
        this.additionalProperties = ((Map<String, Object> ) in.readValue((Map.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Name() {
    }

    /**
     * 
     * @param nativeName
     * @param common
     * @param official
     */
    public Name(String common, String official, NativeName nativeName) {
        super();
        this.common = common;
        this.official = official;
        this.nativeName = nativeName;
    }

    public String getCommon() {
        return common;
    }

    public void setCommon(String common) {
        this.common = common;
    }

    public String getOfficial() {
        return official;
    }

    public void setOfficial(String official) {
        this.official = official;
    }

    public NativeName getNativeName() {
        return nativeName;
    }

    public void setNativeName(NativeName nativeName) {
        this.nativeName = nativeName;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(common);
        dest.writeValue(official);
        dest.writeValue(nativeName);
        dest.writeValue(additionalProperties);
    }

    public int describeContents() {
        return  0;
    }

}
