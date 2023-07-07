
import java.awt.event.*;
import javax.swing.*;

public class GUIstruk1 {
    JTextField orang;
    JComboBox<String> listbarang;
    JTextField txtharga;
    JTextField txtbeli;
    JTextField txtbayar;
    JComboBox<String> listbarang1;
    JTextField txtharga1;
    JTextField txtbeli1;
    JComboBox<String> listbarang2;
    JTextField txtharga2;
    JTextField txtbeli2;
    long Harga = 0;

    public static void main(String[] args) {
        new GUIstruk1();
    }

    public GUIstruk1() {
        initComponent();
    }

    public void initComponent() {
        JFrame struk = new JFrame("Tiap Hari Pasti Mandi");
        struk.setSize(400, 600);
        struk.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel toko = new JLabel("Kasir Toko Tiap Hari Pasti Mandi");
        toko.setBounds(100, 20, 300, 30);
        struk.add(toko);

        JLabel namaorang = new JLabel("Nama Pembeli");
        namaorang.setBounds(30, 80, 90, 20);
        struk.add(namaorang);
        orang = new JTextField();
        orang.setBounds(150, 80, 90, 20);
        struk.add(orang);

        JLabel namabarang = new JLabel("List Produk");
        namabarang.setBounds(30, 110, 90, 20);
        struk.add(namabarang);
        String barang[] = { "-pilih-", "Sikat Gigi", "Facial Foam", "Alat Cukur" };
        listbarang = new JComboBox<>(barang);
        listbarang.setBounds(150, 110, 95, 20);
        struk.add(listbarang);

        JLabel harga = new JLabel("Harga");
        harga.setBounds(30, 140, 50, 20);
        struk.add(harga);
        txtharga = new JTextField();
        txtharga.setBounds(150, 140, 90, 20);
        struk.add(txtharga);

        JLabel beli = new JLabel("Jumlah Beli");
        beli.setBounds(30, 170, 90, 20);
        struk.add(beli);
        txtbeli = new JTextField();
        txtbeli.setBounds(150, 170, 90, 20);
        struk.add(txtbeli);

        JLabel namabarang1 = new JLabel("List Produk 1");
        namabarang1.setBounds(30, 240, 90, 20);
        struk.add(namabarang1);
        listbarang1 = new JComboBox<>(barang);
        listbarang1.setBounds(150, 240, 95, 20);
        struk.add(listbarang1);

        JLabel harga1 = new JLabel("Harga");
        harga1.setBounds(30, 270, 50, 20);
        struk.add(harga1);
        txtharga1 = new JTextField();
        txtharga1.setBounds(150, 270, 90, 20);
        struk.add(txtharga1);

        JLabel beli1 = new JLabel("Jumlah Beli");
        beli1.setBounds(30, 300, 90, 20);
        struk.add(beli1);
        txtbeli1 = new JTextField();
        txtbeli1.setBounds(150, 300, 90, 20);
        struk.add(txtbeli1);

        JLabel namabarang2 = new JLabel("List Produk 2");
        namabarang2.setBounds(30, 350, 90, 20);
        struk.add(namabarang2);
        listbarang2 = new JComboBox<>(barang);
        listbarang2.setBounds(150, 350, 95, 20);
        struk.add(listbarang2);

        JLabel harga2 = new JLabel("Harga");
        harga2.setBounds(30, 380, 50, 20);
        struk.add(harga2);
        txtharga2 = new JTextField();
        txtharga2.setBounds(150, 380, 90, 20);
        struk.add(txtharga2);

        JLabel beli2 = new JLabel("Jumlah Beli");
        beli2.setBounds(30, 410, 90, 20);
        struk.add(beli2);
        txtbeli2 = new JTextField();
        txtbeli2.setBounds(150, 410, 90, 20);
        struk.add(txtbeli2);

        JLabel bayar = new JLabel("Bayar");
        bayar.setBounds(30, 460, 90, 20);
        struk.add(bayar);
        txtbayar = new JTextField();
        txtbayar.setBounds(150, 460, 90, 20);
        struk.add(txtbayar);

        JButton simpan = new JButton("Simpan");
        simpan.setBounds(30, 500, 80, 25);
        struk.add(simpan);

        struk.setLayout(null);
        struk.setVisible(true);

        listbarang.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String b = (String) listbarang.getSelectedItem();
                switch (b) {
                    case "Sikat Gigi":
                        Harga = 21000;
                        break;
                    case "Facial Foam":
                        Harga = 15000;
                        break;
                    case "Alat Cukur":
                        Harga = 4500;
                        break;
                    default:
                        Harga = 0;
                }
                txtharga.setText(String.valueOf(Harga));
            }
        });
        listbarang1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String b = (String) listbarang1.getSelectedItem();
                switch (b) {
                    case "Sikat Gigi":
                        Harga = 21000;
                        break;
                    case "Facial Foam":
                        Harga = 15000;
                        break;
                    case "Alat Cukur":
                        Harga = 4500;
                        break;
                    default:
                        Harga = 0;
                }
                txtharga1.setText(String.valueOf(Harga));
            }
        });
        listbarang2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String b = (String) listbarang2.getSelectedItem();
                switch (b) {
                    case "Sikat Gigi":
                        Harga = 21000;
                        break;
                    case "Facial Foam":
                        Harga = 15000;
                        break;
                    case "Alat Cukur":
                        Harga = 4500;
                        break;
                    default:
                        Harga = 0;
                }
                txtharga2.setText(String.valueOf(Harga));
            }
        });
        simpan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int produk1, produk2, produk3;
                int total1, total2, total3;
                produk1 = Integer.parseInt(txtbeli.getText());
                produk2 = Integer.parseInt(txtbeli1.getText());
                produk3 = Integer.parseInt(txtbeli2.getText());

                total1 = produk1 * 21000;
                total2 = produk2 * 15000;
                total3 = produk3 * 4500;
                String command = e.getActionCommand();
                switch (command) {
                    case "Simpan":
                        JFrame struk2 = new JFrame("Toko Tiap Hari Pasti Mandi");
                        struk2.setSize(400, 500);
                        struk2.setLocation(100, 300);
                        JLabel toko = new JLabel("Struk Toko Tiap Hari Pasti Mandi");
                        toko.setBounds(100, 20, 300, 30);
                        struk2.add(toko);

                        JLabel bukti = new JLabel("Bukti Transaksi");
                        bukti.setBounds(150, 50, 300, 30);
                        struk2.add(bukti);

                        JLabel strep = new JLabel("-".repeat(80));
                        strep.setBounds(30, 80, 400, 30);
                        struk2.add(strep);

                        String name;
                        name = orang.getText();
                        JLabel pelanggan = new JLabel("Nama Pembeli : " + " " + name);
                        pelanggan.setBounds(30, 110, 200, 20);
                        struk2.add(pelanggan);

                        String barang;
                        barang = (String) listbarang.getSelectedItem();
                        JLabel lbarang = new JLabel(barang);
                        lbarang.setBounds(30, 135, 100, 20);
                        struk2.add(lbarang);

                        int jmlbarang;
                        jmlbarang = Integer.parseInt(txtbeli.getText());
                        JLabel strjmlbrg = new JLabel(String.valueOf(jmlbarang));
                        strjmlbrg.setBounds(138, 135, 30, 20);
                        struk2.add(strjmlbrg);

                        int hrgperstn;
                        hrgperstn = Integer.parseInt(txtharga.getText());
                        JLabel hrgstn = new JLabel(String.valueOf(hrgperstn));
                        hrgstn.setBounds(200, 135, 80, 20);
                        struk2.add(hrgstn);

                        JLabel talhar = new JLabel(String.valueOf(total1));
                        talhar.setBounds(280, 135, 100, 20);
                        struk2.add(talhar);

                        String barang1;
                        barang1 = (String) listbarang1.getSelectedItem();
                        JLabel lbarang1 = new JLabel(barang1);
                        lbarang1.setBounds(30, 165, 100, 20);
                        struk2.add(lbarang1);

                        int jmlbarang1;
                        jmlbarang1 = Integer.parseInt(txtbeli1.getText());
                        JLabel strjmlbrg1 = new JLabel(String.valueOf(jmlbarang1));
                        strjmlbrg1.setBounds(138, 165, 30, 20);
                        struk2.add(strjmlbrg1);

                        int hrgperstn1;
                        hrgperstn1 = Integer.parseInt(txtharga1.getText());
                        JLabel hrgstn1 = new JLabel(String.valueOf(hrgperstn1));
                        hrgstn1.setBounds(200, 165, 80, 20);
                        struk2.add(hrgstn1);

                        JLabel talhar1 = new JLabel(String.valueOf(total2));
                        talhar1.setBounds(280, 165, 100, 20);
                        struk2.add(talhar1);

                        String barang2;
                        barang2 = (String) listbarang2.getSelectedItem();
                        JLabel lbarang2 = new JLabel(barang2);
                        lbarang2.setBounds(30, 195, 100, 20);
                        struk2.add(lbarang2);

                        int jmlbarang2;
                        jmlbarang2 = Integer.parseInt(txtbeli2.getText());
                        JLabel strjmlbrg2 = new JLabel(String.valueOf(jmlbarang2));
                        strjmlbrg2.setBounds(138, 195, 30, 20);
                        struk2.add(strjmlbrg2);

                        int hrgperstn2;
                        hrgperstn2 = Integer.parseInt(txtharga2.getText());
                        JLabel hrgstn2 = new JLabel(String.valueOf(hrgperstn2));
                        hrgstn2.setBounds(200, 195, 80, 20);
                        struk2.add(hrgstn2);

                        JLabel talhar2 = new JLabel(String.valueOf(total3));
                        talhar2.setBounds(280, 195, 100, 20);
                        struk2.add(talhar2);

                        JLabel strep2 = new JLabel("-".repeat(80));
                        strep2.setBounds(30, 225, 400, 30);
                        struk2.add(strep2);

                        JLabel totaltransaksi = new JLabel("Total Transaksi");
                        totaltransaksi.setBounds(150, 255, 90, 20);
                        struk2.add(totaltransaksi);
                        JLabel total = new JLabel(String.valueOf(total1 + total2 + total3));
                        total.setBounds(280, 255, 90, 20);
                        struk2.add(total);

                        JLabel Labtunai = new JLabel("Total Bayar");
                        Labtunai.setBounds(150, 285, 90, 20);
                        struk2.add(Labtunai);
                        int tunai;
                        tunai = Integer.parseInt(txtbayar.getText());
                        JLabel tunai1 = new JLabel(String.valueOf(tunai));
                        tunai1.setBounds(280, 285, 90, 20);
                        struk2.add(tunai1);

                        JLabel Labkembali = new JLabel("Kembalian");
                        Labkembali.setBounds(150, 315, 90, 20);
                        struk2.add(Labkembali);
                        JLabel kembali = new JLabel(String.valueOf(tunai - (total1 + total2 + total3)));
                        kembali.setBounds(280, 315, 90, 20);
                        struk2.add(kembali);

                        struk2.setLayout(null);
                        struk2.setVisible(true);
                        break;
                }
            }
        });
    }
}
