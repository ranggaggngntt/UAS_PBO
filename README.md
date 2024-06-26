# Dokumentasi Fungsi Pencarian Pegawai

## Tujuan

Menyediakan cara bagi pengguna untuk mencari data pegawai berdasarkan nama (parsial match) melalui antarmuka `FormCariPegawai`.

## Komponen yang Terlibat

### View (`FormCariPegawai`)

* **Deskripsi:** Antarmuka pengguna yang menampilkan form pencarian dan hasil pencarian pegawai.
* **Komponen Penting:**
    * `txtCariNama`: Field input teks untuk memasukkan kata kunci pencarian.
    * `btnCari`: Tombol untuk memicu aksi pencarian.
    * `tblCariPegawai`: Tabel untuk menampilkan hasil pencarian pegawai.
* **Method:**
    * `getTblCariPegawai()`: Mengembalikan referensi ke tabel `tblCariPegawai`.

### Controller (`controllerCariPegawai`)

* **Deskripsi:** Mengatur logika pencarian dan interaksi antara view dan model.
* **Method:**
    * `cariData(String keyword)`:
        1. Menerima kata kunci pencarian dari `FormCariPegawai`.
        2. Memanggil `daoPegawai.cariData(keyword)` untuk mendapatkan data pegawai yang cocok.
        3. Mengirim hasil pencarian ke `FormCariPegawai` untuk ditampilkan.
    * `update_tabel(List<Pegawai> listPeg)`:
        1. Menerima daftar pegawai (`listPeg`) dari hasil pencarian.
        2. Membuat objek `tabelModelPegawai` dari `listPeg`.
        3. Mengatur model tabel `tblCariPegawai` di `FormCariPegawai` dengan `tabelModelPegawai`.

### DAO (`daoPegawai`)

* **Deskripsi:** Berinteraksi dengan database untuk mengambil data pegawai.
* **Method:**
    * `cariData(String keyword)`:
        1. Menerima kata kunci pencarian.
        2. Melakukan query SQL dengan klausa `LIKE` untuk mencari pegawai berdasarkan nama yang mengandung kata kunci.
        3. Mengembalikan daftar objek `Pegawai` yang sesuai.

### Model (`Pegawai`)

* **Deskripsi:** Merepresentasikan data seorang pegawai.
* **Atribut:** (sesuai kebutuhan, minimal `kodepeg` dan `namapeg`)

## Alur Kerja

1. **Input Pengguna:** Pengguna memasukkan kata kunci pencarian pada `txtCariNama` di `FormCariPegawai` dan menekan `btnCari`.
2. **Pemanggilan Controller:** `FormCariPegawai` memanggil method `cariData(keyword)` pada `controllerCariPegawai`.
3. **Pencarian Data:** `controllerCariPegawai` memanggil `daoPegawai.cariData(keyword)` untuk mendapatkan data pegawai yang cocok.
4. **Pengolahan Hasil:** `controllerCariPegawai` menerima hasil pencarian dari `daoPegawai` dalam bentuk `List<Pegawai>`.
5. **Pembaruan Tampilan:** `controllerCariPegawai` memanggil `update_tabel(hasilPencarian)` untuk memperbarui isi tabel `tblCaripegawai` di `FormCariPegawai` dengan data pegawai yang ditemukan.
