/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bk.daopattern.view;

import com.bk.daopattern.dao.SkillDAO;
import com.bk.daopattern.entity.Skill;
import java.util.Scanner;

/**
 *
 * @author bkawan
 * @date Feb 27, 2016
 * @time 12:59:53 PM
 */
public class SkillView {

    // variables to pass in constructor to get reference from main method
    private Scanner input;
    private SkillDAO skillDAO;

    public SkillView(Scanner input, SkillDAO skillDAO) {

        this.input = input;
        this.skillDAO = skillDAO;
    }

    public void add() {
        while (true) {
            System.out.println("**** Add New Skill ****");
            //instantiate skill object
            Skill skill = new Skill();
            //get data from user input and set them
            System.out.println("Enter Skill ID: ");
            skill.setSkillId(input.nextInt());
            System.out.println("Enter Skill Name:");
            //String name = input.nextLine();
            skill.setSkillName(input.next());
            System.out.println("Enter Skill Type:");
            skill.setSkillType(input.next());
            System.out.println("Enter Skill Description");
            skill.setSkillDesc(input.next());

            /**
             * after collecting data from user add pass skill object which
             * contains all data into SkillDAOImplements ie skillDAO variable
             * which stores skill object in a arraylist container
             *
             * public SkillDAOImplements(){ skillList = new ArrayList<>(); }
             * public void insert(Skill skill) { skillList.add(skill); }
             */
            skillDAO.insert(skill);
            System.out.print("Do you want to add more Skill sets[Y/N]: ");
            if (input.next().equalsIgnoreCase("n")) {
                //if no get out from while loop  

                break;// break from while loop
            }
        }

    }

    public void showAll() {
        System.out.println("Listing all skills :");
        if (skillDAO.count() == 0) {
            System.out.println("There are no skills in the list");
        } else {
            skillDAO.getAll().forEach(s -> {
                System.out.println(s.toString());
            });
        }
    }

    public void search() {
        System.out.println("Search Skills :");

        while (true) {
         
                skillDAO.search(input.next()).forEach(s -> {
                    System.out.println(s.toString());
                });

                System.out.println("Do you want to search more ..[Y/N]:");
                if (input.next().equalsIgnoreCase("n")) {
                    break;
                }

            }
       
    }

    public void deleteById() {
        System.out.println("Delete Skills");
        while (true) {
            System.out.println("Enter ID to Delete Skill");

            if (skillDAO.delete(input.nextInt())) {
                System.out.println("Delete Sucessful");
            } else {
                System.out.println("Record not found");

            }
            System.out.println("Do you Want to Delete more[Y/N]: ");
            if (input.next().equalsIgnoreCase("n")) {
                break;
            }
        }

    }

    public void searchById() {
        System.out.println("Search Skills");
        while (true) {
            System.out.println("Enter ID to Search: ");
            Skill skill = skillDAO.getByID(input.nextInt());

            if (skill != null) {
                System.out.println(skill.toString());
            } else {
                System.out.println("Record not found");
            }

            System.out.println("Do you want to search more[Y/N]:");
            if (input.next().equalsIgnoreCase("n")) {
                break;
            }

        }
    }

    public void totalSkillsCount() {
        System.out.println("Total number of Skill = " + skillDAO.count());

    }

    public void exit() {
        System.out.println("Do you really want to exit[Y/N]");
        if (input.next().equalsIgnoreCase("Y")) {
            System.exit(0);
        }
    }
    
    public void controller(){
        skillsMenu();
        switch (input.nextInt()) {

                    case 1:
                        add();
                       
                       
                        break;
                    case 2:
                       showAll();
                        break;
                    case 3:
                        searchById();
                        break;
                    case 4:
                       deleteById();
                        break;
                    case 5:
                        totalSkillsCount();
                        break;
                    case 6:
                        search();
                        break;
                    case 7:
                        exit();
                        break;

                }
    }

    
    public void skillsMenu(){
        System.out.println("=================================");
        System.out.println("    Welcome to Skill Manager");
        System.out.println("=================================");
        System.out.println("1. Add New Skill: ");
        System.out.println("2. Show All Skills: ");

        System.out.println("3. Search Skill By ID : ");

        System.out.println("4. Delete Skill");
        System.out.println("5. Count number of Skills: ");
        System.out.println("6. Search Skills");
        System.out.println("7. Exit");
        System.out.println("=================================");
        System.out.println("Enter Your Choice[1-7]: ");
    }
}
