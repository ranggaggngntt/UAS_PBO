/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import view.*;
/**
 *
 * @author USER
 */
public class controllerMenuUtama {
    private FormMenuUtama frame;
    private FormBarang fBarang;
    private FormPegawai fPegawai;
    private FormLupa fLupaPass;
    private FormCariPegawai fCariPeg;
    
    public controllerMenuUtama(FormMenuUtama frame){
        this.frame = frame;
    }
    
    public void masukFormBarang(){
        fBarang = new FormBarang();
        fBarang.setVisible(true);
    }
    
    public void masukFormPegawai(){
        fPegawai = new FormPegawai();
        fPegawai.setVisible(true);
    }
    
    public void masukFormLupaPass(){
        fLupaPass = new FormLupa();
        fLupaPass.setVisible(true);
    }
    
    public void masukFormCariPegawai(){
        fCariPeg = new FormCariPegawai();
        fCariPeg.setVisible(true);
    }
}
