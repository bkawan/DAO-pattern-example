/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bk.daopattern.dao;

import com.bk.daopattern.entity.Skill;
import java.util.ArrayList;

/**
 *
 * @author bkawan
 * @date Feb 27, 2016
 * @time 8:35:11 AM
 */
//this interface access Skill 
public interface SkillDAO {
    
    void insert(Skill skill);
    // delete skill by id
    boolean delete(int id);
    // search by id and return skill object
    Skill getByID(int id);
    // get al Skill object and put them in a collection
    ArrayList<Skill> getAll();
    // search and put all results in collection of skill type
    ArrayList<Skill>search(String param);
    int count();

}
