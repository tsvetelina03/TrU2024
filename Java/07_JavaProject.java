package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SentenceAndWordCountGUI extends JFrame implements ActionListener {
    private JTextArea textArea;
    private JTextField wordCountField;
    private JTextField sentenceCountField;

    public SentenceAndWordCountGUI() {
        setTitle("Брояч на думи и изречения");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textArea = new JTextArea(10, 30);
        textArea.setLineWrap(true);
        JButton countButton = new JButton("Броене на думи и изречения");
        countButton.addActionListener(this);

        wordCountField = new JTextField(10);
        wordCountField.setEditable(false);
        sentenceCountField = new JTextField(10);
        sentenceCountField.setEditable(false);

        JPanel panel = new JPanel(new FlowLayout());

        panel.add(new JScrollPane(textArea));
        panel.add(countButton);
        panel.add(new JLabel("Брой на думите: "));
        panel.add(wordCountField);
        panel.add(new JLabel("Брой на изреченията: "));
        panel.add(sentenceCountField);

        getContentPane().add(panel);

        setSize(500, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SentenceAndWordCountGUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text = textArea.getText();

        int wordCount = countWords(text);
        int sentenceCount = countSentences(text);

        wordCountField.setText(String.valueOf(wordCount));
        sentenceCountField.setText(String.valueOf(sentenceCount));
    }

    private int countWords(String text) {
        String[] words = text.split("\\s+");
        if (text.trim().isEmpty()) {
            return 0;
        }
        return words.length;
    }

    private int countSentences(String text) {
        String[] sentences = text.split("[.!?]");

        if (text.trim().isEmpty()) {
            return 0;
        }

        return sentences.length;
    }
}
