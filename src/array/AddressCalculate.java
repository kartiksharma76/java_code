package array;

public class AddressCalculate {
    public static void main(String[] args) {
        int baseAddress = 100;
        int sizeEl = 4;
        int row = 8;
        int col = 10;

        int i = 4;
        int j = 12;
        int lowerRowlimit = 2;
        int lowerCollimit = 9;

        int  Address = baseAddress + (j - lowerCollimit) + row + (i - lowerRowlimit) + sizeEl;
        System.out.println("Address of Z1(4,12) is :" + Address);
    }
}
