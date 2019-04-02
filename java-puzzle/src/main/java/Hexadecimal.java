public class Hexadecimal {
    public static void main(String[] args) {
        System.out.println(0xa);
        System.out.println(0xb);
        System.out.println(0xa + 0xb);
        System.out.println(0xcafebabe);//sonucu -889275714 çünkü buradaki sayı int'in boyutuna sığmadığı için overflow oluyor.
        System.out.println(Long.toHexString(0x100000000L + 0xcafebabe));//sonucun 1cafebabe olması beklenir ama sonuc cafebabe'dir.
    }
}
