import javax.swing.*;
import java.io.File;

public class openPDF {
    public static void openById(String id){
        try {
            if ((new File(PharmacyFunction.billpath+"\\"+id+".pdf")).exists()){
                Process p = Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+PharmacyFunction.billpath+"\\"+id+".pdf");
            }
            else {
                JOptionPane.showMessageDialog(null,"File doesn't exists.");
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
}
