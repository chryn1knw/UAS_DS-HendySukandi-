import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        String[] arrMahasiswa = { "Hendy", "Lily", "Loki", "Laufey", "Lisa", "Lawliet" };
        Arrays.sort(arrMahasiswa); //array diurutkan sebelum melakukan pencarian binary search

        show("Laufey",iterativeBinarySearch(arrMahasiswa,"Laufey"));
        show("Lisa",iterativeLinearSearch(arrMahasiswa,"Lisa"));
        show("Lorenzo",iterativeLinearSearch(arrMahasiswa,"Lorenzo"));
        show("Loki",recursiveBinarySearch(arrMahasiswa,0, arrMahasiswa.length-1, "Loki"));
        show("Kratoz",recursiveLinearSearch(arrMahasiswa,0, arrMahasiswa.length-1,"kratoz"));
        show("Hendy",recursiveLinearSearch(arrMahasiswa,0, arrMahasiswa.length-1, "Hendy"));
        show("Lincoln",recursiveBinarySearch(arrMahasiswa,0, arrMahasiswa.length-1, "Lincoln"));
        show("Levy",recursiveBinarySearch(arrMahasiswa,0, arrMahasiswa.length-1, "Levy"));
    }
    private static void show(String nama, int result) {
        if (result == -1){
            System.out.println(nama + " tidak ditemukan.");
        } else{
            System.out.println(nama + " ditemukan.");
        }
    }
    public static int iterativeBinarySearch(String[] arr,String nama)
    {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid].equals(nama)){
                return mid;
            } else if (arr[mid].compareTo(nama) < 0){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return -1;
    }
    public static int iterativeLinearSearch(String[] arr,String nama){
        if(arr == null || arr.length == 0){
            return -1;
        }
        if(nama == null || nama.length() == 0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            if (index >= arr.length) {
                return -1;
            }
            if (nama.equals(arr[index])){
                return index;
            }
        }
        return -1;
    }
    public static int recursiveBinarySearch(String[] arr, int start, int end, String nama){
        if(start > end){
            return -1;
        }
        if(start == end){
            if(arr[start].equals(nama)){
                return start;
            }
            else{
                return -1;
            }
        }
        int midpoint = (start + end)/2;
        if(arr[midpoint].equals(nama)){
            return midpoint;
        }
        else if(arr[midpoint].compareTo(nama) < 0){
            return recursiveBinarySearch(arr, midpoint + 1, end, nama);
        }
        else{
            return recursiveBinarySearch(arr, start, midpoint-1, nama);
        }
    }
    public static int recursiveLinearSearch(String[] arr, String nama){
        return recursiveLinearSearch(arr, 0, arr.length, nama);
    }
    public static int recursiveLinearSearch(String[] arr, int start, int end, String nama) {
        if (start > end) {
            return -1;
        }
        if (arr[start].equals(nama)) {
            return start;
        }
        return recursiveLinearSearch(arr, start + 1, end, nama);
    }
}