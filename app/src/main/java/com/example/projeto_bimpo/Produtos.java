package com.example.projeto_bimpo;

public class Produtos {
    private String nProduto;
    private String dProduto;
    private String cProduto;
    private int imgProduto;

    public Produtos() {

    }

    public Produtos(String nProduto, String dProduto, String cProduto, int imgProduto) {
        this.nProduto = nProduto;
        this.dProduto = dProduto;
        this.cProduto = cProduto;
        this.imgProduto = imgProduto;
    }

    public String getnProduto() {
        return nProduto;
    }

    public String getdProduto() {
        return dProduto;
    }

    public String getcProduto() {
        return cProduto;
    }

    public int getImgProduto() {
        return imgProduto;
    }

    public void setnProduto(String nProduto) {
        this.nProduto = nProduto;
    }

    public void setdProduto(String dProduto) {
        this.dProduto = dProduto;
    }

    public void setcProduto(String cProduto) {
        this.cProduto = cProduto;
    }

    public void setImgProduto(int imgProduto) {
        this.imgProduto = imgProduto;
    }
}
