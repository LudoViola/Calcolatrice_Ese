import GUI.CalcolatriceGUI;
import calcolatriceModel.Calcolatrice;

public class Test {
    public static void main(String[] args) {
        Calcolatrice calcolatrice = new Calcolatrice();
        CalcolatriceGUI calcolatriceGUI = new CalcolatriceGUI("Calcolatrice Tascabile", calcolatrice);
        calcolatriceGUI.setVisible(true);
    }
}
