package Example10_6;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

/**
 * @author : Nina
 * @time : 2020/7/6 17:26
 * @description : window-open and save file
 */
public class WindowReader extends JFrame implements ActionListener {
    JFileChooser fileDialog;
    JMenuBar menuBar;
    JMenu menu;
    JMenuItem itemSave, itemOpen;
    JTextArea text;
    BufferedReader in;
    FileReader fileReader;
    BufferedWriter out;
    FileWriter fileWriter;

    WindowReader() {
        init();
        setSize(300, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void init() {
        text = new JTextArea(10, 10);
        text.setFont(new Font("楷体_gb2312", Font.PLAIN, 28));
        add(new JScrollPane(text), BorderLayout.CENTER);
        menuBar = new JMenuBar();
        menu = new JMenu("文件");
        itemSave = new JMenu("保存文件");
        itemOpen = new JMenu("打开文件");
        itemSave.addActionListener(this);
        itemOpen.addActionListener(this);
        menu.add(itemSave);
        menu.add(itemOpen);
        menuBar.add(menu);
        setJMenuBar(menuBar);
        fileDialog = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("java文件", "java");
        fileDialog.setFileFilter(filter);
    }

    @Override
    /**
     *@description : 无法弹出文件对话框
     *
     *
     *
     * @param e
     * @return : void
     * @author : Nina
     * @time : 2020/7/6 19:16
     */
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == itemSave) {
            int state = fileDialog.showSaveDialog(this);
            if (state == JFileChooser.APPROVE_OPTION) {
                try {
                    File dir = fileDialog.getCurrentDirectory();
                    String name = fileDialog.getSelectedFile().getName();
                    File file = new File(dir, name);
                    fileWriter = new FileWriter(file);
                    out = new BufferedWriter(fileWriter);
                    out.write(text.getText());
                    out.close();
                    fileWriter.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        } else if (e.getSource() == itemOpen) {
            int state = fileDialog.showOpenDialog(this);
            if (state == JFileChooser.APPROVE_OPTION) {
                text.setText(null);
                try {
                    File dir = fileDialog.getCurrentDirectory();
                    String name = fileDialog.getSelectedFile().getName();
                    File file = new File(dir, name);
                    fileReader = new FileReader(file);
                    in = new BufferedReader(fileReader);
                    String s = null;
                    while ((s = in.readLine()) != null) {
                        text.append(s + "\n");
                    }
                    in.close();
                    fileReader.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}
