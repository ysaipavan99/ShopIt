
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class loginBean implements Serializable{
    
    private String name;
    private String email;
    private String gender;
    private String mobNum;
    
    loginBean(){
        this.name = null;
        this.email = null;
        this.gender = null;
        this.mobNum = null;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public void setGender(String gender){
        this.gender = gender;
    }
    
    public void setMobnum(String mobNum){
        this.mobNum = mobNum;
    }
    
    public String getName(){
        return name;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String getGender(){
        return gender;
    }
    
    public String getMobnum(){
        return mobNum;
    }
    
}
