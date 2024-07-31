public class Second {
    public static void main(String[] args) {
        int x = -100;
        if (x / 10 == 0) {
            if (x > 0) {
                System.out.println("число однозначное положительное");
            } else {
                System.out.println("число одназначное отрицательное");
            }
        } else {
            if (x / 100 == 0) {
                if (x > 0) {
                    System.out.println("число двузначное положительное");
                } else {
                    System.out.println("число двузначное отрицательное");
                }
            } else {
                if (x > 0) {
                    System.out.println("Число положительное явно больше двузначного");
                } else {
                    System.out.println("число отрицательное явно больше двузначного");
                }
            }
        }
    }

}



