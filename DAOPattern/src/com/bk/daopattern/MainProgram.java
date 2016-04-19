/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bk.daopattern;

import com.bk.daopattern.dao.implement.SkillDAOImplements;
import com.bk.daopattern.view.SkillView;
import java.util.Scanner;

/**
 *
 * @author bikeshkawan
 */
public class MainProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//        // instantiate SkillDAOImplements which has SkillDAO interface
//        SkillDAO skillDAO = new SkillDAOImplements();
//        //instantiate Scanner object
//        Scanner input = new Scanner(System.in);
        
//short cut
        SkillView sv = new SkillView(new Scanner(System.in), new SkillDAOImplements());
        while (true) {
                       
                sv.controller();
            }
        

    }

    
}
