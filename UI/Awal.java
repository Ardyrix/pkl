package UI;

import Java.*;

public class Awal extends javax.swing.JFrame {

    Connect connection;

    public Awal() {
        initComponents();
//        ext script
        connection = new Connect();
        this.setExtendedState(Awal.MAXIMIZED_BOTH);
    }

    public Awal(boolean rootPaneChecking) {//dont delete this
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Master = new javax.swing.JMenu();
        Pegawai = new javax.swing.JMenuItem();
        Supplier = new javax.swing.JMenuItem();
        Salesman = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        Customer = new javax.swing.JMenuItem();
        TOP = new javax.swing.JMenuItem();
        Kelompok = new javax.swing.JMenuItem();
        Konversi = new javax.swing.JMenuItem();
        Akun = new javax.swing.JMenuItem();
        Rekening = new javax.swing.JMenuItem();
        Kebijakan = new javax.swing.JMenuItem();
        Barang = new javax.swing.JMenuItem();
        SetHargaBarang = new javax.swing.JMenuItem();
        BarangDatang = new javax.swing.JMenuItem();
        Group = new javax.swing.JMenuItem();
        BarangHabis = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        MutasiAntarGudang = new javax.swing.JMenuItem();
        MutasiAntarKode = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        Pembelian = new javax.swing.JMenu();
        Transaksi = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        Hutang = new javax.swing.JMenuItem();
        HutangBG = new javax.swing.JMenuItem();
        LaporanPelunasan = new javax.swing.JMenuItem();
        LaporanFaktur = new javax.swing.JMenuItem();
        BayarReturn = new javax.swing.JMenuItem();
        LaporanReturn = new javax.swing.JMenuItem();
        Penjualan = new javax.swing.JMenu();
        Order = new javax.swing.JMenuItem();
        Penjuallan = new javax.swing.JMenuItem();
        RevisiPenjualan = new javax.swing.JMenuItem();
        HasilRevisiPenjualan = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        Piutang = new javax.swing.JMenuItem();
        PiutangBG = new javax.swing.JMenuItem();
        LaporanPenjualan = new javax.swing.JMenuItem();
        Return = new javax.swing.JMenuItem();
        LaporanRetur = new javax.swing.JMenuItem();
        Sales = new javax.swing.JMenu();
        Tagihan = new javax.swing.JMenuItem();
        HistoryTagihan = new javax.swing.JMenuItem();
        Omzet = new javax.swing.JMenuItem();
        Komisi = new javax.swing.JMenuItem();
        Denda = new javax.swing.JMenuItem();
        Toko = new javax.swing.JMenu();
        Transaksii = new javax.swing.JMenuItem();
        ReturTransaksi = new javax.swing.JMenuItem();
        LaporanToko = new javax.swing.JMenuItem();
        MasterTransaksi = new javax.swing.JMenu();
        Transaksiii = new javax.swing.JMenuItem();
        LaporanTransaksi = new javax.swing.JMenuItem();
        RugiLaba = new javax.swing.JMenuItem();
        SaldoKeuangan = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem8 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem9 = new javax.swing.JMenuItem();
        ProfilAdmin = new javax.swing.JMenu();
        UbahProfil = new javax.swing.JMenuItem();
        Logout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setPreferredSize(new java.awt.Dimension(640, 480));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(703, 703));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setAlignmentX(1.0F);
        jMenuBar1.setAlignmentY(2.0F);
        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuBar1.setMinimumSize(new java.awt.Dimension(29, 41));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(481, 38));

        Master.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/bullet-arrow-down-icon.png"))); // NOI18N
        Master.setText("Master");
        Master.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Master.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Master.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        Pegawai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/checked.png"))); // NOI18N
        Pegawai.setText("Pegawai");
        Pegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PegawaiActionPerformed(evt);
            }
        });
        Master.add(Pegawai);

        Supplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/checked.png"))); // NOI18N
        Supplier.setText("Supplier");
        Supplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupplierActionPerformed(evt);
            }
        });
        Master.add(Supplier);

        Salesman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/checked.png"))); // NOI18N
        Salesman.setText("Salesman");
        Salesman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalesmanActionPerformed(evt);
            }
        });
        Master.add(Salesman);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/checked.png"))); // NOI18N
        jMenuItem2.setText("Laporan Kunjungan");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        Master.add(jMenuItem2);

        Customer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/checked.png"))); // NOI18N
        Customer.setText("Customer");
        Customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerActionPerformed(evt);
            }
        });
        Master.add(Customer);

        TOP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/checked.png"))); // NOI18N
        TOP.setText("TOP");
        TOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TOPActionPerformed(evt);
            }
        });
        Master.add(TOP);

        Kelompok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/checked.png"))); // NOI18N
        Kelompok.setText("Kelompok");
        Kelompok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KelompokActionPerformed(evt);
            }
        });
        Master.add(Kelompok);

        Konversi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/checked.png"))); // NOI18N
        Konversi.setText("Konversi");
        Konversi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KonversiActionPerformed(evt);
            }
        });
        Master.add(Konversi);

        Akun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/checked.png"))); // NOI18N
        Akun.setText("Akun");
        Akun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AkunActionPerformed(evt);
            }
        });
        Master.add(Akun);

        Rekening.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/checked.png"))); // NOI18N
        Rekening.setText("Rekening");
        Rekening.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RekeningActionPerformed(evt);
            }
        });
        Master.add(Rekening);

        Kebijakan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/checked.png"))); // NOI18N
        Kebijakan.setText("Kebijakan");
        Kebijakan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KebijakanActionPerformed(evt);
            }
        });
        Master.add(Kebijakan);

        Barang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/checked.png"))); // NOI18N
        Barang.setText("Barang");
        Barang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BarangActionPerformed(evt);
            }
        });
        Master.add(Barang);

        SetHargaBarang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/checked.png"))); // NOI18N
        SetHargaBarang.setText("Set Harga Barang");
        SetHargaBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetHargaBarangActionPerformed(evt);
            }
        });
        Master.add(SetHargaBarang);

        BarangDatang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/checked.png"))); // NOI18N
        BarangDatang.setText("Barang Datang");
        BarangDatang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BarangDatangActionPerformed(evt);
            }
        });
        Master.add(BarangDatang);

        Group.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/checked.png"))); // NOI18N
        Group.setText("Group");
        Group.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GroupActionPerformed(evt);
            }
        });
        Master.add(Group);

        BarangHabis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/checked.png"))); // NOI18N
        BarangHabis.setText("Barang Habis");
        BarangHabis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BarangHabisActionPerformed(evt);
            }
        });
        Master.add(BarangHabis);

        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/checked.png"))); // NOI18N
        jMenuItem10.setText("Koreksi Ketersediaan Barang");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        Master.add(jMenuItem10);

        MutasiAntarGudang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/checked.png"))); // NOI18N
        MutasiAntarGudang.setText("Mutasi Antar Gudang");
        MutasiAntarGudang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MutasiAntarGudangActionPerformed(evt);
            }
        });
        Master.add(MutasiAntarGudang);

        MutasiAntarKode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/checked.png"))); // NOI18N
        MutasiAntarKode.setText("Mutasi Antar Kode");
        MutasiAntarKode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MutasiAntarKodeActionPerformed(evt);
            }
        });
        Master.add(MutasiAntarKode);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/checked.png"))); // NOI18N
        jMenuItem5.setText("Mutasi Antar Gudang By Permintaan");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        Master.add(jMenuItem5);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/checked.png"))); // NOI18N
        jMenuItem6.setText("Permintaan Mutasi Antar Gudang");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        Master.add(jMenuItem6);

        jMenuBar1.add(Master);

        Pembelian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/bullet-arrow-down-icon.png"))); // NOI18N
        Pembelian.setText("Pembelian");
        Pembelian.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Pembelian.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Pembelian.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        Transaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/checked.png"))); // NOI18N
        Transaksi.setText("Transaksi");
        Transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransaksiActionPerformed(evt);
            }
        });
        Pembelian.add(Transaksi);

        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/checked.png"))); // NOI18N
        jMenuItem11.setText("Target Pembelian");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        Pembelian.add(jMenuItem11);

        Hutang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/checked.png"))); // NOI18N
        Hutang.setText("Hutang");
        Hutang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HutangActionPerformed(evt);
            }
        });
        Pembelian.add(Hutang);

        HutangBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/checked.png"))); // NOI18N
        HutangBG.setText("Hutang BG");
        HutangBG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HutangBGActionPerformed(evt);
            }
        });
        Pembelian.add(HutangBG);

        LaporanPelunasan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/checked.png"))); // NOI18N
        LaporanPelunasan.setText("Laporan Pelunasan");
        LaporanPelunasan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LaporanPelunasanActionPerformed(evt);
            }
        });
        Pembelian.add(LaporanPelunasan);

        LaporanFaktur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/checked.png"))); // NOI18N
        LaporanFaktur.setText("Laporan Faktur");
        LaporanFaktur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LaporanFakturActionPerformed(evt);
            }
        });
        Pembelian.add(LaporanFaktur);

        BayarReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/checked.png"))); // NOI18N
        BayarReturn.setText("Retur Pembelian");
        BayarReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BayarReturnActionPerformed(evt);
            }
        });
        Pembelian.add(BayarReturn);

        LaporanReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/checked.png"))); // NOI18N
        LaporanReturn.setText("Laporan Retur");
        LaporanReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LaporanReturnActionPerformed(evt);
            }
        });
        Pembelian.add(LaporanReturn);

        jMenuBar1.add(Pembelian);

        Penjualan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/bullet-arrow-down-icon.png"))); // NOI18N
        Penjualan.setText("Penjualan");
        Penjualan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Penjualan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Penjualan.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        Order.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/checked.png"))); // NOI18N
        Order.setText("Order");
        Order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderActionPerformed(evt);
            }
        });
        Penjualan.add(Order);

        Penjuallan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/checked.png"))); // NOI18N
        Penjuallan.setText("Penjualan");
        Penjuallan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PenjuallanActionPerformed(evt);
            }
        });
        Penjualan.add(Penjuallan);

        RevisiPenjualan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/checked.png"))); // NOI18N
        RevisiPenjualan.setText("Revisi Penjualan");
        RevisiPenjualan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RevisiPenjualanActionPerformed(evt);
            }
        });
        Penjualan.add(RevisiPenjualan);

        HasilRevisiPenjualan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/checked.png"))); // NOI18N
        HasilRevisiPenjualan.setText("Hasil Revisi Penjualan");
        HasilRevisiPenjualan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HasilRevisiPenjualanActionPerformed(evt);
            }
        });
        Penjualan.add(HasilRevisiPenjualan);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/checked.png"))); // NOI18N
        jMenuItem4.setText("Cetak Bon Gudang");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        Penjualan.add(jMenuItem4);

        Piutang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/checked.png"))); // NOI18N
        Piutang.setText("Piutang");
        Piutang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PiutangActionPerformed(evt);
            }
        });
        Penjualan.add(Piutang);

        PiutangBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/checked.png"))); // NOI18N
        PiutangBG.setText("Piutang BG");
        PiutangBG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PiutangBGActionPerformed(evt);
            }
        });
        Penjualan.add(PiutangBG);

        LaporanPenjualan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/checked.png"))); // NOI18N
        LaporanPenjualan.setText("Laporan Penjualan");
        LaporanPenjualan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LaporanPenjualanActionPerformed(evt);
            }
        });
        Penjualan.add(LaporanPenjualan);

        Return.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/checked.png"))); // NOI18N
        Return.setText("Retur");
        Return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnActionPerformed(evt);
            }
        });
        Penjualan.add(Return);

        LaporanRetur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/checked.png"))); // NOI18N
        LaporanRetur.setText("Laporan Retur");
        LaporanRetur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LaporanReturActionPerformed(evt);
            }
        });
        Penjualan.add(LaporanRetur);

        jMenuBar1.add(Penjualan);

        Sales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/bullet-arrow-down-icon.png"))); // NOI18N
        Sales.setText("Sales");
        Sales.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Sales.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Sales.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        Tagihan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/checked.png"))); // NOI18N
        Tagihan.setText("Tagihan");
        Tagihan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TagihanActionPerformed(evt);
            }
        });
        Sales.add(Tagihan);

        HistoryTagihan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/checked.png"))); // NOI18N
        HistoryTagihan.setText("History Tagihan");
        HistoryTagihan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistoryTagihanActionPerformed(evt);
            }
        });
        Sales.add(HistoryTagihan);

        Omzet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/checked.png"))); // NOI18N
        Omzet.setText("Omzet");
        Omzet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OmzetActionPerformed(evt);
            }
        });
        Sales.add(Omzet);

        Komisi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/checked.png"))); // NOI18N
        Komisi.setText("Komisi");
        Komisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KomisiActionPerformed(evt);
            }
        });
        Sales.add(Komisi);

        Denda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/checked.png"))); // NOI18N
        Denda.setText("Denda");
        Denda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DendaActionPerformed(evt);
            }
        });
        Sales.add(Denda);

        jMenuBar1.add(Sales);

        Toko.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/bullet-arrow-down-icon.png"))); // NOI18N
        Toko.setText("Toko");
        Toko.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Toko.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        Transaksii.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/checked.png"))); // NOI18N
        Transaksii.setText("Transaksi");
        Transaksii.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransaksiiActionPerformed(evt);
            }
        });
        Toko.add(Transaksii);

        ReturTransaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/checked.png"))); // NOI18N
        ReturTransaksi.setText("Return Transaksi");
        ReturTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturTransaksiActionPerformed(evt);
            }
        });
        Toko.add(ReturTransaksi);

        LaporanToko.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/checked.png"))); // NOI18N
        LaporanToko.setText("Laporan Toko");
        LaporanToko.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LaporanTokoActionPerformed(evt);
            }
        });
        Toko.add(LaporanToko);

        jMenuBar1.add(Toko);

        MasterTransaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/bullet-arrow-down-icon.png"))); // NOI18N
        MasterTransaksi.setText("Master Transaksi");
        MasterTransaksi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        MasterTransaksi.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        Transaksiii.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/checked.png"))); // NOI18N
        Transaksiii.setText("Transaksi");
        Transaksiii.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransaksiiiActionPerformed(evt);
            }
        });
        MasterTransaksi.add(Transaksiii);

        LaporanTransaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/checked.png"))); // NOI18N
        LaporanTransaksi.setText("Laporan Transaksi");
        LaporanTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LaporanTransaksiActionPerformed(evt);
            }
        });
        MasterTransaksi.add(LaporanTransaksi);

        RugiLaba.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/checked.png"))); // NOI18N
        RugiLaba.setText("Rugi Laba");
        RugiLaba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RugiLabaActionPerformed(evt);
            }
        });
        MasterTransaksi.add(RugiLaba);

        SaldoKeuangan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/checked.png"))); // NOI18N
        SaldoKeuangan.setText("Saldo Keuangan");
        SaldoKeuangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaldoKeuanganActionPerformed(evt);
            }
        });
        MasterTransaksi.add(SaldoKeuangan);

        jMenuBar1.add(MasterTransaksi);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/bullet-arrow-down-icon.png"))); // NOI18N
        jMenu1.setText("Laporan");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenu1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/checked.png"))); // NOI18N
        jMenuItem7.setText("Tutup Transaksi Harian");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);
        jMenu1.add(jSeparator1);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/checked.png"))); // NOI18N
        jMenuItem1.setText("Pembelian");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/checked.png"))); // NOI18N
        jMenuItem3.setText("Penjualan");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);
        jMenu1.add(jSeparator2);

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/checked.png"))); // NOI18N
        jMenuItem8.setText("Persediaan");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);
        jMenu1.add(jSeparator3);

        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/checked.png"))); // NOI18N
        jMenuItem9.setText("Keuangan");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem9);

        jMenuBar1.add(jMenu1);

        ProfilAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/bullet-arrow-down-icon.png"))); // NOI18N
        ProfilAdmin.setText("Profil Admin");
        ProfilAdmin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ProfilAdmin.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ProfilAdmin.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        UbahProfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/user.png"))); // NOI18N
        UbahProfil.setText("Ubah Profil");
        UbahProfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UbahProfilActionPerformed(evt);
            }
        });
        ProfilAdmin.add(UbahProfil);

        Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/cancel (3).png"))); // NOI18N
        Logout.setText("Logout");
        ProfilAdmin.add(Logout);

        jMenuBar1.add(ProfilAdmin);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void OrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderActionPerformed
        Penjualan_Order po = new Penjualan_Order();
        po.setVisible(true);
        po.setFocusable(true);
    }//GEN-LAST:event_OrderActionPerformed

    private void PenjuallanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PenjuallanActionPerformed
        Penjualan_Penjualan pp = new Penjualan_Penjualan();
        pp.setVisible(true);
        pp.setLocationRelativeTo(null);
    }//GEN-LAST:event_PenjuallanActionPerformed

    private void PegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PegawaiActionPerformed
        Master_Pegawai pg = new Master_Pegawai(this, rootPaneCheckingEnabled, connection);
        pg.setLocationRelativeTo(this);
        pg.setVisible(true);
//        System.out.println("jalan");
//        pg.setFocusable(true);
    }//GEN-LAST:event_PegawaiActionPerformed

    private void RevisiPenjualanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RevisiPenjualanActionPerformed
        Penjualan_RevisiPenjualan pr = new Penjualan_RevisiPenjualan();
        pr.setVisible(true);
        pr.setFocusable(true);
    }//GEN-LAST:event_RevisiPenjualanActionPerformed

    private void HasilRevisiPenjualanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HasilRevisiPenjualanActionPerformed
        Penjualan_HasilRevisiPenjualan ppf = new Penjualan_HasilRevisiPenjualan();
        ppf.setVisible(true);
        ppf.setFocusable(true);
    }//GEN-LAST:event_HasilRevisiPenjualanActionPerformed

    private void PiutangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PiutangActionPerformed
        Penjualan_Piutang pp = new Penjualan_Piutang();
        pp.setVisible(true);
        pp.setFocusable(true);
    }//GEN-LAST:event_PiutangActionPerformed

    private void PiutangBGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PiutangBGActionPerformed
        Penjualan_PiutangBG ppb = new Penjualan_PiutangBG();
        ppb.setVisible(true);
        ppb.setFocusable(true);
    }//GEN-LAST:event_PiutangBGActionPerformed

    private void LaporanPenjualanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LaporanPenjualanActionPerformed
        Penjualan_LaporanPenjualan plp = new Penjualan_LaporanPenjualan();
        plp.setVisible(true);
        plp.setFocusable(true);
    }//GEN-LAST:event_LaporanPenjualanActionPerformed

    private void ReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnActionPerformed
//        Penjualan_ReturPenjualan rp = new Penjualan_ReturPenjualan(this, rootPaneCheckingEnabled, connection);
//        rp.setLocationRelativeTo(this);
//        rp.setVisible(true);
    }//GEN-LAST:event_ReturnActionPerformed

    private void LaporanReturActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LaporanReturActionPerformed
        Penjualan_LaporanReturn plr = new Penjualan_LaporanReturn(this, rootPaneCheckingEnabled, connection);
        plr.setVisible(true);
        plr.setFocusable(true);
    }//GEN-LAST:event_LaporanReturActionPerformed

    private void TagihanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TagihanActionPerformed
        Sales_Tagihan st = new Sales_Tagihan();
        st.setVisible(true);
        st.setFocusable(true);
    }//GEN-LAST:event_TagihanActionPerformed

    private void HistoryTagihanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistoryTagihanActionPerformed
        Sales_History sh = new Sales_History();
        sh.setVisible(true);
        sh.setFocusable(true);
    }//GEN-LAST:event_HistoryTagihanActionPerformed

    private void OmzetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OmzetActionPerformed
        Sales_Omzet so = new Sales_Omzet();
        so.setVisible(true);
        so.setFocusable(true);
    }//GEN-LAST:event_OmzetActionPerformed

    private void KomisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KomisiActionPerformed
        Sales_Komisi sk = new Sales_Komisi();
        sk.setVisible(true);
        sk.setFocusable(true);
    }//GEN-LAST:event_KomisiActionPerformed

    private void DendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DendaActionPerformed
        Sales_Denda sd = new Sales_Denda();
        sd.setVisible(true);
        sd.setFocusable(true);
    }//GEN-LAST:event_DendaActionPerformed

    private void UbahProfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UbahProfilActionPerformed
        Profil_Ubah pu = new Profil_Ubah();
        pu.setVisible(true);
        pu.setFocusable(true);
    }//GEN-LAST:event_UbahProfilActionPerformed

    private void TransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransaksiActionPerformed
        Pembelian_Transaksi pt = new Pembelian_Transaksi();
        pt.setVisible(true);
        pt.setFocusable(true);
    }//GEN-LAST:event_TransaksiActionPerformed

    private void HutangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HutangActionPerformed
        Pembelian_Hutang h = new Pembelian_Hutang();
        h.setVisible(true);
        h.setLocationRelativeTo(null);
    }//GEN-LAST:event_HutangActionPerformed

    private void HutangBGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HutangBGActionPerformed
        Pembelian_HutangBG hb = new Pembelian_HutangBG();
        hb.setVisible(true);
    }//GEN-LAST:event_HutangBGActionPerformed

    private void LaporanPelunasanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LaporanPelunasanActionPerformed
        Pembelian_LaporanPelunasan lp = new Pembelian_LaporanPelunasan();
        lp.setVisible(true);
        lp.setLocationRelativeTo(null);
    }//GEN-LAST:event_LaporanPelunasanActionPerformed

    private void LaporanFakturActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LaporanFakturActionPerformed
        Pembelian_LaporanFaktur lf = new Pembelian_LaporanFaktur();
        lf.setVisible(true);
        lf.setFocusable(true);
    }//GEN-LAST:event_LaporanFakturActionPerformed

    private void BayarReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BayarReturnActionPerformed
        Pembelian_Return br = new Pembelian_Return();
        br.setVisible(true);
        br.setFocusable(true);
    }//GEN-LAST:event_BayarReturnActionPerformed

    private void LaporanReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LaporanReturnActionPerformed
        Pembelian_LaporanReturn lr = new Pembelian_LaporanReturn();
        lr.setVisible(true);
        lr.setFocusable(true);
    }//GEN-LAST:event_LaporanReturnActionPerformed

    private void SetHargaBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetHargaBarangActionPerformed
        Master_SetHargaBarang2 shb = new Master_SetHargaBarang2(this, rootPaneCheckingEnabled);
        shb.setVisible(true);
        shb.setFocusable(true);
    }//GEN-LAST:event_SetHargaBarangActionPerformed

    private void BarangDatangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BarangDatangActionPerformed
        Master_BarangDatang bd = new Master_BarangDatang();
        bd.setVisible(true);
        bd.setFocusable(true);
    }//GEN-LAST:event_BarangDatangActionPerformed

    private void GroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GroupActionPerformed
        Master_Group g = new Master_Group(connection);

        this.setExtendedState(g.MAXIMIZED_BOTH);
        g.setVisible(true);
        g.setVisible(true);
    }//GEN-LAST:event_GroupActionPerformed

    private void BarangHabisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BarangHabisActionPerformed
        Master_BarangHabis bh = new Master_BarangHabis(this, rootPaneCheckingEnabled, connection);
        bh.setVisible(true);
        bh.setFocusable(true);
    }//GEN-LAST:event_BarangHabisActionPerformed

    private void MutasiAntarGudangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MutasiAntarGudangActionPerformed
        Master_MutasiAntarGudang mag = new Master_MutasiAntarGudang();
        mag.setVisible(true);
        mag.setFocusable(true);
    }//GEN-LAST:event_MutasiAntarGudangActionPerformed

    private void MutasiAntarKodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MutasiAntarKodeActionPerformed
        Master_MutasiAntarKode mak = new Master_MutasiAntarKode();
        mak.setVisible(true);
        mak.setFocusable(true);
    }//GEN-LAST:event_MutasiAntarKodeActionPerformed

    private void TransaksiiiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransaksiiiActionPerformed
        MasterTransaksi_Transaksi mt = new MasterTransaksi_Transaksi();
        mt.setVisible(true);
        mt.setFocusable(true);
    }//GEN-LAST:event_TransaksiiiActionPerformed

    private void LaporanTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LaporanTransaksiActionPerformed
        MasterTransaksi_LaporanTransaksi lt = new MasterTransaksi_LaporanTransaksi();
        lt.setVisible(true);
        lt.setFocusable(true);
    }//GEN-LAST:event_LaporanTransaksiActionPerformed

    private void RugiLabaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RugiLabaActionPerformed
        MasterTransaksi_RugiLaba rl = new MasterTransaksi_RugiLaba();
        rl.setVisible(true);
        rl.setFocusable(true);
    }//GEN-LAST:event_RugiLabaActionPerformed

    private void SaldoKeuanganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaldoKeuanganActionPerformed
        MasterTransaksi_SaldoKeuangan sk = new MasterTransaksi_SaldoKeuangan();
        sk.setVisible(true);
        sk.setFocusable(true);
    }//GEN-LAST:event_SaldoKeuanganActionPerformed

    private void SupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupplierActionPerformed
        Master_Supplier sup = new Master_Supplier(this, rootPaneCheckingEnabled, connection);
        sup.setLocationRelativeTo(this);
        sup.setVisible(true);
    }//GEN-LAST:event_SupplierActionPerformed

    private void SalesmanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalesmanActionPerformed
        Master_Salesman sal = new Master_Salesman(this, rootPaneCheckingEnabled, connection);
        sal.setLocationRelativeTo(this);
        sal.setVisible(true);
    }//GEN-LAST:event_SalesmanActionPerformed

    private void CustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerActionPerformed
        Master_Customer cus = new Master_Customer(this, rootPaneCheckingEnabled, connection);
        cus.setLocationRelativeTo(this);
        cus.setVisible(true);
    }//GEN-LAST:event_CustomerActionPerformed

    private void TOPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TOPActionPerformed
        Master_TOP top = new Master_TOP();
        top.setVisible(true);
        top.setFocusable(true);
    }//GEN-LAST:event_TOPActionPerformed

    private void KelompokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KelompokActionPerformed
        Master_Kelompok x = new Master_Kelompok();
        x.setVisible(true);
        x.setFocusable(true);
    }//GEN-LAST:event_KelompokActionPerformed

    private void KonversiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KonversiActionPerformed
        Master_Konversi x = new Master_Konversi();
        x.setVisible(true);
        x.setFocusable(true);
    }//GEN-LAST:event_KonversiActionPerformed

    private void AkunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AkunActionPerformed
        Master_Akun x = new Master_Akun();
        x.setVisible(true);
        x.setFocusable(true);
    }//GEN-LAST:event_AkunActionPerformed

    private void RekeningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RekeningActionPerformed
        Master_Rekening x = new Master_Rekening();
        x.setVisible(true);
        x.setFocusable(true);
    }//GEN-LAST:event_RekeningActionPerformed

    private void KebijakanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KebijakanActionPerformed
        Master_Kebijakan x = new Master_Kebijakan();
        x.setVisible(true);
        x.setFocusable(true);
    }//GEN-LAST:event_KebijakanActionPerformed

    private void BarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BarangActionPerformed
        Master_Barang x = new Master_Barang(this, rootPaneCheckingEnabled, connection);
        x.setVisible(true);
        x.setFocusable(true);
    }//GEN-LAST:event_BarangActionPerformed

    private void TransaksiiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransaksiiActionPerformed
        Toko_Transaksi2 x = new Toko_Transaksi2();
        x.setLocationRelativeTo(this);
        x.setVisible(true);
    }//GEN-LAST:event_TransaksiiActionPerformed

    private void ReturTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturTransaksiActionPerformed
        Toko_ReturPenjualan x = new Toko_ReturPenjualan();
        x.setLocationRelativeTo(this);
        x.setVisible(true);
    }//GEN-LAST:event_ReturTransaksiActionPerformed

    private void LaporanTokoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LaporanTokoActionPerformed
        Toko_Laporan x = new Toko_Laporan();
        x.setVisible(true);
        x.setFocusable(true);
    }//GEN-LAST:event_LaporanTokoActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
//        Master_LaporanKunjungan lk=new Master_LaporanKunjungan(this, rootPaneCheckingEnabled, connection);
//        lk.setLocationRelativeTo(this);
//        lk.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        Penjualan_CetakBonGudang pcbg = new Penjualan_CetakBonGudang();
        pcbg.setVisible(true);
        pcbg.setFocusable(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        Master_MutasiBarangAntarGudangBerdasarkanPermintaan mbag = new Master_MutasiBarangAntarGudangBerdasarkanPermintaan();
        mbag.setVisible(true);
        mbag.setFocusable(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        Master_Mutasi_PermintaanMutasiAntarGudang pm = new Master_Mutasi_PermintaanMutasiAntarGudang();
        pm.setVisible(true);
        pm.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        Laporan_Tutup_Transaksi_Harian tp = new Laporan_Tutup_Transaksi_Harian();
        tp.setVisible(true);
        tp.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Laporan_Pembelian x = new Laporan_Pembelian();
        x.setVisible(true);
        x.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Laporan_Penjualan x = new Laporan_Penjualan();
        x.setVisible(true);
        x.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        Stok_Koreksi_Ketersediaan_Barang x = new Stok_Koreksi_Ketersediaan_Barang();
        x.setVisible(true);
        x.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        Laporan_Persediaan l = new Laporan_Persediaan();
        l.setVisible(true);
        l.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        Laporan_Keuangan lk = new Laporan_Keuangan();
        lk.setVisible(true);
        lk.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        Pembelian_TargePembelian tp = new Pembelian_TargePembelian();
        tp.setVisible(true);
        tp.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    /**
     * @aparam args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Awal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Awal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Awal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Awal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Awal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Akun;
    private javax.swing.JMenuItem Barang;
    private javax.swing.JMenuItem BarangDatang;
    private javax.swing.JMenuItem BarangHabis;
    private javax.swing.JMenuItem BayarReturn;
    private javax.swing.JMenuItem Customer;
    private javax.swing.JMenuItem Denda;
    private javax.swing.JMenuItem Group;
    private javax.swing.JMenuItem HasilRevisiPenjualan;
    private javax.swing.JMenuItem HistoryTagihan;
    private javax.swing.JMenuItem Hutang;
    private javax.swing.JMenuItem HutangBG;
    private javax.swing.JMenuItem Kebijakan;
    private javax.swing.JMenuItem Kelompok;
    private javax.swing.JMenuItem Komisi;
    private javax.swing.JMenuItem Konversi;
    private javax.swing.JMenuItem LaporanFaktur;
    private javax.swing.JMenuItem LaporanPelunasan;
    private javax.swing.JMenuItem LaporanPenjualan;
    private javax.swing.JMenuItem LaporanRetur;
    private javax.swing.JMenuItem LaporanReturn;
    private javax.swing.JMenuItem LaporanToko;
    private javax.swing.JMenuItem LaporanTransaksi;
    private javax.swing.JMenuItem Logout;
    private javax.swing.JMenu Master;
    private javax.swing.JMenu MasterTransaksi;
    private javax.swing.JMenuItem MutasiAntarGudang;
    private javax.swing.JMenuItem MutasiAntarKode;
    private javax.swing.JMenuItem Omzet;
    private javax.swing.JMenuItem Order;
    private javax.swing.JMenuItem Pegawai;
    private javax.swing.JMenu Pembelian;
    private javax.swing.JMenu Penjualan;
    private javax.swing.JMenuItem Penjuallan;
    private javax.swing.JMenuItem Piutang;
    private javax.swing.JMenuItem PiutangBG;
    private javax.swing.JMenu ProfilAdmin;
    private javax.swing.JMenuItem Rekening;
    private javax.swing.JMenuItem ReturTransaksi;
    private javax.swing.JMenuItem Return;
    private javax.swing.JMenuItem RevisiPenjualan;
    private javax.swing.JMenuItem RugiLaba;
    private javax.swing.JMenuItem SaldoKeuangan;
    private javax.swing.JMenu Sales;
    private javax.swing.JMenuItem Salesman;
    private javax.swing.JMenuItem SetHargaBarang;
    private javax.swing.JMenuItem Supplier;
    private javax.swing.JMenuItem TOP;
    private javax.swing.JMenuItem Tagihan;
    private javax.swing.JMenu Toko;
    private javax.swing.JMenuItem Transaksi;
    private javax.swing.JMenuItem Transaksii;
    private javax.swing.JMenuItem Transaksiii;
    private javax.swing.JMenuItem UbahProfil;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
