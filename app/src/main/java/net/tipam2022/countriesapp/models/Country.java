
package net.tipam2022.countriesapp.models;

import android.os.Parcelable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Country implements Parcelable
{

    private Name name;
    private List<String> tld = new ArrayList<String>();
    private String cca2;
    private String ccn3;
    private String cca3;
    private String cioc;
    private boolean independent;
    private String status;
    private boolean unMember;
    private Object currencies;
    private Idd idd;
    private List<String> capital = new ArrayList<String>();
    private List<String> altSpellings = new ArrayList<String>();
    private String region;
    private String subregion;
    private Object languages;
    private Translations translations;
    private List<Double> latlng = new ArrayList<Double>();
    private boolean landlocked;
    private List<String> borders = new ArrayList<String>();
    private double area;
    private Demonyms demonyms;
    private String flag;
    private Maps maps;
    private int population;
    private Gini gini;
    private String fifa;
    private Car car;
    private List<String> timezones = new ArrayList<String>();
    private List<String> continents = new ArrayList<String>();
    private Flags flags;
    private CoatOfArms coatOfArms;
    private String startOfWeek;
    private CapitalInfo capitalInfo;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    public final static Creator<Country> CREATOR = new Creator<Country>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Country createFromParcel(android.os.Parcel in) {
            return new Country(in);
        }

        public Country[] newArray(int size) {
            return (new Country[size]);
        }

    }
    ;

    protected Country(android.os.Parcel in) {
        this.name = ((Name) in.readValue((Name.class.getClassLoader())));
        in.readList(this.tld, (String.class.getClassLoader()));
        this.cca2 = ((String) in.readValue((String.class.getClassLoader())));
        this.ccn3 = ((String) in.readValue((String.class.getClassLoader())));
        this.cca3 = ((String) in.readValue((String.class.getClassLoader())));
        this.cioc = ((String) in.readValue((String.class.getClassLoader())));
        this.independent = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.status = ((String) in.readValue((String.class.getClassLoader())));
        this.unMember = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.currencies = ((Object) in.readValue((Object.class.getClassLoader())));
        this.idd = ((Idd) in.readValue((Idd.class.getClassLoader())));
        in.readList(this.capital, (String.class.getClassLoader()));
        in.readList(this.altSpellings, (String.class.getClassLoader()));
        this.region = ((String) in.readValue((String.class.getClassLoader())));
        this.subregion = ((String) in.readValue((String.class.getClassLoader())));
        this.languages = ((Object) in.readValue((Object.class.getClassLoader())));
        this.translations = ((Translations) in.readValue((Translations.class.getClassLoader())));
        in.readList(this.latlng, (Double.class.getClassLoader()));
        this.landlocked = ((boolean) in.readValue((boolean.class.getClassLoader())));
        in.readList(this.borders, (String.class.getClassLoader()));
        this.area = ((double) in.readValue((double.class.getClassLoader())));
        this.demonyms = ((Demonyms) in.readValue((Demonyms.class.getClassLoader())));
        this.flag = ((String) in.readValue((String.class.getClassLoader())));
        this.maps = ((Maps) in.readValue((Maps.class.getClassLoader())));
        this.population = ((int) in.readValue((int.class.getClassLoader())));
        this.gini = ((Gini) in.readValue((Gini.class.getClassLoader())));
        this.fifa = ((String) in.readValue((String.class.getClassLoader())));
        this.car = ((Car) in.readValue((Car.class.getClassLoader())));
        in.readList(this.timezones, (String.class.getClassLoader()));
        in.readList(this.continents, (String.class.getClassLoader()));
        this.flags = ((Flags) in.readValue((Flags.class.getClassLoader())));
        this.coatOfArms = ((CoatOfArms) in.readValue((CoatOfArms.class.getClassLoader())));
        this.startOfWeek = ((String) in.readValue((String.class.getClassLoader())));
        this.capitalInfo = ((CapitalInfo) in.readValue((CapitalInfo.class.getClassLoader())));
        this.additionalProperties = ((Map<String, Object> ) in.readValue((Map.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Country() {
    }

    /**
     * 
     * @param capital
     * @param flag
     * @param independent
     * @param landlocked
     * @param borders
     * @param flags
     * @param capitalInfo
     * @param ccn3
     * @param coatOfArms
     * @param demonyms
     * @param fifa
     * @param cioc
     * @param car
     * @param translations
     * @param altSpellings
     * @param area
     * @param languages
     * @param maps
     * @param subregion
     * @param idd
     * @param tld
     * @param unMember
     * @param gini
     * @param continents
     * @param population
     * @param startOfWeek
     * @param timezones
     * @param name
     * @param cca3
     * @param region
     * @param latlng
     * @param cca2
     * @param status
     * @param currencies
     */
    public Country(Name name, List<String> tld, String cca2, String ccn3, String cca3, String cioc, boolean independent, String status, boolean unMember, Object currencies, Idd idd, List<String> capital, List<String> altSpellings, String region, String subregion, Object languages, Translations translations, List<Double> latlng, boolean landlocked, List<String> borders, double area, Demonyms demonyms, String flag, Maps maps, int population, Gini gini, String fifa, Car car, List<String> timezones, List<String> continents, Flags flags, CoatOfArms coatOfArms, String startOfWeek, CapitalInfo capitalInfo) {
        super();
        this.name = name;
        this.tld = tld;
        this.cca2 = cca2;
        this.ccn3 = ccn3;
        this.cca3 = cca3;
        this.cioc = cioc;
        this.independent = independent;
        this.status = status;
        this.unMember = unMember;
        this.currencies = currencies;
        this.idd = idd;
        this.capital = capital;
        this.altSpellings = altSpellings;
        this.region = region;
        this.subregion = subregion;
        this.languages = languages;
        this.translations = translations;
        this.latlng = latlng;
        this.landlocked = landlocked;
        this.borders = borders;
        this.area = area;
        this.demonyms = demonyms;
        this.flag = flag;
        this.maps = maps;
        this.population = population;
        this.gini = gini;
        this.fifa = fifa;
        this.car = car;
        this.timezones = timezones;
        this.continents = continents;
        this.flags = flags;
        this.coatOfArms = coatOfArms;
        this.startOfWeek = startOfWeek;
        this.capitalInfo = capitalInfo;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public List<String> getTld() {
        return tld;
    }

    public void setTld(List<String> tld) {
        this.tld = tld;
    }

    public String getCca2() {
        return cca2;
    }

    public void setCca2(String cca2) {
        this.cca2 = cca2;
    }

    public String getCcn3() {
        return ccn3;
    }

    public void setCcn3(String ccn3) {
        this.ccn3 = ccn3;
    }

    public String getCca3() {
        return cca3;
    }

    public void setCca3(String cca3) {
        this.cca3 = cca3;
    }

    public String getCioc() {
        return cioc;
    }

    public void setCioc(String cioc) {
        this.cioc = cioc;
    }

    public boolean isIndependent() {
        return independent;
    }

    public void setIndependent(boolean independent) {
        this.independent = independent;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isUnMember() {
        return unMember;
    }

    public void setUnMember(boolean unMember) {
        this.unMember = unMember;
    }

    public Object getCurrencies() {
        return currencies;
    }

    public void setCurrencies(Object currencies) {
        this.currencies = currencies;
    }

    public Idd getIdd() {
        return idd;
    }

    public void setIdd(Idd idd) {
        this.idd = idd;
    }

    public List<String> getCapital() {
        return capital;
    }

    public void setCapital(List<String> capital) {
        this.capital = capital;
    }

    public List<String> getAltSpellings() {
        return altSpellings;
    }

    public void setAltSpellings(List<String> altSpellings) {
        this.altSpellings = altSpellings;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSubregion() {
        return subregion;
    }

    public void setSubregion(String subregion) {
        this.subregion = subregion;
    }

    public Object getLanguages() {
        return languages;
    }

    public void setLanguages(Object languages) {
        this.languages = languages;
    }

    public Translations getTranslations() {
        return translations;
    }

    public void setTranslations(Translations translations) {
        this.translations = translations;
    }

    public List<Double> getLatlng() {
        return latlng;
    }

    public void setLatlng(List<Double> latlng) {
        this.latlng = latlng;
    }

    public boolean isLandlocked() {
        return landlocked;
    }

    public void setLandlocked(boolean landlocked) {
        this.landlocked = landlocked;
    }

    public List<String> getBorders() {
        return borders;
    }

    public void setBorders(List<String> borders) {
        this.borders = borders;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Demonyms getDemonyms() {
        return demonyms;
    }

    public void setDemonyms(Demonyms demonyms) {
        this.demonyms = demonyms;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public Maps getMaps() {
        return maps;
    }

    public void setMaps(Maps maps) {
        this.maps = maps;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public Gini getGini() {
        return gini;
    }

    public void setGini(Gini gini) {
        this.gini = gini;
    }

    public String getFifa() {
        return fifa;
    }

    public void setFifa(String fifa) {
        this.fifa = fifa;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public List<String> getTimezones() {
        return timezones;
    }

    public void setTimezones(List<String> timezones) {
        this.timezones = timezones;
    }

    public List<String> getContinents() {
        return continents;
    }

    public void setContinents(List<String> continents) {
        this.continents = continents;
    }

    public Flags getFlags() {
        return flags;
    }

    public void setFlags(Flags flags) {
        this.flags = flags;
    }

    public CoatOfArms getCoatOfArms() {
        return coatOfArms;
    }

    public void setCoatOfArms(CoatOfArms coatOfArms) {
        this.coatOfArms = coatOfArms;
    }

    public String getStartOfWeek() {
        return startOfWeek;
    }

    public void setStartOfWeek(String startOfWeek) {
        this.startOfWeek = startOfWeek;
    }

    public CapitalInfo getCapitalInfo() {
        return capitalInfo;
    }

    public void setCapitalInfo(CapitalInfo capitalInfo) {
        this.capitalInfo = capitalInfo;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(name);
        dest.writeList(tld);
        dest.writeValue(cca2);
        dest.writeValue(ccn3);
        dest.writeValue(cca3);
        dest.writeValue(cioc);
        dest.writeValue(independent);
        dest.writeValue(status);
        dest.writeValue(unMember);
        dest.writeValue(currencies);
        dest.writeValue(idd);
        dest.writeList(capital);
        dest.writeList(altSpellings);
        dest.writeValue(region);
        dest.writeValue(subregion);
        dest.writeValue(languages);
        dest.writeValue(translations);
        dest.writeList(latlng);
        dest.writeValue(landlocked);
        dest.writeList(borders);
        dest.writeValue(area);
        dest.writeValue(demonyms);
        dest.writeValue(flag);
        dest.writeValue(maps);
        dest.writeValue(population);
        dest.writeValue(gini);
        dest.writeValue(fifa);
        dest.writeValue(car);
        dest.writeList(timezones);
        dest.writeList(continents);
        dest.writeValue(flags);
        dest.writeValue(coatOfArms);
        dest.writeValue(startOfWeek);
        dest.writeValue(capitalInfo);
        dest.writeValue(additionalProperties);
    }

    public int describeContents() {
        return  0;
    }

}
