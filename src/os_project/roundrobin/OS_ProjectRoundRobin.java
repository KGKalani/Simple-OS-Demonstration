/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package os_project.roundrobin;

import de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import view.Task_Manager;

/**
 *
 * @author Amila
 */
public class OS_ProjectRoundRobin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            try {
                String key = null;
                try {
                    key = new String(new byte[]{
                        67, 49, 52, 49, 48, 50, 57, 52, 45, 54, 49, 66, 54, 52, 65, 65,
                        67, 45, 52, 66, 55, 68, 51, 48, 51, 57, 45, 56, 51, 52, 65,
                        56, 50, 65, 49, 45, 51, 55, 69, 53, 68, 54, 57, 53
                    }, "UTF-8");
                } catch (UnsupportedEncodingException ex) {
                    Logger.getLogger(OS_ProjectRoundRobin.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (key != null) {
                    String[] license = {
                        "Licensee=AppWork UG",
                        "LicenseRegistrationNumber=289416475",
                        "Product=Synthetica",
                        "LicenseType=Small Business License",
                        "ExpireDate=--.--.----", "MaxVersion=2.999.999"};
                    UIManager.put("Synthetica.license.info", license);
                    UIManager.put("Synthetica.license.key", key);
                }
                UIManager.setLookAndFeel(new SyntheticaBlackEyeLookAndFeel());
            } catch (ParseException ex) {
                Logger.getLogger(Task_Manager.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Task_Manager.class.getName()).log(Level.SEVERE, null, ex);
        }
        new Task_Manager().setVisible(true);
    }

}
