package org.example;

public enum GezegenlerEnum {
    MERKUR("Merkür", 1, 580, 2839.7, 47),
    VENUS("Venüs", 2, 570, 2739.7, 46),
    DUNYA("Dünya", 3, 560, 2639.7, 45),
    MARS("Mars", 4, 550, 2539.7, 44),
    JUPITER("Jüpiter", 5, 540, 2439.7, 43),
    SATURN("Saturn", 6, 530, 2339.7, 42),
    URANUS("Uranüs", 7, 520, 2239.7, 41),
    NEPTUN("Neptün", 8, 510, 2139.7, 40);

    private final int siraNo;
    private final String gezegenAdi;
    private final double uzaklik;
    private final double yariCap;
    private final double donmeHizi;

    GezegenlerEnum(String gezegenAdi, int siraNo, double uzaklik, double yariCap, double donmeHizi) {
        this.siraNo = siraNo;
        this.uzaklik = uzaklik;
        this.yariCap = yariCap;
        this.donmeHizi = donmeHizi;
        this.gezegenAdi = gezegenAdi;
    }

    public int getSiraNo() {
        return siraNo;
    }

    public double getUzaklik() {
        return uzaklik;
    }

    public double getYariCap() {
        return yariCap;
    }

    public double getDonmeHizi() {
        return donmeHizi;
    }

    public String getGezegenAdi() {
        return gezegenAdi;
    }
}