/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdmissionForm;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author HANNAH
 */
public class userData {
    private static user[] users = {
        new user ("Admin","admin123")
    };
    
    private static List<studentData> students = new ArrayList<>();
    
    public static user[] getUsers(){
        return users;
    }
    
    public static user authenticate(String username, String password){
        for (user user : users){
            if (user.getUsername().equals(username)&& user.getPassword().equals(password)){
                return user;
                }
        }
        return null;
    }
     
    public static void updatePassword(user user, String newPassword){
        user.setPassword(newPassword);
    }
    
    public static void updateUsername(user user, String newUsername){
        user.setUsername(newUsername);
    }
    
    public static void addStudent (studentData student){
        students.add(student);
    }
    
    public static List<studentData>getStudents(){
        return students;
    }
}
