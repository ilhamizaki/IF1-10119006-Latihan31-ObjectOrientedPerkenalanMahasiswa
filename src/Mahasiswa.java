/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author
 * NAMA     : Ilham zaki
 * Kelas    : IF 1
 * NIM      : 10119006
 * Deskripsi Program : class mahasiswa
 */
public class Mahasiswa {
    public String[] nim = {"10119006", "10118006", "10117006", "10116006"};
    public String[] nama = {"Ilham zaki", "Zaki", "Hazaki", "Ham"};
    
    public void perkenalanDiri() {
        for(int i=0; i < nim.length; i++){
            System.out.println("Hello Everyone");
            System.out.println("My NIM is "+ nim[i]);
            System.out.println("My Name is "+ nama[i]);
            System.out.println();
        }
    }
}   
