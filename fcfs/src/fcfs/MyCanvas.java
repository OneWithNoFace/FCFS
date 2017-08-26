/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fcfs;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author harsh
 */
public class MyCanvas extends java.awt.Canvas {
    
    public MyCanvas() {
        setSize(900,100);
    }
    
    ArrayList<Integer> finished;
    ArrayList<String> finid;
    
    void add(ArrayList<Integer> finished,ArrayList<String> finid){
        this.finished=new ArrayList<Integer>(finished);
        this.finid=new ArrayList<String>(finid);
        repaint();
    }
    
    public void paint(Graphics g){
        System.out.println("hksdfasdfas");
        int i=0;
        int currx=0,curry=0;
        int curr=0;
        if(finished!=null){
            while(i<finished.size()){
              Font f1 = new Font("Dialog", Font.PLAIN, 15);
              g.setFont(f1);
              g.setColor(Color.black);
              g.drawLine(currx, 0, currx, 70);
              g.drawString(Integer.toString(curr), currx+2, 65);
              currx+=2;
              Font f = new Font("Dialog", Font.PLAIN, 25);
              g.setFont(f);
            if(finid.get(i).equals("-1")){
                g.setColor(Color.white);
                g.fillRect(currx, curry, 30*finished.get(i), 50);
            }else{
                g.setColor(Color.red);
                g.fillRect(currx, curry, 30*finished.get(i), 50);
                g.setColor(Color.white);
                g.drawString(finid.get(i), currx+(30*finished.get(i)/2)-10, 30);
            }
              curr+=finished.get(i);
            currx+=30*finished.get(i)+2;
            i++;
        }
            g.setColor(Color.black);
            Font f1 = new Font("Dialog", Font.PLAIN, 15);
            g.setFont(f1);
             g.drawLine(currx, 0, currx, 70);
            g.drawString(Integer.toString(curr), currx+2, 65);
        }
    }
}
