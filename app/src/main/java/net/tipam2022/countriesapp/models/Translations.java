
package net.tipam2022.countriesapp.models;

import java.util.HashMap;
import java.util.Map;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;

public class Translations implements Parcelable
{

    private Ara ara;
    private Ces ces;
    private Cym cym;
    private Deu deu;
    private Est est;
    private Fin fin;
    private Fra__1 fra;
    private Hrv hrv;
    private Hun hun;
    private Ita ita;
    private Jpn jpn;
    private Kor kor;
    private Nld nld;
    private Per per;
    private Pol pol;
    private Por por;
    private Rus rus;
    private Slk slk;
    private Spa spa;
    private Swe swe;
    private Urd urd;
    private Zho zho;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    public final static Creator<Translations> CREATOR = new Creator<Translations>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Translations createFromParcel(android.os.Parcel in) {
            return new Translations(in);
        }

        public Translations[] newArray(int size) {
            return (new Translations[size]);
        }

    }
    ;

    protected Translations(android.os.Parcel in) {
        this.ara = ((Ara) in.readValue((Ara.class.getClassLoader())));
        this.ces = ((Ces) in.readValue((Ces.class.getClassLoader())));
        this.cym = ((Cym) in.readValue((Cym.class.getClassLoader())));
        this.deu = ((Deu) in.readValue((Deu.class.getClassLoader())));
        this.est = ((Est) in.readValue((Est.class.getClassLoader())));
        this.fin = ((Fin) in.readValue((Fin.class.getClassLoader())));
        this.fra = ((Fra__1) in.readValue((Fra__1.class.getClassLoader())));
        this.hrv = ((Hrv) in.readValue((Hrv.class.getClassLoader())));
        this.hun = ((Hun) in.readValue((Hun.class.getClassLoader())));
        this.ita = ((Ita) in.readValue((Ita.class.getClassLoader())));
        this.jpn = ((Jpn) in.readValue((Jpn.class.getClassLoader())));
        this.kor = ((Kor) in.readValue((Kor.class.getClassLoader())));
        this.nld = ((Nld) in.readValue((Nld.class.getClassLoader())));
        this.per = ((Per) in.readValue((Per.class.getClassLoader())));
        this.pol = ((Pol) in.readValue((Pol.class.getClassLoader())));
        this.por = ((Por) in.readValue((Por.class.getClassLoader())));
        this.rus = ((Rus) in.readValue((Rus.class.getClassLoader())));
        this.slk = ((Slk) in.readValue((Slk.class.getClassLoader())));
        this.spa = ((Spa) in.readValue((Spa.class.getClassLoader())));
        this.swe = ((Swe) in.readValue((Swe.class.getClassLoader())));
        this.urd = ((Urd) in.readValue((Urd.class.getClassLoader())));
        this.zho = ((Zho) in.readValue((Zho.class.getClassLoader())));
        this.additionalProperties = ((Map<String, Object> ) in.readValue((Map.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Translations() {
    }

    /**
     * 
     * @param hun
     * @param swe
     * @param zho
     * @param spa
     * @param urd
     * @param est
     * @param nld
     * @param jpn
     * @param fin
     * @param pol
     * @param hrv
     * @param kor
     * @param ces
     * @param ara
     * @param rus
     * @param por
     * @param slk
     * @param fra
     * @param deu
     * @param cym
     * @param ita
     * @param per
     */
    public Translations(Ara ara, Ces ces, Cym cym, Deu deu, Est est, Fin fin, Fra__1 fra, Hrv hrv, Hun hun, Ita ita, Jpn jpn, Kor kor, Nld nld, Per per, Pol pol, Por por, Rus rus, Slk slk, Spa spa, Swe swe, Urd urd, Zho zho) {
        super();
        this.ara = ara;
        this.ces = ces;
        this.cym = cym;
        this.deu = deu;
        this.est = est;
        this.fin = fin;
        this.fra = fra;
        this.hrv = hrv;
        this.hun = hun;
        this.ita = ita;
        this.jpn = jpn;
        this.kor = kor;
        this.nld = nld;
        this.per = per;
        this.pol = pol;
        this.por = por;
        this.rus = rus;
        this.slk = slk;
        this.spa = spa;
        this.swe = swe;
        this.urd = urd;
        this.zho = zho;
    }

    public Ara getAra() {
        return ara;
    }

    public void setAra(Ara ara) {
        this.ara = ara;
    }

    public Ces getCes() {
        return ces;
    }

    public void setCes(Ces ces) {
        this.ces = ces;
    }

    public Cym getCym() {
        return cym;
    }

    public void setCym(Cym cym) {
        this.cym = cym;
    }

    public Deu getDeu() {
        return deu;
    }

    public void setDeu(Deu deu) {
        this.deu = deu;
    }

    public Est getEst() {
        return est;
    }

    public void setEst(Est est) {
        this.est = est;
    }

    public Fin getFin() {
        return fin;
    }

    public void setFin(Fin fin) {
        this.fin = fin;
    }

    public Fra__1 getFra() {
        return fra;
    }

    public void setFra(Fra__1 fra) {
        this.fra = fra;
    }

    public Hrv getHrv() {
        return hrv;
    }

    public void setHrv(Hrv hrv) {
        this.hrv = hrv;
    }

    public Hun getHun() {
        return hun;
    }

    public void setHun(Hun hun) {
        this.hun = hun;
    }

    public Ita getIta() {
        return ita;
    }

    public void setIta(Ita ita) {
        this.ita = ita;
    }

    public Jpn getJpn() {
        return jpn;
    }

    public void setJpn(Jpn jpn) {
        this.jpn = jpn;
    }

    public Kor getKor() {
        return kor;
    }

    public void setKor(Kor kor) {
        this.kor = kor;
    }

    public Nld getNld() {
        return nld;
    }

    public void setNld(Nld nld) {
        this.nld = nld;
    }

    public Per getPer() {
        return per;
    }

    public void setPer(Per per) {
        this.per = per;
    }

    public Pol getPol() {
        return pol;
    }

    public void setPol(Pol pol) {
        this.pol = pol;
    }

    public Por getPor() {
        return por;
    }

    public void setPor(Por por) {
        this.por = por;
    }

    public Rus getRus() {
        return rus;
    }

    public void setRus(Rus rus) {
        this.rus = rus;
    }

    public Slk getSlk() {
        return slk;
    }

    public void setSlk(Slk slk) {
        this.slk = slk;
    }

    public Spa getSpa() {
        return spa;
    }

    public void setSpa(Spa spa) {
        this.spa = spa;
    }

    public Swe getSwe() {
        return swe;
    }

    public void setSwe(Swe swe) {
        this.swe = swe;
    }

    public Urd getUrd() {
        return urd;
    }

    public void setUrd(Urd urd) {
        this.urd = urd;
    }

    public Zho getZho() {
        return zho;
    }

    public void setZho(Zho zho) {
        this.zho = zho;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(ara);
        dest.writeValue(ces);
        dest.writeValue(cym);
        dest.writeValue(deu);
        dest.writeValue(est);
        dest.writeValue(fin);
        dest.writeValue(fra);
        dest.writeValue(hrv);
        dest.writeValue(hun);
        dest.writeValue(ita);
        dest.writeValue(jpn);
        dest.writeValue(kor);
        dest.writeValue(nld);
        dest.writeValue(per);
        dest.writeValue(pol);
        dest.writeValue(por);
        dest.writeValue(rus);
        dest.writeValue(slk);
        dest.writeValue(spa);
        dest.writeValue(swe);
        dest.writeValue(urd);
        dest.writeValue(zho);
        dest.writeValue(additionalProperties);
    }

    public int describeContents() {
        return  0;
    }

}
