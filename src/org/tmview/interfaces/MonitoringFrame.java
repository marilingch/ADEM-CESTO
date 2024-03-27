package org.tmview.interfaces;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.ScrollPaneConstants;

//import org.openxmlformats.schemas.drawingml.x2006.main.impl.STTextAutonumberSchemeImpl;


public class MonitoringFrame {

	private JFrame frameMonitoring;
	private JTextArea messageTextArea;
	private JTextArea errorTextArea;
	private JTextArea statusTextArea;
	private static JPanel ImagePane;
	private JLabel imageLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MonitoringFrame window = new MonitoringFrame();
					window.frameMonitoring.setVisible(true);

					// create a new SwingWorker to do the actual work and interact with the GUI
					BackgroundTask task = new BackgroundTask(window.getFrmInterface(), window.getStatusTextArea(), window.getMessageTextArea(), window.getErrorTextArea());
					
					task.execute();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MonitoringFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameMonitoring = new JFrame();
		frameMonitoring.getContentPane().setForeground(SystemColor.infoText);
		frameMonitoring.setBounds(50, 50, 1000, 780);
		frameMonitoring.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameMonitoring.getContentPane().setLayout(null);
		frameMonitoring.setBackground(new Color(240, 240, 240));
		
		// message area
		messageTextArea = new JTextArea();
		messageTextArea.setForeground(SystemColor.infoText);
		messageTextArea.setBackground(new Color(240, 240, 240));
		messageTextArea.setFont(new Font("Monospaced", Font.PLAIN, 11)); //$NON-NLS-1$
		messageTextArea.setEditable(false);
		
		// scroll pane for message area
		JScrollPane messageScrollPane = new JScrollPane(messageTextArea);
		messageScrollPane.setBounds(73, 150, 875, 290);
		frameMonitoring.getContentPane().add(messageScrollPane);
		messageScrollPane.setRowHeaderView(messageTextArea);
		messageScrollPane.setViewportView(messageTextArea);
		messageScrollPane.setVerticalScrollBarPolicy ( ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS );
		
		// error area
		errorTextArea = new JTextArea();
		errorTextArea.setForeground(SystemColor.infoText);
		errorTextArea.setBackground(new Color(240, 240, 240));
		errorTextArea.setFont(new Font("Monospaced", Font.PLAIN, 11)); //$NON-NLS-1$
		errorTextArea.setEditable(false);
		
		// scroll pane for error area
		JScrollPane errorScrollPane = new JScrollPane();
		errorScrollPane.setBounds(73, 460, 875, 250);
		frameMonitoring.getContentPane().add(errorScrollPane);
		errorScrollPane.setRowHeaderView(errorTextArea);
		errorScrollPane.setViewportView(errorTextArea);
		errorScrollPane.setVerticalScrollBarPolicy ( ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS );

		
		// status area
		statusTextArea = new JTextArea();
		statusTextArea.setLineWrap(true);
		statusTextArea.setWrapStyleWord(true);
		statusTextArea.setForeground(SystemColor.infoText);
		statusTextArea.setBackground(new Color(240, 240, 240));
		statusTextArea.setFont(new Font("Monospaced", Font.PLAIN, 11)); //$NON-NLS-1$
		statusTextArea.setEditable(false);
		
		// scroll pane status area
		JScrollPane statusScrollPane = new JScrollPane();
		statusScrollPane.setBounds(400, 20, 545, 100);
		frameMonitoring.getContentPane().add(statusScrollPane);
		statusScrollPane.setRowHeaderView(statusTextArea);
		statusScrollPane.setViewportView(statusTextArea);
		statusScrollPane.setVerticalScrollBarPolicy ( ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS );
			
		
		ImagePane = new JPanel();
		ImagePane.setBounds(73, 15, 310, 110);
		frameMonitoring.getContentPane().add(ImagePane);
		
		imageLabel = new JLabel(""); //$NON-NLS-1$
		ImagePane.add(imageLabel);
		ImageIcon image = new ImageIcon("resources/tmview_db.png"); //$NON-NLS-1$
		imageLabel.setIcon(image);
		
		JLabel statusLabel = new JLabel("StatusLabel", JLabel.LEFT);
		statusLabel.setText("Status");
		statusLabel.setBounds(400, 2, 100, 15);
		statusLabel.setFont(new Font("Monospaced", Font.PLAIN, 12));
		frameMonitoring.getContentPane().add(statusLabel);
		
		JLabel infoLabel = new JLabel("InformationLabel", JLabel.LEFT);
		infoLabel.setText("Information");
		infoLabel.setBounds(73, 130, 100, 15);
		infoLabel.setFont(new Font("Monospaced", Font.PLAIN, 12));
		frameMonitoring.getContentPane().add(infoLabel);
		
		JLabel errorLabel = new JLabel("ErrorLabel", JLabel.LEFT);
		errorLabel.setText("Error");
		errorLabel.setBounds(73, 440, 100, 15);
		errorLabel.setFont(new Font("Monospaced", Font.PLAIN, 12));
		frameMonitoring.getContentPane().add(errorLabel);

	}
	public JFrame getFrmInterface() {
		return frameMonitoring;
	}
	
	public JTextArea getStatusTextArea() {
		return statusTextArea;
	}
	public JTextArea getMessageTextArea() {
		return messageTextArea;
	}
	public JTextArea getErrorTextArea() {
		return errorTextArea;
	}
}
