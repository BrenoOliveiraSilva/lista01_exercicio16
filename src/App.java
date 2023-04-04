import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        double area = 0;
        boolean validInput = false;
        DecimalFormat numberFormat = new DecimalFormat("#.00");

        while (!validInput) {
            String input = JOptionPane.showInputDialog(null, "Informe o tamanho em metros quadrados da área a ser pintada");
            try {
                area = Double.parseDouble(input);
                validInput = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida!");
            }
        }
        double liters = area / 3;
        int paintCan = (int) Math.ceil(liters / 18);
        double paintCanPrice = paintCan * 80;
        if (area > 0) {
            JOptionPane.showMessageDialog(null, "Serao necessárias " + paintCan + " lata(s) de tinta, o custo será de R$ " + numberFormat.format(paintCanPrice));
        } else {
            JOptionPane.showMessageDialog(null, "Entrada inválida!");
        }
    }
}