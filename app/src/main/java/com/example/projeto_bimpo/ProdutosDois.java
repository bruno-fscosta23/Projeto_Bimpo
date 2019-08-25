package com.example.projeto_bimpo;

public class ProdutosDois {
    private String nProDois;
    private String dProDois;
    private String cProDois;
    private int imgProdDois;

    public ProdutosDois() {
    }

    public ProdutosDois(String nProDois, String dProDois, String cProDois, int imgProdDois) {
        this.nProDois = nProDois;
        this.dProDois = dProDois;
        this.cProDois = cProDois;
        this.imgProdDois = imgProdDois;
    }

    public String getnProDois() {
        return nProDois;
    }

    public String getdProDois() {
        return dProDois;
    }

    public String getcProDois() {
        return cProDois;
    }

    public int getImgProdDois() {
        return imgProdDois;
    }

    public void setnProDois(String nProDois) {
        this.nProDois = nProDois;
    }

    public void setdProDois(String dProDois) {
        this.dProDois = dProDois;
    }

    public void setcProDois(String cProDois) {
        this.cProDois = cProDois;
    }

    public void setImgProdDois(int imgProdDois) {
        this.imgProdDois = imgProdDois;
    }
}
