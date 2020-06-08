package shuben;
	import java.awt.BorderLayout;
	import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	import javax.swing.ImageIcon;
	import javax.swing.JButton;
	import javax.swing.JDialog;
	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.JToolBar;


	public class ManageDialog extends JDialog{
		private UserDao userDao;
		private JFrame jFrame;
		private JPanel jpanel; 
		private JButton labelE;
		private JToolBar toolBar1;
		private JToolBar toolBar2;
		private JToolBar toolBar3,toolBar4,toolBar5,toolBar6,toolBarE;
		private JButton jbutton1,jbutton2,jbutton3,jbutton4,jbutton5,jbuttonExit;
		
		public ManageDialog() {
			labelE=new JButton(new ImageIcon(this.getClass().getResource("menu.gif")));
			labelE.setToolTipText("�������˵�");
			jFrame = new JFrame("���׹���");
			labelE.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					jFrame.dispose();
					new Menu().showMe();
				}
			});
		}
		public void init() {
			toolBar1 = new JToolBar();
			toolBar2 = new JToolBar();
			toolBar3 = new JToolBar();
			toolBar4 = new JToolBar();
			toolBar5 = new JToolBar();
			toolBar6 = new JToolBar();
			toolBarE = new JToolBar();
			
			jbutton1 = new JButton("���ݵ���",new ImageIcon(this.getClass().getResource("Import.gif")));
			jbutton1.setToolTipText("���ݵ���");//���ݵ���
			
			jbutton2 = new JButton("���ݵ���",new ImageIcon(this.getClass().getResource("Derive.gif")));
			jbutton2.setToolTipText("���ݵ���");
			
			jbutton3 = new JButton("����¼��",new ImageIcon(this.getClass().getResource("Insert.gif")));
			jbutton3.setToolTipText("����¼��");
			
			jbutton4 = new JButton("�����޸�",new ImageIcon(this.getClass().getResource("Update.gif")));
			jbutton4.setToolTipText("�����޸�");
			
			jbutton5 = new JButton("����ɾ��",new ImageIcon(this.getClass().getResource("Delete.gif")));
			jbutton5.setToolTipText("����ɾ��");
			
			jbuttonExit = new JButton(new ImageIcon(this.getClass().getResource("Exit.gif")));
			jbuttonExit.setToolTipText("�˳�");
			
		//	labelE = new JButton("�������˵�");
		//	labelE.setToolTipText("�������˵�");

			toolBar1.add(jbutton1);

			toolBar2.add(jbutton2);
			toolBar3.add(jbutton3);
			toolBar4.add(jbutton4);
			toolBar5.add(jbutton5);
			toolBar6.add(jbuttonExit);
			toolBarE.add(labelE);
			
		}
		public void showMe() {
			this.init();
			this.addEventHandler();
			JPanel p = new JPanel();
			p.add(toolBarE);
			p.add(toolBar6);
			FlowLayout flo=new FlowLayout(FlowLayout.CENTER,60,1);
			p.setLayout(flo);
			GridLayout grid = new GridLayout(6,1);
			jFrame.setLayout(grid);
			jFrame.setBounds(0,0,400,350);
			jFrame.setVisible(true);	
			jFrame.add(toolBar1);
			jFrame.add(toolBar2);
			jFrame.add(toolBar3);
			jFrame.add(toolBar4);
			jFrame.add(toolBar5);
			jFrame.add(p);
//			jFrame.add(toolBarE);
//			jFrame.add(toolBar6);
			//jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		}

		public void addEventHandler() {
			jbutton1.addActionListener(new ImportHandler());
			jbutton2.addActionListener(new DeriveHandler());
			jbutton3.addActionListener(new InsertHandler());
			jbutton4.addActionListener(new UpdateHandler());
			jbutton5.addActionListener(new DeleteHandler());
			jbuttonExit.addActionListener(new ExitHandler());
		}
		public class ImportHandler implements ActionListener{
			public void actionPerformed(ActionEvent events) {
				new ImportDialog().showMe();
			} 
		}
		public class DeriveHandler implements ActionListener{
			public void actionPerformed(ActionEvent events) {
				new DeriveDialog().showMe();
			} 
		}
		public class InsertHandler implements ActionListener{
			public void actionPerformed(ActionEvent events) {
				new InsertDialog().showMe();
			} 
		}
		public class UpdateHandler implements ActionListener{
			public void actionPerformed(ActionEvent events) {
				new UpdateDialog().showMe();
			} 
		}
		public class DeleteHandler implements ActionListener{
			public void actionPerformed(ActionEvent events) {
				new DeleteDialog().showMe();
			} 
		}
		private class ExitHandler implements ActionListener{
			public void actionPerformed(ActionEvent events) {
				System.exit(0);
			}
		}
//		public static void main(String[] args) {
//			// TODO �Զ����ɵķ������
//			 new ManageDialog().showMe();
//		}

	}

