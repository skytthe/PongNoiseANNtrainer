/*
 * The MIT License
 *
 * Copyright 2015 skytthe.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package model;

import view.GUI;

/**
 *
 * @author skytthe
 */
public class ANN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("ANN");
        
        GUI gui = new GUI();
        
        //First Neural network implementation
        int[][] input = {{0,0},
                         {0,1},
                         {1,0},
                         {1,1}};
        //AND
        int[] goal = {0,0,0,1};
        //XOR
        //int[] goal = {0,1,1,0};
        
        //init ANN
        int i = 1;
        int k = 1;
        
        double[] weights = new double[10];
        
        System.out.println(goal[0]);
        
        //Forward pass
        
        //Backpropagation
        
        boolean done = false;
        int itr = 0;
        while (itr < 10) {            
            System.out.println(itr);
            itr++;
            done = true;
        }
        
        //test ANN
        
    }
    
    public double sigmoid(double x){
        return 1/(1+Math.exp(-x));
    }
    
    
    
    
}
