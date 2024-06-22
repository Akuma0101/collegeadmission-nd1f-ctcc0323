/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdmissionForm;

/**
 *
 * @author HANNAH
 */
public class studentData {
    private String fullname;
    private String sex;
    private String emailadd;
    private String campus1;
    private String program1;
    private String campus2;
    private String program2;
    private String gwa;
    
    public studentData(String fullname, String sex, String emailadd, String campus1, String program1, String campus2, String program2, String gwa){
        this.fullname = fullname;
        this.sex =  sex;
        this.emailadd = emailadd;
        this.campus1 = campus1;
        this.program1 = program1;
        this.campus2 = campus2;
        this.program2 = program2;
        this.gwa = gwa;
    }
    
    public String getName(){
        return fullname;
    }
    
    public String getSex(){
        return sex;
    }
    
    public String getEmailAdd(){
        return emailadd;
    }
    
    public String getCampus1(){
        return campus1;
    }
    
    public String getProgram1(){
        return program1;
    }
    
    public String getCampus2(){
        return campus2;
    }
    
    public String getProgram2(){
        return program2;
    }
    
    public String getGWA(){
        return gwa;
    }
}
