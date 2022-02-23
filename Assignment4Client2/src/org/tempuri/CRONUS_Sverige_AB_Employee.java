/**
 * CRONUS_Sverige_AB_Employee.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class CRONUS_Sverige_AB_Employee  implements java.io.Serializable {
    private byte[] timestamp;

    private java.lang.String no_;

    private java.lang.String first_Name;

    private java.lang.String middle_Name;

    private java.lang.String last_Name;

    private java.lang.String initials;

    private java.lang.String job_Title;

    private java.lang.String search_Name;

    private java.lang.String address;

    private java.lang.String address_2;

    private java.lang.String city;

    private java.lang.String post_Code;

    private java.lang.String county;

    private java.lang.String phone_No_;

    private java.lang.String mobile_Phone_No_;

    private java.lang.String e_Mail;

    private java.lang.String alt__Address_Code;

    private java.util.Calendar alt__Address_Start_Date;

    private java.util.Calendar alt__Address_End_Date;

    private byte[] picture;

    private java.util.Calendar birth_Date;

    private java.lang.String social_Security_No_;

    private java.lang.String union_Code;

    private java.lang.String union_Membership_No_;

    private int sex;

    private java.lang.String country_Region_Code;

    private java.lang.String manager_No_;

    private java.lang.String emplymt__Contract_Code;

    private java.lang.String statistics_Group_Code;

    private java.util.Calendar employment_Date;

    private int status;

    private java.util.Calendar inactive_Date;

    private java.lang.String cause_of_Inactivity_Code;

    private java.util.Calendar termination_Date;

    private java.lang.String grounds_for_Term__Code;

    private java.lang.String global_Dimension_1_Code;

    private java.lang.String global_Dimension_2_Code;

    private java.lang.String resource_No_;

    private java.util.Calendar last_Date_Modified;

    private java.lang.String extension;

    private java.lang.String pager;

    private java.lang.String fax_No_;

    private java.lang.String company_E_Mail;

    private java.lang.String title;

    private java.lang.String salespers__Purch__Code;

    private java.lang.String no__Series;

    public CRONUS_Sverige_AB_Employee() {
    }

    public CRONUS_Sverige_AB_Employee(
           byte[] timestamp,
           java.lang.String no_,
           java.lang.String first_Name,
           java.lang.String middle_Name,
           java.lang.String last_Name,
           java.lang.String initials,
           java.lang.String job_Title,
           java.lang.String search_Name,
           java.lang.String address,
           java.lang.String address_2,
           java.lang.String city,
           java.lang.String post_Code,
           java.lang.String county,
           java.lang.String phone_No_,
           java.lang.String mobile_Phone_No_,
           java.lang.String e_Mail,
           java.lang.String alt__Address_Code,
           java.util.Calendar alt__Address_Start_Date,
           java.util.Calendar alt__Address_End_Date,
           byte[] picture,
           java.util.Calendar birth_Date,
           java.lang.String social_Security_No_,
           java.lang.String union_Code,
           java.lang.String union_Membership_No_,
           int sex,
           java.lang.String country_Region_Code,
           java.lang.String manager_No_,
           java.lang.String emplymt__Contract_Code,
           java.lang.String statistics_Group_Code,
           java.util.Calendar employment_Date,
           int status,
           java.util.Calendar inactive_Date,
           java.lang.String cause_of_Inactivity_Code,
           java.util.Calendar termination_Date,
           java.lang.String grounds_for_Term__Code,
           java.lang.String global_Dimension_1_Code,
           java.lang.String global_Dimension_2_Code,
           java.lang.String resource_No_,
           java.util.Calendar last_Date_Modified,
           java.lang.String extension,
           java.lang.String pager,
           java.lang.String fax_No_,
           java.lang.String company_E_Mail,
           java.lang.String title,
           java.lang.String salespers__Purch__Code,
           java.lang.String no__Series) {
           this.timestamp = timestamp;
           this.no_ = no_;
           this.first_Name = first_Name;
           this.middle_Name = middle_Name;
           this.last_Name = last_Name;
           this.initials = initials;
           this.job_Title = job_Title;
           this.search_Name = search_Name;
           this.address = address;
           this.address_2 = address_2;
           this.city = city;
           this.post_Code = post_Code;
           this.county = county;
           this.phone_No_ = phone_No_;
           this.mobile_Phone_No_ = mobile_Phone_No_;
           this.e_Mail = e_Mail;
           this.alt__Address_Code = alt__Address_Code;
           this.alt__Address_Start_Date = alt__Address_Start_Date;
           this.alt__Address_End_Date = alt__Address_End_Date;
           this.picture = picture;
           this.birth_Date = birth_Date;
           this.social_Security_No_ = social_Security_No_;
           this.union_Code = union_Code;
           this.union_Membership_No_ = union_Membership_No_;
           this.sex = sex;
           this.country_Region_Code = country_Region_Code;
           this.manager_No_ = manager_No_;
           this.emplymt__Contract_Code = emplymt__Contract_Code;
           this.statistics_Group_Code = statistics_Group_Code;
           this.employment_Date = employment_Date;
           this.status = status;
           this.inactive_Date = inactive_Date;
           this.cause_of_Inactivity_Code = cause_of_Inactivity_Code;
           this.termination_Date = termination_Date;
           this.grounds_for_Term__Code = grounds_for_Term__Code;
           this.global_Dimension_1_Code = global_Dimension_1_Code;
           this.global_Dimension_2_Code = global_Dimension_2_Code;
           this.resource_No_ = resource_No_;
           this.last_Date_Modified = last_Date_Modified;
           this.extension = extension;
           this.pager = pager;
           this.fax_No_ = fax_No_;
           this.company_E_Mail = company_E_Mail;
           this.title = title;
           this.salespers__Purch__Code = salespers__Purch__Code;
           this.no__Series = no__Series;
    }


    /**
     * Gets the timestamp value for this CRONUS_Sverige_AB_Employee.
     * 
     * @return timestamp
     */
    public byte[] getTimestamp() {
        return timestamp;
    }


    /**
     * Sets the timestamp value for this CRONUS_Sverige_AB_Employee.
     * 
     * @param timestamp
     */
    public void setTimestamp(byte[] timestamp) {
        this.timestamp = timestamp;
    }


    /**
     * Gets the no_ value for this CRONUS_Sverige_AB_Employee.
     * 
     * @return no_
     */
    public java.lang.String getNo_() {
        return no_;
    }


    /**
     * Sets the no_ value for this CRONUS_Sverige_AB_Employee.
     * 
     * @param no_
     */
    public void setNo_(java.lang.String no_) {
        this.no_ = no_;
    }


    /**
     * Gets the first_Name value for this CRONUS_Sverige_AB_Employee.
     * 
     * @return first_Name
     */
    public java.lang.String getFirst_Name() {
        return first_Name;
    }


    /**
     * Sets the first_Name value for this CRONUS_Sverige_AB_Employee.
     * 
     * @param first_Name
     */
    public void setFirst_Name(java.lang.String first_Name) {
        this.first_Name = first_Name;
    }


    /**
     * Gets the middle_Name value for this CRONUS_Sverige_AB_Employee.
     * 
     * @return middle_Name
     */
    public java.lang.String getMiddle_Name() {
        return middle_Name;
    }


    /**
     * Sets the middle_Name value for this CRONUS_Sverige_AB_Employee.
     * 
     * @param middle_Name
     */
    public void setMiddle_Name(java.lang.String middle_Name) {
        this.middle_Name = middle_Name;
    }


    /**
     * Gets the last_Name value for this CRONUS_Sverige_AB_Employee.
     * 
     * @return last_Name
     */
    public java.lang.String getLast_Name() {
        return last_Name;
    }


    /**
     * Sets the last_Name value for this CRONUS_Sverige_AB_Employee.
     * 
     * @param last_Name
     */
    public void setLast_Name(java.lang.String last_Name) {
        this.last_Name = last_Name;
    }


    /**
     * Gets the initials value for this CRONUS_Sverige_AB_Employee.
     * 
     * @return initials
     */
    public java.lang.String getInitials() {
        return initials;
    }


    /**
     * Sets the initials value for this CRONUS_Sverige_AB_Employee.
     * 
     * @param initials
     */
    public void setInitials(java.lang.String initials) {
        this.initials = initials;
    }


    /**
     * Gets the job_Title value for this CRONUS_Sverige_AB_Employee.
     * 
     * @return job_Title
     */
    public java.lang.String getJob_Title() {
        return job_Title;
    }


    /**
     * Sets the job_Title value for this CRONUS_Sverige_AB_Employee.
     * 
     * @param job_Title
     */
    public void setJob_Title(java.lang.String job_Title) {
        this.job_Title = job_Title;
    }


    /**
     * Gets the search_Name value for this CRONUS_Sverige_AB_Employee.
     * 
     * @return search_Name
     */
    public java.lang.String getSearch_Name() {
        return search_Name;
    }


    /**
     * Sets the search_Name value for this CRONUS_Sverige_AB_Employee.
     * 
     * @param search_Name
     */
    public void setSearch_Name(java.lang.String search_Name) {
        this.search_Name = search_Name;
    }


    /**
     * Gets the address value for this CRONUS_Sverige_AB_Employee.
     * 
     * @return address
     */
    public java.lang.String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this CRONUS_Sverige_AB_Employee.
     * 
     * @param address
     */
    public void setAddress(java.lang.String address) {
        this.address = address;
    }


    /**
     * Gets the address_2 value for this CRONUS_Sverige_AB_Employee.
     * 
     * @return address_2
     */
    public java.lang.String getAddress_2() {
        return address_2;
    }


    /**
     * Sets the address_2 value for this CRONUS_Sverige_AB_Employee.
     * 
     * @param address_2
     */
    public void setAddress_2(java.lang.String address_2) {
        this.address_2 = address_2;
    }


    /**
     * Gets the city value for this CRONUS_Sverige_AB_Employee.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this CRONUS_Sverige_AB_Employee.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the post_Code value for this CRONUS_Sverige_AB_Employee.
     * 
     * @return post_Code
     */
    public java.lang.String getPost_Code() {
        return post_Code;
    }


    /**
     * Sets the post_Code value for this CRONUS_Sverige_AB_Employee.
     * 
     * @param post_Code
     */
    public void setPost_Code(java.lang.String post_Code) {
        this.post_Code = post_Code;
    }


    /**
     * Gets the county value for this CRONUS_Sverige_AB_Employee.
     * 
     * @return county
     */
    public java.lang.String getCounty() {
        return county;
    }


    /**
     * Sets the county value for this CRONUS_Sverige_AB_Employee.
     * 
     * @param county
     */
    public void setCounty(java.lang.String county) {
        this.county = county;
    }


    /**
     * Gets the phone_No_ value for this CRONUS_Sverige_AB_Employee.
     * 
     * @return phone_No_
     */
    public java.lang.String getPhone_No_() {
        return phone_No_;
    }


    /**
     * Sets the phone_No_ value for this CRONUS_Sverige_AB_Employee.
     * 
     * @param phone_No_
     */
    public void setPhone_No_(java.lang.String phone_No_) {
        this.phone_No_ = phone_No_;
    }


    /**
     * Gets the mobile_Phone_No_ value for this CRONUS_Sverige_AB_Employee.
     * 
     * @return mobile_Phone_No_
     */
    public java.lang.String getMobile_Phone_No_() {
        return mobile_Phone_No_;
    }


    /**
     * Sets the mobile_Phone_No_ value for this CRONUS_Sverige_AB_Employee.
     * 
     * @param mobile_Phone_No_
     */
    public void setMobile_Phone_No_(java.lang.String mobile_Phone_No_) {
        this.mobile_Phone_No_ = mobile_Phone_No_;
    }


    /**
     * Gets the e_Mail value for this CRONUS_Sverige_AB_Employee.
     * 
     * @return e_Mail
     */
    public java.lang.String getE_Mail() {
        return e_Mail;
    }


    /**
     * Sets the e_Mail value for this CRONUS_Sverige_AB_Employee.
     * 
     * @param e_Mail
     */
    public void setE_Mail(java.lang.String e_Mail) {
        this.e_Mail = e_Mail;
    }


    /**
     * Gets the alt__Address_Code value for this CRONUS_Sverige_AB_Employee.
     * 
     * @return alt__Address_Code
     */
    public java.lang.String getAlt__Address_Code() {
        return alt__Address_Code;
    }


    /**
     * Sets the alt__Address_Code value for this CRONUS_Sverige_AB_Employee.
     * 
     * @param alt__Address_Code
     */
    public void setAlt__Address_Code(java.lang.String alt__Address_Code) {
        this.alt__Address_Code = alt__Address_Code;
    }


    /**
     * Gets the alt__Address_Start_Date value for this CRONUS_Sverige_AB_Employee.
     * 
     * @return alt__Address_Start_Date
     */
    public java.util.Calendar getAlt__Address_Start_Date() {
        return alt__Address_Start_Date;
    }


    /**
     * Sets the alt__Address_Start_Date value for this CRONUS_Sverige_AB_Employee.
     * 
     * @param alt__Address_Start_Date
     */
    public void setAlt__Address_Start_Date(java.util.Calendar alt__Address_Start_Date) {
        this.alt__Address_Start_Date = alt__Address_Start_Date;
    }


    /**
     * Gets the alt__Address_End_Date value for this CRONUS_Sverige_AB_Employee.
     * 
     * @return alt__Address_End_Date
     */
    public java.util.Calendar getAlt__Address_End_Date() {
        return alt__Address_End_Date;
    }


    /**
     * Sets the alt__Address_End_Date value for this CRONUS_Sverige_AB_Employee.
     * 
     * @param alt__Address_End_Date
     */
    public void setAlt__Address_End_Date(java.util.Calendar alt__Address_End_Date) {
        this.alt__Address_End_Date = alt__Address_End_Date;
    }


    /**
     * Gets the picture value for this CRONUS_Sverige_AB_Employee.
     * 
     * @return picture
     */
    public byte[] getPicture() {
        return picture;
    }


    /**
     * Sets the picture value for this CRONUS_Sverige_AB_Employee.
     * 
     * @param picture
     */
    public void setPicture(byte[] picture) {
        this.picture = picture;
    }


    /**
     * Gets the birth_Date value for this CRONUS_Sverige_AB_Employee.
     * 
     * @return birth_Date
     */
    public java.util.Calendar getBirth_Date() {
        return birth_Date;
    }


    /**
     * Sets the birth_Date value for this CRONUS_Sverige_AB_Employee.
     * 
     * @param birth_Date
     */
    public void setBirth_Date(java.util.Calendar birth_Date) {
        this.birth_Date = birth_Date;
    }


    /**
     * Gets the social_Security_No_ value for this CRONUS_Sverige_AB_Employee.
     * 
     * @return social_Security_No_
     */
    public java.lang.String getSocial_Security_No_() {
        return social_Security_No_;
    }


    /**
     * Sets the social_Security_No_ value for this CRONUS_Sverige_AB_Employee.
     * 
     * @param social_Security_No_
     */
    public void setSocial_Security_No_(java.lang.String social_Security_No_) {
        this.social_Security_No_ = social_Security_No_;
    }


    /**
     * Gets the union_Code value for this CRONUS_Sverige_AB_Employee.
     * 
     * @return union_Code
     */
    public java.lang.String getUnion_Code() {
        return union_Code;
    }


    /**
     * Sets the union_Code value for this CRONUS_Sverige_AB_Employee.
     * 
     * @param union_Code
     */
    public void setUnion_Code(java.lang.String union_Code) {
        this.union_Code = union_Code;
    }


    /**
     * Gets the union_Membership_No_ value for this CRONUS_Sverige_AB_Employee.
     * 
     * @return union_Membership_No_
     */
    public java.lang.String getUnion_Membership_No_() {
        return union_Membership_No_;
    }


    /**
     * Sets the union_Membership_No_ value for this CRONUS_Sverige_AB_Employee.
     * 
     * @param union_Membership_No_
     */
    public void setUnion_Membership_No_(java.lang.String union_Membership_No_) {
        this.union_Membership_No_ = union_Membership_No_;
    }


    /**
     * Gets the sex value for this CRONUS_Sverige_AB_Employee.
     * 
     * @return sex
     */
    public int getSex() {
        return sex;
    }


    /**
     * Sets the sex value for this CRONUS_Sverige_AB_Employee.
     * 
     * @param sex
     */
    public void setSex(int sex) {
        this.sex = sex;
    }


    /**
     * Gets the country_Region_Code value for this CRONUS_Sverige_AB_Employee.
     * 
     * @return country_Region_Code
     */
    public java.lang.String getCountry_Region_Code() {
        return country_Region_Code;
    }


    /**
     * Sets the country_Region_Code value for this CRONUS_Sverige_AB_Employee.
     * 
     * @param country_Region_Code
     */
    public void setCountry_Region_Code(java.lang.String country_Region_Code) {
        this.country_Region_Code = country_Region_Code;
    }


    /**
     * Gets the manager_No_ value for this CRONUS_Sverige_AB_Employee.
     * 
     * @return manager_No_
     */
    public java.lang.String getManager_No_() {
        return manager_No_;
    }


    /**
     * Sets the manager_No_ value for this CRONUS_Sverige_AB_Employee.
     * 
     * @param manager_No_
     */
    public void setManager_No_(java.lang.String manager_No_) {
        this.manager_No_ = manager_No_;
    }


    /**
     * Gets the emplymt__Contract_Code value for this CRONUS_Sverige_AB_Employee.
     * 
     * @return emplymt__Contract_Code
     */
    public java.lang.String getEmplymt__Contract_Code() {
        return emplymt__Contract_Code;
    }


    /**
     * Sets the emplymt__Contract_Code value for this CRONUS_Sverige_AB_Employee.
     * 
     * @param emplymt__Contract_Code
     */
    public void setEmplymt__Contract_Code(java.lang.String emplymt__Contract_Code) {
        this.emplymt__Contract_Code = emplymt__Contract_Code;
    }


    /**
     * Gets the statistics_Group_Code value for this CRONUS_Sverige_AB_Employee.
     * 
     * @return statistics_Group_Code
     */
    public java.lang.String getStatistics_Group_Code() {
        return statistics_Group_Code;
    }


    /**
     * Sets the statistics_Group_Code value for this CRONUS_Sverige_AB_Employee.
     * 
     * @param statistics_Group_Code
     */
    public void setStatistics_Group_Code(java.lang.String statistics_Group_Code) {
        this.statistics_Group_Code = statistics_Group_Code;
    }


    /**
     * Gets the employment_Date value for this CRONUS_Sverige_AB_Employee.
     * 
     * @return employment_Date
     */
    public java.util.Calendar getEmployment_Date() {
        return employment_Date;
    }


    /**
     * Sets the employment_Date value for this CRONUS_Sverige_AB_Employee.
     * 
     * @param employment_Date
     */
    public void setEmployment_Date(java.util.Calendar employment_Date) {
        this.employment_Date = employment_Date;
    }


    /**
     * Gets the status value for this CRONUS_Sverige_AB_Employee.
     * 
     * @return status
     */
    public int getStatus() {
        return status;
    }


    /**
     * Sets the status value for this CRONUS_Sverige_AB_Employee.
     * 
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }


    /**
     * Gets the inactive_Date value for this CRONUS_Sverige_AB_Employee.
     * 
     * @return inactive_Date
     */
    public java.util.Calendar getInactive_Date() {
        return inactive_Date;
    }


    /**
     * Sets the inactive_Date value for this CRONUS_Sverige_AB_Employee.
     * 
     * @param inactive_Date
     */
    public void setInactive_Date(java.util.Calendar inactive_Date) {
        this.inactive_Date = inactive_Date;
    }


    /**
     * Gets the cause_of_Inactivity_Code value for this CRONUS_Sverige_AB_Employee.
     * 
     * @return cause_of_Inactivity_Code
     */
    public java.lang.String getCause_of_Inactivity_Code() {
        return cause_of_Inactivity_Code;
    }


    /**
     * Sets the cause_of_Inactivity_Code value for this CRONUS_Sverige_AB_Employee.
     * 
     * @param cause_of_Inactivity_Code
     */
    public void setCause_of_Inactivity_Code(java.lang.String cause_of_Inactivity_Code) {
        this.cause_of_Inactivity_Code = cause_of_Inactivity_Code;
    }


    /**
     * Gets the termination_Date value for this CRONUS_Sverige_AB_Employee.
     * 
     * @return termination_Date
     */
    public java.util.Calendar getTermination_Date() {
        return termination_Date;
    }


    /**
     * Sets the termination_Date value for this CRONUS_Sverige_AB_Employee.
     * 
     * @param termination_Date
     */
    public void setTermination_Date(java.util.Calendar termination_Date) {
        this.termination_Date = termination_Date;
    }


    /**
     * Gets the grounds_for_Term__Code value for this CRONUS_Sverige_AB_Employee.
     * 
     * @return grounds_for_Term__Code
     */
    public java.lang.String getGrounds_for_Term__Code() {
        return grounds_for_Term__Code;
    }


    /**
     * Sets the grounds_for_Term__Code value for this CRONUS_Sverige_AB_Employee.
     * 
     * @param grounds_for_Term__Code
     */
    public void setGrounds_for_Term__Code(java.lang.String grounds_for_Term__Code) {
        this.grounds_for_Term__Code = grounds_for_Term__Code;
    }


    /**
     * Gets the global_Dimension_1_Code value for this CRONUS_Sverige_AB_Employee.
     * 
     * @return global_Dimension_1_Code
     */
    public java.lang.String getGlobal_Dimension_1_Code() {
        return global_Dimension_1_Code;
    }


    /**
     * Sets the global_Dimension_1_Code value for this CRONUS_Sverige_AB_Employee.
     * 
     * @param global_Dimension_1_Code
     */
    public void setGlobal_Dimension_1_Code(java.lang.String global_Dimension_1_Code) {
        this.global_Dimension_1_Code = global_Dimension_1_Code;
    }


    /**
     * Gets the global_Dimension_2_Code value for this CRONUS_Sverige_AB_Employee.
     * 
     * @return global_Dimension_2_Code
     */
    public java.lang.String getGlobal_Dimension_2_Code() {
        return global_Dimension_2_Code;
    }


    /**
     * Sets the global_Dimension_2_Code value for this CRONUS_Sverige_AB_Employee.
     * 
     * @param global_Dimension_2_Code
     */
    public void setGlobal_Dimension_2_Code(java.lang.String global_Dimension_2_Code) {
        this.global_Dimension_2_Code = global_Dimension_2_Code;
    }


    /**
     * Gets the resource_No_ value for this CRONUS_Sverige_AB_Employee.
     * 
     * @return resource_No_
     */
    public java.lang.String getResource_No_() {
        return resource_No_;
    }


    /**
     * Sets the resource_No_ value for this CRONUS_Sverige_AB_Employee.
     * 
     * @param resource_No_
     */
    public void setResource_No_(java.lang.String resource_No_) {
        this.resource_No_ = resource_No_;
    }


    /**
     * Gets the last_Date_Modified value for this CRONUS_Sverige_AB_Employee.
     * 
     * @return last_Date_Modified
     */
    public java.util.Calendar getLast_Date_Modified() {
        return last_Date_Modified;
    }


    /**
     * Sets the last_Date_Modified value for this CRONUS_Sverige_AB_Employee.
     * 
     * @param last_Date_Modified
     */
    public void setLast_Date_Modified(java.util.Calendar last_Date_Modified) {
        this.last_Date_Modified = last_Date_Modified;
    }


    /**
     * Gets the extension value for this CRONUS_Sverige_AB_Employee.
     * 
     * @return extension
     */
    public java.lang.String getExtension() {
        return extension;
    }


    /**
     * Sets the extension value for this CRONUS_Sverige_AB_Employee.
     * 
     * @param extension
     */
    public void setExtension(java.lang.String extension) {
        this.extension = extension;
    }


    /**
     * Gets the pager value for this CRONUS_Sverige_AB_Employee.
     * 
     * @return pager
     */
    public java.lang.String getPager() {
        return pager;
    }


    /**
     * Sets the pager value for this CRONUS_Sverige_AB_Employee.
     * 
     * @param pager
     */
    public void setPager(java.lang.String pager) {
        this.pager = pager;
    }


    /**
     * Gets the fax_No_ value for this CRONUS_Sverige_AB_Employee.
     * 
     * @return fax_No_
     */
    public java.lang.String getFax_No_() {
        return fax_No_;
    }


    /**
     * Sets the fax_No_ value for this CRONUS_Sverige_AB_Employee.
     * 
     * @param fax_No_
     */
    public void setFax_No_(java.lang.String fax_No_) {
        this.fax_No_ = fax_No_;
    }


    /**
     * Gets the company_E_Mail value for this CRONUS_Sverige_AB_Employee.
     * 
     * @return company_E_Mail
     */
    public java.lang.String getCompany_E_Mail() {
        return company_E_Mail;
    }


    /**
     * Sets the company_E_Mail value for this CRONUS_Sverige_AB_Employee.
     * 
     * @param company_E_Mail
     */
    public void setCompany_E_Mail(java.lang.String company_E_Mail) {
        this.company_E_Mail = company_E_Mail;
    }


    /**
     * Gets the title value for this CRONUS_Sverige_AB_Employee.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this CRONUS_Sverige_AB_Employee.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the salespers__Purch__Code value for this CRONUS_Sverige_AB_Employee.
     * 
     * @return salespers__Purch__Code
     */
    public java.lang.String getSalespers__Purch__Code() {
        return salespers__Purch__Code;
    }


    /**
     * Sets the salespers__Purch__Code value for this CRONUS_Sverige_AB_Employee.
     * 
     * @param salespers__Purch__Code
     */
    public void setSalespers__Purch__Code(java.lang.String salespers__Purch__Code) {
        this.salespers__Purch__Code = salespers__Purch__Code;
    }


    /**
     * Gets the no__Series value for this CRONUS_Sverige_AB_Employee.
     * 
     * @return no__Series
     */
    public java.lang.String getNo__Series() {
        return no__Series;
    }


    /**
     * Sets the no__Series value for this CRONUS_Sverige_AB_Employee.
     * 
     * @param no__Series
     */
    public void setNo__Series(java.lang.String no__Series) {
        this.no__Series = no__Series;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CRONUS_Sverige_AB_Employee)) return false;
        CRONUS_Sverige_AB_Employee other = (CRONUS_Sverige_AB_Employee) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.timestamp==null && other.getTimestamp()==null) || 
             (this.timestamp!=null &&
              java.util.Arrays.equals(this.timestamp, other.getTimestamp()))) &&
            ((this.no_==null && other.getNo_()==null) || 
             (this.no_!=null &&
              this.no_.equals(other.getNo_()))) &&
            ((this.first_Name==null && other.getFirst_Name()==null) || 
             (this.first_Name!=null &&
              this.first_Name.equals(other.getFirst_Name()))) &&
            ((this.middle_Name==null && other.getMiddle_Name()==null) || 
             (this.middle_Name!=null &&
              this.middle_Name.equals(other.getMiddle_Name()))) &&
            ((this.last_Name==null && other.getLast_Name()==null) || 
             (this.last_Name!=null &&
              this.last_Name.equals(other.getLast_Name()))) &&
            ((this.initials==null && other.getInitials()==null) || 
             (this.initials!=null &&
              this.initials.equals(other.getInitials()))) &&
            ((this.job_Title==null && other.getJob_Title()==null) || 
             (this.job_Title!=null &&
              this.job_Title.equals(other.getJob_Title()))) &&
            ((this.search_Name==null && other.getSearch_Name()==null) || 
             (this.search_Name!=null &&
              this.search_Name.equals(other.getSearch_Name()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.address_2==null && other.getAddress_2()==null) || 
             (this.address_2!=null &&
              this.address_2.equals(other.getAddress_2()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.post_Code==null && other.getPost_Code()==null) || 
             (this.post_Code!=null &&
              this.post_Code.equals(other.getPost_Code()))) &&
            ((this.county==null && other.getCounty()==null) || 
             (this.county!=null &&
              this.county.equals(other.getCounty()))) &&
            ((this.phone_No_==null && other.getPhone_No_()==null) || 
             (this.phone_No_!=null &&
              this.phone_No_.equals(other.getPhone_No_()))) &&
            ((this.mobile_Phone_No_==null && other.getMobile_Phone_No_()==null) || 
             (this.mobile_Phone_No_!=null &&
              this.mobile_Phone_No_.equals(other.getMobile_Phone_No_()))) &&
            ((this.e_Mail==null && other.getE_Mail()==null) || 
             (this.e_Mail!=null &&
              this.e_Mail.equals(other.getE_Mail()))) &&
            ((this.alt__Address_Code==null && other.getAlt__Address_Code()==null) || 
             (this.alt__Address_Code!=null &&
              this.alt__Address_Code.equals(other.getAlt__Address_Code()))) &&
            ((this.alt__Address_Start_Date==null && other.getAlt__Address_Start_Date()==null) || 
             (this.alt__Address_Start_Date!=null &&
              this.alt__Address_Start_Date.equals(other.getAlt__Address_Start_Date()))) &&
            ((this.alt__Address_End_Date==null && other.getAlt__Address_End_Date()==null) || 
             (this.alt__Address_End_Date!=null &&
              this.alt__Address_End_Date.equals(other.getAlt__Address_End_Date()))) &&
            ((this.picture==null && other.getPicture()==null) || 
             (this.picture!=null &&
              java.util.Arrays.equals(this.picture, other.getPicture()))) &&
            ((this.birth_Date==null && other.getBirth_Date()==null) || 
             (this.birth_Date!=null &&
              this.birth_Date.equals(other.getBirth_Date()))) &&
            ((this.social_Security_No_==null && other.getSocial_Security_No_()==null) || 
             (this.social_Security_No_!=null &&
              this.social_Security_No_.equals(other.getSocial_Security_No_()))) &&
            ((this.union_Code==null && other.getUnion_Code()==null) || 
             (this.union_Code!=null &&
              this.union_Code.equals(other.getUnion_Code()))) &&
            ((this.union_Membership_No_==null && other.getUnion_Membership_No_()==null) || 
             (this.union_Membership_No_!=null &&
              this.union_Membership_No_.equals(other.getUnion_Membership_No_()))) &&
            this.sex == other.getSex() &&
            ((this.country_Region_Code==null && other.getCountry_Region_Code()==null) || 
             (this.country_Region_Code!=null &&
              this.country_Region_Code.equals(other.getCountry_Region_Code()))) &&
            ((this.manager_No_==null && other.getManager_No_()==null) || 
             (this.manager_No_!=null &&
              this.manager_No_.equals(other.getManager_No_()))) &&
            ((this.emplymt__Contract_Code==null && other.getEmplymt__Contract_Code()==null) || 
             (this.emplymt__Contract_Code!=null &&
              this.emplymt__Contract_Code.equals(other.getEmplymt__Contract_Code()))) &&
            ((this.statistics_Group_Code==null && other.getStatistics_Group_Code()==null) || 
             (this.statistics_Group_Code!=null &&
              this.statistics_Group_Code.equals(other.getStatistics_Group_Code()))) &&
            ((this.employment_Date==null && other.getEmployment_Date()==null) || 
             (this.employment_Date!=null &&
              this.employment_Date.equals(other.getEmployment_Date()))) &&
            this.status == other.getStatus() &&
            ((this.inactive_Date==null && other.getInactive_Date()==null) || 
             (this.inactive_Date!=null &&
              this.inactive_Date.equals(other.getInactive_Date()))) &&
            ((this.cause_of_Inactivity_Code==null && other.getCause_of_Inactivity_Code()==null) || 
             (this.cause_of_Inactivity_Code!=null &&
              this.cause_of_Inactivity_Code.equals(other.getCause_of_Inactivity_Code()))) &&
            ((this.termination_Date==null && other.getTermination_Date()==null) || 
             (this.termination_Date!=null &&
              this.termination_Date.equals(other.getTermination_Date()))) &&
            ((this.grounds_for_Term__Code==null && other.getGrounds_for_Term__Code()==null) || 
             (this.grounds_for_Term__Code!=null &&
              this.grounds_for_Term__Code.equals(other.getGrounds_for_Term__Code()))) &&
            ((this.global_Dimension_1_Code==null && other.getGlobal_Dimension_1_Code()==null) || 
             (this.global_Dimension_1_Code!=null &&
              this.global_Dimension_1_Code.equals(other.getGlobal_Dimension_1_Code()))) &&
            ((this.global_Dimension_2_Code==null && other.getGlobal_Dimension_2_Code()==null) || 
             (this.global_Dimension_2_Code!=null &&
              this.global_Dimension_2_Code.equals(other.getGlobal_Dimension_2_Code()))) &&
            ((this.resource_No_==null && other.getResource_No_()==null) || 
             (this.resource_No_!=null &&
              this.resource_No_.equals(other.getResource_No_()))) &&
            ((this.last_Date_Modified==null && other.getLast_Date_Modified()==null) || 
             (this.last_Date_Modified!=null &&
              this.last_Date_Modified.equals(other.getLast_Date_Modified()))) &&
            ((this.extension==null && other.getExtension()==null) || 
             (this.extension!=null &&
              this.extension.equals(other.getExtension()))) &&
            ((this.pager==null && other.getPager()==null) || 
             (this.pager!=null &&
              this.pager.equals(other.getPager()))) &&
            ((this.fax_No_==null && other.getFax_No_()==null) || 
             (this.fax_No_!=null &&
              this.fax_No_.equals(other.getFax_No_()))) &&
            ((this.company_E_Mail==null && other.getCompany_E_Mail()==null) || 
             (this.company_E_Mail!=null &&
              this.company_E_Mail.equals(other.getCompany_E_Mail()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.salespers__Purch__Code==null && other.getSalespers__Purch__Code()==null) || 
             (this.salespers__Purch__Code!=null &&
              this.salespers__Purch__Code.equals(other.getSalespers__Purch__Code()))) &&
            ((this.no__Series==null && other.getNo__Series()==null) || 
             (this.no__Series!=null &&
              this.no__Series.equals(other.getNo__Series())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getTimestamp() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTimestamp());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTimestamp(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNo_() != null) {
            _hashCode += getNo_().hashCode();
        }
        if (getFirst_Name() != null) {
            _hashCode += getFirst_Name().hashCode();
        }
        if (getMiddle_Name() != null) {
            _hashCode += getMiddle_Name().hashCode();
        }
        if (getLast_Name() != null) {
            _hashCode += getLast_Name().hashCode();
        }
        if (getInitials() != null) {
            _hashCode += getInitials().hashCode();
        }
        if (getJob_Title() != null) {
            _hashCode += getJob_Title().hashCode();
        }
        if (getSearch_Name() != null) {
            _hashCode += getSearch_Name().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getAddress_2() != null) {
            _hashCode += getAddress_2().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getPost_Code() != null) {
            _hashCode += getPost_Code().hashCode();
        }
        if (getCounty() != null) {
            _hashCode += getCounty().hashCode();
        }
        if (getPhone_No_() != null) {
            _hashCode += getPhone_No_().hashCode();
        }
        if (getMobile_Phone_No_() != null) {
            _hashCode += getMobile_Phone_No_().hashCode();
        }
        if (getE_Mail() != null) {
            _hashCode += getE_Mail().hashCode();
        }
        if (getAlt__Address_Code() != null) {
            _hashCode += getAlt__Address_Code().hashCode();
        }
        if (getAlt__Address_Start_Date() != null) {
            _hashCode += getAlt__Address_Start_Date().hashCode();
        }
        if (getAlt__Address_End_Date() != null) {
            _hashCode += getAlt__Address_End_Date().hashCode();
        }
        if (getPicture() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPicture());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPicture(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBirth_Date() != null) {
            _hashCode += getBirth_Date().hashCode();
        }
        if (getSocial_Security_No_() != null) {
            _hashCode += getSocial_Security_No_().hashCode();
        }
        if (getUnion_Code() != null) {
            _hashCode += getUnion_Code().hashCode();
        }
        if (getUnion_Membership_No_() != null) {
            _hashCode += getUnion_Membership_No_().hashCode();
        }
        _hashCode += getSex();
        if (getCountry_Region_Code() != null) {
            _hashCode += getCountry_Region_Code().hashCode();
        }
        if (getManager_No_() != null) {
            _hashCode += getManager_No_().hashCode();
        }
        if (getEmplymt__Contract_Code() != null) {
            _hashCode += getEmplymt__Contract_Code().hashCode();
        }
        if (getStatistics_Group_Code() != null) {
            _hashCode += getStatistics_Group_Code().hashCode();
        }
        if (getEmployment_Date() != null) {
            _hashCode += getEmployment_Date().hashCode();
        }
        _hashCode += getStatus();
        if (getInactive_Date() != null) {
            _hashCode += getInactive_Date().hashCode();
        }
        if (getCause_of_Inactivity_Code() != null) {
            _hashCode += getCause_of_Inactivity_Code().hashCode();
        }
        if (getTermination_Date() != null) {
            _hashCode += getTermination_Date().hashCode();
        }
        if (getGrounds_for_Term__Code() != null) {
            _hashCode += getGrounds_for_Term__Code().hashCode();
        }
        if (getGlobal_Dimension_1_Code() != null) {
            _hashCode += getGlobal_Dimension_1_Code().hashCode();
        }
        if (getGlobal_Dimension_2_Code() != null) {
            _hashCode += getGlobal_Dimension_2_Code().hashCode();
        }
        if (getResource_No_() != null) {
            _hashCode += getResource_No_().hashCode();
        }
        if (getLast_Date_Modified() != null) {
            _hashCode += getLast_Date_Modified().hashCode();
        }
        if (getExtension() != null) {
            _hashCode += getExtension().hashCode();
        }
        if (getPager() != null) {
            _hashCode += getPager().hashCode();
        }
        if (getFax_No_() != null) {
            _hashCode += getFax_No_().hashCode();
        }
        if (getCompany_E_Mail() != null) {
            _hashCode += getCompany_E_Mail().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getSalespers__Purch__Code() != null) {
            _hashCode += getSalespers__Purch__Code().hashCode();
        }
        if (getNo__Series() != null) {
            _hashCode += getNo__Series().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CRONUS_Sverige_AB_Employee.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "CRONUS_Sverige_AB_Employee"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "timestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("no_");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "No_"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("first_Name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "First_Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("middle_Name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Middle_Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("last_Name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Last_Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initials");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Initials"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("job_Title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Job_Title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("search_Name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Search_Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address_2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Address_2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "City"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("post_Code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Post_Code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("county");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "County"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone_No_");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Phone_No_"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobile_Phone_No_");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Mobile_Phone_No_"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("e_Mail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "E_Mail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alt__Address_Code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Alt__Address_Code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alt__Address_Start_Date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Alt__Address_Start_Date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alt__Address_End_Date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Alt__Address_End_Date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("picture");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Picture"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("birth_Date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Birth_Date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("social_Security_No_");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Social_Security_No_"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("union_Code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Union_Code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("union_Membership_No_");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Union_Membership_No_"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sex");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Sex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country_Region_Code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Country_Region_Code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manager_No_");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Manager_No_"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emplymt__Contract_Code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Emplymt__Contract_Code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statistics_Group_Code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Statistics_Group_Code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employment_Date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Employment_Date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inactive_Date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Inactive_Date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cause_of_Inactivity_Code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Cause_of_Inactivity_Code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("termination_Date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Termination_Date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grounds_for_Term__Code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Grounds_for_Term__Code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("global_Dimension_1_Code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Global_Dimension_1_Code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("global_Dimension_2_Code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Global_Dimension_2_Code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resource_No_");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Resource_No_"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("last_Date_Modified");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Last_Date_Modified"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extension");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Extension"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pager");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Pager"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fax_No_");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Fax_No_"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company_E_Mail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Company_E_Mail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salespers__Purch__Code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Salespers__Purch__Code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("no__Series");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "No__Series"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
