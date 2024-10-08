package basics;

public class SpecialNumbers {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // binary, octal, hex

        int oct = 016;
        int bin = 0b1011;
        int hex = 0x18ABF;

        String octStr = "016";
        String binStr = "1011";
        String hexStr = "AA77";

        // converting to decimals
        int decHex = Integer.parseInt(hexStr, 16);
        int decBin = Integer.parseInt(binStr, 2);
        int decOct = Integer.parseInt(octStr, 8);

        System.out.println(decHex);
        System.out.println(decBin);
        System.out.println(decOct);

        int dec = 255;
        // convert to binary
        String binary = Integer.toBinaryString(dec);
        // convert to Octal
        String octal = Integer.toOctalString(dec);
        // convert to hex
        String hexa = Integer.toHexString(dec);

        System.out.println(binary);
        System.out.println(octal);
        System.out.println(hexa);

    }
}
