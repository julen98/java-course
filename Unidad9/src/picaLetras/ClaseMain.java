package picaLetras;

import javax.swing.SwingUtilities;

public class ClaseMain {
	public static void main(String[] args) {
		try {
			SwingUtilities.invokeLater(new Runnable() {
				@Override
				public void run() {
					new PicaLetras();
				}
			});
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	} // main
}
