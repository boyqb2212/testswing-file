/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingfile;

/**
 *
 * @author at160
 */
public class Swingfile {
static Accounts accs=new Accounts();
static singup fsingup=new singup();
static profile fprofile=new profile();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        login flogin=new login();
        flogin.setVisible(true);
    }
    
}
