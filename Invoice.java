public class Invoice implements Payable { // Mendefinisikan kelas Invoice yang mengimplementasikan interface Payable
    private int quantity; // Atribut untuk menyimpan jumlah barang, bertipe integer
    private int pricePerItem; // Atribut untuk menyimpan harga per barang, bertipe integer

    public Invoice(int quantity, int pricePerItem) { // Konstruktor untuk menginisialisasi quantity dan pricePerItem
        this.quantity = quantity; // Menyimpan nilai parameter quantity ke atribut quantity
        this.pricePerItem = pricePerItem; // Menyimpan nilai parameter pricePerItem ke atribut pricePerItem
    }

    public double getPayableAmount() { // Implementasi metode getPayableAmount() dari interface Payable
        return quantity * pricePerItem; // Mengembalikan total harga dengan mengalikan jumlah barang (quantity) dengan harga per barang (pricePerItem)
    }
}