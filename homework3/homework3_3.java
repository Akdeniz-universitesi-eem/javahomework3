package javaHomework.homework3;

    import javax.swing.JOptionPane;
    import java.util.Random;
    public class homework3_3 {
        public static void main(String[] args) {
        Random random = new Random();
        int rastgeleSayi = random.nextInt(100) + 1;
        int tahmin = 0;
        int denemeSayisi = 0;

        JOptionPane.showMessageDialog(null, "1 ile 100 arasında rastgele bir sayı seçildi. Tahmininizi girin.");

        while (tahmin != rastgeleSayi) {
            try {
                String tahminStr = JOptionPane.showInputDialog("Tahmininizi girin:");
                tahmin = Integer.parseInt(tahminStr);
                denemeSayisi++;

                if (tahmin < rastgeleSayi) {
                    JOptionPane.showMessageDialog(null, "Daha büyük bir sayı girin.");
                } else if (tahmin > rastgeleSayi) {
                    JOptionPane.showMessageDialog(null, "Daha küçük bir sayı girin.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Lütfen geçerli bir sayı girin.");
            }
        }

        JOptionPane.showMessageDialog(null, "Tebrikler! " + denemeSayisi + " denemede doğru tahmin ettiniz. Rastgele sayı: " + rastgeleSayi);
    }
}

