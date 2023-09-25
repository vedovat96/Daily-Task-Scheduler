import javax.swing.*; import java.awt.event.*; import java.awt.*;
class color extends JFrame{
    JPanel panel;

    color(){
        setSize(520,1080);
        setTitle("Color Specification");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Panel();
        add(panel);
        setVisible(true);


    }

    void Panel(){

        panel=new JPanel();
        JButton red=new JButton("School/Work");
        red.setBackground(Color.red);
        red. setBorder(BorderFactory. createEmptyBorder());
        red.setPreferredSize(new Dimension(100, 100));
        red.setBounds(100,-200,80,30);
        JButton blue=new JButton("Personal");
        blue.setBackground(Color.blue);
        blue. setBorder(BorderFactory. createEmptyBorder());
        blue.setPreferredSize(new Dimension(100, 100));
        JButton green=new JButton("Health");
        green.setBackground(Color.green);
        green. setBorder(BorderFactory. createEmptyBorder());
        green.setPreferredSize(new Dimension(100, 100));
        JButton yellow=new JButton("Overall");
        yellow.setBackground(Color.yellow);
        yellow. setBorder(BorderFactory. createEmptyBorder());
        yellow.setPreferredSize(new Dimension(100, 100));

        // registery of the button

        red.addActionListener(new forred());
        blue.addActionListener(new forblue());
        green.addActionListener(new forgreen());
        yellow.addActionListener(new foryellow());


        panel.setBackground(Color.black);
        panel.add(red);
        panel.add(blue);
        panel.add(green);
        panel.add(yellow);


    }

    // inner class for actionlistener

    private class forred implements ActionListener{

        public void actionPerformed(ActionEvent a){

            panel.setBackground(Color.RED);

        }
    }


    private class forblue implements ActionListener{

        public void actionPerformed(ActionEvent a){

            panel.setBackground(Color.BLUE);

        }

    }
    private class forgreen implements ActionListener{

        public void actionPerformed(ActionEvent a){

            panel.setBackground(Color.GREEN);

        }

    }
    private class foryellow implements ActionListener{

        public void actionPerformed(ActionEvent a){

            panel.setBackground(Color.YELLOW);

        }

    }


}

