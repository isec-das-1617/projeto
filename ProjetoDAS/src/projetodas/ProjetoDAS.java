
package projetodas;

import controller.UserController;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.List;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import model.User;

public class ProjetoDAS extends JApplet {
    
    private static final int JFXPANEL_WIDTH_INT = 300;
    private static final int JFXPANEL_HEIGHT_INT = 250;
    private static JFXPanel fxContainer;
   
    private static UserController ucontrol;
    private User user;
    public static JFrame janela;

    public static void main(String[] args) {
       
        ucontrol = new UserController();
        
        SwingUtilities.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
                } catch (Exception e) {
                }
<<<<<<< 8c2d88637258df01300794922c3a8013956caacd
                JFrame entrance = new RegLogin(ucontrol);
                 janela = new notepad();
                entrance.setVisible(true);
                
               
                //janela.setVisible(true);

=======
                JFrame janela = null;
//                janela = new notepad();
//                janela.setVisible(true);
                janela = new NewJFrameEugenio();
                janela.setVisible(true);
>>>>>>> ace7e7a5590e9103a3154ba1bc0287b844b6f6be
            }
        });
    }
    
    @Override
    public void init() {
        fxContainer = new JFXPanel();
        fxContainer.setPreferredSize(new Dimension(JFXPANEL_WIDTH_INT, JFXPANEL_HEIGHT_INT));
        add(fxContainer, BorderLayout.CENTER);
        // create JavaFX scene
        Platform.runLater(new Runnable() {
            
            @Override
            public void run() {
                createScene();
            }
        });
    }
    
    private void createScene() {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        fxContainer.setScene(new Scene(root));
    }
    
}
