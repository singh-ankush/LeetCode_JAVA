class AddDigits {
    public static int addDigits(int num) {

        String str = String.valueOf(num);
        String[] parts = str.split("");

        int[] arr = new int[parts.length];
        int sum = 0;

        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i]);
            sum += arr[i];
        }

        return sum;
    }

    public static void main(String[] args){
        System.out.println(addDigits(345));
    }
}
