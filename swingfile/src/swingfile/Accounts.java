/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingfile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author at160
 */
public class Accounts {
    ArrayList<User> accounts = new ArrayList<>();

    public Accounts() {
    }
    public boolean contains(String user){
        for(User x:this.accounts){
            if(x.user.equalsIgnoreCase(user)){
                return true;
            }
        }
        return false;
    }
    public void add(String user,String pass){
      if(!this.contains(user)){
          this.accounts.add(new User (user,pass));
      }
}
    public boolean check(String user,String pass){
        for(User x:this.accounts){
            if(x.user.equalsIgnoreCase(user)&&x.pass.equalsIgnoreCase(pass)){
                return true;
            }
        }
        return false;
    }
    public void docfile(String filepath){
        try{
            File f=new File("data.txt");
            FileReader fr=new FileReader(f);
            BufferedReader br=new BufferedReader(fr);
            this.accounts.removeAll(accounts);
             
            String str;
            while((str=br.readLine())!=null){
                String [] obj=str.split("-");
                this.accounts.add(new User(obj[0],obj[1]));
            }
            
            
            br.close();
            fr.close();
            
        }catch(Exception e){
            
        }
    }
    public void ghifile(String filepath){
        try{
            File f=new File("data.txt");
            FileWriter fw=new FileWriter(f);
            BufferedWriter bw=new BufferedWriter(fw);
            
            for(User x:this.accounts){
                bw.write(x.toString()+"\n");
            }
            
            
            
            bw.close();
            fw.close();
            
        }catch(Exception e){
            
        }
    }
    
}
