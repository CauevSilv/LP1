package com.lp1.classes;

public class Mouse {
    private int dpi;
    private String material;
    private String cores;

    public Mouse(int dpi, String material, String cores) {
        this.dpi = dpi;
        this.material = material;
        this.cores = cores;
    }
    public void mudadpi(int quantidade){
        switch (quantidade){
            case 1:
                setDpi(1000);

            case 2:
                setDpi(1400);
            case 3:
                setDpi(2000);
            case 4:setDpi(2200);

            default:
                System.out.println("Só pode entrar com valores entre 1 e 4");
        }
    }

    public int getDpi() {
        return dpi;
    }

    public void setDpi(int dpi) {
        this.dpi = dpi;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getCores() {
        return cores;
    }

    public void setCores(String cores) {
        this.cores = cores;
    }
}
