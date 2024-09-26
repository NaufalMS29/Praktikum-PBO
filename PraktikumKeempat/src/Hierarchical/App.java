package Hierarchical;

public class App {
        public static void main(String[] args) {
        // implementasi hierarchichal inheritance
        Karyawan wahyu = new Karyawan("Wahyu");
        Dosen amir = new Dosen("Amir Murtako");
        Staff melan = new Staff("Melan");

        wahyu.kerja();
        amir.kerja();
        melan.kerja();
    }
}
