import java.util.ArrayList;

public class DotComTestDrive {
    public static void main(String[] args) {
        DotCom d = new DotCom();
        ArrayList<String> locations = new ArrayList<>(); // Corrigido para criar um ArrayList
        locations.add("william");
        locations.add("cesar");
        locations.add("silva");
        locations.add("de");
        locations.add("carvalho");

        d.setLocationCells(locations);

        System.out.println(d.checkYourself("will"));    // Deve retornar "miss"
        System.out.println(d.checkYourself("william")); // Deve retornar "hit" ou "kill"
    }
}

class DotCom {
    private ArrayList<String> locationCells;

    public void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }

    public String checkYourself(String userInput) {
        String result = "miss";

        int index = locationCells.indexOf(userInput);
        if (index >= 0) { // Verifica se o índice é válido
            locationCells.remove(index); // Remove o elemento encontrado

            if (locationCells.isEmpty()) {
                result = "kill";
            } else {
                result = "hit";
            }
        }
        return result;
    }
}

