package shuben;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;


public class Menu extends JFrame{
	private int judgement = 1;
	private JFrame frame;
	private JButton labelM;
	private JButton labelS;
	private JButton label1;
	private JButton label2;
	private JToolBar toolBar1;
	private JToolBar toolBar2;
	private JToolBar toolBar3;
	private JToolBar toolBar4;
	private JMenuItem jmiInsert,jmiUpdate,jmiDelete,jmiImport,jmiDerive,jmiField,jmiVague,jmiCondition;
	private UserDao userDao;
//	public static void main(String[] args) throws IOException{
//		new Menu().showMe();
//	}
	
	public Menu() {
		toolBar1 = new JToolBar();
		toolBar2 = new JToolBar();
		toolBar3 = new JToolBar();
		toolBar4 = new JToolBar();
		frame = new JFrame("���׹���ϵͳ");
		userDao=new UserDaoImplForList();
		labelM=new JButton("���׹���",new ImageIcon(this.getClass().getResource("Manage.gif")));
		labelS=new JButton("���ײ�ѯ",new ImageIcon(this.getClass().getResource("Select1.gif")));
		label1=new JButton("����",new ImageIcon(this.getClass().getResource("Concern.gif")));
		label2=new JButton(new ImageIcon(this.getClass().getResource("Exit.gif")));
		label2.setToolTipText("�˳�");
		labelS.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
				new SelectDialog(judgement).showMe();//showMe(int rr){this.rr=rr}
			}
		});
		label1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new ConcernDialog().showMe();
			}
		});	
//		labelM.addActionListener(new ActionListener(){
//			public void actionPerformed(ActionEvent e) {
//				new ManageDialog().showMe();
//			}
//		});	
	}
	public void createMenuBar() {
		JMenuBar menuBar = new JMenuBar();
		JMenu manageMenu = new JMenu("���׹���");
		manageMenu.setMnemonic(KeyEvent.VK_N);
		manageMenu.add(jmiInsert = new JMenuItem("����¼��"));
		//jmiInsert.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));
		manageMenu.add(jmiUpdate = new JMenuItem("�����޸�"));
		//jmiUpdate.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));
		manageMenu.add(jmiDelete = new JMenuItem("����ɾ��"));
		//jmiDelete.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));
		manageMenu.add(jmiImport = new JMenuItem("���ݵ���"));
		//jmiImport.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));
		manageMenu.add(jmiDerive = new JMenuItem("���ݵ���"));
		//jmiDerive.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));
		menuBar.add(manageMenu);
		
		JMenu selectMenu = new JMenu("���ײ�ѯ");
		selectMenu.setMnemonic(KeyEvent.VK_N);
		menuBar.add(selectMenu);
		selectMenu.add(jmiField = new JMenuItem("���ֶβ�ѯ"));
		//jmiField.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));
		selectMenu.add(jmiCondition = new JMenuItem("��������ѯ"));
		//jmiCondition.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));
		selectMenu.add(jmiVague = new JMenuItem("ģ����ѯ"));
		
		//jmiVague.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));
		frame.setJMenuBar(menuBar);
	}
	private void init() {
		
		//JPanel jpanel=new JPanel();
		JPanel p = new JPanel();
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		GridLayout grid=new GridLayout(3,1,1,100);
		//setLayout(new GridLayout(2,2,50,50));
		createMenuBar();
		//JPanel p = new JPanel();
	    p.setPreferredSize(new Dimension(200,70));
		//this.add("Center",p);
	    toolBar1.add(labelM);
		p.add(toolBar1);
		toolBar2.add(labelS);
		p1.add(toolBar2);
	//	p1.add(labelS);
		GridLayout grid1=new GridLayout(1,2,100,10);
		p2.setLayout(grid1);
		toolBar3.add(label1);
		p2.add(toolBar3);
		//p2.add(label1);
		toolBar4.add(label2);
		p2.add(toolBar4);
		//p2.add(label2);	
		frame.add(p,BorderLayout.NORTH);
		frame.add(p1,BorderLayout.CENTER);
		frame.add(p2,BorderLayout.SOUTH);
	}
	public void showMe(){
		init();
		this.addEventHandler();
		frame.setTitle("���׹���ϵͳ");
		frame.setBounds(0,0,300,250);
		//frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	public void addEventHandler(){
		jmiInsert.addActionListener(new InsertHandler());
		jmiUpdate.addActionListener(new UpdateHandler());
		jmiDelete.addActionListener(new DeleteHandler());
		jmiImport.addActionListener(new ImportHandler());
		jmiDerive.addActionListener(new DeriveHandler());
		jmiField.addActionListener(new FieldHandler());
		jmiVague.addActionListener(new VagueHandler());
		jmiCondition.addActionListener(new ConditionHandler());
		label2.addActionListener(new ExitHandler());
		labelM.addActionListener(new ManageHandler());
	}
	private class InsertHandler implements ActionListener{
		public void actionPerformed(ActionEvent events) {
			frame.dispose();
			new InsertDialog().showMe();
		}  		
	}
	private class UpdateHandler implements ActionListener{
		public void actionPerformed(ActionEvent events) {
			frame.dispose();
			new UpdateDialog().showMe();
		}  		
	}
	private class DeleteHandler implements ActionListener{
		public void actionPerformed(ActionEvent events) {
			frame.dispose();
			new DeleteDialog().showMe();
		}  		
	}
	private class ImportHandler implements ActionListener{
		public void actionPerformed(ActionEvent events) {
			frame.dispose();
			new ImportDialog().showMe();
		}  		
	}
	private class FieldHandler implements ActionListener{
		public void actionPerformed(ActionEvent events) {
			frame.dispose();
			new FieldDialog(judgement).showMe();
		}  		
	}
	private class DeriveHandler implements ActionListener{
		public void actionPerformed(ActionEvent events) {
			frame.dispose();
			new DeriveDialog().showMe();
		}  		
	}
	private class VagueHandler implements ActionListener{
		public void actionPerformed(ActionEvent events) {
			frame.dispose();
			new VagueDialog(judgement).showMe();
		}  		
	}
	private class ConditionHandler implements ActionListener{
		public void actionPerformed(ActionEvent events) {
			frame.dispose();
			new ConditionDialog(judgement).showMe();
		}  		
	}
	public class ManageHandler implements ActionListener{
		public void actionPerformed(ActionEvent events) {
			frame.dispose();
			new ManageDialog().showMe();
			//frame.dispose();
		}  		
	}
	public class ExitHandler implements ActionListener{
		public void actionPerformed(ActionEvent events) {
			new Interface().showMe();
			frame.dispose();
		}  		
	}
}

