/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fcfs;

import java.awt.Color;
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
        if(finished!=null){
            while(i<finished.size()){
            if(finid.get(i).equals("-1")){
                g.setColor(Color.black);
                g.fillRect(currx, curry, 10*finished.get(i), 50);
            }else{
                g.setColor(Color.red);
                g.fillRect(currx, curry, 10*finished.get(i), 50);
            }
            currx+=10*finished.get(i)+2;
            i++;
        }
        }
    }
}
