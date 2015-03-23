import javax.swing.JOptionPane;
public class Role{
	public static void main(String [] args) {

String[] choices = { "Admin", "Student", "Staff", "Faculty", "Guest"};
String input = (String) JOptionPane.showInputDialog(null, "What is your role ","Account Type",JOptionPane.QUESTION_MESSAGE, null,choices,choices[1]); 
System.out.println("Welcome " + input);

}
}