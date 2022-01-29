package com.swingobserverex;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingObserverExample {
    JFrame frame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }
   public void go(){
        frame = new JFrame();
        JButton button = new JButton("Should I do it?");
        button.addActionListener(new AngelListener());
        button.addActionListener(new DevilListener());
        frame.getContentPane().add(BorderLayout.CENTER, button);
        // Set frame properties here
   }
   static class AngelListener implements ActionListener{
       public void actionPerformed(ActionEvent e) {
           System.out.println("Don't do it, you might regret it!");
       }
   }
   static class DevilListener implements ActionListener{
       public void actionPerformed(ActionEvent e) {
           System.out.println("Come on, do it!");
       }
   }
}
