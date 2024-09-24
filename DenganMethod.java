public class DenganMethod {

    public static void main(String[] args) {
        int pajakPokok = 5000000;
        int tunjanganTransport = 500000;
        int tunjanganMakan = 300000;
        int bonus = 1000000;

        int totalPenghasilan = hitungTotalPenghasilan(pajakPokok, tunjanganTransport, tunjanganMakan, bonus);
        int pajak = hitungPajak(totalPenghasilan);
        int gajiBersih = hitungGajiBersih(totalPenghasilan, pajak);

        tampilkanDetailGaji(pajakPokok, tunjanganTransport, tunjanganMakan, bonus, pajak, gajiBersih);
    }

    public static int hitungPajak(int totalPenghasilan) {
        return totalPenghasilan * 10 / 100;
    }

    public static int hitungGajiBersih(int totalPenghasilan, int pajak) {
        return totalPenghasilan - pajak;


    }
}
