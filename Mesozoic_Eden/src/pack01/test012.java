package pack01;

public class test012 {

    public static void main(String[] args) {
        int nLetters = 0;
        String name = "Susan";

        nLetters = switch (name) {
            case "Jane", "Sean", "Alan", "Paul" -> 4;
            case "Janet", "Susan" -> 5;
            case "Maaike", "Alison", "Miriam" -> 6;
            default -> {
                System.out.println("Unrecognized name: " + name);
                yield -1; // 'nLetters' 가 -1로 초기화 된다.
            }
        };

        System.out.println(nLetters);

        System.out.println(switch (name) {
            case "Jane", "Sean", "Alan", "Paul" -> 4;
            case "Janet", "Susan" -> 5;
            case "Maaike", "Alison", "Miriam" -> 6;
            default -> "Unrecognized name: " + name;
        });
    }
}


