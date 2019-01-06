package _03_To_Do_List;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class ToDoList implements ActionListener {
	/*
	 * Create a program with five buttons, add task, view tasks, remove task, save
	 * list, and load list.
	 * 
	 * When add task is clicked: ask the user for a task and save it to an array
	 * list
	 * 
	 * When the view tasks button is clicked: show all the tasks in the list
	 * 
	 * When the remove task button is clicked: prompt the user for which task to
	 * remove and take it off of the list.
	 * 
	 * When the save list button is clicked: Save the list to a file
	 * 
	 * When the load list button is clicked: Prompt the user for the location of the
	 * file and load the list from that file
	 * 
	 * When the program starts, it should automatically load the last saved file
	 * into the list.
	 */
	ArrayList<String> list = new ArrayList<String>();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton add = new JButton("Add Task");
	JButton view = new JButton("View Tasks");
	JButton remove = new JButton("Remove Task");
	JButton save = new JButton("Save Task List");
	JButton load = new JButton("Load Task List");

	public static void main(String[] args) {
		ToDoList runner = new ToDoList();
		runner.run();
	}

	public void run() {
		frame.add(panel);
		panel.add(add);
		panel.add(remove);
		panel.add(view);
		panel.add(save);
		panel.add(load);
		add.addActionListener(this);
		view.addActionListener(this);
		remove.addActionListener(this);
		save.addActionListener(this);
		load.addActionListener(this);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton source = (JButton) e.getSource();
		if (source.getText() == "Add Task") {
			list.add(JOptionPane.showInputDialog("Add Task: "));
		}
		if (source.getText() == "View Tasks") {
			JOptionPane.showMessageDialog(null, list.toString());
		}
		if (source.getText() == "Remove Task") {
			try {
				list.remove(Integer.parseInt(JOptionPane.showInputDialog("Enter the # of a Task: ")));
			} catch (Exception e2) {
				// TODO: handle exception
			}

		}
		if (source.getText() == "Save Task List") {
			JFileChooser jfc = new JFileChooser();
			int returnVal = jfc.showOpenDialog(null);
			if (returnVal == JFileChooser.APPROVE_OPTION) {
				String fileName = jfc.getSelectedFile().getAbsolutePath();
				try {
					FileWriter fw = new FileWriter(fileName);
					fw.write(list.toString());
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
	}

}
