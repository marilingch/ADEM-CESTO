package org.tmview.interfaces;

import java.util.List;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.SwingWorker;

public class BackgroundTask extends SwingWorker<Object, BackgroundTask.StatusBackgroundTask> {
	// The result type returned by this SwingWorker's doInBackground is
	// "Object" (in fact, no result is necessary but a return type is required)
	// The type used for carrying out intermediate results by this SwingWorker's 
	// publish and process methods is StatusBackgroundTask, which will be used to 
	// populate the message/error text areas

	private JTextArea statusTextArea;
	private JTextArea messageTextArea;
	private JTextArea errorTextArea;
	private JFrame frame;
	
	public BackgroundTask(JFrame paramFrame, JTextArea paramStatusTextArea, JTextArea paramMessageTextArea, JTextArea paramErrorTextArea) {
		// save the text areas
		this.statusTextArea = paramStatusTextArea;
		this.messageTextArea = paramMessageTextArea;
		this.errorTextArea = paramErrorTextArea;
		this.frame = paramFrame;
	}

	public class StatusBackgroundTask {
		private String textFrame;
		private String textStatus;
		private String textMessage;
		private String textError;

		public StatusBackgroundTask() {
			this.textStatus = ""; //$NON-NLS-1$
			this.textMessage = ""; //$NON-NLS-1$
			this.textError = ""; //$NON-NLS-1$
		}

		public String getTextStatus() {
			return this.textStatus;
		}
		public void setTextStatus(String s) {
			this.textStatus = s;
		}

		public String getTextMessage() {
			return this.textMessage;
		}
		public void setTextMessage(String s) {
			this.textMessage = s;
		}

		public String getTextError() {
			return this.textError;
		}
		public void setTextError(String s) {
			this.textError = s;
		}

		public String getTextFrame() {
			return this.textFrame;
		}
		public void setTextFrame(String s) {
			this.textFrame = s;
		}

	}

	@Override
	public Object doInBackground() {
		// execute the actual interface
		//DsViewValidate dsViewValidate = new DsViewValidate();
		TmViewXmlGenerate.runInterface(this);

		// dummy return
		return new Object();
	}

	@Override
	protected void process(List<StatusBackgroundTask> chunks) {
		for (StatusBackgroundTask statusBackgroundTask : chunks) {
			// get components of statusBackgroundTask
			String textStatus = statusBackgroundTask.getTextStatus();
			String textMessage = statusBackgroundTask.getTextMessage();
			String textError = statusBackgroundTask.getTextError();
			String textFrame = statusBackgroundTask.getTextFrame();
			
			if (!textStatus.equals("")) { //$NON-NLS-1$
				// the status replaces the prior value
				this.statusTextArea.setText(textStatus);
			}

			if (!textMessage.equals("")) { //$NON-NLS-1$
				// the message is appended
				this.messageTextArea.append("\n"); //$NON-NLS-1$
				this.messageTextArea.append(textMessage);
			}

			if (!textError.equals("")) { //$NON-NLS-1$
				// the error is appended
				this.errorTextArea.append("\n"); //$NON-NLS-1$
				this.errorTextArea.append(textError);
			}

			this.frame.setTitle(textFrame);
		}
	}

	// public method to call protected method "publish" from other classes
	public void publish2(BackgroundTask.StatusBackgroundTask statusBackgroundTask) {
		publish(statusBackgroundTask);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}
