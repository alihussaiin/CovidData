package org.example;

public class Covid19Data    {
    private String region;
    private String aldersgruppe;
    private int bekræftede;
    private int døde;
    private int indlagtePåIntensivAfdeling;
    private int indlagte;
    private String dato;

    public Covid19Data(String region, String aldersgruppe, int bekræftede, int døde, int indlagtePåIntensivAfdeling, int indlagte, String dato) {
        this.region = region;
        this.aldersgruppe = aldersgruppe;
        this.bekræftede = bekræftede;
        this.døde = døde;
        this.indlagtePåIntensivAfdeling = indlagtePåIntensivAfdeling;
        this.indlagte = indlagte;
        this.dato = dato;
    }


    @Override
    public String toString() {
        return "Covid19Data{" +
                "region='" + region + '\'' +
                ", aldersgruppe='" + aldersgruppe + '\'' +
                ", bekræftede=" + bekræftede +
                ", døde=" + døde +
                ", indlagtePåIntensivAfdeling=" + indlagtePåIntensivAfdeling +
                ", indlagte=" + indlagte +
                ", dato='" + dato + '\'' +
                '}';
    }
}
