package com.cs2340.WaterNet.Model;

/**
 * Created by Pulkit Gupta on 2/27/2017.
 */

public class PurityReport {
    private String creator, dateTime;
    private Long purityReportID;
    private Site site;
    private Virus virus;
    private Contaminant contaminant;
    private OverallCondition overallCondition;

    public PurityReport(String creator, double lat, double lng, Virus virus, Contaminant contaminant, OverallCondition overallCondition) {
        this.creator = creator;
        dateTime = Singleton.getInstance().getTime();
        purityReportID = Singleton.getInstance().getPurityReportID();
        site = new Site(lat, lng);
        this.virus = virus;
        this.contaminant = contaminant;
        this.overallCondition = overallCondition;
    }

    public String getCreator() {
        return creator;
    }

    public String getDateTime() {
        return dateTime;
    }

    public long getPurityReportID() {
        return purityReportID;
    }

    public void setPurityReportID(long purityReportID) {
        this.purityReportID = purityReportID;
    }

    public Virus getVirus() {
        return virus;
    }

    public void setVirus(Virus virus) {
        this.virus = virus;
    }

    public Contaminant getContaminant() {
        return contaminant;
    }

    public void setContaminant(Contaminant contaminant) {
        this.contaminant = contaminant;
    }

    public OverallCondition getOverallCondition() {
        return overallCondition;
    }

    public void setOverallCondition(OverallCondition overallCondition) {
        this.overallCondition = overallCondition;
    }
    public void setLng(double lng) {
        site.setLng(lng);
    }
    public void setLat(double lat) {
        site.setLat(lat);
    }
    public double getLng() {
        return site.getLng();
    }
    public double getLat() {
        return site.getLat();
    }
}
