package Exercicio01;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;
/**
 *
 * @author Matheus Ruan Werner
 */
public class Exemplo00 implements JFrameBaseInterface, JFrameScrolleComboInterface{
    
    private JFrame jFrame;
    private JButton jButtonSalvar,
                    jButtonCancelar;
    private JLabel jLabelNome,
                   jLabelApelido,
                   jLabelIdade,
                   jLabelPreco,
                   jLabelDescricao,
                   jLabelRaca;
    private JCheckBox jCheckBoxAdestrado,
                      jCheckBoxVacinado,
                      jCheckBoxCastrado,
                      jCheckBoxTemPedigree;
    private JRadioButton jRadioButtonRacao,
                         jRadioButtonVivo,
                         jRadioButtonMorto,
                         jRadioButtonCome;
    private JComboBox jComboBoxRaca;
    private JTextArea jTextAreaDescricao;
    private JScrollPane jScrollPaneDescricao;
    private JTextField jTextFieldNome,
                       jTextFieldApelido,
                       jTextFieldIdade,
                       jTextFieldPreco;
    
    public Exemplo00() {
        instanciarComponentes();
        gerarTela();
        adicionarComponentes();
        gerarLocalizacoes();
        gerarDimensoes();
        configurarJScrollPane();
        configurarJComboBox();
        jFrame.setVisible(true);
    }
  

    @Override
    public void gerarTela() {
        jFrame = new JFrame();
        jFrame.setSize(612,417);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);  
    }

    @Override
    public void adicionarComponentes() {
       jFrame.add(jButtonSalvar);
       jFrame.add(jButtonCancelar);
       jFrame.add(jLabelNome);
       jFrame.add(jLabelApelido);
       jFrame.add(jLabelIdade);
       jFrame.add(jLabelPreco);
       jFrame.add(jLabelDescricao);
       jFrame.add(jLabelRaca);
       jFrame.add(jCheckBoxAdestrado);
       jFrame.add(jCheckBoxVacinado);
       jFrame.add(jCheckBoxCastrado);
       jFrame.add(jCheckBoxTemPedigree);
       jFrame.add(jRadioButtonRacao);
       jFrame.add(jRadioButtonVivo);
       jFrame.add(jRadioButtonMorto);
       jFrame.add(jRadioButtonCome);
       jFrame.add(jComboBoxRaca);
       jFrame.add(jTextAreaDescricao);
       jFrame.add(jTextFieldNome);
       jFrame.add(jTextFieldIdade);
       jFrame.add(jTextFieldPreco);
       jFrame.add(jTextFieldApelido);
    }

    @Override
    public void instanciarComponentes() {
        jScrollPaneDescricao = new JScrollPane();
        jTextAreaDescricao = new JTextArea();
        jComboBoxRaca = new JComboBox();
        jRadioButtonRacao = new JRadioButton("Ração");
        jRadioButtonVivo = new JRadioButton("Vivo");
        jRadioButtonMorto = new JRadioButton("Morto");
        jRadioButtonCome = new JRadioButton("Come");
        jCheckBoxAdestrado = new JCheckBox("Adestrado");
        jCheckBoxVacinado = new JCheckBox("Vacinado");
        jCheckBoxCastrado = new JCheckBox("Castrado");
        jCheckBoxTemPedigree = new JCheckBox("Tem Pedigree");
        jLabelNome = new JLabel("Nome");
        jLabelApelido = new JLabel("Apelido");
        jLabelIdade = new JLabel("Idade");
        jLabelPreco = new JLabel("Preço");
        jLabelDescricao = new JLabel("Descrição");
        jLabelRaca = new JLabel("Raça");
        jTextFieldNome = new JTextField();
        jTextFieldApelido = new JTextField();
        jTextFieldIdade = new JTextField();
        jTextFieldPreco = new JTextField();        
        jButtonSalvar = new JButton("Salvar");
        jButtonCancelar = new JButton("Cancelar");  
        
    }

    @Override
    public void gerarLocalizacoes() {
        jLabelNome.setLocation(5,3);
        jTextFieldNome.setLocation(5,30);
        jLabelRaca.setLocation(5,60);
        jComboBoxRaca.setLocation(5,85);
        jLabelApelido.setLocation(194,60);
        jTextFieldApelido.setLocation(194,85);
    }

    @Override
    public void gerarDimensoes() {
        jLabelNome.setSize(40,20);
        jTextFieldNome.setSize(340,25);
        jLabelRaca.setSize(40,20);
        jComboBoxRaca.setSize(150,23);
        jLabelApelido.setSize(100,20);
        jTextFieldApelido.setSize(150,23);
    }

    @Override
    public void configurarJScrollPane() {
        jScrollPaneDescricao.setViewportView(jTextAreaDescricao);
        jScrollPaneDescricao.setHorizontalScrollBarPolicy(
        JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPaneDescricao.setVerticalScrollBarPolicy(
        JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        jTextAreaDescricao.setLineWrap(true);
        
    }

    @Override
    public void configurarJComboBox() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel(
                      new Object[]{
                          "Rottweiller", "Pastor Alemão", "Husky", "São Bernardo",
                          "Chow Chow", "Yorkshire", "Doberman", "Pincher", "Cão Lobo",
                          "Pitbull"
                      }); 
        jComboBoxRaca.setModel(modelo);
        jComboBoxRaca.setSelectedIndex(-1);
        
    
    }
    
   
                   
    
}
