

package Main;

//@author Radames J Halmeman  - rjhalmeman@gmail.com
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI extends JFrame {
    
    private Container cp;
    
    private JPanel pnCentro = new JPanel();
    
    private JLabel lbNome = new JLabel("Nome");
    private JLabel lbSexo = new JLabel("Sexo");
    
    private JTextField tfNomePessoa = new JTextField();
    private JTextField tfSexoPessoa = new JTextField();
    
    private JLabel lbVazio = new JLabel("");
    private JButton btVerificar = new JButton("Entrar");
    
    private JLabel lbResultado = new JLabel();
    
    public GUI() {
        setSize(800, 600);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        cp = getContentPane();
        cp.setLayout(new BorderLayout());
        setTitle("GUI");
        
        cp.add(pnCentro, BorderLayout.CENTER);
        
        pnCentro.setLayout(new GridLayout(4,2));
        
        pnCentro.add(lbNome);
        pnCentro.add(tfNomePessoa);
        
        pnCentro.add(lbSexo);
        pnCentro.add(tfSexoPessoa);
        
        pnCentro.add(lbVazio);
        pnCentro.add(btVerificar);
        
        pnCentro.add(lbVazio);
        pnCentro.add(lbResultado);
        
        btVerificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Entidade entidade = new Entidade();
                
                entidade.setNome(String.valueOf(tfNomePessoa.getText()));
                entidade.setSexo(String.valueOf(tfSexoPessoa.getText()));
                
                lbResultado.setText(String.valueOf(entidade.getResultado()));
            }
        });
        
        setLocationRelativeTo(null);//centraliza no monitor
        setVisible(true);
    }
}
