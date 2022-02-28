/**
 * CronusServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public interface CronusServiceSoap extends java.rmi.Remote {
    public org.tempuri.CRONUS_Sverige_AB_Employee[] getEmployees() throws java.rmi.RemoteException;
    public void addEmployee(java.lang.String no_, java.lang.String first_Name, java.lang.String last_Name, java.lang.String job_Title, java.lang.String address) throws java.rmi.RemoteException;
    public org.tempuri.CRONUS_Sverige_AB_Employee findEmployee(java.lang.String no_) throws java.rmi.RemoteException;
    public void updateEmployee(java.lang.String no_, java.lang.String first_Name, java.lang.String last_Name, java.lang.String job_Title, java.lang.String address) throws java.rmi.RemoteException;
    public void deleteEmployee(java.lang.String no_) throws java.rmi.RemoteException;
}
