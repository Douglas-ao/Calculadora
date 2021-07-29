package br.unipar.ambientes;

import org.eclipse.swt.widgets.Display;

import br.unipar.ambientes.telas.dialog.Dialog;


public class CalculadoraMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dialog Dialog = new Dialog(Display.getDefault().getActiveShell());
		Dialog.open();
	}
}
