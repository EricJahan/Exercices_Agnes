package tamagotchi;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author eric
 */
public class CustomDialog extends JDialog {

    private JPanel myPanel = null;
    private JButton yesButton = null;
    private JButton noButton = null;

    public CustomDialog(JFrame frame, boolean modal, String myMessage) {
        super(frame, modal);
        myPanel = new JPanel();
        getContentPane().add(myPanel);
        myPanel.add(new JLabel(myMessage));
        yesButton = new JButton("Confirmer");
        myPanel.add(yesButton);
        yesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setVisible(false);
            }
        });
        //noButton = new JButton("No");
        //myPanel.add(noButton);
        pack();
        //setLocationRelativeTo(frame);
        setLocation(500, 500); // <--
        //setVisible(true);
        
    }
}
