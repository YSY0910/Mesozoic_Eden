package DinoException;
public class P2 {
    private String name;
    private int weight;

    P2(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public void updateDinosaurWeight(String nname, int nweight) {
        try {
            if (nweight <= 0) {
                throw new IllegalArgumentException("공룡의 체중은 0이나 그 이하가 될 수 없다.");
            }
            else if(nweight > 99999){
                throw new IllegalArgumentException("공룡의 무게가 터무니 없이 높다.");
            }
            else {
            	this.name = nname;
                this.weight = nweight;
                System.out.println("공룡 체중 확인 완료: 이름: " + nname + " 체중: " + nweight);
            }
        } catch (IllegalArgumentException a) {
            System.err.println("예외 발생: " + a.getMessage());
        }
    }
    
    public static void main(String[]args) {
    	P2 dino = new P2("공룡1", 1000);
    	dino.updateDinosaurWeight("공룡1", 6500);
    	dino.updateDinosaurWeight("공룡2", 0);
    	dino.updateDinosaurWeight("공룡3", 4000);
    	dino.updateDinosaurWeight("공룡3", 152500);
    }
}
