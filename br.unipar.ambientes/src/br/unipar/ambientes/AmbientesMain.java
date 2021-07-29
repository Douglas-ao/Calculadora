package br.unipar.ambientes;

import org.eclipse.swt.widgets.Display;

import br.unipar.ambientes.telas.dialog.CalculadoraIMCDialog;

public class AmbientesMain {

	public static void main(String[] args) {
//		LoginDialog loginDialog = new LoginDialog(Display.getDefault().getActiveShell());
//		loginDialog.open();
		
		CalculadoraIMCDialog calculadoraDialog = new CalculadoraIMCDialog(Display.getDefault().getActiveShell());
		calculadoraDialog.open();
	}

}
