package com.custom.testdatasqllite.data.model;

import java.util.Date;

public class Barang {
    private long id;
    private String nama_barang;
    private  int qty;
    private String date;
    private String harga;


    public Barang() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    @Override
    public String toString() {
        return "Barang{" +
                "id=" + id +
                ", nama_barang='" + nama_barang + '\'' +
                ", qty=" + qty +
                ", date='" + date + '\'' +
                ", harga='" + harga + '\'' +
                '}';
    }
}
