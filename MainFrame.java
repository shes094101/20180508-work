import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JButton jbtnnine = new JButton("9");
    private JButton jbtneight = new JButton("8");
    private JButton jbtnseven = new JButton("7");
    private JButton jbtnsix = new JButton("6");
    private JButton jbtnfive = new JButton("5");
    private JButton jbtnfour = new JButton("4");
    private JButton jbtnthree = new JButton("3");
    private JButton jbtntwo = new JButton("2");
    private JButton jbtnone = new JButton("1");
    private JButton jbtnzero = new JButton("0");

    private JButton jbtnplus = new JButton("+");
    private JButton jbtnsub = new JButton("-");
    private JButton jbtnmul = new JButton("*");
    private JButton jbtndiv = new JButton("/");
    private JButton jbtnequ = new JButton("=");
    private JButton jbtnpoint = new JButton(".");
    private String str="";

    private JLabel jlb =new JLabel();

    public MainFrame() {
        init();
    }

    private void init() {
        this.setDefaultCloseOperation(3);//設定關閉視窗的按鈕
        this.setLayout(null);//設置布局為空
        this.setBounds(100, 100, 450,570);//設置介面大小
        MainFrame.this.setTitle("計算機");

        jlb.setBounds(0,0,450,100);
        jlb.setFont(new Font(null, Font.BOLD,40));
        this.add(jlb);

        jbtnnine.setBounds(10,100,100,100);
        jbtnnine.setFont(new Font(null, Font.BOLD,40));
        this.add(jbtnnine);

        jbtneight.setBounds(115,100,100,100);
        jbtneight.setFont(new Font(null, Font.BOLD,40));
        this.add(jbtneight);

        jbtnseven.setBounds(220,100,100,100);
        jbtnseven.setFont(new Font(null, Font.BOLD,40));
        this.add(jbtnseven);

        jbtndiv.setBounds(325,100,100,100);
        jbtndiv.setFont(new Font(null, Font.BOLD,40));
        this.add(jbtndiv);

        jbtnsix.setBounds(10,205,100,100);
        jbtnsix.setFont(new Font(null, Font.BOLD,40));
        this.add(jbtnsix);

        jbtnfive.setBounds(115,205,100,100);
        jbtnfive.setFont(new Font(null, Font.BOLD,40));
        this.add(jbtnfive);

        jbtnfour.setBounds(220,205,100,100);
        jbtnfour.setFont(new Font(null, Font.BOLD,40));
        this.add(jbtnfour);

        jbtnmul.setBounds(325,205,100,100);
        jbtnmul.setFont(new Font(null, Font.BOLD,40));
        this.add(jbtnmul);

        jbtnthree.setBounds(10,310,100,100);
        jbtnthree.setFont(new Font(null, Font.BOLD,40));
        this.add(jbtnthree);

        jbtntwo.setBounds(115,310,100,100);
        jbtntwo.setFont(new Font(null, Font.BOLD,40));
        this.add(jbtntwo);

        jbtnone.setBounds(220,310,100,100);
        jbtnone.setFont(new Font(null, Font.BOLD,40));
        this.add(jbtnone);

        jbtnsub.setBounds(325,310,100,100);
        jbtnsub.setFont(new Font(null, Font.BOLD,40));
        this.add(jbtnsub);

        jbtnzero.setBounds(10,415,100,100);
        jbtnzero.setFont(new Font(null, Font.BOLD,40));
        this.add(jbtnzero);

        jbtnpoint.setBounds(115,415,100,100);
        jbtnpoint.setFont(new Font(null, Font.BOLD,40));
        this.add(jbtnpoint);

        jbtnequ.setBounds(220,415,100,100);
        jbtnequ.setFont(new Font(null, Font.BOLD,40));
        this.add(jbtnequ);

        jbtnplus.setBounds(325,415,100,100);
        jbtnplus.setFont(new Font(null, Font.BOLD,40));
        this.add(jbtnplus);

        //----------------------程式設計------------------------//

        jbtnnine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlb.setText(jlb.getText()+jbtnnine.getText());
            }
        });

        jbtneight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlb.setText(jlb.getText()+jbtneight.getText());
            }
        });jbtnseven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlb.setText(jlb.getText()+jbtnseven.getText());
            }
        });
        jbtnsix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlb.setText(jlb.getText()+jbtnsix.getText());
            }
        });jbtnfive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlb.setText(jlb.getText()+jbtnfive.getText());
            }
        });
        jbtnfour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlb.setText(jlb.getText()+jbtnfour.getText());
            }
        });
        jbtnthree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlb.setText(jlb.getText()+jbtnthree.getText());
            }
        });
        jbtntwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlb.setText(jlb.getText()+jbtntwo.getText());
            }
        });
        jbtnone.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlb.setText(jlb.getText()+jbtnone.getText());
            }
        });
        jbtnzero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlb.setText(jlb.getText()+jbtnzero.getText());
            }
        });
        jbtnplus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlb.setText(jlb.getText()+jbtnplus.getText());
            }
        });
        jbtnsub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlb.setText(jlb.getText()+jbtnsub.getText());
            }
        });
        jbtnmul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlb.setText(jlb.getText()+jbtnmul.getText());
            }
        });jbtndiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlb.setText(jlb.getText()+jbtndiv.getText());
            }
        });jbtnpoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlb.setText(jlb.getText()+jbtnpoint.getText());            }
        });
        jbtnequ.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlb.setText(jlb.getText()+jbtnequ.getText());
            }
        });

    }
}