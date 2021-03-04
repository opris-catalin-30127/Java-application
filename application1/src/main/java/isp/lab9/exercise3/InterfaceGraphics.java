package isp.lab9.exercise3;

import isp.lab9.exercise3.exceptions.TenantAlreadyExistsException;
import isp.lab9.exercise3.exceptions.TooManyAttemptsException;
import isp.lab9.exercise3.exceptions.InvalidPinException;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

import static isp.lab9.exercise3.DoorStatus.CLOSE;
import static isp.lab9.exercise3.DoorStatus.OPEN;


public class InterfaceGraphics extends JFrame {

    private DoorLockController doorLockController;
    private JTextField enterPinTextField;
    private JButton enterPinButton;
    private JTextField doorStatusTextField;
    private JTextField incorrectPinMsgLabel;


    public InterfaceGraphics(DoorLockController doorLockController)  {
        this.doorLockController = doorLockController;
        createPage();
        actionPerformed();

        setTitle( "Design preview" );
        setSize( 350, 250 );
        setLayout(new BorderLayout());
        setVisible(true);


    }

        private void createPage(){
            JLabel jLabel=new JLabel("Type access code:");
            jLabel.setBounds(5,5,150,20);
            add(jLabel);

            JTextField jTextField=new JTextField(" ");
            this.enterPinTextField=jTextField;
            this.enterPinTextField.setBounds(170,5,150,30);
            add(enterPinTextField);

            JButton jButton=new JButton("Enter code");
            this.enterPinButton=jButton;
            this.enterPinButton.setBounds(5,50,315,50);
            add(enterPinButton);


            JLabel jLabel1=new JLabel("Door status:");
            jLabel1.setBounds(5,130,150,20);
            add(jLabel1);

            JTextField jTextField1=new JTextField();
            this.doorStatusTextField=jTextField1;
            this.doorStatusTextField.setBounds(170,130,150,30);
            add(doorStatusTextField);

            JTextField jTextField2=new JTextField();
            this.incorrectPinMsgLabel=jTextField2;
            this.incorrectPinMsgLabel.setBounds(5,170,300,20);
            this.incorrectPinMsgLabel.setVisible(false);
            add(incorrectPinMsgLabel);
        }

        private void actionPerformed(){
            this.enterPinButton.addActionListener(e-> {
                try {
                    DoorStatus doorStatus = this.doorLockController.enterPin(enterPinTextField.getText());
                    doorStatusMethod(doorStatus);
                     incorrectPinMsgLabel.setVisible(false);
                    } catch (InvalidPinException f) {
                   this.incorrectPinMsgLabel.setText("Error: The pin is invalid");
                    this.incorrectPinMsgLabel.setVisible(true);
                    } catch (TooManyAttemptsException f) {
                    this.incorrectPinMsgLabel.setText("Error: too many attempts");
                    this.incorrectPinMsgLabel.setVisible(true);
                    }

            });
        }

        private void doorStatusMethod(DoorStatus doorStatus){
          Door door=new Door();
            door.setStatus(OPEN);
            if (!Objects.equals(doorStatus, door.getStatus())) {
                door.setStatus(CLOSE);
                if (Objects.equals(doorStatus, door.getStatus())) {
                    doorStatusTextField.setText("Locked");
                }
            } else {
                doorStatusTextField.setText("Unlocked");
            }
        }
    }

