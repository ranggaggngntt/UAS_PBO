/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.daoPegawai;
import java.util.List;
import javax.swing.JOptionPane;
import model.Pegawai;
import model.tabelModelPegawai;
import view.FormCariPegawai;

/**
 *
 * @author USER
 */
public class controllerCariPegawai {
    
    FormCariPegawai frame;
    tabelModelPegawai peg;
    List<Pegawai> listPeg;
    daoPegawai daoCariPeg = new daoPegawai();
    Pegawai cariPeg = new Pegawai();
    
    
    public controllerCariPegawai(FormCariPegawai frame) {
        this.frame = frame;
        listPeg = daoCariPeg.getData();
    }
    
    public void tampil_tabel() {
        tabelModelPegawai tabelPeg = new tabelModelPegawai(listPeg);
        frame.getTblCaripegawai().setModel(tabelPeg);
    }
    
    public void update_tabel(List<Pegawai> listPeg){
        tabelModelPegawai tabelPeg = new tabelModelPegawai(listPeg);
        frame.getTblCaripegawai().setModel(tabelPeg);
    }
    
    public void cariData(String keyword) {
        listPeg = daoCariPeg.cariData(keyword);
        update_tabel(listPeg);
    }
}
