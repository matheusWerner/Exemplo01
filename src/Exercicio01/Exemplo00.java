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
import javax.swing.ButtonGroup;
/**
 *
 * @author Matheus Ruan Werner
 */
public class Exemplo00 implements JFrameBaseInterface, JFrameScrolleComboInterface, 
                                  JFrameCancelareSalvarInterface, JFrameConfiguracoesInterface {
    
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
    private ButtonGroup buttonGroupVouM,
                        buttonGroupRouC;
    
    public Exemplo00() {
        instanciarComponentes();
        gerarTela();
        adicionarComponentes();
        gerarLocalizacoes();
        gerarDimensoes();
        configurarJScrollPane();
        configurarJComboBox();
        configurarCancelar();
        configurarSalvar();
        configurarButtonGroup();
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
       jFrame.add(jScrollPaneDescricao);
   
    }

    @Override
    public void instanciarComponentes() {
        jScrollPaneDescricao = new JScrollPane();
        jTextAreaDescricao = new JTextArea();
        jComboBoxRaca = new JComboBox();
        jRadioButtonRacao = new JRadioButton("Ração");
        jRadioButtonVivo = new JRadioButton("Vivo");
        jRadioButtonMorto = new JRadioButton("Morto");
        jRadioButtonCome = new JRadioButton("Come almoços, jantas");
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
        buttonGroupVouM = new ButtonGroup();
        buttonGroupRouC = new ButtonGroup();
    }

    @Override
    public void gerarLocalizacoes() {
        jLabelNome.setLocation(5,3);
        jTextFieldNome.setLocation(5,25);
        jLabelRaca.setLocation(5,55);
        jComboBoxRaca.setLocation(5,80);
        jLabelApelido.setLocation(194,55);
        jTextFieldApelido.setLocation(194,80);
        jLabelIdade.setLocation(400,3);
        jTextFieldIdade.setLocation(400,25);
        jLabelPreco.setLocation(400,55);
        jTextFieldPreco.setLocation(400,80);
        jRadioButtonVivo.setLocation(3,115);
        jRadioButtonMorto.setLocation(3,145);
        jRadioButtonRacao.setLocation(100,115);
        jRadioButtonCome.setLocation(100,145);
        jCheckBoxAdestrado.setLocation(340,120);
        jCheckBoxVacinado.setLocation(340,150);
        jCheckBoxCastrado.setLocation(470,120);
        jCheckBoxTemPedigree.setLocation(470,150);
        jLabelDescricao.setLocation(5,170);
        jScrollPaneDescricao.setLocation(5,195);
        jButtonCancelar.setLocation(320,297);
        jButtonSalvar.setLocation(459,297);
    }

    @Override
    public void gerarDimensoes() {
        jLabelNome.setSize(40,20);
        jTextFieldNome.setSize(340,25);
        jLabelRaca.setSize(40,20);
        jComboBoxRaca.setSize(150,23);
        jLabelApelido.setSize(100,20);
        jTextFieldApelido.setSize(150,23);
        jLabelIdade.setSize(100,20);
        jTextFieldIdade.setSize(190,23);
        jLabelPreco.setSize(60,20);
        jTextFieldPreco.setSize(190,23);
        jRadioButtonVivo.setSize(100,20);
        jRadioButtonMorto.setSize(100,20);
        jRadioButtonRacao.setSize(100,20);
        jRadioButtonCome.setSize(200,20);
        jCheckBoxAdestrado.setSize(100,20);
        jCheckBoxVacinado.setSize(100,20);
        jCheckBoxCastrado.setSize(100,20);
        jCheckBoxTemPedigree.setSize(200,20);
        jLabelDescricao.setSize(100,20);
        jScrollPaneDescricao.setSize(585,90);
        jButtonCancelar.setSize(130,70);
        jButtonSalvar.setSize(130,70);
    }

    @Override
    public void configurarJScrollPane() {
        jScrollPaneDescricao.setViewportView(jTextAreaDescricao); 
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

    @Override
    public void configurarCancelar() {
        jButtonCancelar.addActionListener (new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jComboBoxRaca.setSelectedIndex(-1);
                jCheckBoxAdestrado.setSelected(false);
                jCheckBoxVacinado.setSelected(false);
                jCheckBoxCastrado.setSelected(false);
                jCheckBoxTemPedigree.setSelected(false);
                jRadioButtonRacao.setSelected(false);        
                jRadioButtonVivo.setSelected(false); 
                jRadioButtonMorto.setSelected(false);
                jRadioButtonCome.setSelected(false);
                jTextFieldNome.setText(null);
                jTextFieldApelido.setText(null);
                jTextFieldIdade.setText(null);
                jTextFieldPreco.setText(null);
                jTextAreaDescricao.setText(null);
            }
        });
    }

    @Override
    public void configurarSalvar() {
        String infos = "";
        infos += jTextFieldNome.getText()
                 + jTextFieldApelido.getText()
                 + jTextFieldIdade.getText()
                 + jTextFieldPreco.getText()
                 + jComboBoxRaca.getSelectedIndex();
        
        jButtonSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                JOptionPane.showMessageDialog(null, "Nome: " + jTextFieldNome.getText());
            }
        });
    }

    @Override
    public void configurarButtonGroup() {
        buttonGroupVouM.add(jRadioButtonVivo);
        buttonGroupVouM.add(jRadioButtonMorto);
        buttonGroupRouC.add(jRadioButtonRacao);
        buttonGroupRouC.add(jRadioButtonCome);     
    }
    
    
    
    
    
   
                   
    
}
