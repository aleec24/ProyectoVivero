package Test;
//referencias para la conexción

public class main {

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FinsertarCliente().setVisible(true);
            }
        });
    }

}//fin main
