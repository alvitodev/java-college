package P06_Multidimension_Array;

public class StringTabel {
    public static void main(String[] args) {
        String data[][] = {{"ABDUL","085646668991","Kediri"},
                           {"KUSNO","085646668992","Trenggalek"},
                           {"PONIRAN", "085646668999", "Bojonegoro"}};
        System.out.println("------------------------------------------------");
        System.out.printf("| %-10s | %-15s | %-13s |\n","NAMA","ALAMAT","TELEPON");
        System.out.println("------------------------------------------------");
        for (int i = 0; i < data.length; i++) {
            String[] baris = data[i];
            System.out.printf("| %-10s | %-15s | %-13s |\n", baris[0], baris[2], baris[1]);
        }
        System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
    }
}