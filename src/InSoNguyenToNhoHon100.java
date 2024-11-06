public class InSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        // In ra các số nguyên tố nhỏ hơn 100
        for (int N = 2; N < 100; N++) {
            if (isPrime(N)) {
                System.out.print(N + " ");
            }
        }
    }

    // Hàm kiểm tra một số có phải là số nguyên tố hay không
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
