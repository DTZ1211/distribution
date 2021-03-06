package test.model;

import java.util.Date;

public class Handover {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column handover.startcity
     *
     * @mbg.generated
     */
    private String startcity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column handover.finalcity
     *
     * @mbg.generated
     */
    private String finalcity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column handover.arrivecity
     *
     * @mbg.generated
     */
    private String arrivecity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column handover.hotatus
     *
     * @mbg.generated
     */
    private Integer hotatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column handover.gentime
     *
     * @mbg.generated
     */
    private Date gentime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column handover.remarks
     *
     * @mbg.generated
     */
    private String remarks;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column handover.startcity
     *
     * @return the value of handover.startcity
     *
     * @mbg.generated
     */
    public String getStartcity() {
        return startcity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column handover.startcity
     *
     * @param startcity the value for handover.startcity
     *
     * @mbg.generated
     */
    public void setStartcity(String startcity) {
        this.startcity = startcity == null ? null : startcity.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column handover.finalcity
     *
     * @return the value of handover.finalcity
     *
     * @mbg.generated
     */
    public String getFinalcity() {
        return finalcity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column handover.finalcity
     *
     * @param finalcity the value for handover.finalcity
     *
     * @mbg.generated
     */
    public void setFinalcity(String finalcity) {
        this.finalcity = finalcity == null ? null : finalcity.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column handover.arrivecity
     *
     * @return the value of handover.arrivecity
     *
     * @mbg.generated
     */
    public String getArrivecity() {
        return arrivecity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column handover.arrivecity
     *
     * @param arrivecity the value for handover.arrivecity
     *
     * @mbg.generated
     */
    public void setArrivecity(String arrivecity) {
        this.arrivecity = arrivecity == null ? null : arrivecity.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column handover.hotatus
     *
     * @return the value of handover.hotatus
     *
     * @mbg.generated
     */
    public Integer getHotatus() {
        return hotatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column handover.hotatus
     *
     * @param hotatus the value for handover.hotatus
     *
     * @mbg.generated
     */
    public void setHotatus(Integer hotatus) {
        this.hotatus = hotatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column handover.gentime
     *
     * @return the value of handover.gentime
     *
     * @mbg.generated
     */
    public Date getGentime() {
        return gentime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column handover.gentime
     *
     * @param gentime the value for handover.gentime
     *
     * @mbg.generated
     */
    public void setGentime(Date gentime) {
        this.gentime = gentime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column handover.remarks
     *
     * @return the value of handover.remarks
     *
     * @mbg.generated
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column handover.remarks
     *
     * @param remarks the value for handover.remarks
     *
     * @mbg.generated
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}