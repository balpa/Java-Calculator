public class Calculator {

private JFrame frame;
private JTextField textField;
private JTextField textField_1;
private JTextField txtAnswer;
private JTextField textField_2;

public static void main(String[] args) {
 EventQueue.invokeLater(new Runnable() {
  public void run() {
   try {
    Calculator window = new Calculator();
    window.frame.setVisible(true);
   } catch (Exception e) {
    e.printStackTrace();
   }
  }
 });
}

public Calculator() {
 initialize();
}
private void initialize() {
 frame = new JFrame();
 frame.getContentPane().setBackground(Color.LIGHT_GRAY);
 frame.getContentPane().setLayout(null);
 
 JButton buttonAdd = new JButton("+");
 buttonAdd.addActionListener(new ActionListener() {
  public void actionPerformed(ActionEvent e) {
   try {
    int num1,num2,ans;
    num1=Integer.parseInt(textField.getText());
    num2=Integer.parseInt(textField_1.getText());
    ans=num1+num2;
    textField_2.setText(Integer.toString(ans));
   }
   catch(Exception e1) {
    JOptionPane.showMessageDialog(null, "Enter a number");
   }
  }
 });
 buttonAdd.setBounds(27, 118, 89, 23);
 frame.getContentPane().add(buttonAdd);
 
 JButton buttonCikar = new JButton("-");
 buttonCikar.addActionListener(new ActionListener() {
  public void actionPerformed(ActionEvent e) {
   try {
    int num1,num2,ans;
    num1=Integer.parseInt(textField.getText());
    num2=Integer.parseInt(textField_1.getText());
       ans=num1-num2;
    textField_2.setText(Integer.toString(ans));
   }
   catch(Exception e1) {
    JOptionPane.showMessageDialog(null, "Enter a number");
   }
  }
 });
 buttonCikar.setBounds(126, 118, 89, 23);
 frame.getContentPane().add(buttonCikar);

 JButton buttonCarp = new JButton("*");
 buttonCarp.addActionListener(new ActionListener() {
  public void actionPerformed(ActionEvent e) {
   try {
    int num1,num2,ans;
    num1=Integer.parseInt(textField.getText());
    num2=Integer.parseInt(textField_1.getText());
   
    ans=num1*num2;
    textField_2.setText(Integer.toString(ans));  
   }
   catch(Exception e1) {
    JOptionPane.showMessageDialog(null, "Enter a number");
   }
  }
 });
 buttonCarp.setBounds(225, 118, 89, 23);
 frame.getContentPane().add(buttonCarp);
 
 JButton buttonBol = new JButton("/");
 buttonBol.addActionListener(new ActionListener() {
  public void actionPerformed(ActionEvent e) {
   try {
    int num1,num2,ans;
    num1=Integer.parseInt(textField.getText());
    num2=Integer.parseInt(textField_1.getText());
   
    ans=num1/num2;
    textField_2.setText(Integer.toString(ans));
   }
   catch(Exception e1) {
    JOptionPane.showMessageDialog(null, "Enter a number");
   }
  }
 });
 buttonBol.setBounds(321, 118, 89, 23);
 frame.getContentPane().add(buttonBol);
 
 textField = new JTextField();
 textField.setBounds(77, 31, 86, 44);
 frame.getContentPane().add(textField);
 textField.setColumns(10);
 
 textField_1 = new JTextField();
 textField_1.setBounds(275, 31, 86, 44);
 frame.getContentPane().add(textField_1);
 textField_1.setColumns(10);
 
 txtAnswer = new JTextField();
 txtAnswer.setBackground(Color.LIGHT_GRAY);
 txtAnswer.setFont(new Font("Tahoma", Font.BOLD, 18));
 txtAnswer.setText("Equals=");
 txtAnswer.setBounds(129, 191, 86, 30);
 frame.getContentPane().add(txtAnswer);
 txtAnswer.setColumns(10);
 
 textField_2 = new JTextField();
 textField_2.setBackground(Color.LIGHT_GRAY);
 textField_2.setBounds(228, 192, 86, 30);
 frame.getContentPane().add(textField_2);
 textField_2.setColumns(10);
 frame.setBounds(100, 100, 450, 300);
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
