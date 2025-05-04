public class Employee implements Payable { // Mendefinisikan kelas Employee yang mengimplementasikan interface Payable
    private int registrationNumber; // Atribut untuk menyimpan nomor registrasi karyawan, bertipe integer
    private String name; // Atribut untuk menyimpan nama karyawan, bertipe String
    private int salaryPerMonth; // Atribut untuk menyimpan gaji per bulan karyawan, bertipe integer
    private Invoice[] invoices; // Atribut untuk menyimpan daftar invoice (belanjaan) karyawan, bertipe array Invoice

    public Employee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices) { // Konstruktor untuk menginisialisasi atribut-atribut
        this.registrationNumber = registrationNumber; // Menyimpan nilai parameter registrationNumber ke atribut
        this.name = name; // Menyimpan nilai parameter name ke atribut
        this.salaryPerMonth = salaryPerMonth; // Menyimpan nilai parameter salaryPerMonth ke atribut
        this.invoices = invoices; // Menyimpan nilai parameter invoices ke atribut
    }

    public double getPayableAmount() { // Implementasi metode getPayableAmount() dari interface Payable
        double totalInvoices = 0; // Variabel untuk menyimpan total harga semua invoice
        for (Invoice invoice : invoices) { // Perulangan untuk menghitung total harga dari semua invoice
            totalInvoices += invoice.getPayableAmount(); // Menambahkan harga setiap invoice ke totalInvoices
        }
        return salaryPerMonth - totalInvoices; // Mengembalikan gaji bersih dengan mengurangi gaji per bulan dengan total belanjaan
    }

    public String toString() { // Metode untuk menampilkan informasi karyawan dalam bentuk String
        return "Employee [registrationNumber=" + registrationNumber + ", name=" + name + 
               ", salaryPerMonth=" + salaryPerMonth + ", payableAmount=" + getPayableAmount() + "]"; // Mengembalikan string yang berisi informasi karyawan
    }
}