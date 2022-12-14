package leetcode.Math;

public class Bit_reverse {

    public void reverse(int X) {

        long reverse = 0;
        for (int i = 0; i < 32; i++) {
            reverse = reverse << 1;

            // push 1 whenever x has bit 1
            if ((X & 1) != 0) {
                reverse++;

            }
            X = X >> 1;

        }
        System.out.println(reverse);
    }
}