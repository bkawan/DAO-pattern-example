package com.bk.daopattern.dao.implement;



import com.bk.daopattern.dao.SkillDAO;
import com.bk.daopattern.entity.Skill;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bkawan
 * @date Feb 27, 2016
 * @time 9:19:31 AM
 */
public class SkillDAOImplements  implements SkillDAO{

    
    // store skills object in Arraylist as we have no database connection yet
    private ArrayList<Skill> skillList;
    
    public SkillDAOImplements(){
        skillList = new ArrayList<>();
    }
    @Override
    public void insert(Skill skill) {
        //add skill in skillList Array
        skillList.add(skill);
    }

    @Override
    public boolean delete(int id) {
        
        boolean hasDelete = false;
       
        for(Skill skill:skillList){
            if(skill.getSkillId() == id){
            skillList.remove(skill);
            hasDelete=true;
            break;
            }
            
        }
        return hasDelete;
    }

    @Override
    public Skill getByID(int id) {
        // search in a skilllist array collection by id
        
        for(Skill skill:skillList){
            if(skill.getSkillId() == id){
                return skill;
            }
        }
        // if not found
        return null;
    }

    @Override
    public ArrayList<Skill> getAll() {
        
        // return in arraylist
        return skillList;
    }

    @Override
    public ArrayList<Skill> search(String param) {
        // to store all the skills found after searching in skillList Array
        ArrayList<Skill> skills = new ArrayList<>();
        for(Skill skill:skillList){
            //convert name and description to lower case from our arraylist container 
            String name = skill.getSkillName().toLowerCase();
            String description = skill.getSkillDesc().toLowerCase();
            
            //convert passing string parameter to lowercase
            param = param.toLowerCase();
            
            
            //if(skill.getSkillName().toLowerCase().contains(param.toLowerCase()))
            
            // check if our SlikkList arraylist container contain passing parameter that matches name or description
            if(name.contains(param) || description.contains(param)){
                //if matches either name or desc then add to our new skills arraylist
                skills.add(skill);
            }
        }
        // return of new container arraylist ie skills
        return skills;
    }

    @Override
    public int count() {
        
        // count array list size
        return skillList.size();
                
    }

}
