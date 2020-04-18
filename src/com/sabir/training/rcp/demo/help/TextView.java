package com.sabir.training.rcp.demo.help;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

public class TextView extends ViewPart {

	public static String VIEW_ID = "com.sabir.training.rcp.demo.help";
	Text text;
	public TextView() {
		// TODO Auto-generated constructor stub
		System.out.println("TextView.TextView()");
		
		
	}

	@Override
	public void createPartControl(Composite parent) {
		// TODO Auto-generated method stub
		System.out.println("TextView.createPartControl()");
		text = new Text(parent, SWT.NONE);
		text.setText("Hello");
		PlatformUI.getWorkbench().getHelpSystem().setHelp(text, VIEW_ID+".message");

	}

	@Override
	public void setFocus() {
		System.out.println("TextView.setFocus()");
text.setFocus();
	}

}
