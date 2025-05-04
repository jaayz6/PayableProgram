public class PayableProgram { // Mendefinisikan kelas utama PayableProgram
    public static void main(String[] args) { // Metode main, titik masuk program
        Invoice[] invoices = new Invoice[2]; // Membuat array untuk menyimpan 2 objek Invoice
        invoices[0] = new Invoice(3, 50000); // Membuat objek Invoice pertama: 3 barang, harga per barang 50.000
        invoices[1] = new Invoice(2, 30000); // Membuat objek Invoice kedua: 2 barang, harga per barang 30.000

        Employee employee = new Employee(101, "Rojak", 5000000, invoices); // Membuat objek Employee dengan nomor registrasi 101, nama John Doe, gaji 5.000.000, dan daftar invoice
        System.out.println(employee); // Menampilkan informasi karyawan (menggunakan metode toString())
        System.out.println("Total Invoice Amount: " + (invoices[0].getPayableAmount() + invoices[1].getPayableAmount())); // Menampilkan total harga semua invoice
    }
}