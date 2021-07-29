package br.unipar.ambientes.telas.dialog;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

public class Dialog extends org.eclipse.jface.dialogs.Dialog {
	private Text txtTela;
	
	private BigDecimal numero1;
	private BigDecimal numero2;
	private String operador;

	/**
	 * Create the dialog.
	 * @param parentShell
	 */
	public Dialog(Shell parentShell) {
		super(parentShell);
	}

	/**
	 * Create contents of the dialog.
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);
		container.setLayout(new GridLayout(4, false));
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		
		txtTela = new Text(container, SWT.BORDER | SWT.RIGHT);
		txtTela.setFont(SWTResourceManager.getFont("Segoe UI", 25, SWT.NORMAL));
		GridData gd_txtTela = new GridData(SWT.CENTER, SWT.CENTER, true, false, 4, 2);
		gd_txtTela.heightHint = 86;
		gd_txtTela.widthHint = 384;
		txtTela.setLayoutData(gd_txtTela);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		
		Button btnC = new Button(container, SWT.NONE);
		btnC.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.NORMAL));
		btnC.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				numero1 = null;
				numero2= null;
				txtTela.setText("");
			}
		});
		GridData gd_btnC = new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1);
		gd_btnC.widthHint = 91;
		gd_btnC.heightHint = 62;
		btnC.setLayoutData(gd_btnC);
		btnC.setText("C");
		
		Button btnCe = new Button(container, SWT.NONE);
		btnCe.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.NORMAL));
		btnCe.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				txtTela.setText("");
			}
		});
		GridData gd_btnCe = new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1);
		gd_btnCe.widthHint = 91;
		gd_btnCe.heightHint = 60;
		btnCe.setLayoutData(gd_btnCe);
		btnCe.setText("CE");
		
		Button btnDividir = new Button(container, SWT.NONE);
		btnDividir.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.NORMAL));
		btnDividir.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				numero1 = new BigDecimal(txtTela.getText());
				txtTela.setText("");
				operador = "/";
			}
		});
		GridData gd_btnDividir = new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1);
		gd_btnDividir.widthHint = 91;
		gd_btnDividir.heightHint = 62;
		btnDividir.setLayoutData(gd_btnDividir);
		btnDividir.setText("/");
		
		Button btnVezes = new Button(container, SWT.NONE);
		btnVezes.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.NORMAL));
		btnVezes.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				numero1 = new BigDecimal(txtTela.getText());
				txtTela.setText("");
				operador = "x";
			}
		});
		GridData gd_btnVezes = new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1);
		gd_btnVezes.widthHint = 96;
		gd_btnVezes.heightHint = 62;
		btnVezes.setLayoutData(gd_btnVezes);
		btnVezes.setText("x");
		
		Button btnSete = new Button(container, SWT.NONE);
		btnSete.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.NORMAL));
		btnSete.setText("7");
		btnSete.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				txtTela.setText(txtTela.getText() + "7");
			}
		});
		GridData gd_btnSete = new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1);
		gd_btnSete.widthHint = 91;
		gd_btnSete.heightHint = 57;
		btnSete.setLayoutData(gd_btnSete);
		
		Button btnOito = new Button(container, SWT.NONE);
		btnOito.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.NORMAL));
		GridData gd_btnOito = new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1);
		gd_btnOito.widthHint = 91;
		gd_btnOito.heightHint = 62;
		btnOito.setLayoutData(gd_btnOito);
		btnOito.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				txtTela.setText(txtTela.getText() + "8");
			}
		});
		btnOito.setText("8");
		
		Button btnNove = new Button(container, SWT.NONE);
		btnNove.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.NORMAL));
		GridData gd_btnNove = new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1);
		gd_btnNove.widthHint = 91;
		gd_btnNove.heightHint = 62;
		btnNove.setLayoutData(gd_btnNove);
		btnNove.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				txtTela.setText(txtTela.getText() + "9");
			}
		});
		btnNove.setText("9");
		
		Button btnMenos = new Button(container, SWT.NONE);
		btnMenos.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.NORMAL));
		GridData gd_btnMenos = new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1);
		gd_btnMenos.widthHint = 96;
		gd_btnMenos.heightHint = 62;
		btnMenos.setLayoutData(gd_btnMenos);
		btnMenos.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				numero1 = new BigDecimal(txtTela.getText());
				txtTela.setText("");
				operador = "-";
			}
		});
		btnMenos.setText("-");
		
		Button btnQuatro = new Button(container, SWT.NONE);
		btnQuatro.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.NORMAL));
		btnQuatro.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				txtTela.setText(txtTela.getText() + "4");
			}
		});
		GridData gd_btnQuatro = new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1);
		gd_btnQuatro.widthHint = 91;
		gd_btnQuatro.heightHint = 62;
		btnQuatro.setLayoutData(gd_btnQuatro);
		btnQuatro.setText("4");
		
		Button btnCinco = new Button(container, SWT.NONE);
		btnCinco.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.NORMAL));
		GridData gd_btnCinco = new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1);
		gd_btnCinco.widthHint = 91;
		gd_btnCinco.heightHint = 62;
		btnCinco.setLayoutData(gd_btnCinco);
		btnCinco.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				txtTela.setText(txtTela.getText() + "5");
			}
		});
		btnCinco.setText("5");
		
		Button btnSeis = new Button(container, SWT.NONE);
		btnSeis.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.NORMAL));
		btnSeis.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				txtTela.setText(txtTela.getText() + "6");
			}
		});
		GridData gd_btnSeis = new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1);
		gd_btnSeis.widthHint = 91;
		gd_btnSeis.heightHint = 62;
		btnSeis.setLayoutData(gd_btnSeis);
		btnSeis.setText("6");
		
		Button btnMais = new Button(container, SWT.NONE);
		btnMais.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.NORMAL));
		btnMais.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				numero1 = new BigDecimal(txtTela.getText());
				txtTela.setText("");
				operador = "+";
			}
		});
		GridData gd_btnMais = new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1);
		gd_btnMais.widthHint = 96;
		gd_btnMais.heightHint = 62;
		btnMais.setLayoutData(gd_btnMais);
		btnMais.setText("+");
		
		Button btnUm = new Button(container, SWT.NONE);
		btnUm.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.NORMAL));
		btnUm.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				txtTela.setText(txtTela.getText() + "1");
			}
		});
		GridData gd_btnUm = new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1);
		gd_btnUm.widthHint = 91;
		gd_btnUm.heightHint = 62;
		btnUm.setLayoutData(gd_btnUm);
		btnUm.setText("1");
		
		Button btnDois = new Button(container, SWT.NONE);
		btnDois.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.NORMAL));
		btnDois.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				txtTela.setText(txtTela.getText() + "2");
			}
		});
		GridData gd_btnDois = new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1);
		gd_btnDois.widthHint = 91;
		gd_btnDois.heightHint = 62;
		btnDois.setLayoutData(gd_btnDois);
		btnDois.setText("2");
		
		Button btnTres = new Button(container, SWT.NONE);
		btnTres.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.NORMAL));
		btnTres.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				txtTela.setText(txtTela.getText() + "3");
			}
		});
		GridData gd_btnTres = new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1);
		gd_btnTres.widthHint = 91;
		gd_btnTres.heightHint = 62;
		btnTres.setLayoutData(gd_btnTres);
		btnTres.setText("3");
		
		Button btnIgual = new Button(container, SWT.NONE);
		btnIgual.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.NORMAL));
		btnIgual.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				numero2 = new BigDecimal(txtTela.getText());
				
				if (operador.equals("+")) {
					txtTela.setText(String.valueOf(numero1.add(numero2)));
				}
				
				if (operador.equals("-")) {
					txtTela.setText(String.valueOf(numero1.subtract(numero2)));
				}

				if (operador.equals("x")) {
					txtTela.setText(String.valueOf(numero1.multiply(numero2)));
				}
				
				if (operador.equals("/")) {
					txtTela.setText(String.valueOf(numero1.divide(numero2, 8, RoundingMode.HALF_UP).stripTrailingZeros().toPlainString()));
				}
				
			}
		});
		GridData gd_btnIgual = new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 2);
		gd_btnIgual.widthHint = 96;
		gd_btnIgual.heightHint = 129;
		btnIgual.setLayoutData(gd_btnIgual);
		btnIgual.setText("=");
		
		Button btnZero = new Button(container, SWT.NONE);
		btnZero.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.NORMAL));
		btnZero.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				txtTela.setText(txtTela.getText() + "0");
			}
		});
		GridData gd_btnZero = new GridData(SWT.CENTER, SWT.CENTER, false, false, 2, 1);
		gd_btnZero.widthHint = 186;
		gd_btnZero.heightHint = 62;
		btnZero.setLayoutData(gd_btnZero);
		btnZero.setText("0");
		
		Button btnPonto = new Button(container, SWT.NONE);
		btnPonto.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.NORMAL));
		btnPonto.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				txtTela.setText(txtTela.getText() + ".");
			}
		});
		GridData gd_btnPonto = new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1);
		gd_btnPonto.widthHint = 91;
		gd_btnPonto.heightHint = 62;
		btnPonto.setLayoutData(gd_btnPonto);
		btnPonto.setText(".");
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		
		Button btnNewButton_9 = new Button(container, SWT.NONE);
		btnNewButton_9.setText("New Button");
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);

		return container;
	}

	/**
	 * Create contents of the button bar.
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(414, 569);
	}

}
