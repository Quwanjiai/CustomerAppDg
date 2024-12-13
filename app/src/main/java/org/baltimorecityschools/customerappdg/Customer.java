package org.baltimorecityschools.customerappdg;

public class Customer {

    private String fn;
    private String ln;
    private String ph;
    private String ad;
    private String em;

    public Customer() {
        fn = " ";
        ln = " ";
        ph = " ";
        ad = " ";
        em = " ";

    }

    public Customer(String sFirstname, String sLastname, String sphone, String sAddress, String sEmail) {

        fn = sFirstname;
        ln = sLastname;
        ph = sphone;
        ad = sAddress;
        em = sEmail;
    }

    public String getFn() {
        return fn;
    }

    public void setFn(String fn) {
        this.fn = fn;
    }

    public String getLn() {
        return ln;
    }

    public void setLn(String ln) {
        this.ln = ln;
    }

    public String getPh() {
        return ph;
    }

    public void setPh(String ph) {
        this.ph = ph;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getEm() {
        return em;
    }

    public void setEm(String em) {
        this.em = em;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "fn='" + fn + '\'' +
                ", ln='" + ln + '\'' +
                ", ph='" + ph + '\'' +
                ", ad='" + ad + '\'' +
                ", em='" + em + '\'' +
                '}';
    }
}
